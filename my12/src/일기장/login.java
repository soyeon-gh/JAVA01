package 일기장;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {
	private static JTextField fd_1;
	private static JTextField fd_2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBackground(Color.BLACK);
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		lblId.setBounds(275, 102, 49, 60);
		f.getContentPane().add(lblId);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		lblPassword.setBackground(Color.BLACK);
		lblPassword.setBounds(97, 191, 233, 60);
		f.getContentPane().add(lblPassword);
		
		fd_1 = new JTextField();
		fd_1.setBounds(340, 120, 250, 27);
		f.getContentPane().add(fd_1);
		fd_1.setColumns(10);
		
		fd_2 = new JTextField();
		fd_2.setColumns(10);
		fd_2.setBounds(340, 210, 250, 27);
		f.getContentPane().add(fd_2);
		
		JButton btn_1 = new JButton("");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = fd_1.getText();
				String pw = fd_2.getText();
				//갖고오는것 get , 넣는것 set
				if (id.equals("root") && pw.equals("1234")) {
					// 기본형이 아닌경우는 == 로 비교할수없다
					JOptionPane.showMessageDialog(null, "로그인 되었습니다. 일기장 화면으로 넘어갑니다.");
					login2 today = new login2();
					today.diary();
					
					//diary();메소드를 사용하려면 이 주소를 가진 변수가 있어야한다
					 
				} else {
					JOptionPane.showMessageDialog(null, "ID와 Password가 잘못 입력 되었습니다.");
				}
			}
		});
		btn_1.setIcon(new ImageIcon("D:\\학생방\\ksy\\my12\\login.jpg"));
		btn_1.setBounds(111, 308, 211, 242);
		f.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//f.dispose(); //해당 창 닫음.
                //System.exit(0); 
                //시스템 종료. main + 해당창 close!
				fd_1.setText("");
				fd_2.setText("");
			}
		});
		btn_2.setIcon(new ImageIcon("D:\\학생방\\ksy\\my12\\RESET.jpg"));
		btn_2.setBounds(362, 308, 227, 242);
		f.getContentPane().add(btn_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\학생방\\ksy\\my12\\star.jpg"));
		label.setBounds(0, -34, 666, 689);
		f.getContentPane().add(label);
		f.setTitle("나의 일기장");
		f.setSize(682, 630);
		f.setVisible(true);

	}
}
