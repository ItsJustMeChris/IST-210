package me.chris;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Game g = new Game(20000.00);
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Would you like to play a game of Craps? [Y|N]: ");
			char playing = scanner.next().charAt(0);
			if (playing == 'y') {
				System.out.print("Enter a wager less than your balance or -1 to quit. Your balance is " + g.balanceFormatted() + " : ");
				double bet = scanner.nextDouble();
				if (bet == -1) {
					break;
				}
				if (g.verifyBet(bet)) {
					if (g.play(bet)) {
						System.out.println("Congratulations, balance is now: " + g.balanceFormatted());
					} else {
						System.out.println("You'll get it next time, balance is now: " + g.balanceFormatted());
						if (g.balance <= 0) {
							System.out.println("Sorry, you are busted. Come back soon...");
							break;
						}
					}
				}
				
			} else if (playing == 'n') {
				break;
			}
		}
		if (g.balance > 0) {
			System.out.println("A check of amount " + g.winnings() + " will be mailed to you after taking, taxes and misc fees. ");
		}
		System.out.println("Goodbye..");
		scanner.close();
	}
}

/*
 * Would you like to play a game of Craps? [Y|N]: y
Enter a wager less than your balance or -1 to quit. Your balance is $20000.00 : 20000
Player Rolled: 8:	 6, 2
Player's Point: 8
Player Rolled: 6:	 4, 2
Player Rolled: 9:	 5, 4
Player Rolled: 10:	 4, 6
Player Rolled: 8:	 5, 3
Player Wins...
Congratulations, balance is now: $40000.00
Would you like to play a game of Craps? [Y|N]: y
Enter a wager less than your balance or -1 to quit. Your balance is $40000.00 : 40000
Player Rolled: 6:	 4, 2
Player's Point: 6
Player Rolled: 12:	 6, 6
Player Rolled: 8:	 6, 2
Player Rolled: 8:	 6, 2
Player Rolled: 9:	 5, 4
Player Rolled: 8:	 6, 2
Player Rolled: 8:	 3, 5
Player Rolled: 7:	 4, 3
Player Losses...
You'll get it next time, balance is now: $0.00
Sorry, you are busted. Come back soon...
Goodbye..



 Would you like to play a game of Craps? [Y|N]: y
Enter a wager less than your balance or -1 to quit. Your balance is $20000.00 : 20000
Player Rolled: 7:	 5, 2
Player Wins, balance is $20000.00
Congratulations, balance is now: $40000.00
Would you like to play a game of Craps? [Y|N]: n
A check of amount $5200.00 will be mailed to you after taking, taxes and misc fees. 
Goodbye..

*/