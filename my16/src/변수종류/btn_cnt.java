package 변수종류;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class btn_cnt {
	
	//전역변수 (global)
	// __멤버변수는 모두 전역변수
	// __전역변수는 자동으로 초기화 한다.
	
	static int cnt; 
	
	
	public static void main(String[] args) {
		//지역변수 (local)
		// __자동 초기화 x
		JFrame f = new JFrame("__count program__");
		f.setSize(435, 350);
		f.getContentPane().setLayout(null);
		
		JLabel t_1 = new JLabel("0");
		t_1.setHorizontalAlignment(SwingConstants.CENTER);
		t_1.setForeground(new Color(230, 230, 250));
		t_1.setFont(new Font("맑은 고딕", Font.BOLD, 99));
		t_1.setBounds(116, 95, 186, 176);
		f.getContentPane().add(t_1);
		
		JButton btn_1 = new JButton("+ 1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cnt++;
				t_1.setText(cnt+"");
			}
		});
		btn_1.setBackground(new Color(169, 169, 169));
		btn_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btn_1.setBounds(23, 21, 115, 49);
		f.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("reset");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cnt = 0;
				t_1.setText(cnt+"");
			}
		});
		btn_2.setForeground(new Color(230, 230, 250));
		btn_2.setBackground(new Color(72, 61, 139));
		btn_2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btn_2.setBounds(150, 21, 115, 49);
		f.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("- 1");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cnt--;
				t_1.setText(cnt+"");
			}
		});
		btn_3.setBackground(new Color(138, 43, 226));
		btn_3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btn_3.setBounds(277, 21, 115, 49);
		f.getContentPane().add(btn_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\학생방\\ksy\\my16\\star.jpg"));
		lblNewLabel_1.setBounds(0, 0, 419, 311);
		f.getContentPane().add(lblNewLabel_1);
		f.setVisible(true);
	}
}
