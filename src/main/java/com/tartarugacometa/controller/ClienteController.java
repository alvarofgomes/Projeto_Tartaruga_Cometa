package com.tartarugacometa.controller;

import com.tartarugacometa.BO.ClienteBO;
import com.tartarugacometa.model.Cliente;

import java.util.Scanner;

public class ClienteController {

    private Scanner sc = new Scanner(System.in);
    private ClienteBO clienteBo = new ClienteBO();

    public void cadastrarClienteBO() {
    	
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite CPF/CNPJ: ");
        String cpfcnpj = sc.nextLine();
        Cliente cliente = new Cliente(nome, cpfcnpj);
        clienteBo.cadastrarClienteBO(cliente);
        System.out.println("Cliente cadastrado!");
        
    }

    public void atualizarClienteController() {
    	
        Cliente cliente = new Cliente();
        System.out.println("ID: ");
        cliente.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Novo nome: ");
        cliente.setNome(sc.nextLine());
        System.out.println("Novo CPF/CNPJ: ");
        cliente.setCpfCnpj(sc.nextLine());
        clienteBo.atualizarClienteBO(cliente);
        System.out.println("Cliente atualizado!");
        
    }
  
    public void excluirClienteController() {
    	
        System.out.println("Informe o ID:");
        int id = sc.nextInt();
        clienteBo.deletarClienteBO(id);
        System.out.println("Cliente excluído!");
        
    }
    
    public void listarClientesController() {
    	
        System.out.println("Listando clientes cadastrados: ");
        clienteBo.listarClientesBO().forEach(cliente -> {
            System.out.println(cliente.getNome());
        });
        
    }
    
    public void buscarClientePorIdController() {
    	
        System.out.println("Informe o ID do cliente:");
        int id = sc.nextInt();

        Cliente cliente = clienteBo.buscarClientePorIdBO(id);

        if (cliente != null) {
            System.out.println("Cliente encontrado:");
            System.out.println("ID: " + cliente.getId());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF/CNPJ: " + cliente.getCpfCnpj());
        } else {
            System.out.println("Nenhum cliente encontrado com esse ID.");
        }
        
    }
    
}