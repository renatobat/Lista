package pctTestes;

import java.sql.SQLException;

import pctFactory.ConnectionFactory;

public class TestaPoolConexao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();

		for (int i = 1; i < 20; i++) {
			connectionFactory.recuperarConexao();
			System.out.println("Conexão de número " + i + " criada com sucesso!");
		}
	}
}
