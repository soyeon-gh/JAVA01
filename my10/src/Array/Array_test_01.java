package Array;

public class Array_test_01 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * -----------
		 * 1학기 수학 점수 : 100, 88, 96
		 * 2학기 수학 점수는 첫 학생만 100점에서 99점으로 변경
		 * 
		 * 두 학기의 점수를 프린트
		 */
		
		int[] math_01 = {100, 88, 96};   
		int[] math_02 = math_01.clone(); //깊은 복사
		
		math_02[0] = 99 ;
		System.out.print("1학기 수학 점수 : ");
		for (int a : math_01) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.print("2학기 수학 점수 : ");
		for (int b : math_02) {
			System.out.print(b+" ");
		}
	}

}
