package javadatetime;
import java.time.OffsetDateTime;
public class JavaOffsetDateTimeExample 
{
   public static void main(String args[])
   {
	   OffsetDateTime offsetDT=OffsetDateTime.now();
	   System.out.println(offsetDT.getDayOfMonth());//get the current day in this month
	   System.out.println(offsetDT.getDayOfYear());//get the day in this year
	   System.out.println(offsetDT.getDayOfWeek());//get the current day in this week
	   System.out.println(offsetDT.toLocalDate()); //print the current date
	   OffsetDateTime value1=offsetDT.minusDays(240);//subtracting 240 days from the current date
	   System.out.println(value1);
	   OffsetDateTime value2=offsetDT.plusDays(240);//adding 240 days from the current date
	   System.out.println(value2);
   }
}
