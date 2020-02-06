package 배열;

public class Array_test_02 {

	public static void main(String[] args) {
		
		int[] s = new int[10];
		for (int i = 0; i < s.length; i++) {
			s[i]= i;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println("==========================");
		for (int i:s) {
			System.out.println(i);
		}
	}

}
