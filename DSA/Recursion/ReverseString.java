package dsa.recursion;

import java.util.Scanner;

public class ReverseString {

	public static String reverseString(String s ,String r,int i) {
		if(i < 0) {
			return r;
		}
		return reverseString(s,r+s.charAt(i),i-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(reverseString(s,"",s.length()-1));
		
		sc.close();

	}

}
