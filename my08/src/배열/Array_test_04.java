package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Array_test_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] s = {11, 55, 77, 22, 99};
		
		Arrays.sort(s);
		for (int i : s) {
			System.out.println(i);
		}
		System.out.println("찾고 싶은 숫자 입력 : ");
		int input = sc.nextInt();
		
		for (int i = 0; i < s.length; i++) {
			if (s[i]==input) {
				System.out.println(input + " 값은" + (i+1) + "위치에 있습니다.");
			}
		}
	}

}
