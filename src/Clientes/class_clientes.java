/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import clases.Validacion;
import clases.conexion;
import conexion_BD.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhonker2
 */
public class class_clientes {
    
    DefaultTableModel model;
    Validacion obj1 =new Validacion(); 
    conectar cc=new conectar();
    Connection cn = cc.conexion();
    
     public void cargar_Clientes( JTable x ){
    String [] titulos={"CEDULA","NOMBRES Y APELLIDO ","TELEFONO","CELULAR"};
    String [] registros= new String [4];
    String sql="select clientes.cedula, CONCAT(personas.nombres,' ',personas.ape_pat)AS nombre_cli,"
            + " personas.telefono,personas.celular"
            + " from clientes, personas\n" +
                "where personas.cedula = clientes.cedula;";
    model= new DefaultTableModel(null,titulos);
        try {
            joyeria1.Joyeria1.con.Consultar(sql);
            while (joyeria1.Joyeria1.con.rs.next()){
            registros[0]=joyeria1.Joyeria1.con.rs.getString("cedula");
            registros[1]=joyeria1.Joyeria1.con.rs.getString("nombre_cli");
            registros[2]=joyeria1.Joyeria1.con.rs.getString("telefono");
            registros[3]=joyeria1.Joyeria1.con.rs.getString("celular");
            
            model.addRow(registros);
                } x.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL LLENAR LA TABLA");
        }
    }
     
      public void buscar_Clientes( JTable x, String valor ){
    String [] titulos={"CEDULA","NOMBRES Y APELLIDO ","TELEFONO","CELULAR"};
    String [] registros= new String [4];
    String sql="select clientes.cedula, CONCAT(personas.nombres,' ',personas.ape_pat)AS nombre_cli,"
            + " personas.telefono,personas.celular"
            + " from clientes, personas\n" +
              " where personas.cedula = clientes.cedula \n"+
              " AND clientes.cedula like '%"+valor+"%'";
    model= new DefaultTableModel(null,titulos);
        try {
            joyeria1.Joyeria1.con.Consultar(sql);
            while (joyeria1.Joyeria1.con.rs.next()){
            registros[0]=joyeria1.Joyeria1.con.rs.getString("cedula");
            registros[1]=joyeria1.Joyeria1.con.rs.getString("nombre_cli");
            registros[2]=joyeria1.Joyeria1.con.rs.getString("telefono");
            registros[3]=joyeria1.Joyeria1.con.rs.getString("celular");
            
            model.addRow(registros);
                } x.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
        public void deleteUsuario(String codigo){
            
        int n = 0;
        
        try {
            String sql="update personas set estado=? WHERE cedula="+codigo+"";
            // String sql="SELECT * FROM cliente where ced_client like '%"+valor+"%'"
            PreparedStatement pst = (PreparedStatement) cn.prepareStatement(sql);
            pst.setString(1, "0");

            n = pst.executeUpdate();

            if (n > 0) {
                System.out.println( "Cliente Eliminado");
                joyeria1.Joyeria1.ven.Mensaje("Cliente Eliminado","Cliente");
                //obj1.cargar_(Administracion_clientes.tabla_clientes);
                

            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR al actualizar el pedido el estado" + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
      
       public void cargar_edit_usuario(String valor,JTextField x1,JTextField x2,JTextField x3, JTextField x4,JTextField x5, JTextField x6,JTextField x7)
{       String c="";
        String sql="Select * from personas where personas.cedula='"+valor+"'";               
        try {

            joyeria1.Joyeria1.con.Consultar(sql);
            while (conexion.rs.next()){
            x1.setText(conexion.rs.getString("cedula"));
            x2.setText(conexion.rs.getString("nombres"));
            x3.setText(joyeria1.Joyeria1.con.rs.getString("ape_pat"));
            x4.setText(joyeria1.Joyeria1.con.rs.getString("ape_mat"));
            x5.setText(joyeria1.Joyeria1.con.rs.getString("telefono"));
            x6.setText(joyeria1.Joyeria1.con.rs.getString("celular"));
            x7.setText(joyeria1.Joyeria1.con.rs.getString("direccion"));
            
            
            }
        }
        catch(SQLException ex){
        
        }

}
}
