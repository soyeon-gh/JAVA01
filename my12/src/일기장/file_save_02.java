package 일기장;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file_save_02 {

	public static void main(String[] args) throws Exception {
		
		//파일을 인식 + 파일에 저장
		FileWriter f = new FileWriter("20200121.txt");
		
		// 에러가 발생할 수 있는 가능성이 너무 크다
		// 에러가 발생했을 때 어떻게 처리할지를 꼭 써줘야 함
		// 1. 파일에 저장하는경우 / 읽어오는경우
		// 2. 채팅 프로그램 만든 경우 ( = 네트워크 연결하는 경우 )
		// 3. DB를 사용하는경우
		
		f.write("hi" + "\n");
		f.write("hello");
		f.close();
	 }

}
