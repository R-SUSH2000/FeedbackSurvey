

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tet
 */
@WebServlet("/Tet")
public class Tet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		PrintWriter pw= response.getWriter();
//		pw.println("<html>\r\n"
//				+ "<head>\r\n"
//				+ "<title>Insert title here</title>\r\n"
//				+ "</head>\r\n" 
//				+ "<body >\r\n"
//				+ "<marquee>Welcome to First page</marquee>\r\n"+ name
//				+ "</body>\r\n"
//				+ "</html>");
//		response.getWriter().append("Served at: ").append(request.getContextPath());}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("sname");
		
		
		request.setAttribute("fname", name);
		RequestDispatcher rd= request.getRequestDispatcher("output.jsp");
		rd.forward(request, response);
	}

}
