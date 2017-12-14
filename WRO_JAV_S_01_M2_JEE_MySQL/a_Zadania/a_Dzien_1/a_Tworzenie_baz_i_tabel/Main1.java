package a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {
    
    //public String query = "create database products_ex";
    
//    public static String queryCreateTable1 = "CREATE TABLE Products("+
//    		"id INT AUTO_INCREMENT," +
//    		"name CHAR(20) NOT NULL," +
//    		"description VARCHAR(255)," +
//    		"price DECIMAL(20,2)," +
//    		"PRIMARY KEY (id));";
//    
    public static String queryCreateTable2 = "Create Table Payments("+
    			"id INT AUTO_INCREMENT," +
    			"type CHAR(20),"+
    			"data date," +
    			"PRIMARY KEY (id))" ;
    public static void main(String[]args){
        Connection conn = null;
        Statement statement = null;
      
        try {
            
        	
        conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cinemas_ex",
                    "root","coderslab");
           
            
        System.out.println("Succesfully Connected");
        
        statement = conn.createStatement();
        statement.executeUpdate(queryCreateTable2);
            
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
}

