package collectioneg;

import java.util.ArrayList;
import java.util.Iterator;



public class CollectionSample {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();//non generic arraylist
		al.add("Aparna");
		al.add('a');
		al.add(30);
		al.add(1.1f);
		System.out.println(al);
		
		ArrayList<String> obj=new ArrayList();//Generic arraylist
		obj.add("Aparna");
		obj.add("Athira");
		obj.add("Anila");
		obj.add("Nehna");
		System.out.println(obj);
		
		obj.remove(1);
		System.out.println(obj);
		ArrayList<String> obj1=new ArrayList();
		obj1.add("Jithin");
		obj1.add("Arun");
		obj1.add("Midhun");
		System.out.println(obj1);
		obj1.addAll(obj);
		System.out.println(obj1);
		obj.removeAll(obj);
		System.out.println(obj);
		//obj1.get(0);
		System.out.println(obj1.get(0));
		System.out.println(obj1.size());
		boolean b=obj1.contains("Jithin");
		System.out.println(b);
		boolean c=obj1.contains("Leo");
		System.out.println(c);
		
		Iterator itr=obj1.iterator();
		  while(itr.hasNext()) {
		  System.out.println(itr.next());
		}
		  itr.remove();
		  System.out.println(obj1);
		
		
		
		// TODO Auto-generated method stub

	}

}
