package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import java.util.List;

public class TraverseArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		//for(int i : list) {
			list.add("Miami");
			list.add("USA");
			list.add("Hongkong");
			list.add("Canada");
			list.add("London");
		//}
		
		//ArrayList<Integer> list1 = new ArrayList<Integer>();
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\n******************************\n");
		list.remove("Hongkong");
		list.add(1, "China");
		
		Iterator iterator1 = list.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
			
		System.out.println("\nList after sorting\n");
		
		Collections.sort(list);
		for(String i : list) {
			System.out.println(i);
		}

	}

}
