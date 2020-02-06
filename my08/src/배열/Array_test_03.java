package 배열;

public class Array_test_03 {

	public static void main(String[] args) {
		
		int[] age = {55, 54, 26, 23};
		String[] name = {"안영일" , "김애경", "안근영", "안수영"};
		char[] score = {'A','B','C','D','F'};
		
		for (String s : name) {
			System.out.println(s);
		}
		for (int n : age) {
			System.out.println(n);
		}
		for (char c : score) {
			System.out.println(c);
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println("인덱스[" + i + "]번째 값 : " + score[i]);
		}
	}

}
