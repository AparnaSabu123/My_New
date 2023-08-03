package accessmodifierexample;

public class Sample2 {
	
	public static void print()
	{
		System.out.println("Sample 2");
	}

	public static void main(String[] args) {
		
		Sample2.print();
		
		Sample1 sa=new Sample1();//Aggregation
		sa.display1();
		// TODO Auto-generated method stub

	}

}
