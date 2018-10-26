package backjoon;

import java.util.Scanner;

public class boj10952 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*
		 * hasNextInt() : �Է°��� ����� ������ ������ �����ϴ� ���� �Է°��� int���� �ƴ� ���� false�� ����, �Է°���
		 * int�� ǥ���� �� �ִ� ������ �������� ���� true�� ���� ���� �Ʒ��� �ڵ�� �Է��� �� ������ ������ ��ٷȴٰ� �Է��� �Ͼ��
		 * ���� �� ���� �޾Ƽ� ���� ������ش�.
		 */
		while (s.hasNextInt()) {
			int a = s.nextInt();
			int b = s.nextInt();
			
			if(a == 0 && b == 0)
				break;

			System.out.println(a + b);
		}
	}
}
