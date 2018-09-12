package me.chris;

public class Converter {
	int coins;
	Converter(int coinCount) {
		coins = coinCount;
	}
	
	public int toDollars() {
		int tmp = coins/100;
		coins %= 100;
		return tmp;
	}
	
	public int toPennies() {
		return coins;
	}
	
	public int toQuarters() {
		int tmp = coins/25;
		coins %= 25;
		return tmp;
	}
	
	public int toDimes() {
		int tmp = coins/10;
		coins %= 10;
		return tmp;
	}
	
	public int toNickels() {
		int tmp = coins/5;
		coins %= 5;
		return tmp;
	}

	
	public void output() {
		System.out.format("Original Amount: %d%n" + 
						  "Number of Dollars: %d%n" + 
						  "Number of Quarters: %2d%n" + 
						  "Number of Dimes: %2d%n" + 
						  "Number of Nickels: %2d%n" + 
						  "Number of Pennies: %2d%n", 
						  coins, toDollars(), toQuarters(), toDimes(), toNickels(), toPennies());
	}
}
