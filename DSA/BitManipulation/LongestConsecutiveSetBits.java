package dsa.bitmanipulation;

import java.util.Scanner;

public class LongestConsecutiveSetBits {
	
	public static int consecutive1(int n) {
		int count =0;
		
		while(n>0) {
			n = n & n<<1;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = consecutive1(n);
		System.out.println(res);
		
		sc.close();
		
	}

}
