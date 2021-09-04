package com.ksl.javalearn.basic.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub test
				
		ArrayList<String> arraylist = new ArrayList<>();
		//use add method with index
		arraylist.add(0, "Kansas");
		arraylist.add(1, "Missourie");			
		arraylist.add(2, "Arkansas");
		arraylist.add(3, "Texas");
		arraylist.add(4, "Ohio");
		
		//use add method without index
		arraylist.add("Nevada");
		
		//print element  at index 1 with get method
		System.out.println("arraylist get element 1 " + arraylist.get(1));
		
		//print element  at last index using get method
		System.out.println("arraylist get last  element " + arraylist.get(arraylist.size()-1));
		
		//verify if particular element exist with contains method
		System.out.println("arraylist contains Florida " + arraylist.contains("Florida"));
		
		
		ArrayList<String> arraylistNew = new ArrayList<>();
		arraylistNew.add("Arizona");
		
		//Use equal method to compare two different array list
		System.out.println("arraylist equals arraylistNew : " + arraylist.equals(arraylistNew));

		//use for loop to print each element of arraylist
		for(int i=0; i<arraylist.size(); i++) {
			System.out.println("arraylist at index no " + i + " : " + arraylist.get(i));
		}
		
		//use iterator to iterate each element of array list
		Iterator<String> iterator = arraylist.iterator();
		while(iterator.hasNext()) {
			System.out.println("arraylist iterator  : " + iterator.next());
		}
		
		//use iterator to iterate each element of array list
		Iterator<String> listiterator = arraylist.listIterator();
		while(listiterator.hasNext()) {
			System.out.println("arraylist listiterator  : " + listiterator.next());
		}
		
		System.out.println("arraylist listIterator : " + arraylist.listIterator());
		
		arraylist.remove(1);
		
		arraylist.set(2, "Georgia");
		
		System.out.print("arraylist : " + arraylist + "\n");
		System.out.println("arraylist size :" + arraylist.size());

 		arraylist.sort(Comparator.naturalOrder());
		System.out.print("arraylist sort Comparator naturalOrder :" + arraylist + "\n");

		Collections.sort(arraylist);
		System.out.print("Collections sort arraylist" + arraylist + "\n");
		
        Collections.sort(arraylist, Collections.reverseOrder());
		System.out.print("arraylist CollectionsreverseOrder : " + arraylist + "\n");

		
        Spliterator<String> states = arraylist.spliterator();
		System.out.println("states characteristics : " + states.characteristics());
		

		//declare array
		String myArray[] =  new String[arraylist.size()];
		//convert ArrayList to Array
		myArray = arraylist.toArray(myArray);
		//print Array
        System.out.println("ArrayList to Array :" + myArray.toString()); 
        
    	//	arraylist.toString();

        System.out.println("ArrayList to Array to String :" + Arrays.asList(myArray));

		System.out.println("arraylist isEmpty : " + arraylist.isEmpty());

    	arraylist.clear();
		
		System.out.println("arraylist isEmpty : " + arraylist.isEmpty());

			
	}

}