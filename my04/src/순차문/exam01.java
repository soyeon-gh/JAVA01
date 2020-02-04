package 순차문;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		/*
		 * << 여행 정보 >>
		 * ------------------
		 * - 여행지 : 제주도
		 * - 경비 : 200000원
		 * - 할인율 : 0.3
		 * - 실제 경비 : 140000원
		 * ------------------
		 * -> 12월 중순에 갔을 때 가격
		 */
		Scanner sc = new Scanner(System.in); 
		System.out.println("<< 여행 정보 >>");
		System.out.println("------------------");
		
		System.out.print("- 여행지 : ");
		String tr = sc.next(); 
		
		System.out.print("- 경비 : ");
		int money = sc.nextInt(); 
		
		System.out.print("- 할인율 : ");
		double p = sc.nextDouble();
		
		System.out.print("- 실제 경비 : ");
		double dec_money = money - (money * p);
		// 자바에서는 연산시 하나라도 실수면 집어넣을 변수타입 -> 실수
		System.out.println((int)dec_money + "원");
		System.out.println("-----------------");
		System.out.println("-> 12월 중순에 갔을 때 가격");
	}
}
