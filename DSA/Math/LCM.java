package dsa.math;

import java.util.Scanner;

public class LCM {
	public static int lcm(int a ,int b) {
		int res = 0;
		if(a>b) {
			res = a;
		}
		else {
			res = b;
		}
		while(true) {
			if(res%a == 0 && res%b == 0 ) {
				break;
			}
			res++;
		}
		return res;
		 
	}
	
	public static int gcd (int a ,int b) {
		while(a!=0 && b!=0) {
			if(a>b) {
				a = a%b;
			}else {
				b = b%a;
			}
		}
		if(a!=0) {
			return a;
		}
		else {
			return b;
		}
	}
	
	static int lcm1(int a, int b) {
		return a*b/gcd(a,b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = lcm1(a,b);
		System.out.println(res);
		
		sc.close();

	}

}
