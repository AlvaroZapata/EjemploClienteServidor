package srvlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Autentificar
 */
@WebServlet("/Autentificar")
public class Autentificar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Autentificar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Usuario = request.getParameter("usuario");
		String Password = request.getParameter("password");
		String Login = request.getParameter("enviar");
		
		
		
		
		if (Login != null) {
		if (Usuario.equals("Alvaro") &&  Password.equals("123")){
			request.setAttribute("datos", Usuario);			
			request.getRequestDispatcher("html/miPanel.jsp").forward(request, response);	
			
		}
		else {
			response.sendRedirect("index.jsp");
		}
		}
	}
		
			
		
		/*
		
		
		if (Login != null) { //Pulsa el boton de Login
			
			//CON DATOS
			request.setAttribute("dato1", "Login");
			
			//SIN DATOS
			//response.sendRedirect(arg0);
			
			request.getRequestDispatcher("html/miPanel.jsp").forward(request, response);
		} else { 
			
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
			
	}

	*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
