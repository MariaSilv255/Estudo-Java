package aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

public class Program {
	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;

		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false);//pendente de uma confirmção explicita do programador
			
			st = conn.createStatement();
			int row1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1 ");
			int row2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2 ");

			conn.commit(); //pode passar
			
			System.out.println("linha 1" + row1);
			System.out.println("linha 2" + row2);

			int x = 1;
			if (x < 2) {
				throw new SQLException("Faker erro");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();//deu erro
				throw new DbException("erro, rollback efetiviado.");
			} catch (SQLException e1) {
				throw new DbException("erro enquanto tentava voltar a transação  rollback");
				
			}
		}finally {
			DB.closeConnection();
			DB.closeStatement(st);
		}

	}
}
