package 스태틱;

public class exam_2 {
		
		String name; 
		int age;
		String gender;
		
		static int cnt; 
		static int sum;
		
		
		public void work() {
			
		}
		public void cmc() {
			
		}
		public exam_2(String name, String gender,int age ) {
			cnt++;
			sum = sum + age;
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
		
		@Override
		public String toString() {
			return  name + ", " + age + ", " + gender ;
		}
		
		// static 메소드는 객체생성하지 않아도 클래스 이름으로 접근해서 사용 가능
		public static int avg() {
			return sum/cnt;
		} 
		
}
