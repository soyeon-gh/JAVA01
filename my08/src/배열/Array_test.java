package 배열;

public class Array_test {

	public static void main(String[] args) {
		/*
		 * 5번째 위치값을 10으로 넣어서 출력
		 * 10번째 위치값을 20으로 넣어서 출력
		 */
		
		int[] num = new int[10];
		num[4] = 10;
		num[9] = 20;
		System.out.println("배열의 5번째 위치값 :" + num[4]);
		System.out.println("배열의 10번째 위치값 :" +num[9]);
	}

}
