package com.tartarugacometa.controller;

import java.util.Scanner;

import com.tartarugacometa.model.Cliente;

public class ClienteController {

	Scanner sc = new Scanner(System.in);
	
	private Cliente cliente;
	
	public Cliente cadastrarCliente() {
		
		System.out.println("O cliente e pessoa física ou juridica(f/j)?");
		char l = sc.next().charAt(0);
		
		if(l == 'f') {
			System.out.println("Digite o nome do cliente: ");
			sc.nextLine(); 
			String n = sc.nextLine();
			System.out.println("Digite o CPF do cliente: ");
			String c = sc.nextLine();
			this.cliente = new Cliente(n,c);
		}else if(l == 'j') {
			System.out.println("Digite o nome do cliente: ");
			sc.nextLine(); 
			String n = sc.nextLine();
			System.out.println("Digite o CNPJ do cliente: ");
			String c = sc.nextLine();
			this.cliente = new Cliente(n,c);
		}else {
			System.out.println("solicitação inválida");
		}
		return this.cliente;
		
	}
	
	public void carregarCliente() {
		
	}
	
	public void editarCliente() {
		
	}
	
	public void excluirCliente() {
		
	}
	
	public void exibirInfo() {
		System.out.println("Dados DO CLIENTE: ");
		System.out.printf("Nome: %s\n", this.cliente.getNome());
		System.out.printf("CPF: %s\n", this.cliente.getCpfCnpj());
	}
	
}