package dsa.math;

import java.util.Scanner;

public class GCDOrHCF {

	public static int gcd1(int a ,int b) {
		int min = 0;
		if(a<b) {
			min = a;
		}
		else{
			min = b;
		}
		for(int i = min ; i>=1; i--) {
			if(a%i==0 && b%i ==0) {
				return i;
			}
		}
		return 1;
	}
	public static int gcd2(int a , int b) {
		while(a != b) {
			if(a>b) {
				a = a-b;
			}
			else {
				b = b -a;
			}
		}
		return a;
	}
	
	public static int gcd3(int a ,int b) {
		while(a!=0 && b!=0){
			if(a>b) {
				a = a%b;
			}else {
				b = b%a;
			}
		}
		if(a !=0) {
			return a;
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(gcd1(a,b));
		System.out.println(gcd2(a,b));
		System.out.println(gcd3(a,b));
		
		sc.close();

	}

}
