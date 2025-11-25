package com.conexaofactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection recuperarConexao() {
		
        try {
            //em ambiente produtivo a forma de colocar os usuarios não e essa forma que esta sendo feita com o get
        	//comando para iniciar postgres no cmd do linux (psql -h localhost -U postgres -p 5433)
        	System.out.println("Conexão ok. ");
        	return DriverManager.getConnection("jdbc:postgresql://localhost:5433/tartaruga_cometa?user=postgres&password=root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
		
	}
	
}