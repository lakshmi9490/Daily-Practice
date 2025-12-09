package com.triangle;

import java.util.Scanner;

public class DiamondHallowPattern {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 int n = sc.nextInt();
		 for(int i=0;i<n;i++) {
			 for(int k=n-i;k>=1;k--) {
				 System.out.print(" ");
			 }
			 for(int j=0;j<=i;j++) {
				 if(j==0||j==i) {
					 
					 System.out.print("* " );
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 System.out.println();
		 }
		 for(int i=1;i<n;i++) {
			 for(int k=0;k<=i;k++) {
				 System.out.print(" ");
			 }
			 for(int j=0;j<n-i;j++) {
				 if(j==0||j==n-i-1) {
					 
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
