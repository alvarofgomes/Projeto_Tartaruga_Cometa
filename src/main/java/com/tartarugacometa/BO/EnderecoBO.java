package com.tartarugacometa.BO;

import java.util.List;

import com.tartarugacometa.dao.EnderecoDAO;
import com.tartarugacometa.model.Endereco;

public class EnderecoBO {

    private EnderecoDAO enderecoDAO = new EnderecoDAO();

    public void cadastrarEnderecoBO(Endereco endereco) {
        enderecoDAO.cadastrarEnderecoDAO(endereco);
    }

    public void atualizarEnderecoBO(Endereco endereco) {
        enderecoDAO.atualizarEnderecoDAO(endereco);
    }

    public void deletarEnderecoBO(int id) {
        enderecoDAO.deletarEnderecoDAO(id);
    }

    public List<Endereco> listarEnderecoBO() {
        return enderecoDAO.listarEnderecosDAO();
    }
    
}