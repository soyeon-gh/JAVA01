package Array;

public class Array_value_plus {

	public static void main(String[] args) {
		
		int num[] = {1,2,3};
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println("배열의 합은 " + sum);
	}
}
