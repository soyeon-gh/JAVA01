package 조건문;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보게임03 {

	public static void main(String[] args) {
		/* 
		 * 0이면 computer는 가위
		 * 1이면 computer는 바위
		 * 2이면 computer는 보
		 */
		Random r = new Random();
		int computer = r.nextInt(3); //-21억 ~ 21억
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("1.가위 , 2.바위 , 3.보: ");
		int me = sc.nextInt(); 
		
		switch (me) {
		case 0:
			System.out.println("나 : 가위");
			switch (computer) {
			case 0:
				System.out.println("computer: 가위");
				System.out.println("무승부");
				break;
			case 1:
				System.out.println("computer: 바위");
				System.out.println("computer win!!");
				break;
			case 2:
				System.out.println("computer: 보");
				System.out.println("내가 win!!");
				break;
			}
			break;
		case 1:
			System.out.println("나 : 바위");
			switch (computer) {
			case 0:
				System.out.println("computer: 가위");
				System.out.println("내가 win!!");
				break;
			case 1:
				System.out.println("computer: 바위");
				System.out.println("무승부");
				break;
			case 2:
				System.out.println("computer: 보");
				System.out.println("computer win!!");
				break;
			}
			break;
		case 2:
			System.out.println("나 : 보");
			switch (computer) {
			case 0:
				System.out.println("computer: 가위");
				System.out.println("computer win!!");
				break;
			case 1:
				System.out.println("computer: 바위");
				System.out.println("내가 win!!");
				break;
			case 2:
				System.out.println("computer: 보");
				System.out.println("무승부");
				break;
			}
			break;
		default:
			System.out.println("0~2까지의 숫자만 입력해주세요.");
			break;
		}
	}
}
