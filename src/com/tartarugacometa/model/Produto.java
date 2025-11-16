package com.tartarugacometa.model;
public class Produto {

	private String nomeDoProduto;
	private double peso;
	private double valor;
	//volume e passado na classe (CalcularFreteProdutoController) para calcular frete. 
	private double volume;

	public Produto(String nomeDoProduto, double peso, double valor, double volume) {
		this.nomeDoProduto = nomeDoProduto;
		this.peso = peso;
		this.valor = valor;
		this.volume = volume;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public Produto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}