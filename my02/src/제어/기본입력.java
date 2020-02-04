package 제어;

import javax.swing.JOptionPane;

public class 기본입력 {

	public static void main(String[] args) {
		/*
		String name = JOptionPane.showInputDialog("당신의 이름은");
		System.out.println("당신이 입력한 이름은 " + name);
		*/
		
		// ctrl + / : 전체 주석
		
		String company = JOptionPane.showInputDialog("당신의 소속은?") + "스터디";
		String result = company + "스터디";
		System.out.println("당신은" + result + "소속입니다");
	}

}
