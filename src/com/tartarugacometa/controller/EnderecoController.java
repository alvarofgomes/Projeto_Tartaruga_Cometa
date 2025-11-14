package com.tartarugacometa.controller;

import com.tartarugacometa.model.Endereco;

public class EnderecoController {

	Endereco endereco = new Endereco("flores brancas",43,"santo aleixo","PE");

	public void exibirInfo() {
		System.out.println("ENDEREÇO DO CLIENTE: ");
		System.out.printf("Rua: %s\n", endereco.getRua());
		System.out.printf("Número da casa: %d\n", endereco.getNumero());
		System.out.printf("Bairro: %s\n", endereco.getBairro());
		System.out.printf("Estado: %s\n", endereco.getEstado());
	}
	
	
	
}