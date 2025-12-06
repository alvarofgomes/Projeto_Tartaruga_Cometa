package com.tartarugacometa.controller;

import java.util.Scanner;

import com.tartarugacometa.BO.ClienteBO;
import com.tartarugacometa.BO.EntregaBO;
import com.tartarugacometa.model.Cliente;
import com.tartarugacometa.model.Entrega;

public class EntregaController {

	Scanner sc = new Scanner(System.in);
	
    private EntregaBO entregaBo = new EntregaBO();
    private ClienteBO clienteBo = new ClienteBO();
	
	public void cadastrarEntregaController() {
		Entrega entrega = new Entrega();
		
        System.out.println("ID do cliente que recebera a entrega: ");
        int idCliente = sc.nextInt();
        sc.nextLine();
        
        Cliente cliente = clienteBo.buscarClientePorIdBO(idCliente);
        entrega.setCliente(cliente);
        
        System.out.println("Status: ");
        entrega.setStatus(sc.nextLine());
        System.out.println("Valor do frete: ");
        entrega.setFrete(sc.nextDouble());
        
        entregaBo.cadastrarEntregaBO(entrega);
        System.out.println("Entrega cadastrada cim sucesso!");
		
	}
	
	public void atualizarEntregaController() {
		Entrega entrega = new Entrega();
		
		System.out.println("ID da entrega a atualizar: ");
		entrega.setId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Novo status: ");
		entrega.setStatus(sc.nextLine());
		System.out.println("Novo valor do frete: ");
		entrega.setFrete(sc.nextDouble());
		
		entregaBo.atualizarEntregaBO(entrega);
		System.out.println("Entrega atualizada com sucesso!");
		
	}
	
	public void excluirEntregaController() {
		
		System.out.println("ID da entrega para excluir: ");
		int id = sc.nextInt();
		
		entregaBo.deletarEntregaBO(id);
		System.out.println("Entrega excluida com sucesso!");
		
	}
	
	public void listarEntregaController() {
		
		System.out.println("Listando Entregas: ");
		entregaBo.listarEntregaBO()
			.forEach(entrega -> 
					System.out.println(entrega.getId() + " - " + entrega.getStatus()));
		
	}
	
}