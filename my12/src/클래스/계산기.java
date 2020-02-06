package 클래스;

public class 계산기 {
	//오버로딩
	public void add() {
		System.out.println("더하기 기능을 수행합니다.");
	}
	
	public int add(int x, int y) {
		return x + y;
	}
	public double add(int x, double y) {
		return x + y;
	}
	public double add(double x , double y) {
		return x + y;
	}
	public String add(String x , String y) {
		return x + y;
	}
	public String add(String x , int y) {
		return x + y;
	}
}
