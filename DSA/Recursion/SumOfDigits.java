package dsa.recursion;

import java.util.Scanner;

public class SumOfDigits {

	public static long sumOfDigits(long n ) {
		if(n == 0) {
			return 0;
		}
		return sumOfDigits(n/10)+n%10;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
        System.out.println(sumOfDigits(n));
        
        sc.close();
	}

}
