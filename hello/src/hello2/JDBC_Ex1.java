package hello2;

import java.sql.*;
public class JDBC_Ex1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.25:3306/java01?serverTimezone=UTC","java01","java01");
			System.out.println("DB ���� �Ϸ�");
		}catch(ClassNotFoundException e) {
			System.out.println("jdbc ����̹� �ε� ����");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("db ���� ����");
		}
	}
}
