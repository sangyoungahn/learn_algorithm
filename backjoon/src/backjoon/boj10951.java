package backjoon;

import java.util.Scanner;

public class boj10951 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		/* hasNextInt() : �Է°��� ����� ������ ������ �����ϴ� ����
		   �Է°��� int���� �ƴ� ���� false�� ����,
		   �Է°��� int�� ǥ���� �� �ִ� ������ �������� ���� true�� ����
		   ���� �Ʒ��� �ڵ�� �Է��� �� ������ ������ ��ٷȴٰ�
		   �Է��� �Ͼ�� ���� �� ���� �޾Ƽ� ���� ������ش�.*/
		while(s.hasNextInt()) {
			int a = s.nextInt();
			int b = s.nextInt();
			
			System.out.println(a+b);
		}
	}
}
