package com.tartarugacometa.service;

import java.sql.Connection;
import java.util.Scanner;

import com.conexaofactory.ConnectionFactory;
import com.tartarugacometa.model.Endereco;

public class EnderecoService {

	Scanner sc = new Scanner(System.in);
	
	private ConnectionFactory connection;
	private Connection conn;
	
	public EnderecoService(Connection connection) {
		this.conn = connection;
	}

	public EnderecoService() {
		this.connection = new ConnectionFactory();
	}
	
	public void cadastraEnderecoService(Endereco endereco) {
		
		
		
	}
	
}