package Array;

public class Array_2차원_02 {

	public static void main(String[] args) {
		/*
		 * array[가로][세로]
		 * ------------------------
		 *    0 1 2
		 * ------------------------
		 * 0: 0 0 0
		 * 1: 0 0 0 
		 */
		int[][] seat = new int[2][3];
		seat[0][0]=1;
		seat[0][1]=1;
		seat[1][1]=1;
		seat[1][2]=1;
		for (int i = 0; i < seat.length; i++) { //행만큼
			System.out.print((i+1) + " : ");
			for (int j = 0; j < seat[i].length; j++) { //열만큼
				System.out.print(seat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
