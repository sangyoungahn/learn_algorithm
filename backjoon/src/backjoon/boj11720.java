package backjoon;

import java.util.Scanner;

/* Scanner Ŭ������ �޼ҵ�δ� ���ڸ� 1�ڸ��� ��� �Է¹��� �� ����.
 * �پ��ִ� ���ڴ� �ϳ��� ���ڷ� �Է� �ޱ� ������ ���ڿ��� �Է� �޾Ƽ� �� ���ھ� ó������� �Ѵ�.
 * ù��° ���� n�� ���ڷ� �ް�, �ι�° ���� ���ڴ� �ϳ��� ���ڿ��� �޴´�.
 * �� �� ���ڿ��� ���̸�ŭ �ݺ��ϸ鼭 �� ���ھ� ���ڷ� �����Ͽ� �����ش�.
 */
public class boj11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		String line = sc.next();
		int sum = 0;
		
		//charAt : ���ڿ����� ������ ��ġ�� �����ϴ� ���ڸ� ã�Ƽ� ��ȯ�ϴ� �Լ�
		for(int i = 0; i < testCase; i++) {
			sum += line.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}
}