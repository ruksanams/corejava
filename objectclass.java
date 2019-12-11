package objclass;

public class objectclass {
	static int last_roll;
	int roll_no;
	//constructor
	objectclass()
	{
		roll_no =last_roll;
		last_roll++;
		
	}
	public int hashcode()
	{
		return roll_no;
	}
	public static void main(String[]args)
	{
		objectclass s=new objectclass();
		System.out.println(s);
		System.out.println(s.toString());
		Object obj=new String("Face");
		Class c=obj.getClass();
		System.out.println("class of object obj is : "+c.getName());
		
		s=null;
		System.gc();//garbage collection
	}
	
	protected void finalize()
	{
		System.out.println("finalize metod called");
	}
}

