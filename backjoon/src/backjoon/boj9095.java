package backjoon;

import java.util.Scanner;

public class boj9095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int num;
		
		int[] arr = new int[11];
		arr[0] = 0;		// 정수가 0일 때 가능한 경우의 수
		arr[1] = 1;		// 정수가 1일 때 가능한 경우의 수
		arr[2] = 2;		// 정수가 2일 때 가능한 경우의 수
		arr[3] = 4;		// 정수가 3일 때 가능한 경우의 수
		
		// 입력 받은 테스크 케이스만큼 반복
		for(int i = 0 ; i < testCase; i++) {
			num = sc.nextInt();
			
			// 4이상부터는 점화식을 통해 값을 구함
			for(int j = 4; j <= num; j++) {
				arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
			}
			System.out.println(arr[num]);
		}
		sc.close();
	}
}