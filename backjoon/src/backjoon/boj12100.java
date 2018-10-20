package backjoon;

import java.util.Scanner;

public class boj12100 {
	public static void main(String args[]) {
		int N;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		int[][] map = new int[N][N];
		
		int[][] map_up = new int[N][N];
		int[][] map_down = new int[N][N];
		int[][] map_left = new int[N][N];
		int[][] map_right = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int num = sc.nextInt();
				map[i][j] = num;
			}
		}

		// ���� �̵�
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				// �迭�� ���� �� ���ڰ� ������ ���� �ִ� ���ڿ� ��
				map_up[i][j] = num;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int num = sc.nextInt();
				map_down[i][j] = num;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int num = sc.nextInt();
				map_left[i][j] = num;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int num = sc.nextInt();
				map_right[i][j] = num;
			}
		}
	}
}