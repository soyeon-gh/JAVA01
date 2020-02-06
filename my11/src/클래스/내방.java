package 클래스;

public class 내방 {

	public static void main(String[] args) {
		
		//내 방에 강아지가 한 마리 필요
		 
		강아지 dog = new 강아지();
		dog.age = 5;
		dog.color = "yellow";
		dog.꼬리를흔들다();
		dog.사람을잘따른다();
		System.out.println();
		System.out.println("---폰1---");
		폰클래스 phone_1 = new 폰클래스();
		phone_1.색상 = "실버";
		phone_1.소프트웨어 = "ios";
		phone_1.용량 = 64;
		phone_1.화면크기 = 4.7;
		System.out.println("색상 : " + phone_1.색상);
		System.out.println("소프트웨어 : " + phone_1.소프트웨어);
		System.out.println("용량 : " + phone_1.용량);
		System.out.println("화면크기 : " + phone_1.화면크기);
		phone_1.전원on();
		phone_1.볼륨down();
		phone_1.볼륨up();
		phone_1.전원off();
		System.out.println();
		System.out.println("---폰2---");
		폰클래스 phone_2 = new 폰클래스();
		phone_2.색상 = "블랙";
		phone_2.소프트웨어 = "안드로이드";
		phone_2.용량 = 32;
		phone_2.화면크기 = 4.5;
		System.out.println("색상 : " + phone_2.색상);
		System.out.println("소프트웨어 : " + phone_2.소프트웨어);
		System.out.println("용량 : " + phone_2.용량);
		System.out.println("화면크기 : " + phone_2.화면크기);
		phone_2.전원on();
		phone_2.볼륨down();
		phone_2.볼륨up();
		phone_2.전원off();
	}

}
