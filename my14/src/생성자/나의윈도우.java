package 생성자;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의윈도우 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 윈도우");
		f.setSize(300, 300);
		//생성자 메소드이름은 동일하게 사용할 수 있다.
		//오버로딩(다형성)
		
		JButton b = new JButton("푸시");
		f.add(b);
		f.setVisible(true);
	}

}
