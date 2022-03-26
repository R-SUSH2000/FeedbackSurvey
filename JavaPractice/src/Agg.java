class name {
	String aname;
	String lname;
	String mname;
	 
	public name(String f, String l,String m)
	{
		this.aname=f;
		this.lname=l;
		this.mname=m;
	} 
}     
class employee{ 
	int salary;
	name n;
	public void display(name n , int s)
	{
		System.out.println(" "+n.aname+" "+n.lname+" "+n.mname);
		System.out.println(s);
	}
}
public class Agg {
	
	public static void main(String args[])
	{
		employee e= new employee();	
		name n= new name(" SUYASH ", " Agrawal ", "HEe"); 
		e.display(n, 2000);
	}
	
}