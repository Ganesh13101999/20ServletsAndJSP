

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ServletApp")
public class ServletApp extends HttpServlet {
	int age=18;
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		  String name=request.getParameter("uname");
		  String ucity=request.getParameter("ucity");
		  Date date=new Date();
		  PrintWriter writer = response.getWriter();
		  
//		  	writer.println("Hello "+ name);
//		  	writer.println(" I know you're from "+ucity);
		    writer.println("<html> <head> <title> Second App</title></head>");
			writer.println("<body bgcolor='cyan'> <h1><marquee> Welcome to our dynamic app </marquee></h1>");
			writer.println("<table>");
			writer.println("<h1>Hello changes in servlet</h1>");
			writer.println("<tr> <th>NAME</th>  <th>CITY</th> </tr>");
			writer.println("<tr><td> "+name+"</td> <td> "+ucity+"</td> </tr>");
			
			writer.println("</table></body>");
			
			writer.println("</html>");
		  
		    writer.close();

	}

}