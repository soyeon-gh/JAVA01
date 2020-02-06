package 배열;

public class Array_test_11 {

	public static void main(String[] args) {
		
		int[] num = {66,77,88,99};
		int temp = num[0]; //새로운 변수를 넣어야 서로 뒤바뀌게 된다.
		num[0] = num[3];
		num[3] = temp;
		
		System.out.println(num[0]);
		System.out.println(num[3]);
	}
}

