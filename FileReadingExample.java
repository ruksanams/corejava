package stringtokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class FileReadingExample
{
  public static void main(String args[])
  {
	  BufferedReader br = null;
	  try
	  {
		  String line;
		  br= new BufferedReader(new FileReader("C:\\Users\\user_2\\eclipse-workspace\\corejava\\src\\stringtokenizer\\Stringtoken.txt"));
		  while((line = br.readLine())!=null)
		  {
			  System.out.println(line);
              StringTokenizer StringTokenizer=new  StringTokenizer(line,"|");
              while(StringTokenizer.hasMoreElements())
              {
            	  Integer id=Integer.parseInt( StringTokenizer.nextElement().toString());
            	  Double price=Double.parseDouble( StringTokenizer.nextElement().toString());
            	  String username=  StringTokenizer.nextElement().toString();
            	  StringBuilder sb=new StringBuilder();
            	  sb.append("\nId : "+id);
            	  sb.append("\nprice : "+price);
            	  sb.append("\nusername : "+username);
            	  sb.append("\n******************\n");
            	  System.out.println(sb);
              }
		  }
		  System.out.println("Done");
	  }
	  catch(IOException e)
	  {
		  e.printStackTrace();
	  }
	  finally
	  {
		 try
		 {
			 if(br !=null)
				 br.close();
		 }
		 catch(IOException ex)
		 {
			 ex.printStackTrace();
		 }
	  }
  }
}
