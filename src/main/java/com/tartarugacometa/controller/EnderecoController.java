package com.tartarugacometa.controller;

import java.util.Scanner;

import com.tartarugacometa.model.Endereco;

public class EnderecoController {

	Scanner sc = new Scanner(System.in);
	
	private Endereco endereco;

	public void cadastrarDadosDoEndereco() {
		System.out.println("Digite o nome da rua: ");
		String r = sc.nextLine();
		System.out.println("Digite o número do endereço: ");
		int n = sc.nextInt();
		System.out.println("Digite o nome do bairro: ");
		String b = sc.nextLine();
		sc.nextLine();
		System.out.println("Digite o nome da cidade: ");
		String c = sc.nextLine();
		System.out.println("Digite o nome do estado: ");
		String e = sc.nextLine();
		System.out.println("Digite o cep: ");
		String cep = sc.nextLine();
		
		this.endereco = new Endereco(r,n,b,c,e,cep);
	}
	
	public void atualizarDadosDoEndereco() {
		System.out.println("Atualize o nome da rua: ");
		this.endereco.setRua(sc.nextLine());
		System.out.println("Atualize o número do endereço: ");
		this.endereco.setNumero(sc.nextInt());
		System.out.println("Atualize o nome do bairro: ");
		this.endereco.setBairro(sc.nextLine());
		System.out.println("Atualize o nome da cidade: ");
		this.endereco.setCidade(sc.nextLine());
		System.out.println("Atualize o nome do estado: ");
		this.endereco.setEstado(sc.nextLine());
		System.out.println("Atualize o cep: ");
		this.endereco.setCep(sc.nextLine());
	}
	
	public void excluirDadosDoEndereco() {
		if(this.endereco != null) {
			System.out.println("Certeza que deseja excluir o endereço(s/n): ");
			char res = sc.next().charAt(0);
			
			if(res == 's') {
				this.endereco = null;
				System.out.println("Endereço apagado da base de dados. ");
			}else if(res == 'n') {
				System.out.println("Solicitação cancelada. ");
			}else {
				System.out.println("Solicitção invalida");
			}
		}else {
			System.out.println("Não existe endereço para excluir. ");
		}
	}
	
	public void exibirInfo() {
		System.out.println("ENDEREÇO DO CLIENTE: ");
		System.out.printf("Rua: %s\n", this.endereco.getRua());
		System.out.printf("Número da casa: %d\n", this.endereco.getNumero());
		System.out.printf("Bairro: %s\n", this.endereco.getBairro());
		System.out.printf("Cidade: %s\n", this.endereco.getCidade());
		System.out.printf("Estado: %s\n", this.endereco.getEstado());
		System.out.printf("CEP: %s\n", this.endereco.getCep());
	}
	
	
	
}