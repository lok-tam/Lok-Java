package collectionFrame;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		
		List<String> om = new ArrayList<>();
		
		om.add("uncle");
		om.add("aunt");
		om.add("uncle1");
		om.add("aunt1");
		om.add("uncle2");
		om.add("aunt2");
		
		
		List<String> fm = new ArrayList<>();
		
		fm.add("Dad");
		fm.add("Mom");
		fm.add("Dad1");
		fm.add("Mom1");
		fm.add("Dad2");
		fm.add("Mom2");
		
		fm.forEach(o->System.out.println(o));
		fm.addAll(om);
		System.out.println();				
		fm.forEach(f->System.out.println(f));
		System.out.println();
		fm.remove(7);
		fm.forEach(f->System.out.println(f));
		
		/*
		int a = fm.size(); //print fm collection size
		
		System.out.println(a);
		
		for(String n: fm) { //print fm collection data
			System.out.println(n);
		}
		
		System.out.println();
		System.out.println(fm.get(3)); //get position 3 data
		
		System.out.println(fm.contains("Mom")); //checks collection data
		
		fm.add(0,"Grandfather"); //add data in specified array position
		
		System.out.println("--------------------------------");
		fm.forEach(f->System.out.println(f)); //another way of printing collection data

*/	
		
	
	
	}

}
