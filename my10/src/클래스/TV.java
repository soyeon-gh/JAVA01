package 클래스;

public class TV {
	/*
	 * 부품의 특징으로 가지고 부품을 만들어야 한다.
	 * 성질 : 모양, 크기, 회사, 가격, 색상
	 * -> 변수로 정의 (멤버변수)
	 * 동작 : 채널바꾸기, 볼륨조절, 전원on/off
	 * -> 함수(메소드)로 정의 (멤버 메소드)
	 */
	
	String shape;
	int size;
	
	//--------------------------------
	//Ctrl 누른채로 println 누르고 네모칸 누르고 밑에 클릭 java jdk 파일에 있는 압축파일 넣고 클릭
	
	public void changeCh() {
		//changeCh() 명령어를 쳤을 때 처리할 내용
		System.out.println("TV채널 변경");
	}
	public void tv_off() {
		//tv_off() 명령어를 쳤을 때 처리할 내용
		System.out.println("TV를 끄다");
	}
}
