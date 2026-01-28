package scenario_based;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;

class Product {
    String name;
    double price;
    int stock;

    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}

class Customer {
    String name;
    ArrayList<String> cart;

    Customer(String name) {
        this.name = name;
        this.cart = new ArrayList<>();
    }

    public void addItem(String itemName) {
        cart.add(itemName);
    }
}

class Supermarket {
    private HashMap<String, Product> inventory;
    private Queue<Customer> checkoutQueue;

    Supermarket() {
        inventory = new HashMap<>();
        checkoutQueue = new LinkedList<>();
        initializeInventory();
    }

    private void initializeInventory() {
        inventory.put("Milk", new Product("Milk", 2.50, 10));
        inventory.put("Bread", new Product("Bread", 1.20, 15));
        inventory.put("Eggs", new Product("Eggs", 3.00, 5));
        inventory.put("Apple", new Product("Apple", 0.50, 50));
        inventory.put("Chocolate", new Product("Chocolate", 1.50, 20));
    }

    public void addToQueue(Customer customer) {
        checkoutQueue.add(customer);
        System.out.println("Customer " + customer.name + " joined the queue.");
    }

    public void viewInventory() {
        System.out.println("STORE INVENTORY");
        for (Product p : inventory.values()) {
            System.out.println(p.name + ": $" + p.price + " (Stock: " + p.stock + ")");
        }
    }

    public void processNextCustomer() {
        if (checkoutQueue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer currentCustomer = checkoutQueue.poll();
        System.out.println("Processing Bill for: " + currentCustomer.name);
        
        double totalBill = 0.0;

        for (String itemName : currentCustomer.cart) {
            if (inventory.containsKey(itemName)) {
                Product product = inventory.get(itemName);
                
                if (product.stock > 0) {
                    System.out.println(" - " + itemName + ": $" + product.price);
                    totalBill += product.price;
                    product.stock--; 
                } else {
                    System.out.println(" - " + itemName + ": [OUT OF STOCK]");
                }
            } else {
                System.out.println(" - " + itemName + ": [INVALID ITEM]");
            }
        }
        System.out.println("TOTAL: $" + String.format("%.2f", totalBill));
        System.out.println(currentCustomer.name + " has left the counter.");
    }

    public boolean hasProduct(String name) {
        return inventory.containsKey(name);
    }
}

public class SmartCheckout {
    public static void main(String[] args) {
        Supermarket market = new Supermarket();
        Scanner input = new Scanner(System.in);
        int choice;
        String custName, item;

        System.out.println("SMART CHECKOUT SYSTEM");

        while (true) {
            System.out.println("1. New Customer (Join Queue)");
            System.out.println("2. Process Next Customer (Checkout)");
            System.out.println("3. View Inventory");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            if (input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine();
            } else {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer Name: ");
                    custName = input.nextLine();
                    Customer newCust = new Customer(custName);
                    
                    market.viewInventory();
                    System.out.println("Enter items (type 'done' to finish):");
                    while (true) {
                        System.out.print("> ");
                        item = input.nextLine();
                        if (item.equalsIgnoreCase("done")) break;
                        String formattedItem = item.substring(0, 1).toUpperCase() + item.substring(1).toLowerCase();
                        if (market.hasProduct(formattedItem)) {
                             newCust.addItem(formattedItem);
                        } else {
                            System.out.println("   (Item not found in store)");
                        }
                    }
                    market.addToQueue(newCust);
                    break;
                case 2:
                    market.processNextCustomer();
                    break;
                case 3:
                    market.viewInventory();
                    break;
                case 4:
                    System.out.println("Closing Checkout Counter.");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}