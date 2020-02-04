package 순차문;

import java.util.Scanner;

public class 콘솔연습02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력>> ");
		int age = sc.nextInt();
		int nextAge = age + 1;
		System.out.println("내년 나이는 " + nextAge + "세");
		
		System.out.print("키를 입력>> ");
		double height = sc.nextDouble();
		System.out.println("당신의 키는" + height);
		
		System.out.print("저녁을 먹었는지 입력 (true/false) >> ");
		boolean food = sc.nextBoolean();
		System.out.println("당신의 저녁 여부는 " + food);
		
		System.out.print("올해의 목표는 >> ");
		sc.nextLine(); //엔터 처리 (저장안하고 버리는용도
		String life = sc.nextLine();
		System.out.println("올해의 목표는 " + life);
		
		//자동코드정렬 : Ctrl + Shift + f
		//next : 한 단어 입력
		//nextLine : 한 줄 전부
	}

}
