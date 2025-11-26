package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

	/*
	 * metodo que inicializa a conexão com o banco
	 */
	public static Connection getConnection() {

		if (conn == null) {// verifica se a conexao ja foi criada

			try {
				Properties props = loadProperties(); // carrega os dados de db.propries
				String url = props.getProperty("dburl"); // ler o caminho do meu banco na url

				/*
				 * abre a conexao do banco passando a url que é o caminho e o objeto propries
				 * contem as informações de user e password o drivemanager usar essas
				 * informações para autenticar.
				 */

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
	

	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

}
