package exceptionsample;

public class SampleClass {
	
	public void test(int age) throws LicenseException
	{
		if(age<=18)
		{
			throw new LicenseException("not eligible");
		}
		else
		{
			System.out.println("eligible for vote");
		}
	}
	
	public static void main(String args[]) 
	
	{
		SampleClass obj=new SampleClass();
		try {
			obj.test(12);
		} catch (LicenseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
