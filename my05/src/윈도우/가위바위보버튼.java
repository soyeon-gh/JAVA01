package 윈도우;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 가위바위보버튼 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(153, 153, 204));
		
		//---------------------가위버튼
		JButton btnNewButton = new JButton("가위");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//버튼을 클릭했을 때 처리 내용
				JOptionPane.showMessageDialog(null, "가위를 누르셨습니다.");
			}
		});
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btnNewButton.setBackground(new Color(255, 204, 255));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		//---------------------보버튼
		JButton btnNewButton_1 = new JButton("보");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "보를 누르셨습니다.");
			}
		});
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		//---------------------바위버튼
		JButton btnNewButton_2 = new JButton("바위");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "바위를 누르셨습니다.");
			}
		});
		btnNewButton_2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btnNewButton_2.setBackground(new Color(255, 255, 204));
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
