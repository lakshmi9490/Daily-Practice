package dsa.math;

import java.util.Scanner;

public class SievePrimeNumber {
	
	public static void sievePrime(int n) {
		
		boolean[] primes = new boolean[n+1];
		
		for(int i=2;i<=n;i++) {
			if(primes[i]==false) {
				for(int j=i*2;j<=n;j=j+i) {
					primes[j]=true;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(primes[i]==false) {
				System.out.println(i);
			}
		}
	}

	public static void sievePrime1(int n) {
		boolean[] primes = new boolean[n+1];
		for(int i=2;i*i<=n;i++) {
			if(primes[i]==false) {
				for(int j=i*i;j<=n;j=j+i) {
					primes[j]=true;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(primes[i]==false) {
				System.out.println(i);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sievePrime(n);
		System.out.println("_______________________");
		sievePrime1(n);
		
		sc.close();
	}

}
