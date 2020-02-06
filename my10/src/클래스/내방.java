package 클래스;

public class 내방 {

	public static void main(String[] args) {
		
		TV t1 = new TV();
		t1.shape = "네모";
		t1.size = 50;
		t1.changeCh();
		t1.tv_off();
		System.out.println("t1:" + t1);
		
		TV t2 = new TV();
		t2.shape = "동그라미";
		t2.size = 100;
		t2.changeCh();
		t2.tv_off();
		System.out.println("t2:" + t2);
	}

}
