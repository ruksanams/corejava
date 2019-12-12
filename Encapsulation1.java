package corejava;
public class Encapsulation1 
{
 String name,address,phone,email,prooftype,proofid;
 public void setname(String name)
       {
		this.name=name;
	}
	public void setaddress(String address)//updating values
	{
		this.address=address;
	}
	public void setphone(String phone)
	{
		this.phone=phone;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	public void setprooftype(String prooftype)
	{
		this.prooftype=prooftype;
	}
	public void setproofid(String proofid)
	{
		 this.proofid=proofid;
	}
       public String getname()//retrieving values
       {
    	return this.name;
       }
      public String getaddress()
       {
    	return this.address;
       }
     public String getphone()
      {
    	return this.phone;
      }
    public String getemail()
     {
    	return this.email;
     }
    public String getprooftype()
     {
    	return this.prooftype;
     }
    public String getproofid()
     {
    	return this.proofid;
     }
}

