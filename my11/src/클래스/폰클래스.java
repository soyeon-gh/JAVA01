package 클래스;

public class 폰클래스 {
	
	//  성질 : 화면크기, 폰 용량, 색상, 소프트웨어종류 ㅡ> 멤버변수
	String 색상; // 실버, 골드, 블랙, 화이트, 핑크
	double 화면크기; //4 , 4.5 , 4.7 , 
	int 용량; // 32GB, 64GB , 128GB
	String 소프트웨어; // 안드로이드, ios
	
	
	//  동작 : 전원 on_off, 볼륨조절 ㅡ> 멤버메소드 (함수)
	public void 전원on() {
		System.out.println("핸드폰 전원이 켜졌습니다");
	}
	public void 전원off() {
		System.out.println("핸드폰 전원이 꺼졌습니다");
	}
	public void 볼륨up() {
		System.out.println("핸드폰 볼륨을 높입니다");
	}
	public void 볼륨down() {
		System.out.println("핸드폰 볼륨을 낮춥니다");
	}
	
}
