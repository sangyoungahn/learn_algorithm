package backjoon;

import java.util.Scanner;

public class boj2442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int i, j;
		
		for (i = 1; i <= input; i++) {
			for (j = 0; j <= input-i-1; j++)
				System.out.print(" ");
			for (j = 1; j <= i*2-1 ; j++)
				System.out.print("*");   
			
			System.out.println();
		}
	}
}