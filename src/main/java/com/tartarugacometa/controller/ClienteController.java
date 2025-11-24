package com.tartarugacometa.controller;

import java.util.*;

import com.tartarugacometa.model.Cliente;

public class ClienteController {

	Scanner sc = new Scanner(System.in);
	
	private Cliente cliente;
	//chamando toda vez pra verificar se e fisica ou juridica, uma logica meio nojenta por enquanto tentar melhorar assim que possivel
	//tentei chamar dentro dos metodos porem fazia a verificacao toda hora a logica ficava pior unico jeito que pensei e consegui montar de momento foi esse. 
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
	//tentando referenciar o cliente pelo set acessando diretamente o object com this para não ter que criar um objeto novo no lugar 
	public Cliente atualizarDadosDoCliente() {
		if(this.l == 'f') {
			System.out.println("Atualize o nome do cliente: ");
			this.cliente.setNome(sc.nextLine());
			System.out.println("Atualize o CPF do cliente: ");
			this.cliente.setCpfCnpj(sc.nextLine());
		}else if(this.l == 'j') {
			System.out.println("Atualize o nome do cliente: ");
			this.cliente.setNome(sc.nextLine());
			System.out.println("Atualize o CNPJ do cliente: ");
			this.cliente.setCpfCnpj(sc.nextLine());
		}else {
			System.out.println("solicitação inválida");
		}
		return this.cliente;
	}
	
	public void excluirContaDoCliente() {
		if(this.cliente != null) {
			
			System.out.println("Certeza que deseja excluir os seus dados(s/n): ");
			char res = sc.next().charAt(0);
			
			if(res == 's') {
				this.cliente = null;
				System.out.println("Cliente excluido. ");
			}else if(res == 'n') {
				System.out.println("Cancelando exclusão do cliente. ");
			}else {
				System.out.println("Solicitação inválida. ");
			}
		}else {
			System.out.println("Cliente está vazio. ");
		}
		
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