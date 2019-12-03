package corejava;
import java.util.Scanner;
class A{
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.print("sum is "+c);
	}
	
}

public class inheritance extends A{
	int a,b;
	public void add(int a,int b) {
		int c=a+b+10;
		System.out.print("sum is "+c);
	}
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first number  : ");
		int a=obj.nextInt();
		System.out.println("Enter the second number : ");
		int b=obj.nextInt();
		A ob=new inheritance();
		ob.add(a,b);
	}

}
