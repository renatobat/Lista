package pctTestes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pctFactory.ConnectionFactory;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();

		Statement stm = connection.createStatement();
		stm.execute("insert into produto (nome, descricao) values ('Mouse', 'Mouse sem fio')", Statement.RETURN_GENERATED_KEYS);
		
		ResultSet rst = stm.getGeneratedKeys();
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O id criado foi o " + id);
		}
		
	}

}
