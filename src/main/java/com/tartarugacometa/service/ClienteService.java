package com.tartarugacometa.service;

import com.tartarugacometa.dao.ClienteDAO;
import com.tartarugacometa.model.Cliente;

import java.util.Set;

public class ClienteService {

    private ClienteDAO clienteDAO = new ClienteDAO();

    public void cadastrarClienteService(Cliente cliente) {
        clienteDAO.cadastrarClienteDAO(cliente);
    }

    public void atualizarClienteService(Cliente cliente) {
        clienteDAO.atualizarClienteDAO(cliente);
    }

    public void deletarClienteService(int id) {
        clienteDAO.deletarClienteDAO(id);
    }

    public Set<Cliente> listarClientesService() {
        return clienteDAO.listarClientesDAO();
    }
    
    public Cliente buscarClientePorIdService(int id) {
        return clienteDAO.buscarClientePorIdDAO(id);
    }
    
}