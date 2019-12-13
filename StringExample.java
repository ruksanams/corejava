package strings;
public class StringExample 
 {
    public static void main(String args[])
    {
    	String str="I, am, going, to, split, this, stringby, space.";
    	String[] str1=str.split(",");
    	for(String a:str1)//for each loop is used to transverse the array
    		System.out.print(a);
    }
}
