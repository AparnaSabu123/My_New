package inheritance;

public class Child extends Parent {
	
	public void sub()
	{
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		
		Child c=new Child();
		c.sub();
		c.Display();
		// TODO Auto-generated method stub

	}

}
