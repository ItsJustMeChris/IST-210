package me.chris;

import java.util.Scanner;

public class Game {
	int winGuesses;
	int guessCount;
	
	private int hidden;
	
	Game(int guessCount) {
		winGuesses = guessCount;
		hidden = (int)(1000.0*Math.random() + 1.0);

	}
	
	int getHidden() {
		return hidden;
	}
	
	boolean guess(int guess) {
		guessCount++;
		if (guess == hidden) {
			return true;
		} else if(guess < hidden) {
			System.out.println("Guess to low");
			return false;
		} else if(guess > hidden) {
			System.out.println("Guess to high");
			return false;
		}
		return false;
	}
	
	void play() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would yoou like to play?");
		if (scanner.next().equals("yes")) {
			while(true) {
				System.out.print("Enter a guess: ");
				int guess = scanner.nextInt();
				if (guess == -1) {
					System.out.println("Thanks for playing the guessing game. Good bye¡­.");
					break;
				}
				if (guess(guess)) {
					if (guessCount < winGuesses) {
						System.out.println("Congratulations!!! You won the game in n tries. You did very well.");
						break;
					} else {
						System.out.println("Congratulations!!! You won the game in "+guessCount+" tries. You could do better.");
						break;
					}
				}
			}
		}
		scanner.close();
	}
}
