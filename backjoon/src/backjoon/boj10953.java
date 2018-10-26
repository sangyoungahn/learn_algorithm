package backjoon;

import java.util.Scanner;

public class boj10953 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int sum[] = new int[testCase];
		
		for(int i = 0; i < testCase; i++) {
			String s = sc.next();
			String temp[] = s.split(",");
			
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			
			sum[i] = a + b;
		}
		
		for(int i = 0; i < testCase; i++) {
			System.out.println(sum[i]);
		}
	}
}
