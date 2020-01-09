package collections;
import java.util.*;
class Contacts
 {
	private String name;
	private int ph;
	public void setname(String name)
	{
		this.name=name;
	}
	public void setph(int ph)
	{
		this.ph=ph;
	}
	public String getname()
	{
		return name;
	}
	public int getph()
	{
		return ph;
	}
 }
public class UserDefinedArrayList 
{
   public static void main(String args[])
   {
	   Contacts ob=new Contacts();
	   ob.setname("tim");
	   ob.setph(181888424);
	   Contacts ob1=new Contacts();
	   ob1.setname("john");
	   ob1.setph(181888425);
	   ArrayList<Contacts> contact= new ArrayList<Contacts>();
	   contact.add(ob);
	   contact.add(ob1);
	   System.out.println(contact.get(0).getname()+" "+contact.get(0).getph());
	   System.out.println(contact.get(1).getname()+" "+contact.get(1).getph());
   }
}
