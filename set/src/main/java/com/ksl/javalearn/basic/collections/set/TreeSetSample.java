package com.ksl.javalearn.basic.collections.set;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {


		System.out.println("Hello set");
		//Create a Set

	    Set setHash = new HashSet();
	    Set setLinkedHash = new LinkedHashSet();	    
	    Set<String> setTreeSet = new TreeSet<String>();

	    
		//Add Element to Set	    	    
	    setTreeSet.add("Kansas");
	    setTreeSet.add("Texas");
	    setTreeSet.add("Nevada");
	    setTreeSet.add("Arkansas");
	    setTreeSet.add("Ohio");
	    
		//Iterate Set Using For-Each Loop
        List<String> aListChars = new ArrayList<String>();
        
		//Convert Set to List
        aListChars.addAll(setTreeSet);
        
		//Iterate Set Using For-Each Loop
	    for(int i=0; i<setTreeSet.size(); i++ ) {
	    	System.out.println("Using for loop :  " + aListChars.get(i));
	    }
        		
	    for(String s : aListChars ) {
	    	System.out.println("Using for each loop :  " +s);
	    }
	    
	    
		//Iterate Set Using While Loop
	    Iterator<String> itr = setTreeSet.iterator();
	    
	    while(itr.hasNext()){
	    	String s = itr.next();
	    	System.out.println("Using while loop :  "+ s);
	    }
	    
	    
	    //Print set elements
	    System.out.println(setTreeSet);

		//Check size of Set
	    System.out.println(setTreeSet.size());
	    
		//Check if Set Contains Element
	    System.out.println(setTreeSet.contains("Ohio"));
	    
		//Remove Elements From Set
	    System.out.println(setTreeSet.remove("Ohio"));
	    
	    System.out.println(setTreeSet);
	    
	    //Check if Set is Empty
	    System.out.println("Check if set is empty " + setTreeSet.isEmpty());
	    
		//Add All Elements From Another Collection

	    Set set = new TreeSet();
	    
		//Retain All Elements Present in Another Collection
	    set.addAll(setTreeSet);
	    System.out.println("All from set " + set);

	    set.add("Kansas");

		//Remove All Elements From Another Collection
	    setTreeSet.removeAll(set);
	    System.out.println("After removing all from set " + set);


		//Remove All Elements From Set
	    System.out.println("Before removing all " + setTreeSet);
	

	    
		//Remove All Elements From Set
	    setTreeSet.removeAll(setTreeSet);
	    System.out.println("After removing all " + setTreeSet);
	    
	    System.out.println("Check if set is empty " + setTreeSet.isEmpty());
	}

}
