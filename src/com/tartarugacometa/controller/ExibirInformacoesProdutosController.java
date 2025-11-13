package com.tartarugacometa.controller;

import com.tartarugacometa.model.Produto;
import com.tartarugacometa.model.Entrega;

public class ExibirInformacoesProdutosController{

	Produto produto = new Produto("Pneu de caminhão", 20.0);
	Entrega entrega = new Entrega(20.0);
	
	public void exibirInfo() {
		System.out.println("PRODUTOS: ");
		System.out.printf("Nome: %s\n", produto.getNomeDoProduto());
		System.out.printf("Frete: %.2f ",entrega.getFrete(), " R$");
	}
	
}