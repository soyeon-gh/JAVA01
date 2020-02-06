package 스태틱;

public class Tv {
	
	//멤버변수는 new를 할때마다 메모리에 객체마다 각각복사된다
	 
	String color;
	int price;
	static int cnt; //동적
	
	//생성자 : 입력을 한번에 가능
	public Tv(String color, int price) {
		cnt++;
		this.color = color;
		this.price = price;
		
	}
	
	
	// 멤버변수에 들어있는 값들 출력을 한번에 할 수 있다.
	@Override
	public String toString() {
		return "Tv [color=" + color + ", price=" + price +"]";
	}

	
	
}
