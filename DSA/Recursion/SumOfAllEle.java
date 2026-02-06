package dsa.recursion;

import java.util.Scanner;

public class SumOfAllEle {

	public static int sumOfAllEle(int ar[],int i) {
		if(i==ar.length) {
			return 0;
		}
		return sumOfAllEle(ar,i+1)+ar[i];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] =  new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println(sumOfAllEle(ar, 0));
		
		sc.close();
	}

}
