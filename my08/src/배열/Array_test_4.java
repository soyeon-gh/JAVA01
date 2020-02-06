package 배열;

import java.util.Scanner;

public class Array_test_4 {

	public static void main(String[] args) {
		
		int[] input = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < input.length; i++) {
			System.out.print("숫자를 입력하세요 : ");
			input[i] = sc.nextInt();
		}
		for (int i = 0; i < input.length; i++) {
			System.out.println((i+1) + "번째 값은" + input[i]);
		}
			
		
	}
}

