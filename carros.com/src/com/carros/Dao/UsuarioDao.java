package com.carros.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.carros.Models.Cliente;
import com.carros.Models.Endereco;
import com.carros.Models.Pessoa;
import com.carros.Models.Telefone;
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
		Connection con = Conexao.getConexao();
		Pessoa cliente = new Pessoa();
		Telefone telefone = new Telefone();
		Endereco endereco = new Endereco();
		int codigoTel = recuperaCodTelefone(codigo);
		int codigoEnd = recuperaCodEndereco(codigo);
		TelefoneDao telefoneDao = new TelefoneDao();
		EnderecoDao enderecoDao = new EnderecoDao();
		try {
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM pessoa WHERE id = ?;");
			pstmt.setInt(1, codigo);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setEmail(rs.getString("email"));
				cliente.setSenha(rs.getString("senha"));
				cliente.setDataNascimento(rs.getDate("datanascimento"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setRg(rs.getString("rg"));
				codigoEnd= rs.getInt("endereco_id");
				codigoTel = rs.getInt("telefone_id");
			}
			 telefone = telefoneDao.recuperaTelefoneId(codigoTel);
			enderecoDao.recuperaEnderecoId(codigoEnd);
			
			cliente.setTelefone(telefone);
			cliente.setEndereco(endereco);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return cliente;
	}

	public void remover(int codigo) {
			Connection con = Conexao.getConexao();
			int codigoTel = recuperaCodTelefone(codigo);
			int codigoEnd = recuperaCodEndereco(codigo);
			TelefoneDao telefoneDao = new TelefoneDao();
			EnderecoDao enderecoDao = new EnderecoDao();
			
			try {
				PreparedStatement pstmt = con.prepareStatement("DELETE FROM pessoa WHERE id = ?" );
				pstmt.setInt(1, codigo);
				pstmt.executeUpdate();
				pstmt.close();
				con.close();
				
			} catch (SQLException e) {
				System.out.println("não foi possivel excluir Pessoa");
				e.printStackTrace();
			}
			
			telefoneDao.remover(codigoTel);
			enderecoDao.remover(codigoEnd);
		
	}

	private Integer recuperaCodEndereco(int codigo) {
		 int codigoEnd = 0;
			
			Connection con = Conexao.getConexao();
			try {
				PreparedStatement pstmt = con.prepareStatement("SELECT endereco_id FROM pessoa where id = ? ");
				  pstmt.setInt(1, codigo);
				  ResultSet rs = pstmt.executeQuery();
				  while(rs.next()){
					  return codigoEnd = rs.getInt("endereco_id");
				  }
				  pstmt.close();
				  con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
					
			return codigoEnd;
	}

	public Integer recuperaCodTelefone(int codigo){
		 int codigoTel = 0;
		
		Connection con = Conexao.getConexao();
		try {
			PreparedStatement pstmt = con.prepareStatement("SELECT telefone_id FROM pessoa where id = ? ");
			  pstmt.setInt(1, codigo);
			  ResultSet rs = pstmt.executeQuery();
			  while(rs.next()){
				  return codigoTel = rs.getInt("telefone_id");
			  }
			  pstmt.close();
			  con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return codigoTel;
		
		
	}

	public void listarPorNomeOuCpf(String nome, String cpf) {
		// TODO Auto-generated method stub
		
	}

	public List<Pessoa> listarTodos() {
		Connection con = Conexao.getConexao();
		List<Pessoa> clientes = new ArrayList<Pessoa>();
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM pessoa");
			int codEndereco=0;
			int codTelefone =0;
			while(rs.next()){
				Pessoa cliente = new Pessoa();
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setEmail(rs.getString("email"));
				cliente.setSenha(rs.getString("senha"));
				cliente.setDataNascimento(rs.getDate("datanascimento"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setRg(rs.getString("rg"));
				//codEndereco= rs.getInt("endereco_id");
				//codTelefone = rs.getInt("telefone_id");
				
				clientes.add(cliente);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return clientes;
		
	}

	public List<Pessoa> listarPorNome(String nomePesquisa) {
		Connection con = Conexao.getConexao();
		List<Pessoa> clientes = new ArrayList<Pessoa>();
		try {
			PreparedStatement pstmt = con
			      .prepareStatement("SELECT * FROM pessoa WHERE nome like %(?)%");
			pstmt.setString(1, nomePesquisa);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Pessoa cliente = new Pessoa();
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setEmail(rs.getString("email"));
				cliente.setSenha(rs.getString("senha"));
				cliente.setDataNascimento(rs.getDate("datanascimento"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setRg(rs.getString("rg"));

				clientes.add(cliente);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return clientes;

	}

}
