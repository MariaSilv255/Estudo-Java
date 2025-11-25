package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

	private static Connection conn = null;

	/*
	 * metodo para ler meu db.properties local onde esta localizado meu dados de
	 * conexão do banco
	 * 
	 */
	public static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")) { // necessario para a leitura do arquivo
			Properties props = new Properties(); // cria um objeto que irá armazena os valores do arquivo
			props.load(fs); // carrega os dados do arquivo para dentro do objeto
			return props; // retorna os dados do arquivo;
		} catch (IOException e) {
			throw new DbException(e.getMessage()); // mensagem se ocorrer algum erro
		}
	}

	public static Connection getConnection() {

		if (conn == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url, props);
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}

		return conn;
	}

	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}

		}
	}

}
