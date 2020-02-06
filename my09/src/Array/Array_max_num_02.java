package Array;

import java.util.Random;

public class Array_max_num_02 {

	public static void main(String[] args) {
		Random r = new Random(7); 
		// = 씨드값 (seed) 
		// () 안에 숫자를 넣으면 새로 실행 시켜도 숫자는 같다 
		// (=랜덤값을 동일하게 유지 가능)
		int cnt = 0;
		int s[] = new int[10000];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(10000);
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + " ");
		}
		System.out.println("-------");
		int max = s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i] > max) {
				max = s[i];
			}
		}
		System.out.println("숫자중 최대값은 " + max);
		for (int i = 0; i < s.length; i++) {
			if (s[i] == max) {
				cnt++;
				System.out.println(max + "값이 들어있는 위치는 " + i);
			}
		}
		System.out.println("max 값이 위치한 개수는 " + cnt + "번");
	}
}
