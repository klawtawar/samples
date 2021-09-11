package com.ksl.javalearn.basic.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;


public class HashSetSample {

	public static void main(String[] args) {
		//Create a Set
		HashSet<String> hashset = new HashSet<String>();

		//Add Element to Set	    	    		
		hashset.add("Ohio");
		hashset.add("Texas");
		hashset.add("Kansas");
		hashset.add("Arkansas");
		hashset.add("Nevada");
		hashset.add("Albama");

	    //Print set elements		
		System.out.println(hashset);

		//Iterate Set Using For-Each Loop
		Iterator<String> it = hashset.iterator();

		//Iterate Set Using While Loop
		while(it.hasNext()){
			System.out.println(it.next());
		}
			
		Spliterator<String> sp = hashset.spliterator();
		
        sp.forEachRemaining((n) -> System.out.println(n));
        
    	//Convert Set to List

		HashSet<Integer> hashnumset = new HashSet<Integer>();

		//Iterate Set Using For-Each Loop
		for(int i=0; i<=10; i++) {
		hashnumset.add(i);
		hashnumset.removeIf(n -> n%2!=0);
		}
        System.out.println(hashnumset);
        
		HashSet<Integer> hashnumnewset = new HashSet<Integer>();

		hashnumnewset.add(1024);
		hashnumnewset.add(2048);

		//Add All Elements From Another Collection
		hashnumnewset.addAll(hashnumset);

		System.out.println("Add all Elements From Another Collection" + hashnumnewset);

        System.out.println(hashnumset.hashCode());
 
		//Check size of Set		
        System.out.println(hashset.size());
        
		//Remove Elements From Set       
        hashset.remove("Kansas");
        hashnumset.remove(8);
        
        System.out.println(hashset + "\n" + hashnumset );
        
		//Remove All Elements From Set
        hashnumnewset.removeAll(hashnumset);
		
        //Remove All Elements From Another Collection		
        hashnumset.removeAll(hashnumnewset);
        hashnumnewset.clear();

        System.out.println("START" + hashset + "\n" + hashnumset + "\n" + hashnumnewset + "END");

		//Check if Set Contains Element
		System.out.println("Check if set contains " + hashnumset.contains(2));


		//Check if Set is Empty
		System.out.println("Check if set is empty " + hashnumset.isEmpty());
	    
		
		//Remove All Elements From Set
        hashnumnewset.removeAll(hashnumset);

	}
}
