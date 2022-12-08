package it.domi.models;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/verificaBi")
public class RicercaServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			
			Ricerca ricerca = new Ricerca(Integer.parseInt(request.getParameter("key")));
			int indice = ricerca.binarySearch(0, ricerca.getNumero().size());
			
			if(indice == -1)
				request.setAttribute("return", "Valore non trovato");
			else
				request.setAttribute("return", indice);
			
			
			dispatcher.forward(request, response);
		}
	

}
