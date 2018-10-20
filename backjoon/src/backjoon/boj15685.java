package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class boj15685 {

	static int[][] map = new int[101][101];
	// �迭 �������� : 0 (��), 1 (��), 2 (��), 3(��), 4(�밢���Ʒ�)
	static int[] x = { 0, -1, 0, 1, 1 };
	static int[] y = { 1, 0, -1, 0, 1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int curveNum = sc.nextInt();	//Ŀ���� ����

		int[][] curveInfoArray = new int[curveNum][4];

		for (int i = 0; i < curveNum; i++) {
			for (int j = 0; j < 4; j++) {
				curveInfoArray[i][j] = sc.nextInt();
			}
		}

		solutions(curveInfoArray);

	}

	private static void solutions(int[][] curveInfoArray) {

		for (int i = 0; i < curveInfoArray.length; i++) {
			ArrayList<Integer> direction = new ArrayList<>();
			direction.add(curveInfoArray[i][2]);
			for (int j = 0; j < curveInfoArray[i][3]; j++) {

				// �̵��ؾ��� ������ �����Ѵ�.
				int size = direction.size();
				for (int k = size - 1; k >= 0; k--) {
					int n = direction.get(k);
					if (n == 3) {
						direction.add(0);
					} else {
						direction.add(n + 1);
					}
				}
			}

			// ������������ ���⼳���� ���� �׸���.
			drawing(curveInfoArray[i][0], curveInfoArray[i][1], direction);
		}
		// 4�� �������� ��� ���õ� �簢���� Ž��
		countRec();

	}
	
	private static void drawing(curveInfoArray[i][0], curveInfoArray[i][1]) {
		
	}
}
