package javadatetime;
import java.time.Clock;
import java.time.Duration;
public class JavaClockExample
{
    public static void main(String args[])
    {
      Clock c1=Clock.systemDefaultZone();//converting to date and time using the Default Time Zone
      System.out.println(c1.getZone());//get the time Zone
      Clock c2=Clock.systemUTC();//converting to date and time using the UTC Time Zone
      System.out.println(c2.instant());//get the universal time that is minus 5:30 hour from current time
      Duration d=Duration.ofMinutes(330);
      Clock clock=Clock.offset(c2, d);//adding 5:30 hours to the universal time
      System.out.println(clock.instant());
      
    }
}
