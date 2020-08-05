package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		
		al.add(2);
		al.add(3);
		al.add(5);
		al.add(8);
		al.add(2);
		al.add(5);
		
		System.out.println(al);
		
		System.out.println("------------------------------------------------------");
		
		for(int num:al) {
			System.out.println(num);
		
		}

		System.out.println("------------------------------------------------------");
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("------------------------------------------------------");
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
	}

}
