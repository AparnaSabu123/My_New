package superpackage;

public class SuperParentCons {
	
	public SuperParentCons()
	{
		System.out.println("super parent construtor");
	}
	
	public SuperParentCons(int a,int b)
	{
		this();
		System.out.println(a);
	}

}
