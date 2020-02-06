package 생성자;

public class 키보드 {
	String company;
	int cnt;
	int price;
	
	public 키보드(int p,int n) {
		price = p;
		cnt = n;
	}
	
	public 키보드(int p, String c , int n) {
		company = c;
		cnt = n;
		price = p;
	}

	@Override
	public String toString() {
		return price + ", " + company + ", " + cnt  ;
	}
	
	
}
