package dsa.bitmanipulation;

import java.util.Scanner;

public class Bitwise {

	public static int onMask(int n, int i) {
		
		int onMask = 1<<i;
		return (n | onMask);
		
	}
	
	public static int offMask(int n, int i) {
		int offMask = ~(1<<i);
		return (n & offMask);
	}
	
	public static int toggleMask(int n ,int i) {
		int tmask = (1<<i);
		return (n ^ tmask);
	}
	
	public static String checkingBit(int n, int i) {
		int cmask = (1<<i);
		if((n & cmask) == 0) {
			return "OFF";
		}else {
			return "ON";
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = sc.nextInt();
//		int res = toggleMask(n,i);
		String res = checkingBit(n,i);
		
		System.out.println(res);
		
		sc.close();

	}

}
