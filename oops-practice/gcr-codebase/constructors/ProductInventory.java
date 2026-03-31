package constructors;

class Product{
	
	// Instance Variables
	private String productName; 
	private int price; 
	static int totalProducts; // Class Variable
	
	Product(String productName, int price){
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	
	// Instance Method to display Product details
	void displayProductDetails() {
		System.out.println("Product Name: "+productName);
		System.out.println("Price: "+price);
	}
	
	// Class Method to show the total number of products created
	static void displayTotalProducts() {
		System.out.println("Total No. Of Products: "+totalProducts);
	}
		
}

public class ProductInventory {
	public static void main(String[] args) {
		Product p1 = new Product("Pen", 10);
		Product p2 = new Product("Pencil", 5);
		Product p3 = new Product("Eraser", 5);
		Product p4 = new Product("Scale", 5);
		Product.displayTotalProducts();
		System.out.println("Product 1 Details");
		p1.displayProductDetails();
		System.out.println("Product 2 Details");
		p2.displayProductDetails();
	}
}
