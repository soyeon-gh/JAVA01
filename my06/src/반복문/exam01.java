package 반복문;

public class exam01 {

	public static void main(String[] args) {
		/*
		 * 1. while 문으로 10부터 1까지 감소
		 * 2. for 문으로 1부터 10까지 증가
		 */
		System.out.println("1. while 문으로 10부터 1까지 감소");
		
		int i = 10;
		while (i >= 1) {
			System.out.print(i + " ");
			i--;
		} // while end
		
		System.out.println();
		System.out.println("-----------------------");
		
		System.out.println("2. for 문으로 1부터 10까지 증가");
		
		for (int j = 1; j <= 10; j++) {
			System.out.print(j + " ");
		} // for end
		
	} // main end
} // class end
