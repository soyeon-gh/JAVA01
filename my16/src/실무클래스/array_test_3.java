package 실무클래스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class array_test_3 {

	public static void main(String[] args) {
		System.out.println("──────────LinkedList──────────");
		
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
		//LinkedList -> 선입선출
		
		System.out.println("──────────ArrayList──────────");
		
		ArrayList list_2 = new ArrayList(); 
		list_2.add("상한우유");
		list_2.add("싱싱우유");
		list_2.remove(0);
		System.out.println(list_2);
		
		System.out.println("─────────HashSet───────────");
		
		HashSet bag = new HashSet();
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("돈");
		System.out.println(bag);
		bag.add("휴대폰");
		System.out.println(bag);
		// 중복된값을  자동으로 필터링 : set
		
		System.out.println("─────────ArrayList──────────");
		
		ArrayList list_1 = new ArrayList(); //타입자유, 크기자유, 인덱스 o
		list_1.add("디자이너");
		list_1.add("프로그래머");
		list_1.add("DB관리자");
		System.out.println(list_1);
		
		System.out.println("─────────HashSet───────────");
		
		HashSet work = new HashSet();
		work.add("디자이너");
		work.add("프로그래머");
		work.add("DB관리자");
		System.out.println(work);
		work.add("디자이너");
		System.out.println(work);
		// 중복된값을  자동으로 필터링 : set
		
		System.out.println("──────────HashMap──────────");
		
		HashMap list_3 = new HashMap(); 
		list_3.put("1등","박스키");
		list_3.put("2등","송스키");
		list_3.put("3등","김스키");
		list_3.put("4등","정스키");
		
		System.out.println(list_3);
		list_3.remove("2등");
		System.out.println(list_3);
		
		System.out.println("──────────HashMap──────────");
		
		/*
		 * 키:값 쌍으로 저장해야하는 자료의 형태 : map
		 * map형 자료의 형태
		 * apple = 사과
		 * banana = 바나나
		 */
		
		HashMap dic = new HashMap(); 
		dic.put("apple","사과");
		dic.put("banana","바나나");
		dic.put("melon","메론");
		dic.put("lemon","레몬");
		System.out.println(dic);
		System.out.println(dic.get("banana"));
		
		System.out.println("──────────HashMap──────────");
		
		HashMap list_4 = new HashMap(); 
		list_4.put(1,"엄마");
		list_4.put(2,"아빠");
		list_4.put(3,"친구");
		list_4.put(4,"동생");
		System.out.println(list_4);
		System.out.println(list_4.get(2));

		
		System.out.println("──────────LinkedList──────────");
		
		//대기줄의 형태를 가지는 자료의 형태 : 큐 queue
		LinkedList movie = new LinkedList();
		movie.add("백두산");
		movie.add("히트맨");
		movie.add("남산의 부장들");
		System.out.println(movie);
		movie.remove();
		System.out.println(movie);
		movie.remove();
		System.out.println(movie);
		movie.remove();
		System.out.println(movie);
	}
}
