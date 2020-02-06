package Array;

import java.util.Arrays;

public class Array_grade {

	public static void main(String[] args) {
		
		int grade[] = { 50, 60, 30, 70, 10, 40, 80, 100 };
		int me = 70;
		Arrays.sort(grade);
		System.out.println("---점수 정렬---");
		for (int i = 0; i < grade.length; i++) {
			System.out.println(grade[i] +" ");
		}
		int index = 0;
		for (int i = 0; i < grade.length; i++) {
			if (grade[i] == me) {
				index = i;
				System.out.println("내 위치: " + (i+1));
			}
		}
		System.out.println("내 등수는 " + (grade.length - index) + "등");
	}
}
