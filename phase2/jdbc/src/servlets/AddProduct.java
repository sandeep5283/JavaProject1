package servlets;
import com.jdbc.util.DBConnection;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/addEmployee")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String url = "jdbc:mysql://localhost:3306/office";
		String userName = "root";
		String password = "Simplilearn";

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		try {
			DBConnection dbConnection = new DBConnection(url, userName, password);

			Connection connection = dbConnection.getConnection();
	String query="INSERT  INTO employee VALUES('RAj','VJY','RAAj@GMAIL.COM')";
	Statement stmt=connection.createStatement();
			stmt.executeUpdate(query);
			
			out.println("Data inserted successfully");
			stmt.close();
			out.println("</body></html>");
			dbConnection.closeConnection();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
	
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
