package corejava;
import java.util.Scanner;
public class polymorphism {
	public void area(int s)
	{
		int d=s*s;
		System.out.println("Area of the square is : "+d);
	}
    public void area(int l,int b)
    {
    	int d=l*b;
    	 System.out.println("Area of rectangle is : "+d);
    	   
    }
    public void area(float base,float h)
    {
    	float d=(float)((0.5)*base*h);
    	System.out.println("Area of triangle is : "+d);
    }
    public void area(float r)
    {
    	float d=(float)((3.14)*r*r);
    	System.out.println("Area of circle is : "+d);
    }
    
    public static void main(String[]args)
    {
    Scanner obj=new Scanner(System.in);
     String t;
    polymorphism ob=new polymorphism();
   do {
	   
   
    System.out.println("Enter your choice\n1.Area of square\n2.Area of Rectangle\n3.Area of Triangle\n4.Area of Circle");
    int ch=obj.nextInt();
    switch(ch)
    {
    case 1:
    	System.out.println("Enter the side of square : ");
        int s=obj.nextInt();
        ob.area(s);
        break;
    case 2:
       System.out.println("Enter the length of rectangle : ");
       int l=obj.nextInt();
       System.out.println("Enter the breadth of rectangle : ");
       int b=obj.nextInt();
       ob.area(l,b);
       break;
    case 3:
       System.out.println("Enter the base of triangle : ");
       float base=obj.nextFloat();
       System.out.println("Enter the height of triangle : ");
       float h=obj.nextFloat();
       ob.area(base,h);
       break;
    case 4:
       System.out.println("Enter the radius of the circle: ");
       float r=obj.nextFloat();
       ob.area(r);
       break;
       default:System.out.println("Invalid");
   }
    obj.nextLine();
    System.out.println("Do you want to continue: y/n");
     t=obj.nextLine();
   }while(t.equals("y"));
    }
}
