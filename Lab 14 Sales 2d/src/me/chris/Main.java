package me.chris;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Sales track = new Sales();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter salesperson, item, total sale (-1 to quit)");
			String input = scanner.next();

			if (input.equals("-1")) {
				break;
			}
			
			String[] inputStr = input.split(",", 3);
			track.addSale(Integer.parseInt(inputStr[0]), Integer.parseInt(inputStr[1]), Integer.parseInt(inputStr[2]));
		}
		
		scanner.close();
		track.outputSales();
	}
}

/*
Enter salesperson, item, total sale (-1 to quit)
1,1,1000
Enter salesperson, item, total sale (-1 to quit)
1,2,500
Enter salesperson, item, total sale (-1 to quit)
1,3,500
Enter salesperson, item, total sale (-1 to quit)
1,4,2145
Enter salesperson, item, total sale (-1 to quit)
1,5,235
Enter salesperson, item, total sale (-1 to quit)
2,1,1500
Enter salesperson, item, total sale (-1 to quit)
2,2,2500
Enter salesperson, item, total sale (-1 to quit)
2,3,500
Enter salesperson, item, total sale (-1 to quit)
2,4,3200
Enter salesperson, item, total sale (-1 to quit)
2,5,4235
Enter salesperson, item, total sale (-1 to quit)
3,1,4000
Enter salesperson, item, total sale (-1 to quit)
3,2,4000
Enter salesperson, item, total sale (-1 to quit)
3,3,500
Enter salesperson, item, total sale (-1 to quit)
3,4,2500
Enter salesperson, item, total sale (-1 to quit)
3,5,1035
Enter salesperson, item, total sale (-1 to quit)
4,1,2500
Enter salesperson, item, total sale (-1 to quit)
4,2,2000
Enter salesperson, item, total sale (-1 to quit)
4,3,4500
Enter salesperson, item, total sale (-1 to quit)
4,4,3500
Enter salesperson, item, total sale (-1 to quit)
4,5,5000
Enter salesperson, item, total sale (-1 to quit)
-1
Product	Salesperson 1	 Salesperson 2	Salesperson 3	Salesperson 4
1	1000	1500	4000	2500	
1	500		2500	4000	2000	
1	500		500		500		4500	
1	2145	3200	2500	3500	
1	235		4235	1050	5000	
Total	4380	11935	12050	17500	
*/