package mypack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListToHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List <String> al = new ArrayList <String> ();
		
		al.add("1first");
		al.add("2second");
		al.add("1first");
		al.add("4fourth");
		System.out.println("ArrayList: "+al);
		
		 Set <String> hs = new HashSet <String> (al);
		 System.out.println("After converting to HashSet: "+hs);
		
	}

}
