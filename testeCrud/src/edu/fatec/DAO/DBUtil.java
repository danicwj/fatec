package edu.fatec.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static DBUtil instancia;
      private Connection con;
      
      private Connection DBUtil(){
    	  try { 
    		  Class.forName("org.gjt.mm.mysql.Driver");
    		  con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/teste","root","root");
    		  System.out.println("Conexao ok");
    		  } catch (ClassNotFoundException e) {
    		  e.printStackTrace();
    		  } catch (SQLException e) {
    		  e.printStackTrace();
    		  } catch (Exception e) { 
    		  e.printStackTrace();
    		  }
    		  return con; 
    		  }

      }

