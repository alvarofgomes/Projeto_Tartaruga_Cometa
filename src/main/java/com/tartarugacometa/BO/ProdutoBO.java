package com.tartarugacometa.BO;

import java.util.List;

import com.tartarugacometa.dao.ProdutoDAO;
import com.tartarugacometa.model.Produto;

public class ProdutoBO {

	private ProdutoDAO produtoDAO = new ProdutoDAO();
	
	public void cadastrarProdutoBO(Produto produto) {
		produtoDAO.cadastrarProdutoDAO(produto);
	}
	
	public void atualizarProdutoBO(Produto produto) {
		produtoDAO.atualizarProdutoDAO(produto);
	}
	
	public void deletarProdutoBO(int id) {
		produtoDAO.deletarProdutoDAO(id);
	}
	
	public List<Produto> listarProdutoBO(){
		return produtoDAO.listarProdutoDAO();
	}
	
}