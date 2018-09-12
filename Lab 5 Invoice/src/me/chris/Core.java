package me.chris;

public class Core {
	public static void main(String[] args) {
		Invoice inv = new Invoice(1234, "Hammer", 2, 14.95);
		System.out.println("Original invoice information");
		System.out.println(inv.toString());
		
		inv.setPart(001234);
		inv.setDescription("Yellow Hammer");
		inv.setQuantity(3);
		inv.setPrice(19.49);
		
		System.out.println("Updated invoice information");
		System.out.println(inv.toString());
		
		inv.setPart(001234);
		inv.setDescription("Yellow Hammer");
		inv.setQuantity(-3);
		inv.setPrice(-19.49);
		
		System.out.println("Updated invoice information");
		System.out.println(inv.toString());
		
		
	}
}

/*
Original invoice information
Part Number: 1234
Description: Hammer
Quantity: 2
Price: $14.95
Invoice Amount: $29.90

Updated invoice information
Part Number: 668
Description: Yellow Hammer
Quantity: 3
Price: $19.49
Invoice Amount: $58.47

Updated invoice information
Part Number: 668
Description: Yellow Hammer
Quantity: 0
Price: $0.00
Invoice Amount: $0.00

*/