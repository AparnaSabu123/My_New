package inheritance;

import accessmodifierexample.Class1;

public class Child extends Parent {
	
	public void sub()
	{
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		
		Child c=new Child();
		c.sub();
		c.Display();
		Class1.add();
		//Class1.print();
		//Class1.sub();
		//System.out.println(Class1.name);
		// TODO Auto-generated method stub

	}

}
