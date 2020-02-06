package 실무클래스;

import java.util.ArrayList;

public class array_test_2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //타입자유, 크기자유, 인덱스 o
		list.add("홍길동"); 
		list.add(100);
		list.add(33.5);
		list.add(false);
		list.add('남');
		System.out.println(list.size() + "개");
		System.out.println(list);
		list.remove(3);
		System.out.println(list.size() + "개");
		System.out.println(list);
	}

}
