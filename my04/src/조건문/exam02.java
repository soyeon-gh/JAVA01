package 조건문;

import java.util.Date;
import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		/*
		 * 커피값은? 5000
		 * 인원수는? 3
		 * 
		 * 현재 시각이 저녁 10시 이전이면 원래금액으로 결제합니다.
		 * 10시 이후이면 5000원 할인
		 */
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("커피값은? ");
		int money = sc.nextInt(); 
		System.out.print("인원수는? ");
		int p = sc.nextInt(); 
		
		int total_money = money * p; //총금액
		int sale_total_money = total_money - 5000; //할인금액
		
		Date date = new Date();
		int hour = date.getHours();
		
		System.out.println("------------------------");
		System.out.println("현재 시각이 저녁 10시 이전이면 원래금액으로 결제합니다.");
		System.out.println("10시 이후이면 5000원 할인됩니다.");
		System.out.println("------------------------");
		
		if (hour >= 22) { 
			System.out.println("10시 이후여서 할인 적용 됩니다. 가격 : " + sale_total_money);
		} else {
			System.out.println("10시 이전이어서 할인 적용 안됩니다. 가격 : " + total_money);
		}
	}
}
