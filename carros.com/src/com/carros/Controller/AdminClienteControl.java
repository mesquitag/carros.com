package com.carros.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carros.Dao.UsuarioDao;
import com.carros.Models.Pessoa;

/**
 * Servlet implementation class AdminClienteControl
 */
@WebServlet("/AdminClienteControl")
public class AdminClienteControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Pessoa cliente; 
	private UsuarioDao clienteDao;
	private static String LISTACLIENTE = "./listcliente.jsp";
	private static String EDITCLIENTE = "./editusuarioadm.jsp";
	
    public AdminClienteControl() {
        super();
        cliente = new Pessoa();
        clienteDao = new UsuarioDao();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward="";
		String action = request.getParameter("action");

      if (action.equalsIgnoreCase("remover")){
      	forward = LISTACLIENTE;
          int id = Integer.parseInt(request.getParameter("id"));
          clienteDao.remover(id);
      } 
      
     
		if (action.equalsIgnoreCase("alterar")){
         	forward = EDITCLIENTE;
         	int id = Integer.parseInt(request.getParameter("id"));
         	cliente = clienteDao.ConsultarPorId(id);
         	request.setAttribute("cliente", cliente); 
     
      }
      
      
      
      if(action.equalsIgnoreCase("pesquisa")){
      	forward = LISTACLIENTE;
      	if(request.getParameter("nomePesquisa").equals(null) || request.getParameter("nomePesquisa").equalsIgnoreCase("")){
      		request.setAttribute("clientes", clienteDao.listarTodos());
      		
      	}else{
      		clienteDao.listarPorNome(request.getParameter("nomePesquisa"));
      	}
      	
      }
      
      RequestDispatcher view = request.getRequestDispatcher(forward);
      view.forward(request, response); 
     
  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
