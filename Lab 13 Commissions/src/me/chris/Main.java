package me.chris;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Commission c = new Commission();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("Enter sales amount (Negative to end): ");
			int sale = scanner.nextInt();
			if (sale < 0) {
				break;
			} else {
				c.addCommission(sale);
			}
		}
		c.listCommissions();
		System.out.println("Goodbye..");
		scanner.close();

	}
}

/*
Enter sales amount (Negative to end): 1000
Enter sales amount (Negative to end): 2000
Enter sales amount (Negative to end): 3000
Enter sales amount (Negative to end): 4000
Enter sales amount (Negative to end): 5000
Enter sales amount (Negative to end): 6000
Enter sales amount (Negative to end): 7000
Enter sales amount (Negative to end): 8000
Enter sales amount (Negative to end): 9000
Enter sales amount (Negative to end): -1
Range		Number
$200-299	1
$300-399	1
$400-499	1
$500-599	1
$600-699	1
$700-799	1
$800-899	1
$900-999	1
$1000 and over	1
Goodbye..

*/