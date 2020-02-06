package Array;

public class 배열복습 {

	public static void main(String[] args) {
		
		String[] tv = {"무한도전","런닝맨"}; // 값을 알때
		
		for (int i = 0; i < tv.length; i++) {
			System.out.print(tv[i] + " ");
		}
		System.out.println();
		String[] music = new String[3]; // 값을 모를때 , 나중에 값을 넣을 때
		music[0] = "노래1";
		music[1] = "노래2";
		music[2] = "노래3";
		
		for (int i = 0; i < music.length; i++) {
			System.out.print(music[i] + " ");
		}
	}
}
