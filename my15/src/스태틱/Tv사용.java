package 스태틱;

public class Tv사용 {

	public static void main(String[] args) {
		
		Tv t_1 = new Tv("white",100);
		System.out.println(Tv.cnt);
		System.out.println(t_1);
		
		Tv t_2 = new Tv("black",200);
		System.out.println(Tv.cnt);
		System.out.println(t_2);
		
	}

}
