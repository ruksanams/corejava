package collections;
import java.util.*;
public class HashMapContainsExample 
{
   public static void main(String args[])
   {

		Scanner s=new Scanner(System.in);
		HashMap<Integer,String> map3= new HashMap<Integer,String>();
		System.out.println("Enter the no:of values");
		int n=s.nextInt();
		System.out.println("Enter the values");
		for(int i=0;i<n;i++)
		{
			int roll=s.nextInt();
			String name=s.next();
			map3.put(roll,name);
		}
		System.out.println("Enter the key to be check");
		int n1=s.nextInt();
		System.out.println(map3.containsKey(n1));
		System.out.println("Enter the value to be check");
		String n2=s.next();
		System.out.println(map3.containsKey(n2));
	}
   }

