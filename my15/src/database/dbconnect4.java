package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.swing.JOptionPane;

public class dbconnect4 {

	public static void main(String[] args)  {
		/*
		 * 1. 커넥터 설정
		 * 2. DB연결
		 * 3. SQL문을 만든다.
		 * 4. SQL문을 mySQL프로그램에 전송
		 */
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 완료");
			
			String url = "jdbc:mysql://localhost:3333/shose";
			String user ="root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 완료");
			
			String id = JOptionPane.showInputDialog("탈퇴할 id입력");
			//"insert into member values (?,?,?,?)"
			String sql = "delete from member where id = ?"; //무슨값이 들어올지모를 때 : ?
			PreparedStatement ps = con.prepareStatement(sql); // 매핑
			
			ps.setString(1, id);
			
			System.out.println("3. SQL문 만들기 완료.");
			
			ps.executeUpdate();
			System.out.println("4. SQL문을 mySQL프로그램에 전송 완료");
			//String sql,PreparedStatement ps,ps.executeUpdate 같이 갯수 증가시켜야함
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
