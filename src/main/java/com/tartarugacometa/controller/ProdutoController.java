package com.tartarugacometa.controller;

import java.util.Scanner;

import com.tartarugacometa.model.Cliente;
import com.tartarugacometa.model.Entrega;
import com.tartarugacometa.model.Produto;

public class ProdutoController {

	Scanner sc = new Scanner(System.in);
	
	private Produto produto;
	
	public void cadastrarDadosDoProduto() {
		
		System.out.println("Digite o nome do do produto: ");
		String n = sc.nextLine();
		System.out.println("Digite o peso do produto: ");
		double c = sc.nextDouble();
		System.out.println("Digite o valor do produto: ");
		double vp = sc.nextDouble();
		System.out.println("Digite o volume do produto: ");
		double v = sc.nextDouble();
		this.produto = new Produto(n,c,vp,v);
		
	}
	
	public void atualizarDadosDoProduto() {
		System.out.println("Atualize o nome do produto: ");
		this.produto.setNomeDoProduto(sc.nextLine());
		System.out.println("Atualize o peso do produto: ");
		this.produto.setPeso(sc.nextDouble());
		System.out.println("Atualize o valor do produto: ");
		this.produto.setValor(sc.nextDouble());
		System.out.println("Atualize o volume do produto: ");
		this.produto.setVolume(sc.nextDouble());
	}
	
	public void excluirDadosDoProduto() {
		if(this.produto != null) {
			
			System.out.println("Certeza que deseja excluir o produto(s/n): ");
			char res = sc.next().charAt(0);
			
			if(res == 's') {
				this.produto = null;
				System.out.println("Produto apagado da base de dados. ");
			}else if(res == 'n') {
				System.out.println("Solicitação cancelada. ");
			}else {
				System.out.println("Solicitção invalida");
			}
		}else {
			System.out.println("Não existe produto para excluir. ");
		}
	}
	
	public void exibirInfo() {
		System.out.println("PRODUTOS: ");
		System.out.printf("Nome: %s\n", this.produto.getNomeDoProduto());
		System.out.printf("Peso: %.2f\n", this.produto.getPeso());
		System.out.printf("Valor: %.2f\n",this.produto.getValor());
		System.out.printf("Volume: %.2f\n", this.produto.getVolume());
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