package 응용문제;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		/*
		 * 5번 투표 기회 있습니다.
		 * --------------------
		 * 1)아이유 , 2)유재석 , 3)공유
		 * --------------------
		 * 당신의 선택은? 1
		 * 당신의 선택은? 2
		 * 당신의 선택은? 1
		 * 당신의 선택은? 3
		 * 당신의 선택은? 1
		 * --------------------
		 * 아이유 : 3표
		 * 유재석 : 1표
		 * 공유 : 1표
		 */
		System.out.println("5번 투표 기회 있습니다.");
		System.out.println("--------------------");
		System.out.println("1)아이유 , 2)유재석 , 3)공유");
		System.out.println("--------------------");
		
		Scanner sc = new Scanner(System.in); 
		
		int sum_1 = 0;
		int sum_2 = 0;
		int sum_3 = 0;
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.print("당신의 선택은? ");
			int choice = sc.nextInt(); 
			
			switch (choice) {
			case 1:
				sum_1++;  break;
			case 2:
				sum_2++;  break;
			case 3:
				sum_3++;  break;
			default:
				System.out.println("1,2,3 중에 다른 숫자를 누르셨습니다.");  break;
			}
			
			/*
			if (choice==1) {
				sum_1++;
			} else if(choice==2) {
				sum_2++;
			}else if(choice==3) {
				sum_3++;
			}else {
				System.out.println("1,2,3 중에 다른 숫자를 누르셨습니다.");
			}*/
			
		}
		
		System.out.println("--------------------");
		System.out.println("아이유 : " + sum_1 + "표");
		System.out.println("유재석 : " + sum_2 + "표");
		System.out.println("공유 : " + sum_3 + "표");
		
	} // main end
} // class end
