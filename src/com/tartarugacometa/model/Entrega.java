package com.tartarugacometa.model;
public class Entrega {

	private String status;
	private double frete;
	
	public Entrega(double frete) {
		this.frete = frete;
	}

	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}
	
	public Entrega() {
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}