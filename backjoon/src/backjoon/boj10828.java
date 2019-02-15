package backjoon;

import java.util.Scanner;

public class boj10828 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 명령의 수
		int[] arr = new int[n];	// 스텍의 내용이 들어갈 배열
		int top = -1;	// 배열의 위치
		String input;	// 명령
		
		for(int i = 0; i < n; i++) {
			input = sc.next();
			
			if(input.equals("push")) {
				top += 1;
				arr[top] = sc.nextInt();
			}
			else if(input.equals("pop")) {
				if(top == -1)
					System.out.println(-1);
				else {
					System.out.println(arr[top]);
					top -= 1;
				}
			}
			else if(input.equals("size"))
				System.out.println(top+1);
			else if(input.equals("empty")) {
				if(top == -1)
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(input.equals("top")) {
				if(top == -1)
					System.out.println(-1);
				else
					System.out.println(arr[top]);
			}
		}
	}
}
