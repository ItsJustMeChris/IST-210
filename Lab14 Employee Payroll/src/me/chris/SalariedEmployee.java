package me.chris;

public class SalariedEmployee extends Employee 
{
   private double weeklySalary;

   public SalariedEmployee( String first, String last, String ssn, double salary, Date birthDate)
   {
      super( first, last, ssn, birthDate ); 
      setWeeklySalary( salary ); 
   } 

   public void setWeeklySalary( double salary )
   {
	   if (salary < 0.0) {
	         throw new IllegalArgumentException("Salary too low, expected (salary>=0.0)");
	   }
	   weeklySalary = salary;
   } 

   public double getWeeklySalary()
   {
      return weeklySalary;
   } 

   @Override
   public double earnings()
   {
      return getWeeklySalary();
   } 

   @Override
   public String toString()
   {
      return String.format( "salaried employee: %s\n%s: $%,.2f\n%s: $%,.2f", 
         super.toString(), "weekly salary", getWeeklySalary(), "Earned", earnings());
   } 
}

