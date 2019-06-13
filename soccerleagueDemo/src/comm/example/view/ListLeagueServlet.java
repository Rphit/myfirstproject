package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.League;

/**
 * Servlet implementation class ListLeagueServlet
 */
@WebServlet("/list_leagues.view")
public class ListLeagueServlet extends HttpServlet {
	private List<League> leagueList=null;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		leagueList = (List<League>)getServletContext().getAttribute("leaguelist");
		
	/*	leagueList = new LinkedList<League>();
		leagueList.add( new League(2003, "Spring","Soccer League (Spring '03)") );
		 leagueList.add( new League(2003, "Summer",
		 "Summer Soccer Fest 2003") );
		 leagueList.add( new League(2003, "Fall",
		 "Fall Soccer League (2003)") );
		 leagueList.add( new League(2004, "Spring",
		 "Soccer League (Spring ‘04)") );
		 leagueList.add( new League(2004, "Summer",
		 "The Summer of Soccer Love 2004") );
		 leagueList.add( new League(2004, "Fall",
		 "Fall Soccer League (2004)") );*/
		String pageTitle = "Duke’s Soccer League: List Leagues";
		
		 // Specify the content type is HTML
		response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		
		 // Generate the HTML response
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<title>" + pageTitle + "</title>");
		 out.println("</head>");
		 out.println("<body>");
		
		
		 out.println("<table border=’1’ cellpadding=’5’ cellspacing='0' width=’400’>");
		 out.println("<tr bgcolor='#CCCCFF' align='center' valign='center'height='20'>");
		 out.println("<td><h3>" + pageTitle + "</h3></td>");
		 out.println("</tr>");
		 
		 
		 out.println("<table border='1'><th>Title</th><th>Year</th><th>Season</th>");

		 for(League l:leagueList)
		 {
		 out.println("<tr><td>"+l.getTitle()+"</td><td>"+l.getYear()+"</td><td>"+l.getSeason()+"</td></tr>");


		 }
 
		 
		 out.println("</table>");
		 
		
		  out.println("</body>");
		  out.println("</html>");
	
		
	
	
	}
	

}
