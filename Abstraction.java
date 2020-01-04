package corejava;

abstract class Animal11//abstract class
{
   private String name;
   public Animal11(String name)
   {
	   this.name=name;
   }
  public abstract void eat();//abstract method
  public abstract void breathe();//abstract method
  public String getname() 
  {
	  return name;
  }
}
class Racoon extends Animal11//inherited class
{
	public Racoon(String name)
	{
		super(name);
	}
       public void eat() 
        {
	 System.out.println(getname()+"is eating");
        }
       public void breathe()
        {
	 System.out.println("breathe in,breathe out,repeat");
        }
}
public class abstraction 
{
	public static void main(String[]args)
	{
		Racoon racoon=new Racoon("Racoon");
		racoon.eat();
		racoon.breathe();
	}
		
}

