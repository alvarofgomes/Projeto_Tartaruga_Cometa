package com.tartarugacometa.controller;

import com.tartarugacometa.model.Entrega;
import com.tartarugacometa.model.Produto;

public class ProdutoController {

	Produto produto = new Produto("Pneu de caminhão", 20.0);
	Entrega entrega = new Entrega(20.0);
	
	public void exibirInfo() {
		System.out.println("PRODUTOS: ");
		System.out.printf("Nome: %s\n", produto.getNomeDoProduto());
		System.out.printf("Frete: %.2f ",entrega.getFrete(), " R$");
	}
	
	/*
	 
	 Calcular Frete, por enquanto não  utilizar solicitar para ser setado
	 
	 	//calculo para peso cubico para descobrir valor do frete, primeiro pega o volume e depois 
	//multiplica pelo valor do transporte aqui to supondo um transporte rodoviario.

	
	//peso real do produto com peso cubico do volume frete tem que ser calculado com base no peso do volume
	// e não peso real do produto mas o peso de quanto espaço ele ocupa
	
	public double calcularFrete(Produto produto) {
	
		double pesoCubico = produto.getVolume() * 300.0;
		//0.05 reprensenta a tarifa por kg real ou m³. de novo apenas supondo um número
		return pesoCubico * 0.05;
		
	}
	 
	*/
	
}