package 메뉴판;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu {
	private static JTextField total;
	private static JTextField t_2;
	private static JTextField t_1;
	private static JTextField t_3;
	static int cnt_1 = 0; // 짬뽕 주문수
	static int cnt_2 = 0; // 짜장 주문수
	static int cnt_3 = 0; // 우동 주문수
	static int sum_1 = 0; // 전체금액
	static int sum_2 = 0; // 전체금액
	static int sum_3 = 0; // 전체금액
	static int sum_total = 0; // 전체금액
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.setSize(693, 656);
		f.getContentPane().setLayout(null);
		
		total = new JTextField();
		total.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		total.setBounds(164, 548, 392, 42);
		f.getContentPane().add(total);
		total.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("총 금액");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel.setBounds(58, 534, 80, 61);
		f.getContentPane().add(lblNewLabel);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("D:\\학생방\\ksy\\my07\\00.jpg"));
		img.setBounds(84, 114, 519, 410);
		f.getContentPane().add(img);
		
		t_2 = new JTextField();
		t_2.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		t_2.setBounds(338, 40, 104, 34);
		f.getContentPane().add(t_2);
		t_2.setColumns(10);
		
		t_1 = new JTextField();
		t_1.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		t_1.setColumns(10);
		t_1.setBounds(128, 40, 104, 34);
		f.getContentPane().add(t_1);
		
		t_3 = new JTextField();
		t_3.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		t_3.setColumns(10);
		t_3.setBounds(547, 40, 104, 34);
		f.getContentPane().add(t_3);
		
		JButton btn_1 = new JButton("짬뽕");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cnt_1++;
				String cnt_11 = String.valueOf(cnt_1);
				t_1.setText(cnt_11);
				sum_1 = cnt_1 * 5000 ;
				sum_total = sum_1 + sum_2+ sum_3;
				total.setText(sum_total + "원");
				ImageIcon icon = new ImageIcon("00.jpg");
				img.setIcon(icon);
				
			}
		});
		btn_1.setForeground(Color.BLUE);
		btn_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btn_1.setBounds(31, 28, 85, 49);
		f.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("짜장");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cnt_2++;
				String cnt_22 = String.valueOf(cnt_2);
				t_2.setText(cnt_22);
				sum_2 = cnt_2 * 5000;
				sum_total = sum_1 + sum_2+ sum_3;
				total.setText(sum_total + "원");
				ImageIcon icon = new ImageIcon("01.jpg");
				img.setIcon(icon);
			}
		});
		btn_2.setForeground(Color.BLUE);
		btn_2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btn_2.setBounds(244, 28, 85, 49);
		f.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("우동");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cnt_3++;
				String cnt_33 = String.valueOf(cnt_3);
				t_3.setText(cnt_33);
				sum_3 = cnt_3 * 5000;
				sum_total = sum_1 + sum_2 + sum_3;
				total.setText(sum_total + "원");
				ImageIcon icon = new ImageIcon("02.png");
				img.setIcon(icon);
			}
		});
		btn_3.setForeground(Color.BLUE);
		btn_3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btn_3.setBounds(454, 28, 85, 49);
		f.getContentPane().add(btn_3);
		
		f.setVisible(true);
	}
}
