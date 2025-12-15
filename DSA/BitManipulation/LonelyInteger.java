package dsa.bitmanipulation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class LonelyInteger {
	
	public static int lonelyInteger(int [] a) {
		Arrays.sort(a);
		for(int i=0;i<a.length-2;i=i+2) {
			if(a[i]!=a[i+1]) {
				return a[i];
			}
		}
		return a[a.length-1];
	}
	public static int lonelyInteger1(int [] a) {
		HashSet<Integer> s = new HashSet<>();
		for(int i:a) {
			if(s.contains(i)) {
				s.remove(i);
			}else {
				s.add(i);
			}
		}
		for(int i:s) {
			return i;
		}
		return -1;
	}
	
	public static int lonelyInteger2(int []a) {
		int res = 0;
		for(int i=0;i<a.length;i++) {
			res ^= i;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a [] = new int [n];

		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		int res = lonelyInteger2(a);
		System.out.println(res);
		
		sc.close();
	}

}
