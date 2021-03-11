package loginPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// JDBC driver name and database URL
	      final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	      final String DB_URL="jdbc:mysql://localhost:3306/users";

	      //  Database credentials
	      final String USER = "root";
	      final String PASS = "";

	      // Set response content type
	      response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	      
	      try 
	      {
	    	 
	         // Register JDBC driver
	         Class.forName(JDBC_DRIVER);
	         
	         // Open a connection    
	    	  
	         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         
	         // Execute SQL query
	         java.sql.Statement stmt = conn.createStatement();
	         /////////
	         
	         String un = request.getParameter("yourUS");
	         String pass = request.getParameter("yourPass");
	         
	         
	         String sql = "SELECT * FROM `userdetails` WHERE `username` = " + un + " && `password` = " + pass + ";";
	         
	         
	         ResultSet rs = stmt.executeQuery(sql);
	         
	         if (rs.next() == false) 
	         { 
	        	 out.println("Invalid Log-in"); 
	        	 // Clean-up environment
		         rs.close();
		         stmt.close();
		         conn.close();
		         
	        	 //go to log-in page
	         }
	         else
	         {
	        	 // Clean-up environment
		         rs.close();
		         stmt.close();
		         conn.close();
		         
	        	//go to landing page
		        
	         }
  
	      } 
	      catch(SQLException se) 
	      {
	         //Handle errors for JDBC
	         se.printStackTrace();
	      } 
	      catch(Exception e) 
	      {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	      }
	}


}
