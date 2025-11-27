package com.tartarugacometa.service;

import com.tartarugacometa.model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.conexaofactory.ConnectionFactory;
import com.tartarugacometa.model.Cliente;

public class ClienteService {

	Scanner sc = new Scanner(System.in);
	
	private Cliente cliente;
	private ConnectionFactory connection;
	private Connection conn;
	//criando um construtor para acessar pela listagem da tabela clientes por isso o objeto conn
	public ClienteService(Connection connection) {
		this.conn = connection;
	}
	
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
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCpfCnpj());
			
			ps.execute();
			
		}catch(SQLException e) {
			throw new RuntimeException();
		}
		
	}
	
	public void atualizarClienteService(Cliente cliente){

		String sql = "UPDATE clientes SET nome = ?, cpfcnpj = ? WHERE id_cliente = ?;";
		
		Connection conn = connection.recuperarConexao();
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCpfCnpj());
			ps.setInt(3, cliente.getId());
			
			ps.execute();
			
		}catch(SQLException e) {
			throw new RuntimeException();
		}
	}
	
	public Set<Cliente> listarClientes(){
		Set<Cliente> clientes = new HashSet<>();
		//setando a tabela do banco(nesse caso e clientes)
		String sql = "SELECT * FROM clientes";
		
		//Criando o loop para listar os dados do banco no terminal do java para não está acessndo toda hora o banco
		//utilizando try porque toda execução precisa de uma exceção para ta sendo executada
		try {
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()) {
				
				String nome = resultSet.getString(1);
				String cpfCnpj = resultSet.getString(2);
				
				Cliente cliente = new Cliente(nome,cpfCnpj);
				
				clientes.add(new Cliente(nome,cpfCnpj));
				
			}
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return clientes;
	}
	
}