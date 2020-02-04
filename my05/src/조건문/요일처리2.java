package 조건문;

import java.util.Date;

public class 요일처리2 {

	public static void main(String[] args) {
		
		
		Date date = new Date();
		int day = date.getDay();
		
		switch (day) { // int, char, String 만 올 수 있음
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		default:
			System.out.println("토요일");
			break;
		}
		
	}//main end
}//class end
