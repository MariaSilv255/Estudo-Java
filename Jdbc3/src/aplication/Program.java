package aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			conn = DB.getConnection();
			ps = conn.prepareStatement("INSERT INTO seller "
					+ "(Name,Email,BirthDate,BaseSalary,DepartmentId)"
					+ "VALUES (?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1,"Maria Aparecida");
			ps.setString(2,"mariaDEV@gmail.com");
			ps.setDate(3, new java.sql.Date(stf.parse("27/09/2000").getTime()));
			ps.setDouble(4,3000);
			ps.setInt(5,4);
			
			int linhasAlterada = ps.executeUpdate();
			
			if(linhasAlterada > 0) {
				ResultSet rs = ps.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("pronto id = "+id);
				}
			}else {
				System.out.println("Nenhuma linha alterada");
			}
			System.out.println("feito,linhas afetadas:"+linhasAlterada);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}
		
	}
}
