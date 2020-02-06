package 배열;

public class Array_test_08 {

	public static void main(String[] args) {
		
		int[] s = {66, 77, 88, 99};
		int input = s[0];
		for (int i = 0; i < s.length; i++) {
			if (input < s[i]) {
				input=s[i];
			}
		}
		System.out.println("최대값은 : " + input);
	}
}
