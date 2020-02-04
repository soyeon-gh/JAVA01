package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

public class 그래픽 {

	public static void main(String[] args) {
		/*
		 * 그래픽 부품(class) 사용해서 화면을 띄워 봅시다
		 */
		 JFrame f = new JFrame();
		 f.setSize(800, 800);
		 
		 JButton b = new JButton();
		 b.setForeground(Color.WHITE);
		 b.setFont(new Font("HY센스L", Font.PLAIN, 18));
		 b.setBackground(Color.BLUE);
		 b.setText("나를 눌러");
		 
		 f.getContentPane().add(b); // 프레임에 b 버튼을 올려줌
		 
		 f.setVisible(true); //true : 창을 보이게하는것
		 //setVisible : 위에설정한것을 보여주게하는것 ( 맨아래에있어야함 )
		 
	}
}
