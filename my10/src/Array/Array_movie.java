package Array;

import java.util.Scanner;

public class Array_movie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int size = 10;
		int cnt = 0;
		int sum = 0;
		int[][] seats = new int[size][size];
		while(true) {
			//좌석만들기----------------------------------------------
			System.out.println("┌─────────────────────────────────────┐");
			System.out.print("│      ");
			for (int i = 0; i < seats.length; i++) {
				System.out.print(" " + i + " ");
			}
			System.out.println(" │");
			System.out.println("├─────────────────────────────────────┤");
			
			for (int i = 0; i < seats.length; i++) {
				System.out.print("│");
				System.out.print(" "+i + " 열 :");
				for (int j = 0; j < seats.length; j++) {
					System.out.print(" " + seats[i][j] + " ");
				}
				System.out.print(" │");
				System.out.println();
			}
			
			System.out.println("└─────────────────────────────────────┘");
		
			//좌석예약부분 -------------------------------------------
			System.out.println("원하시는 좌석 번호를 입력하세요 (종료는 100)");
			System.out.print("열 입력 >>");
			int row = sc.nextInt();
			System.out.print("행 입력 >>");
			int col = sc.nextInt();
			if (row == 100) {
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println("┌────────────────────────────────┐");
				System.out.println("│        프로그램을 종료 합니다.       │");
				System.out.println("│      당신은 " + cnt + "자리 예매 했습니다.      │");
				System.out.println("│      결제 금액은 " + sum + " 원 입니다.    │");
				System.out.println("└────────────────────────────────┘");
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.exit(0); //프로그램종료
			} 
			if (seats[row][col] == 0) {
				seats[row][col] = 1;
				cnt++;
				sum = sum + 5000;
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println("┌────────────────┐");
				System.out.println("│  예약 되었습니다.  │");
				System.out.println("└────────────────┘");
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			} else {
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println("┌────────────────────┐");
				System.out.println("│  이미 예약된 자리입니다. │");
				System.out.println("└────────────────────┘");
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			}
		}
	}
}

