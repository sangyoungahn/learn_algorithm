package backjoon;

import java.util.Scanner;

/* Scanner 클래스의 메소드로는 숫자를 1자리씩 끊어서 입력받을 수 없다.
 * 붙어있는 숫자는 하나의 숫자로 입력 받기 때문에 문자열로 입력 받아서 한 글자씩 처리해줘야 한다.
 * 첫번째 줄의 n은 숫자로 받고, 두번째 줄의 숫자는 하나의 문자열로 받는다.
 * 그 후 문자열의 길이만큼 반복하면서 한 글자씩 숫자로 변경하여 더해준다.
 */
public class boj11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		String line = sc.next();
		int sum = 0;
		
		//charAt : 문자열에서 지정된 위치에 존재하는 문자를 찾아서 반환하는 함수
		for(int i = 0; i < testCase; i++) {
			sum += line.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}
}
