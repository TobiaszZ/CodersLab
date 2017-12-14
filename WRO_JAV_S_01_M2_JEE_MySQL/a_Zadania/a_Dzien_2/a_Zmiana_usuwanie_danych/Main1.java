package a_Zadania.a_Dzien_2.a_Zmiana_usuwanie_danych;

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
                    "jdbc:mysql://localhost:3306/(nazwa Twojej data bases)",
                    	"root","coderslab");
		
		System.out.println("Działa");
		statement = conn.prepareStatement("KOD SQL");
		statement.executeQuery();
		result = statement.executeQuery();
		display(result);
		System.out.println("id do wyrzucenia");
		
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
		Integer id = result.getInt("id");
		String name = result.getString("name");
		double rating = result.getDouble("rating");
	System.out.println(name+"|"+ id +"|"+rating);
	}
	} catch(SQLException e){
		e.printStackTrace();
}
}
}

