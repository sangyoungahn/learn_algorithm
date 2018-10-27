package backjoon;

import java.util.Scanner;

public class boj11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int sum[] = new int[testCase];
		
		for(int i = 0; i < testCase; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			sum[i] = a + b;
		}
		
		for(int i = 1; i <= testCase; i++) {
			System.out.println("Case #" + i + ": " + sum[i-1]);
		}
	}

}
