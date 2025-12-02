package com.tartarugacometa.controller;

import com.tartarugacometa.model.Cliente;
import com.tartarugacometa.service.ClienteService;

import java.util.Scanner;

public class ClienteController {

    private Scanner sc = new Scanner(System.in);
    private ClienteService clienteService = new ClienteService();

    public void cadastrarCliente() {
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite CPF/CNPJ: ");
        String cpfcnpj = sc.nextLine();

        Cliente cliente = new Cliente(nome, cpfcnpj);
        clienteService.cadastrarClienteService(cliente);

        System.out.println("Cliente cadastrado!");
    }

    public void atualizarCliente() {
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
  
    public void excluirCliente() {
        System.out.println("Informe o ID:");
        int id = sc.nextInt();

        clienteService.deletarClienteService(id);
        System.out.println("Cliente excluído!");
    }
    
    public void listarClientes() {
        System.out.println("Listando clientes cadastrados: ");

        clienteService.listarClientesService().forEach(cliente -> {
            System.out.println(cliente.getNome());
        });
        
    }
    
}
