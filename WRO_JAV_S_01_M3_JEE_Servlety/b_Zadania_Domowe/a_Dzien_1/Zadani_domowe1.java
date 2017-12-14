

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Zadani_domowe1
 */
@WebServlet("/Zadani_domowe1")
public class Zadani_domowe1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Zadani_domowe1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		File file = new File("/home/tiko/Git/WRO_JAV_S_01_M3_JEE_Servlety/b_Zadania_Domowe/a_Dzien_1/oop.txt");
		String skan;
		
		try {
             Scanner scan = new Scanner(file);
             
             for(;scan.hasNextLine();){
            	 skan = scan.nextLine();
            	 response.getWriter().append("<p>"+skan+"</p>");
            	}
             scan.close();
		}
             catch(FileNotFoundException e){
                 System.out.println("nie ma");
                 
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
