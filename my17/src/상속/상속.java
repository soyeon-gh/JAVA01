package 상속;

public class 상속 {

		/*
		 * 사람 - 상태   / 동작
		 * 상태 - 성별, 이름
		 * 동작 - 잠, 먹다
		 * 
		 * 남자 - 사람 + 남자의 특징
		 * 힘의 크기, 빨리달리다
		 * 
		 * 수퍼맨 = 남자 + 수퍼맨의 특징
		 * 날아다닌다
		 * 
		 * 스파이더맨 = 남자 + 스파이더맨의 특징
		 * 벽을탄다
		 */
		
	String gender;
	String name;
	
	public void sleep() {
		System.out.println("잠을자다");
	}
	
	public void eat() {
		System.out.println("먹다");
	}

}
