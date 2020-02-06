package 스태틱;

public class exam_1 {
		/*
		 * new 를 할 때 객체 생성시, 멤버변수가 복사되는  ram의 영역은 heap영역
		 * heap 영역은 크기만 맞으면 아무데나 만들어 쓸 수 있는 특징이 있다.
		 */
		String doing; // 참조형 String은 null로 초기화
		int time;
		String location;
		static int cnt; // 멤버변수는 자동으로 초기화 된다  int는 0으로 초기화
		static int sum;
		//boolean : false로 초기화
		public exam_1(String doing, int time, String location) {
			sum = sum + time;
			cnt++;
			this.doing = doing;
			this.time = time;
			this.location = location;
		}
		
		@Override
		public String toString() {
			return  doing + "을(를), " + time + "시간동안, " + location + "에서 했다.";
		}
		
		public void play() {
			System.out.println("매일놀다");
		}
	
	
	
}
