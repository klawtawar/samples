package com.ksl.javalearn.basic.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetSample {

	public static void main(String[] args) {
		
		//Create a Set
		LinkedHashSet<String> linkedhashset = new LinkedHashSet<String>();
			
		//Add Element to Set	
		
	     for(String str: Arrays.asList("Ohio", "Ohio", "Texas", "Kansas", "Arkansas", "Nevada","Albama" )){

	        linkedhashset.add(str);		
		
	        }
		
	    //Print set elements		
		System.out.println(linkedhashset);
		
		//Iterate Set Using For-Each Loop

		Iterator<String> it = linkedhashset.iterator();
	
		while(it.hasNext()) {
			System.out.println(it.next());					
		}
		
		Object[] str = new String[linkedhashset.size()];
		
		str = linkedhashset.toArray();
		
		for(int i=0; i<linkedhashset.size() ; i++) {
			System.out.println(str[i]);
		}
		
}}

