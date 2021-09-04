package com.ksl.javalearn.basic.collections.list;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListSample {

	public static void main(String[] args) {
		
		LinkedList<String> linkedlist =  new LinkedList<String>();
				
		linkedlist.add(0, "Kansas");
		linkedlist.add(1, "Missourie");			
		linkedlist.add(2, "Arkansas");
		linkedlist.add(3, "Texas");
		linkedlist.add(4, "Ohio");		
		linkedlist.add(5, "Ohio");

		
		//use add method without index
		System.out.println(linkedlist);
		
		//This method returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
		System.out.println(linkedlist.indexOf("Ohio"));
		
		//Replace element at particular index.
		linkedlist.add(0, "Nevada");
		System.out.println(linkedlist);
		
		//Insert element at specified  index and its pushes other forward.
		linkedlist.set(3, "Florida");
		
		for(int i=0; i<linkedlist.size(); i++) {
			
			System.out.println("linked list get " + linkedlist.get(i));

		}

		linkedlist.remove("Kansas");
		linkedlist.remove(2);
		System.out.println(linkedlist);

		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println(linkedlist);
		
		
		for(String str : linkedlist) {
			System.out.println(str);
		}
		
		String[] array = new String[linkedlist.size()];
		
		linkedlist.toArray(array);
		
		System.out.println(Arrays.toString(array));
		
		
		linkedlist.clear();
		
		
	}

}
