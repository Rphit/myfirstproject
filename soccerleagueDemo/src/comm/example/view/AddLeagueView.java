package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddLeagueView
 */
@WebServlet(
		name= "AddLeagueView",
		urlPatterns = { "/add_league.view" }, 
		initParams = { 
				@WebInitParam(name = "season-list", value = "Select,Summer,Winter,Autumn"),
			
		})
public class AddLeagueView extends HttpServlet {
	
	private String seasonList=null;
	private String[] seasonArr;


	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		seasonList=config.getInitParameter("season-list");
		seasonArr=seasonList.split(",");
		

		

	}
	
	
    public AddLeagueView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		List<String> l=(List<String>)request.getAttribute("ERROR");
		if(l!=null)
		{
			out.println("<font color='red'>please correct the errors</font><br/>");
			for(String str:l)
			{
				out.println("<font color='red'>"+str+"</font><br/>");
			}
			
		}
		
		
		
		
		
		out.println("  <form action='add_league.do' method='post' > ");
		out.println(" year<input type='text' name='year'><br/>  ");
		
		out.println("Season<select name='season'>");
		for(String s:seasonArr)
		{
			out.println("<option value= '"+s+"'>"+s+"</option>");
		}	
		out.println(" </select><br/> ");
		
		out.println("Title<input type='text' name='title'>  ");
		out.println(" <input type='submit' value='Add League'></form>    ");
	}
	
	
	
	
	
	

}
