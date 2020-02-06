package 상속;

public class employee {
	// 접근제어자 +,#,-,없음
	//public -> protected -> default -> private
	
	String address; 
	// 없는것 / 같은 패키지 내에서만 사용가능 ,기본제어자
	
	public String name; 
	//  + : public / 아무데서나 name사용가능
	
	protected int salary; 
	// # : protected 
	// 같은패키지,다른패키지 가능한데 상속할때만 가능
	
	private int rrn; 
	// - : private / 이 클래스를 벗어날 수 없고 내에서만 사용가능
	//본래 주민번호는 스트링처리
	

}
