
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class ServletDemo1 extends HttpServlet {
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			out.print("First servlet program  	190030946_Vidya");
			String name=request.getParameter("uname");
			String pwd=request.getParameter("pwd");
			if(name.equals("vidya") & pwd.equals("vidya")) {
				out.println("valid user");
				RequestDispatcher rd=request.getRequestDispatcher("welcome.html");
				}
				else {
				out.println("In valid user");
				}

			out.println("Hii"+name);
		}

}
