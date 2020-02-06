package Array;

public class Array_2차원 {

	public static void main(String[] args) {
		/*
		 * 2차원 배열 ( 행, 열 지정해줘야함 )
		 *    1  2  3  4  5
		 * ------------------
		 * 1: 0  0  0  0  0
		 * 2: 0  0  0  0  0
		 * 3: 0  0  0  0  0 
		 */
		int[][] n = new int[3][5];
		System.out.println("배열의 크기 : " + n.length); //행만찍힘
		System.out.println("0번 행의 크기 : " + n[0].length); // 해당하는 열의 갯수
		System.out.println("1번 행의 크기 : " + n[1].length); // 해당하는 열의 갯수
		System.out.println("2번 행의 크기 : " + n[2].length); // 해당하는 열의 갯수
		for (int i = 0; i < n.length; i++) { //행만큼
			System.out.print((i+1) + " : ");
			for (int j = 0; j < n[i].length; j++) { //열만큼
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
	}
}
