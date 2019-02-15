package backjoon;

import java.util.Scanner;

public class boj10828_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 명령의 개수
		int[] arr = new int[n];	// 스택에 들어갈 값을 저장할 배열
		String input;	// 명령어
		int top = -1;	// top값 초기화
		
		for(int i = 0; i < n; i++) {
			input = sc.next();
			
			if(input.equals("push")) {
				top++;
				arr[top] = sc.nextInt();
			}
			else if(input.equals("pop")) {
				if(top == -1)
					System.out.println(-1);
				else {
					System.out.println(arr[top]);
					top--;
				}
			}
			else if(input.equals("size")) {
				System.out.println(top+1);
			}
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
