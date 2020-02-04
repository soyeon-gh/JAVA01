package 조건문;

import java.util.Date;

public class 인사처리 {

	public static void main(String[] args) {
		/*
		 * 지금은 몇시인가요?
		 * 몇시인지 알려주는 class가 필요
		 */
		Date date = new Date();
		int hour = date.getHours();
		
		if (hour <= 6 && hour < 10) {
			System.out.println("굿모닝");
		} else if (hour < 15) {
			System.out.println("굿 애프터눈");
		} else if (hour < 22){
			System.out.println("굿 이브닝");
		} else {
			System.out.println("굿 나잇");
		}
		
	}//main end

}//class end
