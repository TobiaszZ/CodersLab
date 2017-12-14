

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Zadani_domowe4
 */
@WebServlet("/Zadani_domowe4")
public class Zadani_domowe4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Zadani_domowe4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		Integer num1 = Integer.parseInt(request.getParameter("1"));
		Integer num2 = Integer.parseInt(request.getParameter("2"));
		Integer num3 = Integer.parseInt(request.getParameter("3"));
		Integer num4 = Integer.parseInt(request.getParameter("4"));
		Integer mean;
		Integer suma;
		Integer iloczyn;
		mean = (num1+num2+num3+num4)/4;
		suma = (num1+num2+num3+num4);
		iloczyn = (num1*num2*num3*num4);
		out.append(" Srednia - ").append(mean.toString()).append(",");
		out.append(" Suma - ").append(suma.toString()).append(",");
		out.append(" Iloczyn - ").append(iloczyn.toString()).append(",");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
