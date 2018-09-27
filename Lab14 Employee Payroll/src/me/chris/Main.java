package me.chris;

public class Main {
	public static void main(String[] args) {
		Date one = new Date(6,15,1944);
		System.out.println("Date Object constructed for date " + one);
		Date two = new Date(12,29,1960);
		System.out.println("Date Object constructed for date " + two);
		Date three = new Date(9,8,1954);
		System.out.println("Date Object constructed for date " + three);
		Date four = new Date(3,2,1965);
		System.out.println("Date Object constructed for date " + four);
		
		System.out.println();
		SalariedEmployee johnSmith = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00, one);
		System.out.println(johnSmith);

		System.out.println();
		HourlyEmployee karenPrice = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40.00, two);
		System.out.println(karenPrice);

		System.out.println();
		CommissionEmployee sueJones = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000.00, .06, three);
		System.out.println(sueJones);

		System.out.println();
		BasePlusCommissionEmployee bobLewis = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000.00, .04, 300.00, four);
		System.out.println(bobLewis);
}
}
