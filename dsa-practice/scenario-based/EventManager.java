package scenario_based;
import java.util.ArrayList;
import java.util.Scanner;

class Ticket {
    String eventId;
    double price;

    Ticket(String eventId, double price) {
        this.eventId = eventId;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + eventId + " | Price: $" + price;
    }
}

class TicketOptimizer {
    private ArrayList<Ticket> tickets;

    TicketOptimizer() {
        tickets = new ArrayList<>();
    }

    public void addTicket(String eventId, double price) {
        tickets.add(new Ticket(eventId, price));
    }

    public void sortTickets() {
        if (tickets.isEmpty()) return;
        quickSort(tickets, 0, tickets.size() - 1);
    }

    private void quickSort(ArrayList<Ticket> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }

    private int partition(ArrayList<Ticket> list, int low, int high) {
        double pivot = list.get(high).price;
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (list.get(j).price < pivot) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);
        return i + 1;
    }

    private void swap(ArrayList<Ticket> list, int i, int j) {
        Ticket temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public void displayTopCheapest(int limit) {
        System.out.println("Top " + limit + " Cheapest Tickets");
        int count = Math.min(limit, tickets.size());
        if (count == 0) {
            System.out.println("No tickets available");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + tickets.get(i));
            }
        }
    }

    public void displayAll() {
        System.out.println("All Tickets");
        for (Ticket t : tickets) {
            System.out.println(t);
        }
    }
}

public class EventManager {
    public static void main(String[] args) {
        TicketOptimizer optimizer = new TicketOptimizer();
        Scanner input = new Scanner(System.in);
        int choice;
        String id;
        double price;

        System.out.println("EVENT TICKET OPTIMIZER");
        
        while (true) {
            System.out.println("1. Add Ticket");
            System.out.println("2. Sort Tickets (QuickSort)");
            System.out.println("3. Show Top 3 Cheapest");
            System.out.println("4. Show All Tickets");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            if (input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine();
            } else {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Ticket ID: ");
                    id = input.nextLine();
                    System.out.print("Enter Price: ");
                    if (input.hasNextDouble()) {
                        price = input.nextDouble();
                        optimizer.addTicket(id, price);
                        System.out.println("Ticket added.");
                    } else {
                        input.nextLine();
                        System.out.println("Invalid price.");
                    }
                    break;
                case 2:
                    long startTime = System.nanoTime();
                    optimizer.sortTickets();
                    long endTime = System.nanoTime();
                    System.out.println("Sorting completed in " + (endTime - startTime) + " ns.");
                    break;
                case 3:
                    optimizer.displayTopCheapest(3);
                    break;
                case 4:
                    optimizer.displayAll();
                    break;
                case 5:
                    System.out.println("Exiting system.");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}