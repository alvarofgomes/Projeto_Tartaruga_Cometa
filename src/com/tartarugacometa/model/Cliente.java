package com.tartarugacometa.model;
public class Cliente {

	private String nome;
	private String cpfCnpj;
	private Endereco endereco;
	
	public Cliente(String nome, String cpfCnpj) {
		this.nome = nome;
		this.cpfCnpj = cpfCnpj;
	}

	public Cliente() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	
	
}