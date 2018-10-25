package backjoon;

import java.util.Scanner;

public class boj10951 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		/* hasNextInt() : 입력값이 생기기 전까지 실행을 유보하는 역할
		   입력값이 int형이 아닐 경우는 false를 리턴,
		   입력값이 int로 표현할 수 있는 형식의 숫자형인 경우는 true를 리턴
		   따라서 아래의 코드는 입력을 할 때까지 실행을 기다렸다가
		   입력이 일어나면 숫자 두 개를 받아서 더해 출력해준다.*/
		while(s.hasNextInt()) {
			int a = s.nextInt();
			int b = s.nextInt();
			
			System.out.println(a+b);
		}
	}
}
