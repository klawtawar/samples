package com.ksl.javalearn.basic.collections.set.set;

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
		linkedhashset.add("Ohio");		
		linkedhashset.add("Ohio");
		linkedhashset.add("Texas");
		linkedhashset.add("Kansas");
		linkedhashset.add("Arkansas");
		linkedhashset.add("Nevada");
		linkedhashset.add("Albama");
		
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

	}

}
