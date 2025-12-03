package com.tartarugacometa.controller;

import java.util.Scanner;

import com.tartarugacometa.model.Cliente;
import com.tartarugacometa.model.Endereco;
import com.tartarugacometa.service.ClienteService;
import com.tartarugacometa.service.EnderecoService;

public class EnderecoController {

    Scanner sc = new Scanner(System.in);

    private EnderecoService enderecoService = new EnderecoService();
    private ClienteService clienteService = new ClienteService();

    public void cadastrarEnderecoController() {
        Endereco endereco = new Endereco();

        System.out.println("ID do cliente que receber� o endere�o: ");
        int idCliente = sc.nextInt();
        sc.nextLine();

        Cliente cliente = clienteService.buscarClientePorIdService(idCliente);
        endereco.setCliente(cliente);

        System.out.println("Rua: ");
        endereco.setRua(sc.nextLine());
        System.out.println("N�mero: ");
        endereco.setNumero(sc.nextInt());
        sc.nextLine();
        System.out.println("Bairro: ");
        endereco.setBairro(sc.nextLine());
        System.out.println("Cidade: ");
        endereco.setCidade(sc.nextLine());
        System.out.println("Estado: ");
        endereco.setEstado(sc.nextLine());
        System.out.println("CEP: ");
        endereco.setCep(sc.nextLine());

        enderecoService.cadastrarEnderecoService(endereco);
        System.out.println("Endere�o cadastrado com sucesso!");
    }

    public void atualizarEnderecoController() {
        Endereco endereco = new Endereco();

        System.out.println("ID do endere�o a atualizar: ");
        endereco.setId(sc.nextInt());
        sc.nextLine();

        System.out.println("Nova Rua: ");
        endereco.setRua(sc.nextLine());
        System.out.println("Novo N�mero: ");
        endereco.setNumero(sc.nextInt());
        sc.nextLine();
        System.out.println("Novo Bairro: ");
        endereco.setBairro(sc.nextLine());
        System.out.println("Nova Cidade: ");
        endereco.setCidade(sc.nextLine());
        System.out.println("Novo Estado: ");
        endereco.setEstado(sc.nextLine());
        System.out.println("Novo CEP: ");
        endereco.setCep(sc.nextLine());

        enderecoService.atualizarEnderecoService(endereco);
        System.out.println("Endere�o atualizado com sucesso!");
    }

    public void excluirEnderecoController() {
        System.out.println("ID do endere�o para excluir: ");
        int id = sc.nextInt();

        enderecoService.deletarEnderecoService(id);
        System.out.println("Endere�o exclu�do com sucesso!");
    }
    
    public void listarEnderecosController() {
    	System.out.println("Listando endereços cadastrados: ");
        enderecoService.listarEnderecosService()
            .forEach(endereco ->
                System.out.println(endereco.getId() + " - " + endereco.getRua() + " - " + endereco.getCidade() + " - " + endereco.getEstado()));
    }
}
