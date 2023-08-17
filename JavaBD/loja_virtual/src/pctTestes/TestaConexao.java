package pctTestes;

import java.sql.Connection;
import java.sql.SQLException;

import pctFactory.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();

		System.out.println("Fechando coexão!!");
		connection.close();
	}

}
