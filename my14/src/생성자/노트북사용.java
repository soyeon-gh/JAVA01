package 생성자;

public class 노트북사용 {

	public static void main(String[] args) {
		노트북 노트북_1 = new 노트북(1400000);
		노트북 노트북_2 = new 노트북("아수스",960000);
		System.out.println(노트북_1);
		System.out.println(노트북_2);
	}
// 주소값이 들어가지 않은상태 -> null
// new는 초기화된상태에서 복사된다.
}
