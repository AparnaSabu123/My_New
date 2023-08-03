package accessmodifierexample;

public class Sample1 {
	
	public static void display()
	{
		System.out.println("Sample 1 method");
	}
public void display1()
{
System.out.println("Dispay 1");	
}
	public static void main(String[] args) {
		
		Sample1 s1=new Sample1();
		s1.display1();
		Sample1.display();
		// TODO Auto-generated method stub

	}

}
