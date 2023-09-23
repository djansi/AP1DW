package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Servelets")

	public class Servelets extends HttpServlet{
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String modelo = req.getParameter("modelo");
			System.out.println("Modelo: " + modelo);
			
			String marca = req.getParameter("marca");
			System.out.println("Marca: " + marca);
			
			String anoFabrica = req.getParameter("anoFabrica");
			System.out.println("Ano de Fabricação: " + anoFabrica);
		}
	}

