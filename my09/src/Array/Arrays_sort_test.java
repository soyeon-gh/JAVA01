package Array;

import java.util.Scanner;

public class Arrays_sort_test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int index = 0;
		int[] s = {66,33,22,11,99};
		System.out.print("탐색할 값을 입력하시오 : ");
		int value = sc.nextInt();
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] == value) {
				index = i;
				System.out.println("" + value + "값은 " + (index+1) + "번째 위치에 있습니다.");
			}
		}
	}
}
