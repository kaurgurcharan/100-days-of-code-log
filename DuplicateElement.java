package com.arraylist;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		String[] list = {"Miami", "Canada", "USA", "Australia","India", "Canada"};
		
		// with for loop
		
		for(int i=0; i<list.length-1; i++) {
			for(int j=i+1; j<list.length; j++) {
				if(list[i] == list[j]) {
					System.out.println("Duplicate element found: " +list[i]);
				}
			}
		}
		
		// with set interface 
		
		Set<String> store = new HashSet<String>();
		for(String name: list) {
			if(store.add(name) == false) {
				System.out.println("Duplicate element found: " +name);
			}
		}

	}

}
