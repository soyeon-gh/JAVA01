package 조건문;

import java.util.Scanner;

public class 요일판별 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("요일 입력  (1.주중 2.주말) : ");
		int data = sc.nextInt();
		if (data==1) {
			System.out.println("열심히 공부합시다.");
		} else {
			System.out.println("열심히 놀아봅시다.");
		}
	}

}
