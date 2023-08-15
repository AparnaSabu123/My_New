package collectioneg;

import java.util.ArrayList;
import java.util.List;

public class CollectionSample2 {
	
	public static void main(String args[])
	{
		List<String> l1=new ArrayList();
		l1.add("hello");
		l1.add("good");
		l1.add("morning");
		System.out.println(l1);
		l1.remove(0);
		System.out.println(l1);
		List<String> l2=new ArrayList();
		l2.add("How");
		l2.add("are");
		l2.add("you");
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
		l2.removeAll(l2);
		System.out.println(l2);
		System.out.println(l1.get(0));
		System.out.println(l1.size());
		boolean b=l1.contains("good");
		System.out.println(b);
		
	}

}
