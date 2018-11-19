package backjoon;

import java.util.Scanner;

public class boj2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int i, j;
		
		for (i = 0; i < input; i++) {
			for (j = 0; j < input-i-1; j++)
				System.out.print(" ");
			for (j = 0; j <= i ; j++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}