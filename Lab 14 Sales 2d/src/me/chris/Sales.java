package me.chris;

public class Sales {
	private int[][] tracker;
	Sales() {
		tracker = new int[5][6];
	}
	
	void addSale(int salesPerson, int productNumber, int totalValue) {
		tracker[salesPerson][productNumber] += totalValue;
	}
	
	void outputSales() {
		System.out.println("Product\tSalesperson 1\t Salesperson 2\tSalesperson 3\tSalesperson 4");

		System.out.println(1+"\t"+tracker[1][1]+"\t"+tracker[2][1]+"\t"+tracker[3][1]+"\t"+tracker[4][1]+"\t");
		System.out.println(1+"\t"+tracker[1][2]+"\t"+tracker[2][2]+"\t"+tracker[3][2]+"\t"+tracker[4][2]+"\t");
		System.out.println(1+"\t"+tracker[1][3]+"\t"+tracker[2][3]+"\t"+tracker[3][3]+"\t"+tracker[4][3]+"\t");
		System.out.println(1+"\t"+tracker[1][4]+"\t"+tracker[2][4]+"\t"+tracker[3][4]+"\t"+tracker[4][4]+"\t");
		System.out.println(1+"\t"+tracker[1][5]+"\t"+tracker[2][5]+"\t"+tracker[3][5]+"\t"+tracker[4][5]+"\t");

		System.out.println("Total\t"+getSellerTotalSales(1)+"\t"+getSellerTotalSales(2)+"\t"+getSellerTotalSales(3)+"\t"+getSellerTotalSales(4)+"\t");

	}
	
	int getSellerTotalSales(int seller) {
		int tmp = 0;
		for(int i=0; i<6; i++) {
			tmp += tracker[seller][i];
		}
		return tmp;
	}
}
