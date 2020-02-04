package 문제;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		/* 출력
		 * 나에 대한 정보
		 * ---------------
		 * 이름 입력 >> hong
		 * 나이 입력 >> 100
		 * 취미 입력 >> run
		 * ---------------
		 * 나의 이름은 hong
		 * 나의 나이는 100
		 * 나의 취미는 run
		 */
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("나의 대한 정보");
		System.out.println("---------------");
		
		System.out.print("이름 입력 >> ");
		String name = sc.next(); // 단어 입력 받는 기능
		
		System.out.print("나이 입력 >> ");
		String age = sc.next(); // 단어 입력 받는 기능
		
		System.out.print("취미 입력 >> ");
		String hobby = sc.next(); // 단어 입력 받는 기능
		
		System.out.println("---------------");
		
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 나이는 " + age);
		System.out.println("나의 취미는 " + hobby);
	}
}
