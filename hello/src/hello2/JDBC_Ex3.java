package hello2;
import java.io.*;
import java.sql.*;
public class JDBC_Ex3 {
	public static void main (String[] args) {
		Connection conn;
		Statement stmt = null;
 
		try {
			Class.forName("com.mysql.jdbc.Driver"); // MySQL ����̹� �ε�
			conn = DriverManager.getConnection("jdbc:mysql://192.168.0.25:3306/java01?serverTimezone=UTC&useUnicode=true&characterEncoding =utf8", "java01","java01");

			System.out.println("DB ���� �Ϸ�");
			PreparedStatement pstmt = conn.prepareStatement("insert into student (name, id, dept) values(?,?,?);");
			pstmt.setString(1,"�ƹ���1");
			pstmt.setString(2,"1234345");
			pstmt.setString(3,"��ǻ�Ͱ���");
			pstmt.executeUpdate();
			printTable(pstmt);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("SQL ���� ����");
		}
	}
	private static void printTable(Statement stmt) throws SQLException {
		ResultSet srs = stmt.executeQuery("select * from student");
		while (srs.next()) {
			System.out.print(new String(srs.getString("name")));
			System.out.print("\t|\t" + srs.getString("id"));
			System.out.println("\t|\t" + new String(srs.getString("dept")));
		}
	}
}