package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class boj11718 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<> ();
		
		while(sc.hasNextLine()) {	// 스캐너의 입력에 다른 줄이 있으면 계속 true를 반환
			String input = sc.nextLine();
			if(input == null || input.isEmpty())
				break;
			
			inputs.add(input);
		}
		sc.close();
		
		for(int i=0; i<inputs.size(); i++) {
			System.out.println(inputs.get(i));
		}
	}

}
