package Array;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class button_01 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		FlowLayout flow = new FlowLayout();
		//붙이는 순서대로 뒤에 붙여주는 class
		
		f.setLayout(flow);
		JButton[] btn = new JButton[500];
		for (int i = 0; i < 500; i++) {
			btn[i] = new JButton("자리" + i);
			f.add(btn[i]);
			// 인터페이스로 이벤트 처리할 예정 - 4주차
		}
		/*
		for (int i = 1; i <= 500; i++) {
			JButton b1 = new JButton("자리" + i);
			f.add(b1);
		} ㅡ> 구분해 줄 변수 값이 없기 때문에 잘못된 코드 */
		
		f.setVisible(true);
	}
}
