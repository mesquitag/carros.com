package com.carros.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.carros.Models.Endereco;
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
			pstmt.setString(5, endereco.getUf());
			ResultSet rs = pstmt.executeQuery();
				if(rs.next()){
					return codigo = rs.getInt("id");
				}
		} catch (SQLException e ) {
			e.printStackTrace();
		}
	return codigo;
	}

}
