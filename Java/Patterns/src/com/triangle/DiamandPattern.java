package com.triangle;

import java.util.Scanner;

public class DiamandPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int k=0;k<=i+1;k++) {
				System.out.print(" ");
			}
			for(int j=n-1-i;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();

	}

}
