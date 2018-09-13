package me.chris;

public class Commission {
	int[] chart;

	Commission() {
		chart = new int[11];
	}
	
	void listCommissions() {
		System.out.println("Range\tNumber");
		System.out.println("$200-299\t"+chart[2]);
		System.out.println("$300-399\t"+chart[3]);
		System.out.println("$400-499\t"+chart[4]);
		System.out.println("$500-599\t"+chart[5]);
		System.out.println("$600-699\t"+chart[6]);
		System.out.println("$700-799\t"+chart[7]);
		System.out.println("$800-899\t"+chart[8]);
		System.out.println("$900-999\t"+chart[9]);
		System.out.println("$1000 and over\t"+chart[10]);
	}
	
	int addCommission(int sale) {
		int commission = (int)(sale*.09) + 200;
		chart[commission/100]++;
		return commission;
	}
	
	
}
