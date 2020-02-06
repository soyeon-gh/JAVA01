package 복습;

public class 마스크원형 {
	
	String color;
	int price;
	
	//입력값을 한번에 반다 출력할때
	//생성자를 이용한다.
	//클래스이름과동일
	 //반환타입의 유무를 쓰지않는다.
	public 마스크원형(String c, int p) {
		color = c;
		price = p;
	}
	
	@Override
	public String toString() {
		return "마스크원형 [color=" + color + ", price=" + price + "]";
	}
	
	
}
