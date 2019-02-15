package backjoon;

import java.util.Scanner;

public class boj9095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int num;
		
		int[] arr = new int[11];
		arr[0] = 0;		// ������ 0�� �� ������ ����� ��
		arr[1] = 1;		// ������ 1�� �� ������ ����� ��
		arr[2] = 2;		// ������ 2�� �� ������ ����� ��
		arr[3] = 4;		// ������ 3�� �� ������ ����� ��
		
		// �Է� ���� �׽�ũ ���̽���ŭ �ݺ�
		for(int i = 0 ; i < testCase; i++) {
			num = sc.nextInt();
			
			// 4�̻���ʹ� ��ȭ���� ���� ���� ����
			for(int j = 4; j <= num; j++) {
				arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
			}
			System.out.println(arr[num]);
		}
		sc.close();
	}
}