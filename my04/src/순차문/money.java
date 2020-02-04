package 순차문;

import java.util.Scanner;

public class money {

	public static void main(String[] args) {
		/*
		 * ----------나의 현금 잔고-----------
		 * 현재 당신이 가지고있는 돈은? 1000
		 * 내일 당신이 가지게 될 돈은? 2000
		 * -------------------------------
		 * 내일 내가 가지고 있는 돈의 총액은 3000원
		 */
		
		Scanner sc = new Scanner(System.in); 
		//갖고오는것도 포함
		//Scanner 라는 class는 이 파일에서 한번 복사하면 계속 반복해서 사용
		//콘솔에서 입력받을 수 있는 부품
		
		System.out.println("------나의 현금 잔고------");
		
		System.out.print("현재 당신이 가지고있는 돈은? : ");
		// 모든 입력되는 데이터의 유형(타입)은 String
		int today_money = sc.nextInt(); // 단어 입력 받는 기능
		
		System.out.print("내일 당신이 가지게 될 돈은? : ");
		int tomorrow_money = sc.nextInt(); 
		
		System.out.println("----------------------");
		
		int total_money = today_money + tomorrow_money;
				
		System.out.println("내일 내가 가지고 있는 돈의 총액은 " + total_money + "원");
	}

}
