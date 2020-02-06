package 클래스;

public class 계산기사용 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.add();
		System.out.println(cal.add(200, 100));
		System.out.println(cal.add(100, 30.5));
		System.out.println(cal.add(33.5, 44.2));
		System.out.println(cal.add("안녕","하세요"));
		System.out.println(cal.add("내나이", 100));
		
	}

}
