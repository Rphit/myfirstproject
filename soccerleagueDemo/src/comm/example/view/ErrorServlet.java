package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorServlet
 */
@WebServlet("/errpage.view")
public class ErrorServlet extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequestt(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
processRequestt(request, response);
	}
	protected void processRequestt(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		List<String> errList=(List<String>)request.getAttribute("ERROR");
		for(String str:errList)
		{
			out.println(str+"<br/>");
		}
		
		
		
		
	}

}
