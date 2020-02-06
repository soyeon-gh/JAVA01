package Array;

public class Array_test_12 {

	public static void main(String[] args) {
		int[][] s = new int[2][2];
		s[0][0] = 10;
		s[1][1] = 50;
		
		int[][] num = { {1,2,3} , {4,5,6} };
		
		System.out.println(num[1][1]);
		System.out.println(num[0][2]);
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				System.out.println(num[i][j]);
			}
			System.out.println(num.length);
			System.out.println(num[0].length);
		}
	}

}
