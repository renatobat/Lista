package pctTestes;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import pctDao.CategoriaDAO;
import pctFactory.ConnectionFactory;
import pctModelo.Categoria;
import pctModelo.Produto;

public class TestaListagemDeCategorias {

	public static void main(String[] args) throws SQLException {
		try (Connection connection = new ConnectionFactory().recuperarConexao()) {
			CategoriaDAO categoriaDao = new CategoriaDAO(connection);
			List<Categoria> listaDeCategorias = categoriaDao.listarComProdutos();
			listaDeCategorias.stream().forEach(lc -> {
				System.out.println(lc.getNome());
					for (Produto produto : lc.getProdutos()) {
						System.out.println(lc.getNome() + " - " + produto.getNome() + "\n");
					}

			});

		}

	}

}
