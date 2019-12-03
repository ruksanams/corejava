package corejava;
import java.util.Scanner;

 class cat {
	public void animalsound()
	{
		System.out.println("Sounds of different animals");
	}
	}
class lion extends cat{
	public void animalsound()
	{
		System.out.println("The lion roars");
	}
	}
class Animal extends cat{
	public void animalsound()
	{
		System.out.println("The cat meows");
	}
    
 public static void main(String[]args)
  {
	cat myanimal=new cat();
	cat mylion=new lion();
	cat mycat=new Animal();
	
   myanimal.animalsound();
   mylion.animalsound();
   mycat.animalsound();
}
}