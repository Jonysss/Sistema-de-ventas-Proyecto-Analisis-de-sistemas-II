/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class Conexion {
  /*  static Connection conn = null;
    public static Connection conectar(){
    string url=""  
    }*/
    
  public static Connection getConexion(){
  
  
     String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=proyecto2;"
                + "user= sa;"
                + "password=12345678;"
                + "loginTimeout=30;"
             + "encrypt=false;"; // Desactiva el cifrado SSL;  
 /*     String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=proyecto2;"
                + "integratedSecurity=true;"
                + "loginTimeout=30;"
                + "encrypt=false;"; // Desactiva el cifrado SSL;*/

      try{
      Connection con = DriverManager.getConnection(conexionUrl);
      return con;
      
      } catch(SQLException ex){
      System.out.println(ex.toString());
      
      return null;
      
      }
  }
  
  }
    
    
    
    
    

