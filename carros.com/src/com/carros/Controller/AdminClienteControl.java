package com.carros.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carros.Dao.ClienteDao;
import com.carros.Dao.UsuarioDao;
import com.carros.Models.Pessoa;
import com.hxtt.global.v;

/**
 * Servlet implementation class AdminClienteControl
 */
@WebServlet("/AdminClienteControl")
public class AdminClienteControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Pessoa cliente; 
	private UsuarioDao clienteDao;
	private static String LISTACLIENTE = "./listcliente.jsp";
	
    public AdminClienteControl() {
        super();
        cliente = new Pessoa();
        clienteDao = new UsuarioDao();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");

      if (action.equalsIgnoreCase("remover")){
          int id = Integer.parseInt(request.getParameter("id"));
          clienteDao.remover(id);
       
      } 
      
      if (action.equalsIgnoreCase("alterar")){
          int id = Integer.parseInt(request.getParameter("id"));
           cliente = clienteDao.ConsultarPorId(id);
          request.setAttribute("cliente", cliente); 
      }
      
      
      
      if(action.equalsIgnoreCase("pesquisa")){
//      	if(!nome.isEmpty() || nome.equals(null) && cpf.isEmpty() || cpf.equals(null)){
//      		clienteDao.listarPorNomeOuCpf(nome,cpf);
//      	}else{
      		request.setAttribute("clientes", clienteDao.listarTodos());
      		
//      	}
      	
      }
      RequestDispatcher view = request.getRequestDispatcher(LISTACLIENTE);
      view.forward(request, response);
      
      
      //  RequestDispatcher view = request.getRequestDispatcher(FORMULARIO);
      
      //request.setAttribute("clientes", .ConsultarTodos());
     // view.forward(request, response);
  }
		
		
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
