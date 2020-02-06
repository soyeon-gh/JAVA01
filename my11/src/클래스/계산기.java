package 클래스;

public class 계산기 {
	
	public int add(int coffee, int green) {
		System.out.println("결제금액 : " + (coffee + green));
		return coffee + green;
	}
	
	public void minus(int money) {
		boolean vip = true;
		int result = money - 1000; 
		System.out.println("할인된금액 >> " + result);
	}
	
	public int multi(int money,int cnt) {
		System.out.println("총 금액은 " + (money * cnt) +" 원 입니다.");
		return  money * cnt;
	}
	
	public void div(int result, int cnt) {
		System.out.println(result / cnt + "원씩 내야합니다.");
	}
	
	/*
	 * multi(3000,4) -> 곱한 값 반환받아서 result2 변수에 저장
	 * div(result2,4) -> 1명당 얼마를 내야하는지 출력
	 */
}

