package com.tartarugacometa.model;

import java.util.List;

public class Entrega {

	private String status;
	private double frete;
	//lembrar de ajustar para varios produtos
	private List<Produto> produtos;
	
	public Entrega(double frete) {
		this.frete = frete;
	}

	public Entrega() {
	}
	
	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}