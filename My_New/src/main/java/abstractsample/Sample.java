package abstractsample;

public class Sample extends AbstractSample {
	
	public void print()  //this is abstract method 
	{
		System.out.println("This is abstract method ");
	}

	public static void main(String[] args) {
		
		Sample obj=new Sample();
		obj.print();
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
