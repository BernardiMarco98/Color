package color;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class Color
 */
@WebServlet("/Color")
public class Color extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String coloreHome = "white";
	String jspParamNameColor = "colore";
	String jspParamForm = "param";
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Color() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Colore.jsp");
		
		HttpSession session = request.getSession();
		
		if(session.isNew() == true)
		{
			request.setAttribute(jspParamNameColor, coloreHome);
		}
		else
		{
			String a = (String) request.getParameter(jspParamForm);
			if(a == "black")
			{
				request.setAttribute(jspParamNameColor, coloreHome);
			}
			else	
			request.setAttribute(jspParamNameColor, a);
		}
	
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
