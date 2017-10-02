package com.tamang.lok.ArrayList;

//import java.util.*;

public class AList {
	
	public static void main(String[] args) {
		
		java.util.ArrayList<String> al = new java.util.ArrayList<String>();
		
		al.add("apple");
		al.add("bapple");
		al.add("capple");
		al.add("dapple");
		al.add("eapple");
		
		System.out.println("Original AL lists: " + al);
		System.out.println();
		
		java.util.ArrayList<String> al1 = new java.util.ArrayList<String>();
		
		al1.add("apple1");
		al1.add("bapple1");
		al1.add("capple1");
		al1.add("dapple1");
		al1.add("eapple1");
		
		System.out.println("Original AL1 lists: " + al);	
		System.out.println();
		
		al.addAll(al1);
		System.out.println("After adding collection al1 to al: " + al);		
		

	}

}
