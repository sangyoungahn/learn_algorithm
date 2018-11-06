package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class boj11719 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<> ();
		int cnt=0;
		
		while(sc.hasNextLine()) {	// 스캐너의 입력에 다른 줄이 있으면 계속 true를 반환
			//next() - 문자 또는 문자열을 공백 기준으로 한단어 또한 한문자씩 입력 받는다.
			//nextLine() - 문자 또는 문장 한라인 전체를 입력 받는다.
			String input = sc.nextLine();
			
			if(input.length()>100 || cnt>100)
				break;
			
			inputs.add(input);
			cnt++;
		}
		sc.close();
		
		for(int i=0; i<inputs.size(); i++) {
			System.out.println(inputs.get(i));
		}
	}
}
