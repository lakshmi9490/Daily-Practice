package com.triangle;

import java.util.Scanner;

public class PascalTriangle {

	public static void main (String []args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int x = 1;
			for(int k = 0;k<=n-i;k++) {
				System.out.print("     ");
			}
			for( int j = 1; j<=i ; j++ ) {
				System.out.print(x+"         ");
				x = x * (i-j)/j;
				
			}
			System.out.println();
		}
		sc.close();
	}
}
