package 응용문제;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		/*
		 * 은행 결제 시스템
		 * --------------------
		 * 1.잔고확인 , 2.입금 , 3.출금 , 4.종료
		 * --------------------
		 * 선택 >> 1
		 * 당신의 잔고는 10000원
		 * --------------------
		 * 선택 >> 2
		 * 입금액 >> 1000
		 * --------------------
		 * 선택>> 3
		 * 출금액 >> 1000
		 * --------------------
		 * 선택 >> 4
		 * 시스템을 종료합니다.
		 */
		System.out.println("은행 결제 시스템");
		System.out.println("--------------------");
		System.out.println("1.잔고확인 , 2.입금 , 3.출금 , 4.종료");
		
		Scanner sc = new Scanner(System.in); 
		int c_m = 10000; //잔고
		
		while (true) {
			
			System.out.println("--------------------");
			System.out.print("선택 >> ");
			int choice = sc.nextInt(); 
			
			if (choice==1) {
				System.out.println("당신의 잔고는" + c_m + "원");
			} else if(choice==2) {
				System.out.print("입금액: ");
				int c_mp = sc.nextInt(); 
				c_m = c_m + c_mp;
			} else if(choice==3) {
				System.out.print("출금액: ");
				int c_mm = sc.nextInt(); 
				c_m = c_m - c_mm;
			} else if(choice==4) {
				System.out.println("시스템을 종료합니다");
				break; // while 문 종료
			} else {
				System.out.println("1,2,3,4중에 다른 숫자를 누르셨습니다.");
			}
			
		}
	} // main end
} // class end
