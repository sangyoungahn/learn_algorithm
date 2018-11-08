package backjoon;

import java.util.Scanner;

public class boj2741 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input <= 100000) {
			for(int i = 1; i <= input; i++) {
				System.out.println(i);
			}
		}
	}
}
