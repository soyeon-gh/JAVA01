package 조건문;

public class CoffeeTest {

	public static void main(String[] args) {
		/*
		 * 25000원이 넘으면 5000원 할인쿠폰
		 * 아니면 없음
		 */
		
		int price = 5600;
		int count = 5;
		
		int sum = price * count;
		
		if (sum>=25000) 
		{
			sum = sum - 5000;
			
		} 
		System.out.println("결제할 금액은 " + sum + "원 입니다.");
	}

}
