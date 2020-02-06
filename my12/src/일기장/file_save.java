package 일기장;

import java.io.File;

public class file_save {

	public static void main(String[] args) {
		
		File f = new File("C:/my/readme.txt");
		boolean ex = f.exists();
		System.out.println("존재여부 >> " + ex);
		System.out.println("폴더여부 >> " + f.isDirectory());
		System.out.println("파일여부 >> " + f.isFile());
		System.out.println("위치확인 >> " + f.getPath());
		
		System.out.println();
		
		File f_2 = new File("C:/windows");
		String[] list = f_2.list();
		
		int folder_cnt = 0;
		int file_cnt = 0;
		
		for (int i = 0; i < list.length; i++) {
			File file_3 = new File("C:/windows/" + list[i]);
			//스트링처리가 되기때문에 
			
			if (file_3.isFile()) {
				file_cnt++;
			}else {
				folder_cnt++;
			}
		} //for end
		System.out.println("파일의 개수 >> " + file_cnt);
		System.out.println("폴더의 개수 >> " + folder_cnt);
	 }

}
