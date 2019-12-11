package staticexaple;

public class staticexample {
static int count=0;
staticexample()
{
	count++;
	System.out.println(count);
	
}
public static void main(String args[])
{
	staticexample a=new staticexample();
	staticexample b=new staticexample();
	staticexample c=new staticexample();
	
}
}
