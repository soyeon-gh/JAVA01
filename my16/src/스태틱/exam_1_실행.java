package 스태틱;

public class exam_1_실행 {

	public static void main(String[] args) {
		/*
		 * 하루의 일과를 나타내는 프로그램
		 * 
		 * 하루는 하는일, 시간, 장소로 변수
		 * Day("자바공부",10,"강남");
		 * Day("여행",15,"강원도");
		 * Day("운동",11,"피트니스");
		 * -------------------------------
		 * 전체 하는 일의 시간은 :
		 * 평균 하는 일의 시간은 :
		 * 매일 무엇을 얼마나 어디에서 했는지 프린트 :
		 * 며칠 간 했는지 : 
		 * -------------------------------
		 * 
		 * 
		 * 
		 *  day_1 변수 : 지역변수 -> 스택영역
		 *  main 은 스택영역에 생기기 때문에
		 *  exam_1("자바공부",10,"강남"); -> heap 영역 변수 3개 총 9개
		 *  
		 */
		
		exam_1 day_1 = new exam_1("자바공부",10,"강남");
		day_1.play();
		exam_1 day_2 = new exam_1("여행",15,"강원도");
		exam_1 day_3 = new exam_1("운동",11,"피트니스");
		System.out.println("전체 하는 일의 시간은  : " + exam_1.sum + " 시간");
		System.out.println("평균 하는 일의 시간은  : " + exam_1.sum/exam_1.cnt + " 시간");
		System.out.println("매일 무엇을 얼마나 어디에서 했는지 :");
		System.out.println("  day 1 : " + day_1);
		System.out.println("  day 2 : " + day_2);
		System.out.println("  day 3 : " + day_3);
		System.out.println("며칠 간 했는지 : " + exam_1.cnt + "일");
	}

}
