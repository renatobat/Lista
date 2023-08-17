package pctTestes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pctFactory.ConnectionFactory;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();

		PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
		stm.setInt(1, 2);
		
		stm.execute();
		
		System.out.println("O número de linhas alteradas foram: " + stm.getUpdateCount());
	}

}
