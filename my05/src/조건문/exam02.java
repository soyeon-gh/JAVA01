package 조건문;

public class exam02 {

	public static void main(String[] args) {
		/*
		 * 사각형의 면적을 구하는 프로그램
		 * ---------------------------
		 * 가로가 7, 세로가 8
		 * 면적은 가로 * 세로
		 * 
		 * 면적이 50이상이면, 너무 넓군요
		 * 그것이 아니면 너무 좁군요
		 */
		
		System.out.println("사각형의 면적을 구하는 프로그램");
		System.out.println("-------------------------");
		System.out.println("가로가 7, 세로가 8");
		System.out.println("면적은 가로 * 세로");
		System.out.println("");
		
		int height = 8;
		int width = 7;
		int tt = height * width;
		
		if (tt>=50) {
			System.out.println("가로: " + height + " , 세로: " + width);
			System.out.println("넓이: " + tt);
			System.out.println("너무 넓군요");
		} else {
			System.out.println("너무 좁군요");
		}
	}

}
