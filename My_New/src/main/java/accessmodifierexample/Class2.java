package accessmodifierexample;

public class Class2  {
	
	public static void sub()
	{
		int c=30;
		int d=10;
		System.out.println(c-d);
	}

	public static void main(String[] args) {
		Class2.sub();
		Class1.add();
		Class1.sub();
		Class1.print();
		//System.out.println(Class1.name);
		// TODO Auto-generated method stub

	}

}
