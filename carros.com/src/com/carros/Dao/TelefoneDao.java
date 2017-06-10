package com.carros.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.carros.Models.Telefone;
import com.carros.util.Conexao;

public class TelefoneDao {

	public Integer salvar(Telefone telefone) {
		Integer codigo =0;
			Connection con = Conexao.getConexao();
			try {
				PreparedStatement pstmt = con.prepareStatement("INSERT INTO telefone (telefone) values(?) RETURNING id");
				pstmt.setString(1, telefone.getTelefone());
				ResultSet rs = pstmt.executeQuery();
				if (rs.next()) {
					return codigo = rs.getInt("id");
					
				}
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return codigo;
	}

	public void remover(int codigo) {
		Connection con = Conexao.getConexao();
		 
		try {
			PreparedStatement pstm = con.prepareStatement("DELETE FROM telefone WHERE id=?");
			pstm.setInt(1, codigo);
			pstm.executeUpdate();
			pstm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("não foi possivel deletar o telefone");
			e.printStackTrace();
		}
		
	}

}
