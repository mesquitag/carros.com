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

import com.carros.Models.Carro;

@WebServlet("/CarroControl")
public class CarroControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
   private Carro carro;    
	
	public CarroControl() {
        super();
        carro = new Carro();
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
				
		
		/*Identifica se o formulario é do tipo multipart/form-data*/
		if (ServletFileUpload.isMultipartContent(request)) {
			try {
				/*Faz o parse do request*/
				List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);

				/*Escreve a o arquivo na pasta img*/
				for (FileItem item : multiparts) {
					if (!item.isFormField()) {
						item.write(new File(request.getServletContext().getRealPath("img")+ File.separator + "uploadfile"));
					}
				}

				request.setAttribute("message", "Arquivo carregado com sucesso");
			} catch (Exception ex) {
				request.setAttribute("message", "Upload de arquivo falhou devido a "+ ex);
			}

		} else {
			request.setAttribute("message","Desculpe este Servlet lida apenas com pedido de upload de arquivos");
		}

		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

		
		
	
}
