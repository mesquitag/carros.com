package com.carros.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.carros.Models.Endereco;
import com.carros.Models.EnumEstado;
import com.carros.util.Conexao;

public class EnderecoDao {

	public Integer salvar(Endereco endereco) {
		int codigo = 0;
		Connection con = Conexao.getConexao();
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into endereco(logradouro,numero,complemento,cep,uf) values(?,?,?,?,?) RETURNING id");
			pstmt.setString(1, endereco.getLogradouro());
			pstmt.setString(2, endereco.getNumero());
			pstmt.setString(3, endereco.getComplemento());
			pstmt.setString(4, endereco.getCep());
			pstmt.setString(5, endereco.getUf().name());
			ResultSet rs = pstmt.executeQuery();
				if(rs.next()){
					return codigo = rs.getInt("id");
				}
		} catch (SQLException e ) {
			e.printStackTrace();
		}
	return codigo;
	}

	public void remover(int codigo) {
		Connection con = Conexao.getConexao();
				try {
					PreparedStatement pstmt = con.prepareStatement("DELETE FROM endereco WHERE id=?");
					pstmt.setInt(1, codigo);
					pstmt.executeUpdate();
					pstmt.close();
					con.close();
				} catch (SQLException e) {
					System.out.println("não foi possivel deletar endereço");	
					e.printStackTrace();
				}
		
	}

	public Endereco recuperaEnderecoId(int codigoEnd) {
		Connection con = Conexao.getConexao();
		Endereco endereco = new Endereco();
		 	
		try {
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM endereco WHERE id = ?" );
			pstmt.setInt(1, codigoEnd);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				endereco.setLogradouro(rs.getString("logradouro"));
				endereco.setNumero(rs.getString("numero"));
				endereco.setComplemento(rs.getString("complemento"));
				endereco.setCep(rs.getString("cep"));
				endereco.setUf(EnumEstado.valueOf(rs.getString("uf")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return endereco;
	}

}
