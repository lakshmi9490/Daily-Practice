package dsa.bitmanipulation;

import java.util.Scanner;

public class RightMostSetBit {
	
	public static int posOfRMSB(int n) {
		int pos =0;
		int m = 1;
		if(n==0) {
			return -1;
		}
		while((n & m)==0) {
			m = m<<1;
			pos++;
		}
		return pos+1;
	}
	
	public static int posOfRMSB1(int n) {
		return (int)(Math.log10(n ^ ( n & (n-1) ))/Math.log10(2))+1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		
		int res = posOfRMSB(a);
		int res1 = posOfRMSB1(a);
		System.out.println(res);
		System.out.println(res1);
		
		sc.close();
	}

}
