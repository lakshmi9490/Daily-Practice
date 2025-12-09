package com.triangle;

import java.util.Scanner;

public class HallowTrianglePattarn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(j==0||i==j||i==n-1) {
					
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		sc.close();

	}

}
