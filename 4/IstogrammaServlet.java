package it.cefi.models;

import java.io.IOException;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/verificaIso")
public class IstogrammaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		
		Isogramma isogramma = new Isogramma(request.getParameter("frase"));
		if(isogramma.verifica()) {
			request.setAttribute("return", "è un isogramma");
		}else {
			request.setAttribute("return", "non è un isogramma");
		}
		
		
		requestDispatcher.forward(request, response);
	}

}