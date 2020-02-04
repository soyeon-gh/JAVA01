package 조건문;

import java.util.Date; 

public class TimeChek_2 {

	public static void main(String[] args) {
		// 한줄 삭제 : 컨트롤 + d
		//import java.util.Date;없어서 오류시 : 마우스올려서 선택 / f2
		
		Date date = new Date();
		int hour = date.getHours();
		System.out.println("현재 시각은 " + hour + "시");
		
		int min = date.getMinutes();
		int sec = date.getMinutes();
		System.out.println(min + "분 " + sec + " 초");
		
		int year = date.getYear();
		int year_2 = year + 1900;
		System.out.println("올해는 " + year_2 + "년");
		
		int month = date.getMonth() + 1; // 그냥 하면 음력기준 그래서 +1
		System.out.println("이번달은 " + month + "월"); 
		
		int d = date.getDate();
		System.out.println("오늘은 " + d + "일");
		
		int day = date.getDay();
		System.out.println("오늘은 " + day + "요일");
		if (day==2) {
			System.out.println("화요일");
		} else {
			System.out.println("화요일 아님");
		}
	}

}
