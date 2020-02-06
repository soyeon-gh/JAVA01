package 윈도우;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 메뉴판 {
	
	static int cnt = 10; //고기의 개수
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 500);
		
		JLabel label = new JLabel("");
		label.setBackground(SystemColor.window);
		label.setIcon(new ImageIcon("D:\\학생방\\ksy\\my06\\규카츠.jpg"));
		f.getContentPane().add(label, BorderLayout.CENTER);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt!=0) {
					JOptionPane.showMessageDialog(null, "고기 빼기");
					cnt--;
					f.setTitle("고기의 개수: " + cnt + "개"); 
					//f.setTitle : 상단 title에 보이게함
				} else {
					f.setTitle("더이상 뺄 수 없어요"); 
				}
			}
		});
		button.setBackground(new Color(255, 255, 255));
		button.setFont(new Font("맑은 고딕", Font.BOLD, 80));
		f.getContentPane().add(button, BorderLayout.WEST);
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "고기 추가");
				cnt++;
				f.setTitle("고기의 개수: " + cnt + "개");
			}
		});
		button_1.setFont(new Font("맑은 고딕", Font.BOLD, 80));
		button_1.setBackground(new Color(255, 255, 51));
		f.getContentPane().add(button_1, BorderLayout.EAST);
		f.setVisible(true);
		//이미지단독으로 사용 x
		//글자로대체,버튼으로대
	}

}
