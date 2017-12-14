

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Zadani_domowe2
 */
@WebServlet("/Zadani_domowe2")
public class Zadani_domowe2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Zadani_domowe2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String s1 = request.getParameter("name");
	    String s2 = request.getParameter("plec");
	    
	    if(s2.equals("Kobieta")){
	    	response.getWriter().append("Coders Lab wita Panią : ").append(s1);
	    }
	    else{
	    	response.getWriter().append("Coders Lab wita Pana : ").append(s1).append("a");
	    }
	    	
	    }
	}


