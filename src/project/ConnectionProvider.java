/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;


/**
 *
 * @author Wizzy
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionProvider {
    public static Connection getCon(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
        }
        catch(Exception e){
            System.out.println("Erreur de connexion:" + e.getMessage()); 
        }
        return con;
    }
    
}
