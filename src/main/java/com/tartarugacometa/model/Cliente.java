package com.tartarugacometa.model;
public class Cliente {

	private Long id;
	private String nome;
	private String cpfCnpj;
	
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}