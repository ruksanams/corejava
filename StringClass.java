package strings;
public class StringClass 
 {
   public static void main(String[]args)
   {
	   String s1,s2;
	   s1=new String("Ruksana");
	   s2=new String("Ruksana");
	   System.out.println(s1);
	   System.out.println(s2);
	   System.out.println(s1==s2);//false because different memory allocatin
	   System.out.println(s1.hashCode());//
	   System.out.println(s2.hashCode());
	   s2=s1+s2;//concating
	   System.out.println(s1);
	   System.out.println(s2);
	   System.out.println(s1.hashCode());//value will be same
	   System.out.println(s2.hashCode());//value different because it is concated
	   
   }
   
}
