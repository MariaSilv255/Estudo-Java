package aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbIntegrityException;

public class Program {
	public static void main(String[] args) {
	
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement("DELETE FROM department WHERE Id = ?");
			
			st.setInt(1,5);
			
			int linha = st.executeUpdate();
			
			System.out.println("linha alteradas:"+linha);
			
		} catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		}
		
	}
}
