package corejava;
import java.util.Scanner;
public class corejava1 {
	String name,address,phone,email,prooftype,proofid;
	
  public static void main(String[]args)
  {
	Scanner obj=new Scanner(System.in);
	corejava1 ob=new corejava1();
    System.out.println("Enter your Name:");
    ob.name=obj.nextLine();
    System.out.println("Enter your Address:");
    ob.address=obj.nextLine();
    System.out.println("Enter your Phone no:");
    ob.phone=obj.nextLine();
    System.out.println("Enter your Email id:");
    ob.email=obj.nextLine();
    System.out.println("Enter your Proof Type:");
    ob.prooftype=obj.nextLine();
    System.out.println("Enter your Proof id:");
    System.out.println("       Thank you for registration     ");
    System.out.println("            Your details are ");
    System.out.println("Name       : "+ob.name);
    System.out.println("Address    : "+ob.address);
    System.out.println("Email Id   : "+ob.email);
    System.out.println("Phone no   : "+ob.phone);
    System.out.println("Proof Type : "+ob.prooftype);
    System.out.println("Proof Id   : "+ob.proofid);
    
    
}
}
