package me.chris;

public class HourlyEmployee extends Employee 
{
   private double wage;
   private double hours; 

   public HourlyEmployee( String first, String last, String ssn, 
      double hourlyWage, double hoursWorked, Date birthDate )
   {
      super( first, last, ssn, birthDate );
      setWage( hourlyWage ); 
      setHours( hoursWorked );
   }

   public void setWage( double hourlyWage )
   {
	   if (hourlyWage < 0.0) {
	         throw new IllegalArgumentException("hourlyWage too low, expected (hourlyWage>=0.0)");
	   }
	   wage = hourlyWage;
   } 

   public double getWage()
   {
      return wage;
   } 

   public void setHours( double hoursWorked )
   {
	   if (hoursWorked >= 0.0 && hoursWorked <= 168.0)
	   {
		   hours = hoursWorked;
	   } else {
		   throw new IllegalArgumentException("Hours worked must be between 0 and 168");
	   }
   } 

   public double getHours()
   {
      return hours;
   } 

   @Override
   public double earnings()
   {
	   return (getHours() <= 40) ? getWage() * getHours() : 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;
   }

   @Override
   public String toString()
   {
      return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f\n%s: $%,.2f", 
         super.toString(), "hourly wage", getWage(), "hours worked", getHours(), "earned", earnings());
   } 
}

