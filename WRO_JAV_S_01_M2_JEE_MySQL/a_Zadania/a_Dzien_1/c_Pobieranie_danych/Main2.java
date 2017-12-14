package a_Zadania.a_Dzien_1.c_Pobieranie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main2 {
    
	
	public static void main(String[] args){
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet result = null;
		
		try{
			conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cinemas_ex",
                    	"root","coderslab");
		System.out.println("Działa");
		//SELECT * FROM Movies WHERE rating>(SELECT AVG(rating) FROM Movies) ORDER BY rating DESC;
		statement = conn.prepareStatement("SELECT AVG(rating) AS avg FROM movies;");
		statement.executeQuery();
		result = statement.executeQuery();
	
		if(result.isBeforeFirst()){
			if(result.next()){
				double avg = result.getDouble("avg");
				statement.close();
				statement = conn.prepareStatement("select name,description,rating FROM movies WHERE rating > ? ORDER BY rating DESC;");
				statement.setDouble(1, avg);
				result.close();
				result = statement.executeQuery();
				display(result);
			}
			
		}
			     
    } catch (SQLException e) {
        e.printStackTrace();
        
    }
    
    finally{
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}

static private void display(ResultSet result){
	try{
	while (result.next()){
		String name = result.getString("name");
		String desc = result.getString("desciprition");
		double rating = result.getDouble("rating");
	System.out.println(name+"|"+desc+"|"+rating);
	}
	} catch(SQLException e){
		e.printStackTrace();
}
}
}

