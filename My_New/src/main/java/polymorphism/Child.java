package polymorphism;

public class Child extends Parent{
	@Override
	public void display()
	{
		super.display();
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		
		Child c=new Child();
		c.display();
		
		/*Parent p=new Parent();
		p.display();*/
		// TODO Auto-generated method stub

	}

}
