package Array;

public class Array_value_plus_02 {

	public static void main(String[] args) {
		
		String num[] = { "11" , "22" , "33" };
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum + Integer.parseInt(num[i]);
		}
		System.out.println("배열의 합은 " + sum);
	}
}
