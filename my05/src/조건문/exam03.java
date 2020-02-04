package 조건문;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		/* switch 문으로 작성
		 * 당신의 직급은? 사원
		 * 
		 * 사원의 보너스는 1000만원입니다.
		 * 과장의 보너스는 2000만원입니다.
		 * 사장의 보너스는 3000만원입니다.
		 * 회장의 보너스는 4000만원입니다.
		 * 
		 */
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("당신의 직급은? ");
		String aa = sc.next(); 
		
		switch (aa) { 
		case "사원":
			System.out.println("사원의 보너스는 1000만원입니다.");
			break;
		case "과장":
			System.out.println("과장의 보너스는 2000만원입니다.");
			break;
		case "사장":
			System.out.println("사장의 보너스는 3000만원입니다.");
			break;
		case "회장":
			System.out.println("회장의 보너스는 4000만원입니다.");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
	}
}
