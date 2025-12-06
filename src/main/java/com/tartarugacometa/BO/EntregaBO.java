package com.tartarugacometa.BO;

import java.util.List;

import com.tartarugacometa.dao.EntregaDAO;
import com.tartarugacometa.model.Entrega;

public class EntregaBO {

    private EntregaDAO entregaDAO = new EntregaDAO();

    public void cadastrarEntregaBO(Entrega entrega) {
    	entregaDAO.cadastrarEntregaDAO(entrega);
    }

    public void atualizarEntregaBO(Entrega entrega) {
    	entregaDAO.atualizarEntregaDAO(entrega);
    }

    public void deletarEntregaBO(int id) {
    	entregaDAO.deletarEntregaDAO(id);
    }

    public List<Entrega> listarEntregasPorClienteBO(int clienteId) {
        return entregaDAO.listarEntregasPorClienteDAO(clienteId);
    }

}