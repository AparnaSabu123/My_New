package inheritance;

public class MultiChild extends MultiParent {

	public void div()
	{
		System.out.println(c/d);
	}
	public static void main(String[] args) {
		
		MultiChild mc=new MultiChild();
		mc.div();
		mc.multiple();
		System.out.println(mc.c);
		mc.add();
		// TODO Auto-generated method stub

	}

}
