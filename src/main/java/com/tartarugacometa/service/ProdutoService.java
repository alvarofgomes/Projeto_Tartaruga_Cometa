package com.tartarugacometa.service;

import java.util.List;

import com.tartarugacometa.dao.ProdutoDAO;
import com.tartarugacometa.model.Produto;

public class ProdutoService {

	private ProdutoDAO produtoDAO = new ProdutoDAO();
	
	public void cadastrarProdutoService(Produto produto) {
		produtoDAO.cadastrarProdutoDAO(produto);
	}
	
	public void atualizarProdutoService(Produto produto) {
		produtoDAO.atualizarProdutoDAO(produto);
	}
	
	public void deletarProdutoService(int id) {
		produtoDAO.deletarProdutoDAO(id);
	}
	
	public List<Produto> listarProdutoService(){
		return produtoDAO.listarProdutoDAO();
	}
	
}