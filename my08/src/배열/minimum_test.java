package 배열;

public class minimum_test {

	public static void main(String[] args) {
		int s[] = { 12, 3, 19, 6, 18, 8, 12, 4, 1, 19};
		int minimum;
		
		minimum = s[0];
		
		for (int i = 1 ; i < s.length ; i++) {
			if (s[i] < minimum) {
				minimum = s[i];
			} // if end
		} //for end
		System.out.println("최소값은 :" + minimum);
	} // main end

}//class end
