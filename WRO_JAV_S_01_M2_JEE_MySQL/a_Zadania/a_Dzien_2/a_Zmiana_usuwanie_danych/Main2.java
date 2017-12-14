package a_Zadania.a_Dzien_2.a_Zmiana_usuwanie_danych;


public class Main2 {
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;

	public class Main1 {
	    
		
		public static void main(String[] args){
			Connection conn = null;
			PreparedStatement statement = null;
			ResultSet result = null;
			
			try{
				conn = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/cinemas_ex",
	                    	"root","coderslab");
			System.out.println("Działa");
			
			statement = conn.prepareStatement("SELECT id,name,rating FROM movies ORDER BY id;");
			statement.executeQuery();
			result = statement.executeQuery();
			display(result);
			System.out.println("id do wyrzucenia");
}
