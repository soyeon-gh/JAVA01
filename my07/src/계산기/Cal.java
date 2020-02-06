package 계산기;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Cal {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField total;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.inactiveCaption);
		
		f.setSize(528, 566);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\학생방\\ksy\\my07\\005.png"));
		lblNewLabel.setBounds(191, 28, 134, 101);
		f.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("숫자1");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		label.setBounds(25, 139, 71, 65);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("숫자2");
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		label_1.setBounds(25, 242, 71, 65);
		f.getContentPane().add(label_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		t1.setBounds(108, 151, 373, 45);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBounds(108, 254, 373, 45);
		f.getContentPane().add(t2);
		
		JButton p = new JButton("더하기");
		p.setForeground(SystemColor.controlText);
		p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 1. t1 과 t2의 입력값 갖고옴
				 * 2. 타입을 계산해주기위해  int 변환
				 * 3. 두수를 더한다.
				 * 4. 결과를 total에 넣어준다
				 */
				
				String t11 = t1.getText();
				String t22 = t2.getText();
				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);
				
				int t = t111 + t222;
				String s = String.valueOf(t);
				total.setText(s);
			}
		});
		p.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		p.setBounds(25, 345, 108, 50);
		f.getContentPane().add(p);
		
		JButton m = new JButton("빼기");
		m.setForeground(SystemColor.controlText);
		m.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String t11 = t1.getText();
				String t22 = t2.getText();
				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);
				
				int t = t111 - t222;
				String s = String.valueOf(t);
				total.setText(s);
			}
		});
		m.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		m.setBounds(145, 345, 108, 50);
		f.getContentPane().add(m);
		
		JButton d = new JButton("곱하기");
		d.setForeground(SystemColor.controlText);
		d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = t1.getText();
				String t22 = t2.getText();
				double t111 = Double.parseDouble(t11);
				double t222 = Double.parseDouble(t22);
				
				double t = t111 * t222;
				String s = String.valueOf(t);
				total.setText(s);
			}
		});
		d.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		d.setBounds(264, 345, 108, 50);
		f.getContentPane().add(d);
		
		JButton s = new JButton("나누기");
		s.setForeground(SystemColor.controlText);
		s.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = t1.getText();
				String t22 = t2.getText();
				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);
				
				int t = t111 / t222;
				String s = String.valueOf(t);
				total.setText(s);
			}
		});
		s.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		s.setBounds(384, 345, 108, 50);
		f.getContentPane().add(s);
		
		JLabel label_2 = new JLabel("결과화면");
		label_2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		label_2.setBounds(25, 426, 108, 65);
		f.getContentPane().add(label_2);
		
		total = new JTextField();
		total.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		total.setColumns(10);
		total.setBounds(141, 436, 340, 50);
		f.getContentPane().add(total);
		
		
		f.setVisible(true);
	}
}
