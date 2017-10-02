package com.tamang.lok.ArrayList;

import java.util.*;

public class ArrayList {

	public static void main(String[] args) {
		java.util.ArrayList<String> list = new java.util.ArrayList<String>();

		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println();
		
		list.remove(0);
		System.out.println(list);
		System.out.println();
		
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
