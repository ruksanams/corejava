package collections;
import java.util.*;
public class HashSetExample 
{
  public static void main(String args[]) 
  {
	  Scanner s=new Scanner(System.in);
	  Set<String> popularCities=new HashSet<String>();
	  // check the Hash set is empty or not 
	  if(popularCities.isEmpty())
	  {
		  System.out.println("Is popularCities set empty? : "+popularCities.isEmpty());
	  }
	  System.out.println("Enter no:of cities");
	  int n=s.nextInt();
	  System.out.println("Enter cities");
	  s.next();//for avoid buffering
	  //adding cities into the Hash set
	  for(int i=0;i<n;i++)
	  {
		  String str=s.nextLine();
		  popularCities.add(str);
	  }
	  System.out.println("Number of cities in the HashSet "+popularCities.size());//print the size of Hash set
	  System.out.println("Enter the city to search");
	  String str1=s.nextLine();
	  //searching the given element is present in the Hash set
	  if(popularCities.contains(str1))
	  {
		  System.out.println(str1+" is in the popular Cities set ");
	  }
  }
}
