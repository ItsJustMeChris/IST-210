package me.chris;

public class Main {
	public static void main(String[] args) {
		Game g = new Game(10);
		g.play();
	}
}

/*
Would yoou like to play?
yes
Enter a guess: 20
Guess to low
Enter a guess: 10
Guess to low
Enter a guess: 80
Guess to high
Enter a guess: 907
Guess to high
Enter a guess: 800
Guess to high
Enter a guess: 700
Guess to high
Enter a guess: 600
Guess to high
Enter a guess: 400
Guess to high
Enter a guess: 300
Guess to high
Enter a guess: 200
Guess to high
Enter a guess: 100
Guess to high
Enter a guess: 50
Guess to high
Enter a guess: 60
Guess to high
Enter a guess: 40
Guess to high
Enter a guess: 20
Guess to low
Enter a guess: 30
Guess to high
Enter a guess: 25
Guess to low
Enter a guess: 24
Guess to low
Enter a guess: 26
Guess to low
Enter a guess: 28
Guess to high
Enter a guess: 27
Congratulations!!! You won the game in 21 tries. You could do better.
*/