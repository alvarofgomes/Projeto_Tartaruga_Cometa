package com.tartarugacometa.controller;

import com.tartarugacometa.model.Produto;

public class ExibirInformacoesProdutosController{

	Produto produto = new Produto("Pneu de caminhão", 20.0);	
	CalcularFreteProdutoController cfpc = new CalcularFreteProdutoController();
	
	public void exibirInfo() {
		System.out.println("PRODUTOS: ");
		System.out.printf("Nome: %s\n", produto.getNomeDoProduto());
		System.out.printf("Frete do produto: %.2f ",cfpc.calcularFrete(produto), " R$");
	}
	
}