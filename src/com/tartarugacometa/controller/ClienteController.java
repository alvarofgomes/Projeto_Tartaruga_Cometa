package com.tartarugacometa.controller;

import java.util.Scanner;

import com.tartarugacometa.model.Cliente;

public class ClienteController {

	Scanner sc = new Scanner(System.in);
	
	private Cliente cliente;
	char l = verificarPessoaFisicaOuJuridica();
	
	public Cliente cadastrarCliente() {

		if(this.l == 'f') {
			System.out.println("Digite o nome do cliente: ");
			String n = sc.nextLine();
			System.out.println("Digite o CPF do cliente: ");
			String c = sc.nextLine();
			this.cliente = new Cliente(n,c);
		}else if(this.l == 'j') {
			System.out.println("Digite o nome do cliente: ");
			String n = sc.nextLine();
			System.out.println("Digite o CNPJ do cliente: ");
			String c = sc.nextLine();
			this.cliente = new Cliente(n,c);
		}else {
			System.out.println("solicitação inválida");
		}
		return this.cliente;
		
	}
	
	public void atualizarDadosDoCliente() {
		
	}
	
	public void excluirContaDoCliente() {
		
	}
	
	public void exibirInfo() {
		
		if(this.l == 'f') {
			System.out.println("Dados DO CLIENTE: ");
			System.out.printf("Nome: %s\n", this.cliente.getNome());
			System.out.printf("CPF: %s\n", this.cliente.getCpfCnpj());
		}else if(this.l == 'j') {
			System.out.println("Dados DO CLIENTE: ");
			System.out.printf("Nome: %s\n", this.cliente.getNome());
			System.out.printf("CNPJ: %s\n", this.cliente.getCpfCnpj());
		}else {
			System.out.println("Erro. ");
		}
		
	}
	
	public static char verificarPessoaFisicaOuJuridica() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("O cliente e pessoa física ou juridica(f/j)?");
		char l = sc.next().charAt(0);
		
		return l;
	}
	
}