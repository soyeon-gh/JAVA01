package 상속;

public class manager_use {

	public static void main(String[] args) {
		manager m = new manager();
		m.name = "홍길동"; //public
		m.address = "서울특별시"; //default
		m.salary = 100; //protected
		//private은 접근불가해서 외부 클래스에서 뜨지않는다
		m.test();
		System.out.println(m);
		
				
	}

}
