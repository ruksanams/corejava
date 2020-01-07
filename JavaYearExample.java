package javadatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class JavaYearExample
{
  public static void main(String args[])
  {
	  Year y1=Year.now();//to get the current year
	  System.out.println(y1);
	  Year y2=Year.of(2020);
	  LocalDate l=y2.atDay(100);//to get the date of specified number
	  System.out.println(l);
	  System.out.println(y2.length());//to get the no:of days in the specified year
	  System.out.println(y2.isLeap());//to check the given year is leap or not
	  YearMonth ym=YearMonth.now();//to get the current month in the given year
	  System.out.println(ym);
	  String s=ym.format(DateTimeFormatter.ofPattern("MM yyyy"));
	  System.out.println(s);//Specify date in format of "MM yyyy"
	  long l1=ym.get(ChronoField.YEAR);//to get year
	  System.out.println(l1);
	  long l2=ym.get(ChronoField.MONTH_OF_YEAR);
	  System.out.println(l2);
	  YearMonth ym2=ym.plus(Period.ofYears(2));
	  System.out.println(ym2);
	  YearMonth ym3=ym.minus(Period.ofYears(2));
	  System.out.println(ym3);
  }
}
