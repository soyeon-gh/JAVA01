package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class dbconnect {

	public static void main(String[] args) throws Exception {
		/*
		 * 1. 커넥터 설정
		 * 2. DB연결
		 * 3. SQL문을 만든다.
		 * 4. SQL문을 mySQL프로그램에 전송
		 */
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 설정 완료");
		
		String url = "jdbc:mysql://localhost:3333/shose";
		String user ="root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 완료");
		
		String sql = "insert into member values ('summer','summer','summer','summer')";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL문 만들기 완료.");
		
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL프로그램에 전송 완료");
		//String sql,PreparedStatement ps,ps.executeUpdate 같이 갯수 증가시켜야함
	}

}
