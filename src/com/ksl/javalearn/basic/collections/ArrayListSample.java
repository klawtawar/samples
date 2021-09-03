package com.ksl.javalearn.basic.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub test
				
		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add(0, "Kansas");
		arraylist.add(1, "Missourie");			
		arraylist.add(2, "Arkansas");
		arraylist.add(3, "Texas");
		arraylist.add(4, "Ohio");
		arraylist.add("Nevada");
		
		System.out.println("arraylist get 1 " + arraylist.get(1));
		
		System.out.println("arraylist contains Florida " + arraylist.contains("Florida"));
		
		ArrayList<String> arraylistNew = new ArrayList<>();
		arraylistNew.add("Arizona");
		
		System.out.println("arraylist equals arraylistNew : " + arraylist.equals(arraylistNew));

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
