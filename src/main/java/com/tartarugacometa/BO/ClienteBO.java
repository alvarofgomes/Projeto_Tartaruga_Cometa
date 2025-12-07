package com.tartarugacometa.BO;

import com.tartarugacometa.dao.ClienteDAO;
import com.tartarugacometa.exceptions.ValidacaoException;
import com.tartarugacometa.model.Cliente;

import java.util.List;

public class ClienteBO {

    private ClienteDAO clienteDAO = new ClienteDAO();

    public void cadastrarClienteBO(Cliente cliente) {
    	validarCliente(cliente);
        clienteDAO.cadastrarClienteDAO(cliente);
    }

    public void atualizarClienteBO(Cliente cliente) {
    	validarCliente(cliente);
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
 
    private void validarCliente(Cliente cliente) {

        if (cliente.getNome() == null || cliente.getNome().isBlank()) {
            throw new ValidacaoException("O nome do cliente não pode ser vazio.");
        }

        if (cliente.getCpfCnpj() == null || cliente.getCpfCnpj().isBlank()) {
            throw new ValidacaoException("O CPF/CNPJ não pode ser vazio.");
        }

        if (!cliente.getCpfCnpj().matches("\\d+")) {
            throw new ValidacaoException("O CPF/CNPJ só pode conter números.");
        }
    }
    
}