package com.carros.Controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.carros.Dao.CarroDao;
import com.carros.Models.Carro;

/**
 * Servlet implementation class CadVeiculoControl
 */
@WebServlet("/CadVeiculoControl")
public class CadVeiculoControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
   private Carro carro;    
   private CarroDao carroDao;
	
	public CadVeiculoControl() {
        super();
        carro = new Carro();
        carroDao = new CarroDao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//dados do carro;
				Carro carro = new Carro();
				carro.setMarca(request.getParameter("marca"));
				carro.setModelo(request.getParameter("modelo"));
				carro.setPlaca(request.getParameter("placa"));
				carro.setAno(request.getParameter("ano"));
		///----------------------------------------------------
				
				String fileUpload = request.getParameter("fileUpload");
				System.out.println(fileUpload); // img base 64
				
				
		
			


		        
	}
	}

