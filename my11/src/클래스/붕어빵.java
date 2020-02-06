package 클래스;

public class 붕어빵 {

	public static void main(String[] args) {
		
		// new 를 하면 클래스의 멤버변수들이 ram 에 복사가 된다.
		
		붕어빵틀 붕어빵 = new 붕어빵틀();
		붕어빵.두께 = "두껍게";
		붕어빵.속재료 = "팥";
		System.out.println("붕어빵두께 : " + 붕어빵.두께);
		System.out.println("붕어빵 속재료 : " + 붕어빵.속재료);
		붕어빵.붕어빵포장();
		붕어빵.붕어빵을먹다();
		
		System.out.println("-----------------");
		
		붕어빵틀 붕어빵_2 = new 붕어빵틀();
		붕어빵_2.두께 = "얇게";
		붕어빵_2.속재료 = "크림";
		System.out.println("붕어빵두께 : " + 붕어빵_2.두께);
		System.out.println("붕어빵 속재료 : " + 붕어빵_2.속재료);
		붕어빵_2.붕어빵포장();
		붕어빵_2.붕어빵을먹다();
		
	}

}
