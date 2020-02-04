package 조건문;

import java.util.Scanner;

public class 가위바위보게임02 {

	public static void main(String[] args) {
		/* 
		 * 0이면 computer는 가위
		 * 1이면 computer는 바위
		 * 2이면 computer는 보
		 */
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("computer: ");
		int com = sc.nextInt(); 
		switch (com) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		default:
			break;
		}
		/*
		if (com==0) {
			System.out.println("가위");
		} else if (com==1) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}*/
	}
}
