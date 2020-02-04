package 순차문;

import javax.swing.JOptionPane;

public class 순차문02 {

	public static void main(String[] args) {
		String data = JOptionPane.showInputDialog("현재 온도는? : ");
		/* 
		 * 모든 외부 입력 타입 : String
		 * String 사용 or 타입변경은 프로그래머가 결정
		 * String -> int 변환
		 */
		
		int now = Integer.parseInt(data);
		//처리
		int back = now - 1;
		System.out.println("집에 갈 때의 온도는 " + back + "℃");

	}

}
