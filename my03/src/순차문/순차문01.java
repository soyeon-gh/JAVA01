package 순차문;

import javax.swing.JOptionPane;

public class 순차문01 {

	public static void main(String[] args) {
		//입력 -> 처리 -> 출력
		/*
		 * 1. 입력 : 오늘의 날씨는?
		 * 2. 처리 : 비->비가 오는 날에는 우산을 챙겨요
		 * 3. 출력
		 */
		
		String weather = JOptionPane.showInputDialog("오늘의 날씨는? (비, 눈): ");
		String s_weather = weather + "오는날에는 우산을 챙겨요";
		
		//System.out.println(s_weather);
		JOptionPane.showMessageDialog(null, s_weather);
		//.함수(함수 입력 값)
	}

}
