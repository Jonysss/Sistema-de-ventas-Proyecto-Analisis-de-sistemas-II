/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import CapaDatos.M_Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class N_Cliente {
    private Conexion SQL = new Conexion();
    private Connection cn =SQL.getConexion(); 
    String sql = "";
    public DefaultTableModel mostrar (String buscar){
    DefaultTableModel modelo;
    
    String[] titulos= {"ID", "Nombre", "apellidos", "DPI", "NIT", "Edad", "sexo", "Telefono", "Direccion"};
    modelo= new DefaultTableModel(null, titulos);
    String [] registro = new String[9];
    
    sql = ("sp_buscar_cliente'"+ buscar+"'");
    
    try{
    Statement st =cn.createStatement();
    ResultSet rs = st.executeQuery(sql);
    
    
    while (rs.next()){
      registro[0]= rs.getString(1);
      registro[1]= rs.getString(2);
      registro[2]= rs.getString(3);
      registro[3]= rs.getString(4);
      registro[4]= rs.getString(5);
      registro[5]= rs.getString(6);
      registro[6]= rs.getString(7);
      registro[7]= rs.getString(8);
      registro[8]= rs.getString(9);
      modelo.addRow(registro);
    }
    return modelo;
    } catch (Exception e){
     JOptionPane.showConfirmDialog(null, e);
     return null;
    
    }
    
    
    }
  public boolean insertar (M_Cliente dts) {
  
  sql=("{call sp_guardar_clientes (?,?,?,?,?,?,?,?,?)}");
  
  try {
  PreparedStatement pst =cn.prepareStatement(sql);
  pst.setString(1, dts.getCodigo());
   pst.setString(2, dts.getNombre());
    pst.setString(3, dts.getApellido());
     pst.setString(4, dts.getCui());
      pst.setString(5, dts.getNit());
       pst.setInt(6, dts.getEdad());
        pst.setString(7, dts.getSexo());
         pst.setString(8, dts.getTelefono());
          pst.setString(9, dts.getDireccion());
          
          
          int n = pst.executeUpdate();
  if (n !=0){
  return true;
  
  } else{
  return false;
  }
  
  } catch (Exception e){
  JOptionPane.showConfirmDialog(null, e);
  return false;
  }
  } 
  
  
  public boolean editar (M_Cliente dts) {
  
  sql=("{call sp_editar_clientes (?,?,?,?,?,?,?,?,?)}");
  
  try {
  PreparedStatement pst =cn.prepareStatement(sql);
  pst.setString(1, dts.getCodigo());
   pst.setString(2, dts.getNombre());
    pst.setString(3, dts.getApellido());
     pst.setString(4, dts.getCui());
      pst.setString(5, dts.getNit());
       pst.setInt(6, dts.getEdad());
        pst.setString(7, dts.getSexo());
         pst.setString(8, dts.getTelefono());
          pst.setString(9, dts.getDireccion());
          
          
          int n = pst.executeUpdate();
  if (n !=0){
  return true;
  
  } else{
  return false;
  }
  
  } catch (Exception e){
  JOptionPane.showConfirmDialog(null, e);
  return false;
  }
  } 
  public boolean eliminar (M_Cliente dts){
      sql =("{call sp_eliminar_clientes(?)}") ;
      try{
          PreparedStatement pst= cn.prepareStatement(sql);
          pst.setString(1, dts.getCodigo());
          
          int n= pst.executeUpdate();
          if(n!=0){
          return true;
          }else{
          return false;
          }
      }catch (Exception e){
      JOptionPane.showMessageDialog(null, e);
      return false;
      }
      
  }
  
  public int generarIdCliente(){
  String sql = ("select max(idcliente) as id from clientes");
  int cod=0;
    
  try {
  Statement st = cn.createStatement();
  ResultSet rs= st.executeQuery(sql);
  if(rs.next()){
  cod=rs.getInt("id")+1;
  }
  }catch (SQLException el){
  JOptionPane.showConfirmDialog(null,"herror sql:"+ el.getMessage());
  }
  return cod;
  }
}

