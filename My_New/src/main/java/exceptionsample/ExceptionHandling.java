package exceptionsample;

public class ExceptionHandling {
	public void display()
	{
		int a=10;
		try
		{
		int b=a/0;
		System.out.println(b);
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		
		ExceptionHandling obj=new ExceptionHandling();
		
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
