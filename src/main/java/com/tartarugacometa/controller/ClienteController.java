package com.tartarugacometa.controller;

import com.tartarugacometa.model.Cliente;
import com.tartarugacometa.service.ClienteService;

import java.util.Scanner;

public class ClienteController {

    private Scanner sc = new Scanner(System.in);
    private ClienteService clienteService = new ClienteService();

    public void cadastrarClienteController() {
    	
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite CPF/CNPJ: ");
        String cpfcnpj = sc.nextLine();
        Cliente cliente = new Cliente(nome, cpfcnpj);
        clienteService.cadastrarClienteService(cliente);
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
        clienteService.atualizarClienteService(cliente);
        System.out.println("Cliente atualizado!");
        
    }
  
    public void excluirClienteController() {
    	
        System.out.println("Informe o ID:");
        int id = sc.nextInt();
        clienteService.deletarClienteService(id);
        System.out.println("Cliente excluído!");
        
    }
    
    public void listarClientesController() {
    	
        System.out.println("Listando clientes cadastrados: ");
        clienteService.listarClientesService().forEach(cliente -> {
            System.out.println(cliente.getNome());
        });
        
    }
    
    public void buscarClientePorIdController() {
    	
        System.out.println("Informe o ID do cliente:");
        int id = sc.nextInt();

        Cliente cliente = clienteService.buscarClientePorIdService(id);

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