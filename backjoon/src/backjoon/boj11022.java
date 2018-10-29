package backjoon;

import java.util.Scanner;

public class boj11022 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int sum[] = new int[testCase];
		int a[] = new int[testCase];
		int b[] = new int[testCase];
		
		
		for(int i = 0; i < testCase; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			
			if(a[i]<=0 || 10<=a[i] || b[i]<=0 || 10<=b[i])
				System.out.println("0 < a, b < 10의 값을 입력하세요");
			
			sum[i] = a[i] + b[i];
		}
		
		for(int i = 1; i <= testCase; i++) {
			System.out.print("Case #" + i + ": ");
			System.out.print(a[i-1] + " + ");
			System.out.print(b[i-1] + " = ");
			System.out.println(sum[i-1]);
		}
	}
}