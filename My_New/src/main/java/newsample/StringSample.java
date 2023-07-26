package newsample;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sample";
		System.out.println(s1);
		String s2=new String("Hello");
		System.out.println(s2);
		//String methods
		String s3="Good Morning";
		System.out.println(s3.length());
		System.out.println(s3.charAt(0));
		int a=10;
		String s4=String.valueOf(a);
		System.out.println(s4); //data type of a is converted to String 
		//String equals
		String s5="Welcome";
		String s6="Welcome";
		String s7="Hi";
		String s8="Traning";
		String s9="WELCome";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equals(s7));
		System.out.println(s5.equals(s9));
		// String isEmpty()
		String s10=" ";
		System.out.println(s10.isEmpty());
		// String equalsIgnoreCase()
		String s11="aPARNA";
		String s12="APARNA";
		System.out.println(s11.equalsIgnoreCase(s12));
		
		
		

	}

}
