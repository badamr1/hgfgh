package collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesInArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(7);
		list.add(3);
		list.add(9);
		list.add(5);
		
		System.out.println("Adding elements to the list");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("After removing dulicates from the list");
		
		List<Integer> newlist = new ArrayList<Integer>();
		
		for(int i=0; i<list.size(); i++) {
			
			if(!newlist.contains(list.get(i))) {
				newlist.add(list.get(i));
			}
		}
		
		for(int i=0; i<newlist.size(); i++) {
			System.out.println(newlist.get(i));
		}
		
	}
}
