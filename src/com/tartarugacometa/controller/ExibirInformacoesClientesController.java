package com.tartarugacometa.controller;

import com.tartarugacometa.model.Cliente;

public class ExibirInformacoesClientesController {

	Cliente cliente = new Cliente("alvaro","12345678909");

	public void exibirInfo() {
		System.out.println("Dados DO CLIENTE: ");
		System.out.printf("Nome: %s\n", cliente.getNome());
		System.out.printf("CPF: %s\n", cliente.getCpfCnpj());
	}
	
}