package stringmethods;
public class CharAtExample4
{
	public static void main(String args[])
	  {
		String str= "Welcome to FACE portal";
		int count=0;
		for(int i=0;i<=str.length()-1;i++)//iterate still the length of string
		{
			if(str.charAt(i)=='t')
			{
				count++;//count all values of t in the string
			}
		}
		System.out.println("Frequency of t is: "+count);//printing the frequency of t
	  }
	}
