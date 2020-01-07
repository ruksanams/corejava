package javadatetime;
import java.util.Calendar;
public class JavaCalenderExample 
{
  public static void main(String args[])
  {
	  Calendar calendar=Calendar.getInstance();
	  System.out.println("The current date is : "+calendar.getTime());
	  calendar.add(Calendar.DATE, -15);
	  System.out.println("15 days ago : "+calendar.getTime());
	  calendar.add(Calendar.MONTH, 4);
	  System.out.println("4 months later : "+calendar.getTime());
	  calendar.add(Calendar.YEAR, 2);
	  System.out.println("2 years later : "+calendar.getTime());
	  System.out.println("At present Calendar's Year : "+calendar.get(Calendar.YEAR));
	  System.out.println("At present Calendar's Day : "+calendar.get(Calendar.DATE));
	  System.out.print("At present Date and time is : "+calendar.getTime());
	  int maximum=calendar.getMaximum(calendar.DAY_OF_WEEK);
	  System.out.println("Maximum number of days in week: "+maximum);
	  maximum=calendar.getMaximum(calendar.WEEK_OF_YEAR);
	  System.out.println("Maximum number of weeks in year: "+maximum);
	  int minimum=calendar.getMinimum(calendar.DAY_OF_WEEK);
	  System.out.println("Mainimum number of days in week: "+minimum);
	  minimum=calendar.getMinimum(calendar.WEEK_OF_YEAR);
	  System.out.println("Mainimum number of weeks in year: "+minimum);
  }
}
