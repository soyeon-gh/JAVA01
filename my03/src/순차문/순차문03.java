package 순차문;

import javax.swing.JOptionPane;

public class 순차문03 {

	public static void main(String[] args) {
		// 두 수 입력받아서 더한 후 출력 : 200 + 100 = 300 입니다.
		
		String num_1 = JOptionPane.showInputDialog("첫번째 수를 입력해 주세요 :");
		String num_2 = JOptionPane.showInputDialog("두번째 수를 입력해 주세요 :");
		int n_1 = Integer.parseInt(num_1);
		int n_2 = Integer.parseInt(num_2);
		
		int sum = n_1 + n_2;
		System.out.println(n_1 + " + " + n_2 + " = " + sum + " 입니다.");
		
	} // main end.
	
} //class end.
