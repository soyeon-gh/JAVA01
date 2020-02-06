package 배열;

public class Array_test_A {

	public static void main(String[] args) {
		/*
		 * 우리가족 5명의 나이 넣고 전체 출력
		 * 친구들의 발사이즈 넣고 전체 출력
		 * 친구들의 성별넣고 전체 출력
		 */
		
		int[] family_age = { 46 , 46 , 23 , 20 , 13 , 10 };
		int[] f_foot_size = { 230 , 240, 250 ,260, 270 };
		char[] f_s = { '여' , '여' , '남', '여', '남' };
		
		for (int i = 0; i < family_age.length; i++) {
			System.out.println(family_age[i]);
		}
		for (int i = 0; i < f_foot_size.length; i++) {
			System.out.println(f_foot_size[i]);
		}
		for (int i = 0; i < f_s.length; i++) {
			System.out.println(f_s[i]);
		}
	}

}
