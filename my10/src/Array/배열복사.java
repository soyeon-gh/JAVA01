package Array;

public class 배열복사 {

	public static void main(String[] args) {
		int[] x = {1,2,3};   //x는 1,2,3에 해당하는 주소가 들어있다
		int[] y = x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println("------------------");
		x[2] = 5 ;
		System.out.print("x : ");
		for (int a : x) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.print("y : ");
		for (int b : y) {
			System.out.print(b+" ");
		}
		
	}

}
