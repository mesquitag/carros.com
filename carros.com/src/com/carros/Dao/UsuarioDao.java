package com.carros.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.carros.Models.Cliente;
import com.carros.Models.Pessoa;
import com.carros.util.Conexao;

public class UsuarioDao {

	public void salvar(Pessoa cliente, Integer codEndereco, Integer codTelefone) {
			Connection con = Conexao.getConexao();
			try {
				PreparedStatement pstmt = con.prepareStatement("INSERT INTO pessoa (nome,datanascimento,email,senha,cpf,rg,endereco_id,telefone_id) VALUES (?,?,?,?,?,?,?,?); ");
				pstmt.setString(1, cliente.getNome());
				pstmt.setDate(2, new java.sql.Date(cliente.getDataNascimento().getTime()));
				pstmt.setString(3, cliente.getEmail());
				pstmt.setString(4, cliente.getSenha());
				pstmt.setString(5, cliente.getCpf());
				pstmt.setString(6, cliente.getRg());
				pstmt.setInt(7, codEndereco);
				pstmt.setInt(8, codTelefone);
				
				pstmt.execute();
				pstmt.close();
				con.close();
				
			} catch (SQLException e) {
				System.out.println("não foi possivel inserir pessoa no Banco ");
				e.printStackTrace();
			}
		
	}

	public void update(Cliente cliente) {

		
	}

	public Pessoa ConsultarPorId(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	public void remover(int codigo) {
		// TODO Auto-generated method stub
		
	}

	public void listarPorNomeOuCpf(String nome, String cpf) {
		// TODO Auto-generated method stub
		
	}

	public void listar() {
		// TODO Auto-generated method stub
		
	}

}
