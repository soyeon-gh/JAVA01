package exam;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 기본입력2 {

	public static void main(String[] args) throws IOException {
		
		String str_1 = JOptionPane.showInputDialog("문자를 입력해주세요 : ");
		String str_2 = JOptionPane.showInputDialog("문자를 입력해주세요 : ");
		
		String str = str_1 + str_2;
		
//		System.out.println("첫 번째 입력한 문자 : " + str_1);
//		System.out.println("두 번째 입력한 문자 : " + str_2);
//		System.out.println("두 문자의 결합 결과 : " + str);
//		JOptionPane.showMessageDialog(null, str);
		
		FileWriter file = new FileWriter("win.txt");
		file.write(str);
		file.close();
		
	}

}
