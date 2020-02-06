package 클래스;

public class bank {
	
	// 멤버변수
	String account; 
	String name;
	int money; 
	
	// 멤버메소드 (함수)
	public void 예금() {
		System.out.println("예금");
	}
	public void 출금() {
		System.out.println("출금");
	}
	
	@Override
	public String toString() {
		return  name + "  " + account + "    " + money ;
	}
	
	
	
}
