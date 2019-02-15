package backjoon;

import java.util.Scanner;

public class boj10828_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// ����� ����
		int[] arr = new int[n];	// ���ÿ� �� ���� ������ �迭
		String input;	// ��ɾ�
		int top = -1;	// top�� �ʱ�ȭ
		
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
