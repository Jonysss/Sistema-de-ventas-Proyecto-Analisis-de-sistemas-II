/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Funciones {
    public static String getHoraHactual(){
    Date hora = new Date();
    SimpleDateFormat formateador = new SimpleDateFormat("hh,mm,ss");
    return formateador.format(hora);
    
    }
    
    public static String getFechaHactual(){
    Date hora = new Date();
    SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
    return formateador.format(hora);
    
    }
    
}
