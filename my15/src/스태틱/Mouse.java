package 스태틱;

public class Mouse {
	
	String color;
	String company;
	int price;
	
	
	//생성자 : 입력을 한번에 가능
	public Mouse(String color, String company, int price) {
		
		this.color = color;
		this.company = company;
		this.price = price;
	}

	
	
	// 멤버변수에 들어있는 값들 출력을 한번에 할 수 있다.
	@Override
	public String toString() {
		return "Mouse [color=" + color + ", company=" + company + ", price=" + price + "]";
	}


	
	
	
}
