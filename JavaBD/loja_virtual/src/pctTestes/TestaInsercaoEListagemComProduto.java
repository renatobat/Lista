package pctTestes;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import pctDao.ProdutoDAO;
import pctFactory.ConnectionFactory;
import pctModelo.Produto;

public class TestaInsercaoEListagemComProduto {

	public static void main(String[] args) throws SQLException {
		Produto comoda = new Produto("Comoda", "Comoda Vertical");

		try (Connection connection = new ConnectionFactory().recuperarConexao()) {
			ProdutoDAO produtoDao = new ProdutoDAO(connection);
			produtoDao.salvar(comoda);
			List<Produto> listaDeProdutos = produtoDao.listar();
			listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
//			stream = converter em uma sequencia de elementos 
//			Foeach = Percorrer todos os elementos
//			quando chegar no produto lp faça o seguinte -> sysout
			
		}

	}

}
