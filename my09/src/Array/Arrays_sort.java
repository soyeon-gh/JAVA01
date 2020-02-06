package Array;

import java.util.Arrays;

public class Arrays_sort {

	public static void main(String[] args) {
		
		final int SIZE = 10;
		int[] numbers = new int[SIZE];
		
		for (int i = 0; i < SIZE; i++) {
			int r = (int) (Math.random() * 100);
			numbers[i] = r;
		}
		System.out.print("최초의 리스트 : ");
		for (int r : numbers) {
			System.out.print(r + " ");
		}
		Arrays.sort(numbers);
		System.out.println();
		System.out.print("정렬된 리스트 : ");
		for (int r : numbers) {
			System.out.print(r + " ");
		}
	}
}
