package 배열;

public class Array_test_05 {

	public static void main(String[] args) {
		int num_1 = 10;
		int num_2 = 20;
		int num_3;
		num_3 = num_1; //복사
		// 기초형 변수의 복사는 변수값을 그대로 대입
		System.out.println(num_1 + ", " + num_3);
		
		int[] num_4 = { 1, 2, 3 };
		int[] num_5;
		num_5 = num_4;
		num_4[0] = 99;
		for (int i : num_5) {
			System.out.println(i + " ");
		}
		System.out.println("======================");
		int[] num_6;
		num_6 = num_4.clone();
		num_4[0]=55;
		
		for (int i: num_6) {
			System.out.println(i+" ");
		}
	}
}
