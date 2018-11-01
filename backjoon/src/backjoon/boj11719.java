package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class boj11719 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<> ();
		int cnt=0;
		
		while(sc.hasNextLine()) {	// ��ĳ���� �Է¿� �ٸ� ���� ������ ��� true�� ��ȯ
			//next() - ����(����)�� �������� �Է� �޴´�
			//nextLine() - �� ����(���๮��)�� �������� �Է� �޴´�.
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
