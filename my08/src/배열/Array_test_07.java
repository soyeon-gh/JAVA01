package 배열;

import java.util.Scanner;

public class Array_test_07 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] s = {11, 22, 33, 44};
		for (int i = 0; i < s.length; i++) {
			if (input == s[i]) {
				System.out.println(input + "의 위치는 " + (i+1));
			}
		}
	}
}
