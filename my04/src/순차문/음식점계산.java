package 순차문;

import java.util.Scanner;

public class 음식점계산 {

	public static void main(String[] args) {
		/*
		 * 음식점 계산 총 금액 : 446677
		 * 함께 먹은 사람 인원수 : 6
		 * -------------------------
		 * 각자 내야할 돈 :
		 */
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("음식점 계산 총 금액 : ");
		int total_money = sc.nextInt(); 
		
		System.out.print("함께 먹은 사람 인원수 : ");
		int p = sc.nextInt(); 
		
		double p_money = total_money / (double)p ;
		
		System.out.println("-----------------");
		System.out.println("각자 내야할 돈 : " + (int)p_money + "원");
	}

}
