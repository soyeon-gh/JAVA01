package 클래스;

public class 우리가족계좌 {

	public static void main(String[] args) {
		
		System.out.println("우리 가족 계좌정보");
		System.out.println("-----------------------");
		System.out.println("이름     계좌이름     금액");
		System.out.println("-----------------------");
		
		bank fafa = new bank();
		fafa.name = "홍길동";
		fafa.account = "튼튼적금";
		fafa.money = 1000;
		System.out.println(fafa);
		

		bank mama= new bank();
		mama.name = "박길동";
		mama.account = "튼튼예금";
		mama.money = 2000;
		System.out.println(mama);
		
		bank me = new bank();
		me.name = "이길동";
		me.account = "다음적금";
		me.money = 3000;
		System.out.println(me);
		
		System.out.println("-----------------------");
		
		System.out.print("아버지는 ");
		fafa.출금();
		System.out.print("딸은 ");
		me.예금();
	}

}
