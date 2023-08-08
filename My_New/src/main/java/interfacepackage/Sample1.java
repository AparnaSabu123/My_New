package interfacepackage;

public class Sample1 implements Sample {
	
	public void display()
	{
		System.out.println("Defenition for interface method display");
	}
public void add()
{
	
	System.out.println(a+b);
}

public void print()
{
	System.out.println("Method of class");
}
	public static void main(String[] args) {
		
		/*Sample1 obj=new Sample1();
		obj.display();
		obj.add();
		obj.print();
		System.out.println(obj.a);*/
		
		Sample obj1=new Sample1();
		obj1.display();
		obj1.add();
		//obj1.print(); class elements cannot be obtained when interface object is created 
		
		System.out.println(obj1.a);
				
		// TODO Auto-generated method stub

	}

}
