package database;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class naver {
	private static JTextField t_1;
	private static JTextField t_2;
	private static JTextField t_2_2;
	private static JTextField t_3;
	private static JTextField t_4;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 네이버 회원 가입");
		f.getContentPane().setBackground(SystemColor.menu);
		f.setSize(530, 726);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel.setBounds(72, 109, 124, 22);
		f.getContentPane().add(lblNewLabel);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("D:\\학생방\\ksy\\my15\\naver.png"));
		label_3.setBounds(160, 26, 222, 54);
		f.getContentPane().add(label_3);
		
		JLabel label = new JLabel("비밀번호");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		label.setBounds(72, 190, 124, 22);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("비밀번호 재확인");
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		label_1.setBounds(72, 276, 124, 22);
		f.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("이름");
		label_2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		label_2.setBounds(72, 350, 124, 22);
		f.getContentPane().add(label_2);
		
		JLabel label_6 = new JLabel("휴대전화");
		label_6.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		label_6.setBounds(72, 425, 124, 22);
		f.getContentPane().add(label_6);
		
		t_1 = new JTextField();
		t_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		t_1.setBounds(72, 141, 370, 33);
		f.getContentPane().add(t_1);
		t_1.setColumns(10);
		
		t_2 = new JTextField();
		t_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		t_2.setColumns(10);
		t_2.setBounds(72, 220, 370, 33);
		f.getContentPane().add(t_2);
		
		t_2_2 = new JTextField();
		t_2_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		t_2_2.setColumns(10);
		t_2_2.setBounds(72, 307, 370, 33);
		f.getContentPane().add(t_2_2);
		
		t_3 = new JTextField();
		t_3.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		t_3.setColumns(10);
		t_3.setBounds(72, 382, 370, 33);
		f.getContentPane().add(t_3);
		
		t_4 = new JTextField();
		t_4.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		t_4.setColumns(10);
		t_4.setBounds(72, 457, 370, 33);
		f.getContentPane().add(t_4);
		
		JButton btn_1 = new JButton("가입하기");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				
				String id = t_1.getText();
				String pw = t_2.getText();
				String pw_1 = t_2_2.getText();
				if ((pw.equals(pw_1))) 
				{
					
				
				String name = t_3.getText();
				String tel = t_4.getText();
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("1. 커넥터 설정 완료");
					
					String url = "jdbc:mysql://localhost:3333/shose";
					String user ="root";
					String password = "1234";
					Connection con = DriverManager.getConnection(url, user, password);
					System.out.println("2. DB연결 완료");
					
					String sql = "insert into member values (?,?,?,?)";  
					PreparedStatement ps = con.prepareStatement(sql); // 매핑
					
					ps.setString(1, id);
					ps.setString(2, pw);
					ps.setString(3, name);
					ps.setString(4, tel);
					
					System.out.println("3. SQL문 만들기 완료.");
					
					ps.executeUpdate();
					System.out.println("4. SQL문을 mySQL프로그램에 전송 완료");
					
				} catch (Exception e) {
					
					e.printStackTrace();
				} 
				} else {
					t_2_2.setText("비밀번호오류");
				}
			}
		});
		btn_1.setForeground(new Color(230, 230, 250));
		btn_1.setBackground(new Color(50, 205, 50));
		btn_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btn_1.setBounds(72, 522, 370, 54);
		f.getContentPane().add(btn_1);
		
		JButton button = new JButton("탈퇴하기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String id = t_1.getText();
				String pw = t_2.getText();
				String pw_1 = t_2_2.getText();
				
				if ((pw.equals(pw_1))) {
					
				
				String name = t_3.getText();
				String tel = t_4.getText();
				
					try {
						Class.forName("com.mysql.jdbc.Driver");
						System.out.println("1. 커넥터 설정 완료");
					
						String url = "jdbc:mysql://localhost:3333/shose";
						String user ="root";
						String password = "1234";
						Connection con = DriverManager.getConnection(url, user, password);
						System.out.println("2. DB연결 완료");
						
						String sql = "delete from member where id = ?"; 
						PreparedStatement ps = con.prepareStatement(sql); // 매핑
					
						ps.setString(1, id);
					
						System.out.println("3. SQL문 만들기 완료.");
					
						ps.executeUpdate();
						System.out.println("4. SQL문을 mySQL프로그램에 전송 완료");
					
					} catch (Exception e) {
						e.printStackTrace();
					} 
				} else {
					t_2_2.setText("비밀번호오류");
				}
			}
		});
		button.setForeground(new Color(230, 230, 250));
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button.setBackground(new Color(50, 205, 50));
		button.setBounds(72, 595, 370, 54);
		f.getContentPane().add(button);
		
		f.setVisible(true);

	}
}
