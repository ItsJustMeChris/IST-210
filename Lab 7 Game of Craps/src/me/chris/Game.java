package me.chris;

public class Game {
    double balance;
    double initialBalance;
    
    Game(double b) {
    	balance = b;
    }
    
    String balanceFormatted() {
    	return String.format("$%.02f", balance);
    }
    
    String winnings() {
    	double winnings = .13*balance;
    	return String.format("$%.02f", winnings);
    }
    
    int roll() {
    	int di1 = (int)(6.0*Math.random() + 1.0);
    	int di2 = (int)(6.0*Math.random() + 1.0);
        System.out.println("Player Rolled: " + (di1+di2) + ":\t " + di1 + ", " + di2);

        return di1+di2;
    }
    
    boolean verifyBet(double bet) {
    	if (balance - bet < 0) {
    		return false;
    	}
    	return true;
    }
    
    boolean play(double bet) {
    	int roll = roll();
    	
    	if (roll == 2 || roll == 3 || roll == 12) {
    		System.out.println("Player Losses...");
    		balance -= bet;
    		return false;
    	} else if(roll == 7 || roll == 11) {
    		System.out.println("Player Wins, balance is " + balanceFormatted());
    		balance += bet;
    		return true;
    	} else {
    		int points = roll;
    		System.out.println("Player's Point: " + points);
    		while(true) {
    			roll = roll();
    			if (roll == points) {
    				System.out.println("Player Wins...");
    				balance += bet;
    				return true;
    			}
    			if (roll == 7) {
    				System.out.println("Player Losses...");
    				balance -= bet;
    				return false;
    			}
    		}
    	}
    }
}
