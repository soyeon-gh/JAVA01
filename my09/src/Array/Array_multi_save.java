package Array;

import javax.swing.JOptionPane;

public class Array_multi_save {

	public static void main(String[] args) {
		
		String[] n = new String[5];
		for (int i = 0; i < n.length; i++) {
			n[i] = JOptionPane.showInputDialog("친구이름 입력");
		}
		System.out.println("--- 친구 이름 목록 ---");
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i] + " ");
		}
		
	}
}
