package accessmodifierexample;

public class Class1 {
	
	public static void add()
	{
		int a=1;
		int b=2;
		System.out.println(a+b);
	}
	int a=10;
	static void sub()
	{
		System.out.println("substract");
	}
	protected static void print()
	{
		System.out.println("protected");
	}
	private static String name="Aparna";
	
	public static void main(String args[])
	{
		Class1.add();
		System.out.println(Class1.name);
		Class1 cs=new Class1();
		System.out.println(cs.a);
		Class1.sub();
		Class1.print();
	}

}
