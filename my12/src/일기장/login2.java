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
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class login2 {
	private static JTextField t_1;
	private static JTextField t_2;

	public void diary() { //일반메서드처럼 만들면 부를 수 있음
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.getContentPane().setLayout(null);
		
		JLabel label_1 = new JLabel("오늘의 날짜 >");
		label_1.setBackground(Color.BLACK);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		label_1.setBounds(72, 42, 205, 60);
		f.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("제목 >");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		label_2.setBackground(Color.BLACK);
		label_2.setBounds(72, 96, 103, 60);
		f.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("내용 >");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		label_3.setBackground(Color.BLACK);
		label_3.setBounds(72, 152, 103, 60);
		f.getContentPane().add(label_3);
		
		t_1 = new JTextField();
		t_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		t_1.setBounds(286, 67, 310, 27);
		f.getContentPane().add(t_1);
		t_1.setColumns(10);
		
		t_2 = new JTextField();
		t_2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		t_2.setColumns(10);
		t_2.setBounds(181, 115, 415, 27);
		f.getContentPane().add(t_2);
		
		JTextArea t_3 = new JTextArea();
		t_3.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		t_3.setRows(5);
		t_3.setBounds(181, 179, 415, 289);
		f.getContentPane().add(t_3);
		
		JButton btn_3 = new JButton("SAVE");
		btn_3.setForeground(new Color(255, 255, 224));
		btn_3.setBackground(new Color(72, 61, 139));
		btn_3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 1. 입력한 값 가져오기
				 * 2. 파일에 저장하기
				 * 3. 저장 확인 메세지 출력
				 */
				String day = t_1.getText();
				String title = t_2.getText();
				String content = t_3.getText();
				
				try {
                    int result = JOptionPane.showConfirmDialog(null, "저장하시겠습니까?");
                    if(result == 0) { //네
                        FileWriter file = new FileWriter(day + ".txt");
                        file.write("제목 : " + title  +"\n");
                        file.write("내용 : " + content  +"\n");
                        file.close();
                        JOptionPane.showMessageDialog(null, "일기가 저장되었습니다.");
                        t_1.setText("");
                        t_2.setText("");
                        t_3.setText("");
                    }else if(result == 1){ //아니요
                        JOptionPane.showMessageDialog(null, "작성을 하지 않는 것으로 선택하셨습니다.");
                        t_1.setText("");
                        t_2.setText("");
                        t_3.setText("");
                    }else { //취소
                        JOptionPane.showMessageDialog(null, "취소하셨습니다. 작성 화면을 닫습니다.");
                        f.dispose();
                    }
                } catch (IOException e1) {
                    System.out.println("error");
                }
            }
        });

		
		btn_3.setIcon(null);
		btn_3.setBounds(214, 502, 227, 52);
		f.getContentPane().add(btn_3);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\학생방\\ksy\\my12\\star.jpg"));
		label.setBounds(0, -34, 666, 689);
		f.getContentPane().add(label);
		f.setTitle("나의 일기장");
		f.setSize(682, 630);
		f.setVisible(true);

	}
}
