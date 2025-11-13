package com.tartarugacometa.controller;

import com.tartarugacometa.model.Produto;

public class CalcularFreteProdutoController {

	//calculo para peso cubico para descobrir valor do frete, primeiro pega o volume e depois 
	//multiplica pelo valor do transporte aqui to supondo um transporte rodoviario.

	
	//peso real do produto com peso cubico do volume frete tem que ser calculado com base no peso do volume
	// e não peso real do produto mas o peso de quanto espaço ele ocupa
	
	public double calcularFrete(Produto produto) {
	
		double pesoCubico = produto.getVolume() * 300.0;
		//0.05 reprensenta a tarifa por kg real ou m³. de novo apenas supondo um número
		return pesoCubico * 0.05;
		
	}

}