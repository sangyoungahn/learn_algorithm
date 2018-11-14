package backjoon;

import java.util.Scanner;

public class boj8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		if(1 <= num && num <= 10000) {
			for(int i = 1; i <= num ; i++)
				sum += i;
			
			System.out.println(sum);
		}
	}
}