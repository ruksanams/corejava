package stringmethods;
public class ConcatExample1 
{
	public static void main(String args[])
	{
		String s1="Java string";
		s1.concat("is immutable");
		System.out.println(s1);//string is immutable so string does't change
		s1=s1.concat("is immutable so assign it explicitly");
		System.out.println(s1);//string is mutable by assign it explicitly
	}
}
