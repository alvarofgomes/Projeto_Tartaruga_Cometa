package com.tartarugacometa.BO;

import com.tartarugacometa.dao.ClienteDAO;
import com.tartarugacometa.model.Cliente;
import com.tartarugacometa.model.Entrega;

import java.util.List;

public class ClienteBO {

    private ClienteDAO clienteDAO = new ClienteDAO();

    public void cadastrarClienteBO(Cliente cliente) {
        clienteDAO.cadastrarClienteDAO(cliente);
    }

    public void atualizarClienteBO(Cliente cliente) {
        clienteDAO.atualizarClienteDAO(cliente);
    }

    public void deletarClienteBO(int id) {
        clienteDAO.deletarClienteDAO(id);
    }

    public List<Cliente> listarClientesBO() {
        return clienteDAO.listarClientesDAO();
    }
    
    public Cliente buscarClientePorIdBO(int id) {
        return clienteDAO.buscarClientePorIdDAO(id);
    }
    
}