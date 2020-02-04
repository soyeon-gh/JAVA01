package 문제;

import javax.swing.JOptionPane;

public class exam01 {

	public static void main(String[] args) {
		// 소속, 이름  -> 홍길동은 메가소속입니다.
		// f2 = 이름변경
		String company = "메가";
		String name = JOptionPane.showInputDialog("당신의 이름은? : ");
		String user = name + "님은 " + company + "소속입니다.";
		//System.out.println(name + "님은 " + company + "소속입니다.");
		JOptionPane.showMessageDialog(null, user);

	}

}
