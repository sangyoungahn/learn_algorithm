package backjoon;

import java.util.Scanner;

public class boj1000 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		
		if(0 < a && b <10)
			c = a + b;
			
		System.out.println(c);
	}
}