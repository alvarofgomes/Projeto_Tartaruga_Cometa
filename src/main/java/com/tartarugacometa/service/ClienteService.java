package com.tartarugacometa.service;

import com.tartarugacometa.model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.conexaofactory.ConnectionFactory;
import com.tartarugacometa.model.Cliente;

public class ClienteService {

	Scanner sc = new Scanner(System.in);
	
	private Cliente cliente;
	private ConnectionFactory connection;
	
    public ClienteService(){
        this.connection = new ConnectionFactory();
    }
	
	//public void cadastrarCliente(Cliente cliente)
	public void cadastrarClienteService(Cliente cliente) {
		/*
		 
		String n;
		String c;
		
		if(this.l == 'f') {
			System.out.println("Digite o nome do cliente: ");
			n = sc.nextLine();
			System.out.println("Digite o CPF do cliente: ");
			c = sc.nextLine();
			this.cliente = new Cliente(n,c);
		}else if(this.l == 'j') {
			System.out.println("Digite o nome do cliente: ");
			n = sc.nextLine();
			System.out.println("Digite o CNPJ do cliente: ");
			c = sc.nextLine();
			this.cliente = new Cliente(n,c);
		}else {
			System.out.println("solicitação inválida");
		}
		  
		*/
		String sql = "INSERT INTO clientes (nome,cpfcnpj)" + "VALUES (?, ?);";
		
		Connection conn = connection.recuperarConexao();
		
		try {
			
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			
			preparedStatement.setString(1, cliente.getNome());
			preparedStatement.setString(2, cliente.getCpfCnpj());
			
			preparedStatement.execute();
			
		}catch(SQLException e) {
			throw new RuntimeException();
		}
		
	}
	//teste para atualizar na tabela deixar para ajustar ao decorrer do curso 
	//focar em criar diretamente pelo terminal de todas as classes(faltando endereço e produtos)
	public void atualizarClienteService(Cliente cliente){

		String sql = "UPDATE clientes SET nome = ?, cpfcnpj = ? WHERE id_cliente = ?;";
		
		Connection conn = connection.recuperarConexao();
		
		try {
			
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			
			preparedStatement.setString(1, cliente.getNome());
			preparedStatement.setString(2, cliente.getCpfCnpj());
			preparedStatement.setLong(3, cliente.getId());
			
			preparedStatement.execute();
			
		}catch(SQLException e) {
			throw new RuntimeException();
		}
	}
	
}