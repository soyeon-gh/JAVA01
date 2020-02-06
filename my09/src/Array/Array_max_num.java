package Array;

public class Array_max_num {

	public static void main(String[] args) {
		
		int s[] = { 10 , 30, 70, 40, 1 };
		int max_num = s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i] > max_num) {
				max_num = s[i];
			}
		}
		System.out.println("최대값은 " + max_num);
	}
}
