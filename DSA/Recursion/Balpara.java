package dsa.recursion;

import java.util.Scanner;

public class Balpara {

	static void balpara(char ar[],int n , int i, int o, int c) {
		if(i==ar.length) {
			System.out.println(ar);
		}
		if(o<n) {
			ar[i]='(';
			balpara(ar,n,i+1,o+1,c);
		}
		if(c<o) {
			ar[i]=')';
			balpara(ar,n,i+1,o,c+1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char ar [] = new char[n*2];
		balpara(ar,n,0,0,0);
		
		sc.close();

	}

}
