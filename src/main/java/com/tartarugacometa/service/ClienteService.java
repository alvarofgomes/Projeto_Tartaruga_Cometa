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
	
	//chamando toda vez pra verificar se e fisica ou juridica, uma logica meio nojenta por enquanto tentar melhorar assim que possivel
	//tentei chamar dentro dos metodos porem fazia a verificacao toda hora a logica ficava pior unico jeito que pensei e consegui montar de momento foi esse. 
	char l = verificarPessoaFisicaOuJuridica();
	//public void cadastrarCliente(Cliente cliente)
	public void cadastrarCliente() {
		
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
		
		String sql = "INSERT INTO clientes (nome,cpfcnpj)" + "VALUES (?, ?)";
		
		Connection conn = connection.recuperarConexao();
		
		try {
			
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			
			preparedStatement.setString(1, this.cliente.getNome());
			preparedStatement.setString(2, this.cliente.getCpfCnpj());
			
			preparedStatement.execute();
			
		}catch(SQLException e) {
			throw new RuntimeException();
		}
		
	}
	
	
	
//-----------------------------------------------------------------------------------------
	public static char verificarPessoaFisicaOuJuridica() {
		Scanner sc = new Scanner(System.in);

		System.out.println("O cliente e pessoa física ou juridica(f/j)?");
		char l = sc.next().charAt(0);

		return l;
	}
}