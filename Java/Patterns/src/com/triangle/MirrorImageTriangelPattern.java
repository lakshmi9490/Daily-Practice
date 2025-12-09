package com.triangle;

import java.util.Scanner;

public class MirrorImageTriangelPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<n;j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
