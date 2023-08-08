package finalsample;

public class finalChild extends finalParent{
	
	final int num=8;
	public  void add(int a,int b)
	{
		System.out.println(a-b);
		 //num=10; varibale initialized by final,so it cannot be changed
	}

	public static void main(String[] args) {
		
		finalChild fc=new finalChild();
		//fc.sub(100, 50);
		fc.add(10,20);
		// TODO Auto-generated method stub

	}

}
