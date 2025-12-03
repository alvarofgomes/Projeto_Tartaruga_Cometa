package com.tartarugacometa.dao;

import com.tartarugacometa.model.Endereco;

public class EnderecoService {

    private EnderecoDAO enderecoDAO = new EnderecoDAO();

    public void cadastrarEndereco(Endereco endereco) {
        enderecoDAO.cadastrarEnderecoDAO(endereco);
    }

    public void atualizarEndereco(Endereco endereco) {
        enderecoDAO.atualizarEnderecoDAO(endereco);
    }

    public void deletarEndereco(int id) {
        enderecoDAO.deletarEnderecoDAO(id);
    }

}