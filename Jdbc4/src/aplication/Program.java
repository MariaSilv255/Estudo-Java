package aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import db.DB;

public class Program {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement("UPDATE seller "
					+ "SET BaseSalary = BaseSalary + ? "
					+ "WHERE DepartmentID = ?");
			
			
			st.setDouble(1,300);
			st.setInt(2, 4);
			
			int linhas = st.executeUpdate();
			
			System.out.println(linhas);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DB.closeConnection();
			DB.closeStatement(st);
		}
		
	}
}
