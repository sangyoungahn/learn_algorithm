package backjoon;

import java.util.Scanner;

public class boj10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCount = sc.nextInt();
		int num;
		int min = 0;
		int max = 0;
		
		if(numCount >= 1 && numCount <= 100000) {
			for(int i = 0; i < numCount; i++) {
				num = sc.nextInt();
				min = num;
				if(num >= -1000000 && num <= 1000000) {
					if(num < min)
						min = num;
					else if(max < num)
						max = num;
				}
			}
			System.out.println(min);
			System.out.println(max);
		}
	
	}

}
