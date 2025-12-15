package dsa.bitmanipulation;

import java.util.Scanner;

public class SwapBits {

	public static int swapBits(int n) {
		
		return ((n & 0Xaaaaaaaa)>>>1)|((n & 0X55555555)<<1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(swapBits(n));
		
		sc.close();
	}

}
