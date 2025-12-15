package dsa.bitmanipulation;

import java.util.Scanner;

public class D2B {

	static String decimalToBinary(int n ) {
		String d = "";
		
		while(n>=1) {
			
			int x = n%2;
			n = n/2;
			d = x + d;
			
		}
		return d;
	}
	
	static int binaryToDecimal(String s) {
		int res =0;
		int powerOf2 = 1;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)=='1') {
				res = res+powerOf2;
			}
			powerOf2 = powerOf2 * 2;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String binary = decimalToBinary(n);
		int decimal = binaryToDecimal(binary);
		
		System.out.println(binary);
		System.out.println(decimal);
		
		sc.close();

	}

}
