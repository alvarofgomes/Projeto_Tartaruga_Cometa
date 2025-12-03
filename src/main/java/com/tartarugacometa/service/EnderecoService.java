package com.tartarugacometa.service;

import java.util.List;

import com.tartarugacometa.dao.EnderecoDAO;
import com.tartarugacometa.model.Endereco;

public class EnderecoService {

    private EnderecoDAO enderecoDAO = new EnderecoDAO();

    public void cadastrarEnderecoService(Endereco endereco) {
        enderecoDAO.cadastrarEnderecoDAO(endereco);
    }

    public void atualizarEnderecoService(Endereco endereco) {
        enderecoDAO.atualizarEnderecoDAO(endereco);
    }

    public void deletarEnderecoService(int id) {
        enderecoDAO.deletarEnderecoDAO(id);
    }

    public List<Endereco> listarEnderecosService() {
        return enderecoDAO.listarEnderecosDAO();
    }
    
}