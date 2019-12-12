package corejava;
import java.util.Scanner;
public class Corejava2 
    {
	public String name,address,phone,email,prooftype,proofid;//data Members
	public corejava2(String name,String address,String phone,String email,String prooftype,String proofid)//parameterised constructor
	   {
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.email=email;
		this.prooftype=prooftype;
		this.proofid=proofid;
	   }
        public void register()//register method
         {
	  System.out.println("     Thank you for registration\n          Your details are");
          System.out.println("Name       : "+name);
          System.out.println("Address    : "+address);
          System.out.println("Email Id   : "+phone);
          System.out.println("Phone no   : "+email);
          System.out.println("Proof Type : "+prooftype);
          System.out.println("Proof Id   : "+proofid);
         }
	 public static void main(String[]args)
	  {
	    Scanner obj=new Scanner(System.in);
	    System.out.println("Enter your Name:");
	    String name=obj.nextLine();
	    System.out.println("Enter your Address:");
	    String address=obj.nextLine();
	    System.out.println("Enter your Phone no:");
	    String phone=obj.nextLine();
	    System.out.println("Enter your Email id:");
	    String email=obj.nextLine();
	    System.out.println("Enter your Proof Type:");
	    String prooftype=obj.nextLine();
	    System.out.println("Enter your Proof id:");
	    String proofid=obj.nextLine();
	    Corejava2 ob=new Corejava2(name,address,phone,email,prooftype,proofid);//calling constructor
	    ob.register();//calling method using object
	  }
 }
