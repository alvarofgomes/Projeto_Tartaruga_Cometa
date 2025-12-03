package com.tartarugacometa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.conexaofactory.ConnectionFactory;
import com.tartarugacometa.model.Endereco;

public class EnderecoDAO {

    private ConnectionFactory connection = new ConnectionFactory();

    public void cadastrarEnderecoDAO(Endereco endereco) {
        String sql = "INSERT INTO enderecos (rua, numero, bairro, cidade, estado, cep, clientes_id) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = connection.recuperarConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, endereco.getRua());
            ps.setInt(2, endereco.getNumero());
            ps.setString(3, endereco.getBairro());
            ps.setString(4, endereco.getCidade());
            ps.setString(5, endereco.getEstado());
            ps.setString(6, endereco.getCep());
            //obtendo obj de cliente no endereço para passar id para cliente_id
            ps.setInt(7, endereco.getCliente().getId());

            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void atualizarEnderecoDAO(Endereco endereco) {
        String sql = "UPDATE enderecos SET rua=?, numero=?, bairro=?, cidade=?, estado=?, cep=? WHERE id_endereco=?";

        try (Connection conn = connection.recuperarConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, endereco.getRua());
            ps.setInt(2, endereco.getNumero());
            ps.setString(3, endereco.getBairro());
            ps.setString(4, endereco.getCidade());
            ps.setString(5, endereco.getEstado());
            ps.setString(6, endereco.getCep());
            ps.setInt(7, endereco.getId());

            ps.execute();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletarEnderecoDAO(int id) {
        String sql = "DELETE FROM enderecos WHERE id_endereco = ?";

        try (Connection conn = connection.recuperarConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            
            ps.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Endereco> listarEnderecosDAO() {
        List<Endereco> lista = new ArrayList<>();

        String sql = "SELECT * FROM enderecos";

        try (Connection conn = connection.recuperarConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Endereco e = new Endereco(
                    rs.getString("rua"),
                    rs.getInt("numero"),
                    rs.getString("bairro"),
                    rs.getString("cidade"),
                    rs.getString("estado"),
                    rs.getString("cep")
                );
                e.setId(rs.getInt("id_endereco"));

                lista.add(e);
            }

            return lista;

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }


}