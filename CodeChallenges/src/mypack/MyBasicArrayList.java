package mypack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyBasicArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List al = new ArrayList<String>();
		al.add("java");
		al.add("selenium");
		al.add("testNg");
		al.add("Maven");
		al.add("java");
		
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(""+ al.get(0));
		System.out.println(""+ al.get(1));
		
		System.out.println(""+ al.indexOf("testNg"));
		System.out.println(""+al.lastIndexOf("java"));
		
		System.out.println(al.contains("selenium"));
				
		al.add(2, "DataStructes");
		
		System.out.println(al);
		System.out.println(al.size());
		
		
		Iterator <String> itr =  al.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		
		 //Clone
		 ArrayList<String> copy = (ArrayList<String>) ((ArrayList<String>) al).clone();
		 System.out.println(copy);
		 
		 al.clear();
		 System.out.println("Empty: "+al);
		 
		 Collections.reverse(copy);
		 System.out.println("reverse copy: "+copy);
		 
		 Collections.swap(copy, 2, 5);
	        System.out.println("Results after swap operation:");
	        for(String str: copy){
	            System.out.println(str);
	        }
	}

}
