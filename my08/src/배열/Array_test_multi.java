package 배열;

import java.util.Scanner;

public class Array_test_multi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int data;  = 쓰레기값이 들어있는 상태
		int[] data = new int[5];
		//변수에 처음값 = 초기값 -> 초기화
		
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("성적을 입력: ");
			data[i] = sc.nextInt();
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+ " ");
		}
		for (int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		System.out.println();
		System.out.println("총합: " + sum + "점");
		System.out.println("평균: " + sum/data.length + "점");
	}
}
