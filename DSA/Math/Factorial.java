package dsa.math;
import java.util.Scanner;
public class Factorial {
	public static int fact(int n) {
		int res = 1;
		for(int i=2;i<=n;i++) {
			res*=i;
		}
		return res;
	}
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to Find the Factorial");
		int n = sc.nextInt();
		
		System.out.println(fact(n));
		sc.close();
	}
}
