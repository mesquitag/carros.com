package com.carros.Controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carros.Dao.EnderecoDao;
import com.carros.Dao.TelefoneDao;
import com.carros.Dao.UsuarioDao;
import com.carros.Models.Endereco;
import com.carros.Models.EnumEstado;
import com.carros.Models.Pessoa;
import com.carros.Models.Telefone;


@WebServlet("/UsuarioControl")
public class UsuarioControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
   private UsuarioDao usuarioDao;   
	private EnderecoDao enderecoDao;
	private TelefoneDao telefoneDao; 
	private  Integer codEndereco;
	private Integer codTelefone;
	private static String CADUSUARIO_SUCESS = "/index.jsp";
	

	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioControl() {
        super();
        usuarioDao = new UsuarioDao();
        enderecoDao = new EnderecoDao();
        telefoneDao = new TelefoneDao();
        codEndereco =0;
        codTelefone=0;
        
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		//dados Cliente
		Pessoa cliente = new Pessoa();
		cliente.setNome(request.getParameter("nome"));
		cliente.setEmail(request.getParameter("email"));
		cliente.setSenha(request.getParameter("senha").toString());
		try {
			Date dataNascimento = new SimpleDateFormat("dd-MM-yyyy").parse(request.getParameter("dataNascimento"));
			cliente.setDataNascimento(dataNascimento);
		} catch (Exception e) {
			e.printStackTrace();
		}
		cliente.setCpf(request.getParameter("cpf").toString());
		cliente.setRg(request.getParameter("rg").toString());
		
		// Cliente > Endereço
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro(request.getParameter("logradouro"));
		endereco.setNumero(request.getParameter("numero"));
		endereco.setComplemento(request.getParameter("complemento"));
		endereco.setCep(request.getParameter("cep").toString());
		endereco.setUf(EnumEstado.valueOf(request.getParameter("enumEstados")));
		
		
		// set Telefone;
		
		Telefone telefone = new  Telefone();
		telefone.setTelefone(request.getParameter("telefone").toString());
		String usuarioId = request.getParameter("id");
		if(usuarioId == null || usuarioId.isEmpty()){
			
			 codEndereco = enderecoDao.salvar(endereco);
			 codTelefone = telefoneDao.salvar(telefone);
			
			usuarioDao.salvar(cliente,codEndereco,codTelefone);
			
		}
		RequestDispatcher view = request.getRequestDispatcher(CADUSUARIO_SUCESS);
		//request.setAttribute("cliente", ClienteDao.findByCpf(cliente));
		view.forward(request, response);
		
	}



}
