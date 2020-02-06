package Array;

import javax.swing.JOptionPane;

public class Array_value_plus_03 {

	public static void main(String[] args) {
		/*
		 * 우리 가족의 나이를 JoptionPane 으로 입력받아
		 * 평균 나이를 구해보자
		 * 55 50 27 15
		 */
		
		String age[] = new String[4];
		
		int sum = 0;
		for (int i = 0; i < age.length; i++) {
			age [i]= JOptionPane.showInputDialog("가족의 나이를 입력해주세요.");
			
			sum = sum + Integer.parseInt(age[i]);
			
		}
		System.out.println("가족 평균나이는 " + sum / age.length);
	}
}
