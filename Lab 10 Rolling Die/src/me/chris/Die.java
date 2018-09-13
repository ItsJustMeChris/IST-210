package me.chris;

public class Die {
	int die1;
	int die2;
	int[] totals = new int[13];
	
	
	Die() {
		
	}
	
	int random() {
		return (int)(6.0*Math.random() + 1.0);
	}
	
	void roll(int times) {
		for(int i=0; i< times; i++) {
			die1 = random();
			die2 = random();
			int total = die1 + die2;
			totals[total]++;
		}
		showResults(times);
	}
	
	void showResults(int times) {
		System.out.println("Sum\tFrequency\tPercentage");
		for(int i=2; i <= 12; i++) {
			double percent = (totals[i]/(double)times) * 100.00;
			System.out.println(String.format("%d	%d\t%.02f", i, totals[i], percent));
		}
	}
	
}
