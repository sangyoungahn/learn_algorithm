package backjoon;

import java.util.Scanner;

public class boj11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int inputNum[] = new int[testCase];
		int sum = 0;
		
		for(int i = 0; i < testCase; i++) {
			inputNum[i] = sc.nextInt();
			sum += inputNum[i];
		}
		
		System.out.println(sum);
	}

}
