package superpackage;

public class superChild extends superParent{
	
	public void display()
	{
		System.out.println("Super child class");
		System.out.println(super.a);
		super.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(super.name);
		superChild sc=new superChild();
		sc.display();
		//sc.print();

	}

}
