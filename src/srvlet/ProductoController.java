package srvlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Clases.Producto;

/**
 * Servlet implementation class Detalle
 */
@WebServlet("/Producto")
public class ProductoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	//GestorProductos.getProductos();
	//GestorProductos.getProduscto(3);
		
		
		
	//llevar a GestorProducto	
	ArrayList<Producto> producto = new ArrayList<>();
	
	Producto p;
	
	
	for (int i = 1; i <= 6; i++) {
				
		
		p=new Producto("Producto"+i, 10+i, "El mejor producto"+i);
		producto.add(p);
	}
	
	//hasta aqui.
	
	String id = request.getParameter("producto");
	
	int id_entero = Integer.parseInt(id) -1;
	
	
	request.setAttribute("producto" ,producto.get(id_entero));

	request.getRequestDispatcher("html/detalle.jsp").forward(request, response);	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
