package 배열;

import java.util.Scanner;

public class Array_test_10 {

	public static void main(String[] args) {
		
		String[] subject = new String[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < subject.length; i++) {
			System.out.print("과목을 입력하세요 : ");
			subject[i] = sc.next();
		}
		
			System.out.println(subject[0] + "보다는 " + subject[2]);
		
	}
}

