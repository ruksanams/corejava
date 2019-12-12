package corejava;
import java.util.Scanner;
public class Corejava3 
 {
     String name,address,phone,email,prooftype,proofid;//data Members
     public static void main(String[]args)
	  {
		    Scanner obj=new Scanner(System.in);
		    System.out.println("Enter your Name:");
	            Corejava31 ob=new Corejava31();
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
		    ob.setname(name);
		    ob.setaddress(address);
		    ob.setphone(phone);
		    ob.setemail(email);
		    ob.setprooftype(prooftype);
		    ob.setproofid(proofid);
		    System.out.println("  Thank you for registration\\n          Your details are");
		    System.out.println("Name       : "+ob.getname());
		    System.out.println("Address    : "+ob.getaddress());
		    System.out.println("Email Id   : "+ob.getphone());
		    System.out.println("Phone no   : "+ob.getemail());
		    System.out.println("Proof Type : "+ob.getprooftype());
		    System.out.println("Proof Id   : "+ob.getproofid());
		    
	  }
}
