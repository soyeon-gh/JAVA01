package 순차문;

public class 평균계산 {
 
	public static void main(String[] args) {
		int 수학 = 88;
		int 영어 = 99;
		int 국어 = 55;
		int total = 수학 + 영어 + 국어;
		int 과목수 = 3;
		double avg = total / (double)과목수;
		System.out.println("전체 과목 총점 : " + total + "점");
		System.out.println("평균 : " + avg + "점");
	}

}
