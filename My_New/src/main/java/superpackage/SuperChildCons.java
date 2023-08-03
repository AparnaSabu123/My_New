package superpackage;

public class SuperChildCons extends SuperParentCons{
	
	public SuperChildCons()
	{
		super(10,20);
		System.out.println("Super child constructor");
	}

	public static void main(String[] args) {
		
		SuperChildCons sc=new SuperChildCons();
		// TODO Auto-generated method stub

	}

}
