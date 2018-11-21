package backjoon;

import java.util.Scanner;

public class boj2441 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int i, j;
		
		for (i = 0; i < input; i++) {		//행
			for (j = 0; j < i; j++)			//공백
				System.out.print(" ");
			for (j = 0; j <= input-i-1 ; j++)
				System.out.print("*");		//별
			
			System.out.println();
		}
	}
}
