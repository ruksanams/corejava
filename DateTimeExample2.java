package javadatetime;
import java.time.LocalDate;
import java.time.Month;
public class DateTimeExample2 
{
   public static void main(String args[])
   {
	   LocalDate localDate1=LocalDate.of(2019,Month.JANUARY,02);
	   LocalDate localDate2=LocalDate.of(2020,Month.FEBRUARY,02);
	   
	   //Numbers of days in a month
	   System.out.println("Numbers of days in "+localDate1.getMonth()+":"+localDate1.lengthOfMonth());
	   System.out.println("Numbers of days in "+localDate2.getMonth()+":"+localDate2.lengthOfMonth());
	   
	   //Numbers of days in a year
	   System.out.println("Numbers of days in "+localDate1.getYear()+":"+localDate1.lengthOfYear());
	   System.out.println("Numbers of days in "+localDate2.getYear()+":"+localDate2.lengthOfYear());
	   
	   if(localDate1.isLeapYear())
	   {
		   System.out.println(localDate1.getYear()+" is a Leap Year");
	   }
	   else
	   {
		   System.out.println(localDate1.getYear()+" is not a Leap Year");
	   }
	   if(localDate2.isLeapYear())
	   {
		   System.out.println(localDate2.getYear()+" is a Leap Year");
	   }
	   else
	   {
		   System.out.println(localDate2.getYear()+" is not a Leap Year");
	   }
   }
}
