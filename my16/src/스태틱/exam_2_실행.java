package 스태틱;

public class exam_2_실행 {

	public static void main(String[] args) {
		/*
		 * 창업시작 직원구함
		 * 직원
		 * 정적속성 - 이름, 성별, 나이 초기화
		 * 동적속성 - 일하다, 친화력 있다
		 * 
		 * static 변수 - 2개 ( 나이를 더하는 변수, 직원수 카운트 변수 )
		 * 평균나이 = 나이를 다 더해서 , 나이합/직원수 프린트
		 * 직원수 카운트 = 직원수 + 1
		 *  
		 *  전체 직원수?
		 *  직원들의 평균나이?
		 *  첫번째 직원의 이름은?
		 */
		
		exam_2 worker_1 = new exam_2("kim","남",20);
		exam_2 worker_2 = new exam_2("lee","여",30);
		exam_2 worker_3 = new exam_2("jang","남",40);
		
		System.out.println("전체 직원 수 : " + exam_2.cnt);
		System.out.println("직원 평균 나이 : " + exam_2.avg());
		System.out.println("첫 번째 직원의 이름은 : " + worker_1.name);
		System.out.println("---------------");
		System.out.println("전체 직원 정보 ");
		System.out.println("---------------");
		System.out.println(worker_1);
		System.out.println(worker_2);
		System.out.println(worker_3);
		System.out.println("---------------");
		String num_1 = "100";
		int num_2 = Integer.parseInt(num_1);
		int num_3 = 200;
		System.out.println(num_2 + num_3);
		
	}

}
