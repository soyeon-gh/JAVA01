package 조건문;

import java.util.Date;

import org.omg.CORBA.DATA_CONVERSION;

public class TimeCheck {

	public static void main(String[] args) {
		/*
		 * 실행할 때 현재 시각을 구해서
		 * 얼마나 집에 갈 시간이 남았는지 체크
		 */
		Date date = new Date();
		int hour = date.getHours();
		if (hour>20) {
			System.out.println("집에 갈 시간이 남았어요");
			// Ctrl + Alt + 방향키 아래 : 한 줄 복사
			// 이동 : Alt + 방향키
		} else {
			System.out.println("집에갈 시간이에요");
		}
	}

}
