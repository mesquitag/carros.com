package com.carros.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carros.Dao.UsuarioDao;
import com.carros.Models.Pessoa;


@WebServlet("/EditClienteControl")
public class EditClienteControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Pessoa cliente; 
	private UsuarioDao clienteDao;
	private static String LISTACLIENTE = "./listcliente.jsp";   

    public EditClienteControl() {
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
		
		
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		
		doGet(request, response);
	}

}
