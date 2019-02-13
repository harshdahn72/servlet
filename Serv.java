
import java.sql.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Serv extends HttpServlet {

	private static final long serialVersionUID = 1L;
      
	
    public Serv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String fname = request.getParameter("First Name");
		String lname = request.getParameter("Last Name");
		String Instname = request.getParameter("Inst Name");
		response.getWriter().append("Serv at:").append(request.getContextPath());
		
		Class.forName("com.mysql.jdbc.driver")
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/form","root","mysql");
		
		Statement st=conn.createStatement()

		doGet(request, response);
	}

}
