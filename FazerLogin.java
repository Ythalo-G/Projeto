package Controle;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.login;

import Visao.Login_DAO;
import Visao.Produto_DAO;


@WebServlet("/fazerLogin")
public class FazeLogin extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("Login");

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
        Login_DAO dao = new Login_DAO(); 
		
		dao.consultar(login,senha );
		
		
		response.sendRedirect("inserirProduto.jsp");

		
	}
}
