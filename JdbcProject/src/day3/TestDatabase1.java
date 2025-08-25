package day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class TestDatabase1 {

	public static void main(String[] args) throws SQLException{
		DriverManager.registerDriver(new OracleDriver());
		try (Scanner scanner = new Scanner(System.in)) {
		
			System.out.print("Enter customer ID: ");
			@SuppressWarnings("unused")
			int id = scanner.nextInt();
			scanner.nextLine(); 
			System.out.print("Enter customer name: ");
			@SuppressWarnings("unused")
			String name = scanner.nextLine();
		}

        String url = "jdbc:oracle:thin:@10.33.58.53:1521:xe";
		Connection conn = DriverManager.getConnection(url, "sediqa", " sediqa07");
		System.out.println("connect");
		String qry = "insert into customer values(?,?)";
		PreparedStatement pst = conn.prepareStatement(qry);
		pst.setInt(1,101);
		pst.setString(2, "sutherland");
		int rows = pst.executeUpdate();
		System.out.println("inserted" +rows);
		conn.close();
		
	}
	
}
