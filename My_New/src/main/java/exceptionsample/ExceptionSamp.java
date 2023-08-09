package exceptionsample;

public class ExceptionSamp {
	
	public void display()
	{
		int a=10;
		int b=a/0;
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		ExceptionSamp obj=new ExceptionSamp();
		System.out.println("Before exception");
		obj.display();
		System.out.println("After exception");
		// TODO Auto-generated method stub

	}

}
