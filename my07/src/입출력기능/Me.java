package 입출력기능;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Me {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(176, 196, 222));
		f.setSize(800, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("이름");
		lblName.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		lblName.setBounds(113, 96, 83, 57);
		f.getContentPane().add(lblName);
		
		JLabel label = new JLabel("나이");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		label.setBounds(113, 228, 83, 57);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("신발");
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		label_1.setBounds(113, 361, 77, 57);
		f.getContentPane().add(label_1);
		
		TextField name = new TextField();
		name.setFont(new Font("Dialog", Font.PLAIN, 35));
		name.setBounds(205, 103, 238, 50);
		f.getContentPane().add(name);
		
		TextField shoe = new TextField();
		shoe.setFont(new Font("Dialog", Font.PLAIN, 35));
		shoe.setBounds(205, 368, 238, 50);
		f.getContentPane().add(shoe);
		
		TextField age = new TextField();
		age.setFont(new Font("Dialog", Font.PLAIN, 35));
		age.setBounds(205, 235, 238, 50);
		f.getContentPane().add(age);
		
		JButton button_4 = new JButton("출력");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = name.getText();
				if (n.equals("")|| n.equals("다시입력")) {
					//JOptionPane.showMessageDialog(null, "빈칸입니다!");
					name.setText("다시입력");
				} else {
					System.out.println("이름출력 : " + n + "님");
				}
				
			}
		});
		button_4.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		button_4.setBackground(new Color(112, 128, 144));
		button_4.setBounds(476, 103, 105, 50);
		f.getContentPane().add(button_4);
		
		JButton button = new JButton("출력");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = age.getText();
				if (a.equals("") || a.equals("다시입력")) {
					age.setText("다시입력");
				} else {
				int aa = Integer.parseInt(a);
				System.out.println("나이출력 : " + a + "세");
				int new_year_age = aa+1;
				System.out.println("내년나이 : " + new_year_age + "세");
				}
			}
		});
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		button.setBackground(new Color(112, 128, 144));
		button.setBounds(476, 235, 105, 50);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("출력");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = shoe.getText();
				if (s.equals("")|| s.equals("다시입력")) {
					shoe.setText("다시입력");
				}else {
					System.out.println("신발 사이즈 출력 : " + s + "mm");
				}
			}
		});
		button_1.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		button_1.setBackground(new Color(112, 128, 144));
		button_1.setBounds(476, 368, 105, 50);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("전체 출력");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = name.getText();
				String a = age.getText();
				String s = shoe.getText();
				if (n.equals("") || s.equals("") || a.equals("") || s.equals("다시입력")|| a.equals("다시입력")|| n.equals("다시입력")) {
					JOptionPane.showMessageDialog(null, "아직 입력하지 않았어요 !");
				} else {
				System.out.println("----------------------------------------------------------------");
				System.out.println("이름 :" + n + "님" + ", 나이 : " + a + "세" +", 신발사이즈 : " + s + "mm");
				}
			}
		});
		button_2.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		button_2.setBackground(new Color(112, 128, 144));
		button_2.setBounds(208, 456, 373, 50);
		f.getContentPane().add(button_2);
		
		
		f.setVisible(true);
	}
}
