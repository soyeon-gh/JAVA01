package 변수;

public class 데이터2 {

	public static void main(String[] args) {
		
		/* 
		 * cpu -> 연산
		 * 컴퓨터가 인식하는 데이터
		 * 기본데이터
		 * - 숫자 ( 정수 / 실수 )
		 * - 문자 ( 1글자 )
		 * - 논리형
		 */
		
		int year;
		year = 2020;
		
		System.out.println("올해는 : "+ year);
		int age = 23;
		double eye = 0.6 ;
		char sn = '2';
		boolean coffee = false;
		
		System.out.println("나이는 : " + age);
		System.out.println("시력은 : " + eye );
		System.out.println("주민뒷자리첫자리는 : " + sn);
		System.out.println("커피는 마셨습니까 : " + coffee);
		
		int n_age = age + 1;
		System.out.println("내년에 내 나이는 : " + n_age);
		
	}

}
