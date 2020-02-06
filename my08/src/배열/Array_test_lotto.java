package 배열;

import java.util.Random;

public class Array_test_lotto {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		Random r = new Random();
		//int data = r.nextInt(45)+1;
		
		//System.out.println("");
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45)+1;
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i] + " ");
		}
	}
}
