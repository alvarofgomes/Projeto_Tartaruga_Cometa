package com.tartarugacometa.dao;

import com.tartarugacometa.model.Cliente;
import com.conexaofactory.ConnectionFactory;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class ClienteDAO {

    private ConnectionFactory connectionFactory = new ConnectionFactory();

    public void cadastrarClienteDAO(Cliente cliente) {
        String sql = "INSERT INTO clientes (nome, cpfcnpj) VALUES (?, ?);";

        try (Connection conn = connectionFactory.recuperarConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpfCnpj());
            ps.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void atualizarClienteDAO(Cliente cliente) {
        String sql = "UPDATE clientes SET nome = ?, cpfcnpj = ? WHERE id_cliente = ?";

        try (Connection conn = connectionFactory.recuperarConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpfCnpj());
            ps.setInt(3, cliente.getId());
            ps.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletarClienteDAO(int id) {
        String sql = "DELETE FROM clientes WHERE id_cliente = ?";

        try (Connection conn = connectionFactory.recuperarConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Set<Cliente> listarClientesDAO() {
        Set<Cliente> clientes = new HashSet<>();
        String sql = "SELECT * FROM clientes";

        try (Connection conn = connectionFactory.recuperarConexao();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Cliente cliente = new Cliente(
                        rs.getString("nome"),
                        rs.getString("cpfcnpj")
                );
                cliente.setId(rs.getInt("id_cliente"));
                clientes.add(cliente);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return clientes;
    }
}
