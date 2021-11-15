package com.ksl.javalearn.basic.memory.compare;

import java.util.Arrays;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		int b = 2;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		int[] c = {1,2,3,4};
		

		
		System.out.println("c : " + c);
		System.out.println("c arrays to string : " + Arrays.toString(c));
		
		int[] d = c;

		System.out.println("d : " + d.toString());
		System.out.println("d : " + Arrays.toString(d));

		
		d[1]  = 99;

		System.out.println("d : " + d.toString());
		System.out.println("d : " + Arrays.toString(d));
		
		d = new int[5];

		System.out.println("d : " + d.toString());
		System.out.println("d : " + Arrays.toString(d));

		String g = "hello";
		
		System.out.println("g : " + g.hashCode());
		
		String h = "hello";
		
		System.out.println("h : " + h.hashCode());
		
		String hh = "hello";
		
		System.out.println("hh : " + hh.hashCode());
		
		String s1 = new String("hello");
		String s2 = new String("hello");

		System.out.println("s equals : " + s1.equals(s2));
		
		System.out.println("s ends with : " + s1.endsWith("o"));
		
		if(s1 == s2)
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");

		if(s1.equals(s2))
			System.out.println("s1 == s2");

		if(s1.compareTo(s2) == 1)
			System.out.println("s1 compareto = s2");
		else
			System.out.println("s1 not compareto = s2");
			
		
		if(g == s1)
			System.out.println("g == s1");
		else
			System.out.println("g == s1");

		
		
		
		char[] ff = s1.toCharArray();
		System.out.println("ff : " + Arrays.toString(ff));

		
		String p = "1234";
		
		System.out.println("p : " + p.equals(s1));
		
		String s = "ABCDEFGHIJKL";
		System.out.println("s substring : " + s.substring(5, 7));
		
		System.out.println("s concat : " + s.concat("deep") + " " + s);
		
		StringBuffer buffer = new StringBuffer("deep");
		System.out.println(buffer);
		buffer.append("hello");
		System.out.println(buffer);
		
		
		StringBuilder sb = new StringBuilder("deep");
		System.out.println(sb);
		sb.append("hello1");
		System.out.println(sb);

		CharSequence cs = null;
		cs = new String("Hello");
		cs = new StringBuffer("Good");
		cs = new StringBuilder("Bye");
		
		System.out.println(cs);


	}

}
