package me.chris;

public class Invoice {
	int partNumber;
	String description;
	int quantity;
	double price;
	
	Invoice(int part, String desc, int qty, double p) {
		partNumber = part;
		description = desc;
		quantity = qty;
		price = p;
		verify();
	}
	
	void verify() {
		quantity = (quantity > 0) ? quantity : 0;

		price = (price > 0) ? price : 0;
 
	}
	
	void setPrice(double p) {
		price = p;
		verify();
	}
	
	void setQuantity(int qty) {
		quantity = qty;
		verify();
	}
	
	void setDescription(String desc) {
		description = desc;
	}
	
	void setPart(int part) {
		partNumber = part;
	}
	
	public String toString() {
		return String.format("Part Number: %d%n"+
							 "Description: %s%n"+
							 "Quantity: %d%n"+
							 "Price: $%.02f%n"+
							 "Invoice Amount: $%.02f%n", partNumber, description, quantity, price, price*quantity);
	}
	
	
}
