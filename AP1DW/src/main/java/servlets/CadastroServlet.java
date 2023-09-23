package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cjava.Carro;

	@WebServlet(urlPatterns = "/cadServlet") 
	public class CadastroServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		
		Carro car = new Carro ();
		car.setModelo(req.getParameter("modelo1"));
		car.setMarca(req.getParameter("marca1"));
		car.setAnoFabrica(req.getParameter("anoFabrica1"));
	
		
		PrintWriter writer = resp.getWriter();
		writer.write("<html>");
		writer.write("<head><title>Sucesso</title>");
		writer.write("<meta charset=\"ISO-8859-1\"></head>");
		writer.write("<body>");
		writer.write("<label>Carro cadastrado com sucesso!</label></br>");
		writer.write("<label>Modelo: " + car.getModelo() + "</label></br>");
		writer.write("<label>Marca: " + car.getMarca() + "</label></br>");
		writer.write("<label>AnoFabrica: " + car.getAnoFabrica() + "</label></br>");
		writer.write("<a href=\"index.html\">voltar</a>");
		writer.write("</body>");
		writer.write("</html>");
	
	}
}