package 상속;

public class manager extends employee {
	private int bonus = 1000; //외부에서 접근금지
	public void test() {
		System.out.println("관리감독하다");
	}
	@Override
	public String toString() {
		return "manager [address=" + address + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
