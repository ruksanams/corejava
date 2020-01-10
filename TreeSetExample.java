package casestudies;
import java.util.*;
public class TreeSetExample 
{
  public static void main(String args[])
  {
	int n,i;
	String name;
	int age;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no:of Employees");
	n=s.nextInt();
	TreeSet<Employee> hashset= new TreeSet<Employee>();
	Employee[] emp=new Employee[n];
	System.out.println("Enter the name and age of Employees");

	for(i=0;i<n;i++)
	{
		name=s.next();
		age=s.nextInt();
		emp[i]=new Employee();
		emp[i].setAge(age);
		emp[i].setName(name);
		hashset.add(emp[i]);
	}
	for(Employee e:hashset)
		System.out.println(e.getName()+" "+e.getAge());
	s.close();
  }
}
