package newsample;

public class ThisMethod {

	public void add(int a,int b) {
		System.out.println(a+b);
		this.sub(40, 20);
	}
	public void sub(int c,int d) {
	System.out.println(c-d);
	this.employeeDetails(9400,"Aparna");
	}
	public void employeeDetails(int empid,String empName)
	{
		System.out.println(empid);
		System.out.println(empName);
		this.div(10, 5);
	}
	public void div(int e,int f)
	{
		System.out.println(e/f);
	}
public static void main(String args[])
{
	ThisMethod tm=new ThisMethod();
	tm.add(20, 10);
	
	
}
}