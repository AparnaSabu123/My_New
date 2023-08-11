package exceptionsample;

public class ThrowException {
	
	public static void testThrow(int age)
	{
	if(age<18)
	{
		throw new ArithmeticException("Not eligible"); //throws to exception class constrcutor explicitly
	}
	else
	{
		System.out.println("Eligible for vote");
	}
	}

	public static void main(String[] args) {
		
		System.out.println("rest of code");
		ThrowException.testThrow(10);
		//System.out.println("rest of code");
		// TODO Auto-generated method stub

	}

}
