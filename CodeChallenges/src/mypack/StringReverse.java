package mypack;

import java.util.Scanner;

public class StringReverse {

	// 3 ways to reverse a string & determines Palindrome or NOT 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pl enter string to reverse: ");
		String s=sc.nextLine();
		
		// 1
		String rev1= new StringBuffer(s).reverse().toString();
		System.out.println("Using StringBUFFER reverse() : "+rev1);
		
		//2
		String rev2= new StringBuilder(s).reverse().toString();
		System.out.println("Using StringBUILDER reverse() : "+rev2);
		
		//3
		int len = s.length();
		String rev3 ="";
		
		for (int i=len-1;i>=0;i--){
			rev3 = rev3+s.charAt(i);
		}
			System.out.println("using Manual logic: "+rev3);
			
		if (s.equals(rev3)){
			System.out.println("String Palindrome...");
		} else { System.out.println("String is not Palindrom..");  }
			
			
	}//main end

}//class end
