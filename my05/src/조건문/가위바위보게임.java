package 조건문;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		Random r = new Random();
		int com = r.nextInt(3); //-21억 ~ 21억
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("0_가위 , 1_바위 , 2_보 : ");
		int my = sc.nextInt(); 
		
		System.out.println("나: " + my + " computer: " + com);
		
		if (my==com) {
			System.out.println("무승부!!");
		} else if (my==0 && com==1) {
			System.out.println("computer win!!");
		} else if (my==0 && com==2) {
			System.out.println("내가 win!!");
		} else if (my==1 && com==0) {
			System.out.println("내가 win!!");
		} else if (my==1 && com==2) {
			System.out.println("computer win!!");
		} else if (my==2 && com==0) {
			System.out.println("computer win!!");
		} else if (my==2 && com==1) {
			System.out.println("내가 win!!");
		} else {
			System.out.println("0에서 2까지의 숫자만 입력해주세요");
		}
	}
}
