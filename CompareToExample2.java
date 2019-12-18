package stringmethods;
public class CompareToExample2 
{
  public static void main(String args[])
  {
	   String s1="hello";
	   String s2="";
	   String s3="me";
	   System.out.println(s1.compareTo(s2));//5 because it will returns the length of 1st string
	   System.out.println(s2.compareTo(s3));//-2 because length difference is -2 compare with s2
  }
}
