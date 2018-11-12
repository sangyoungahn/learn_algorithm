package backjoon;

import java.util.Scanner;

public class boj2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int result = 0;
		
		if(input >= 1 && input <= 9) {
			for(int i = 1; i < 10; i++) {
				result = input * i;
				System.out.println(input + " * " + i + " = " + result);
			}
		}
		else
			System.out.println("1보다 크거나 같고, 9보다 작은 수를 입력하세요.");
		sc.close();
	}
}