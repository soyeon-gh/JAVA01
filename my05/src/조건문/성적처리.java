package 조건문;

public class 성적처리 {

	public static void main(String[] args) {
		//점수 : 88
		 
		int score = 88;
		if (score>=90){
			System.out.println("등급 : A");
		} else if (score>=80){
			System.out.println("등급 : B");
		} else if (score>=70) {
			System.out.println("등급 : C");
		} else if (score>=60) {
			System.out.println("등급 : D");
		} else {
			System.out.println("등급 : F");
		}
	}
}