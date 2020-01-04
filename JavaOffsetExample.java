package javadatetime;
import java.time.OffsetTime;
import java.time.temporal.ChronoField;
public class JavaOffsetExample 
{
   public static void main(String args[])
   {
	   OffsetTime offset=OffsetTime.now();
	   int h=offset.get(ChronoField.HOUR_OF_DAY);//taking the current hour from total hours of the day
	   System.out.println(h);
	   int m=offset.get(ChronoField.MINUTE_OF_DAY);//taking the current minute from total minute of the day
	   System.out.println(m);
	   int s=offset.get(ChronoField.SECOND_OF_DAY);//taking the current second from total second of the day
	   System.out.println(s);
	   int h1=offset.getHour();
	   System.out.println(h1+" hour");//current hour in the system
	   int m1=offset.getMinute();
	   System.out.println(m1+" minute");//current minute in the system
	   int s1=offset.getSecond();
	   System.out.println(h1+" second");//current second in the system
   }
}
