/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import clases.Validacion;
import conexion_BD.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guaman
 */
public class Class_Usuario {
    conectar cc=new conectar();
Connection cn = cc.conexion();
 DefaultTableModel model;
            Validacion obj1 =new Validacion();
    
    
    public void cargar_Usuarios( JTable x ){
    String [] titulos={"CEDULA","NOMBRES Y APELLIDO ","USUARIO","CLAVE","PRIVILEGIO"};
    String [] registros= new String [5];
    String sql="select usuarios.cedula, CONCAT(personas.nombres,' ',personas.ape_pat)AS nombre_usu,"
            + " usuarios.nombre_usuario,usuarios.clave_usuario, usuarios.privilegio"
            + " from usuarios, personas\n" +
                "where personas.cedula = usuarios.cedula and personas.estado=1";
    model= new DefaultTableModel(null,titulos);
        try {
            joyeria1.Joyeria1.con.Consultar(sql);
            while (joyeria1.Joyeria1.con.rs.next()){
            registros[0]=joyeria1.Joyeria1.con.rs.getString("cedula");
            registros[1]=joyeria1.Joyeria1.con.rs.getString("nombre_usu");
            registros[2]=joyeria1.Joyeria1.con.rs.getString("nombre_usuario");
            registros[3]=joyeria1.Joyeria1.con.rs.getString("clave_usuario");
            registros[4]=joyeria1.Joyeria1.con. rs.getString("privilegio");
            
            model.addRow(registros);
                } x.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL LLENAR LA TABLA");
        }
    }
    
    
    public void buscar_Usuarios( JTable x , String valor){
    String [] titulos={"CEDULA","NOMBRES Y APELLIDO ","USUARIO","CLAVE","PRIVILEGIO"};
    String [] registros= new String [5];
    String sql="select usuarios.cedula, CONCAT(personas.nombres,' ',personas.ape_pat)AS nombre_usu,"
            + " usuarios.nombre_usuario,usuarios.clave_usuario, usuarios.privilegio"
            + " from usuarios, personas\n" +
                "where personas.cedula = usuarios.cedula and personas.estado=1\n"+
                "AND personas.cedula like '%"+valor+"%'";
    model= new DefaultTableModel(null,titulos);
        try {
            joyeria1.Joyeria1.con.Consultar(sql);
            while (joyeria1.Joyeria1.con.rs.next()){
            registros[0]=joyeria1.Joyeria1.con.rs.getString("cedula");
            registros[1]=joyeria1.Joyeria1.con.rs.getString("nombre_usu");
            registros[2]=joyeria1.Joyeria1.con.rs.getString("nombre_usuario");
            registros[3]=joyeria1.Joyeria1.con.rs.getString("clave_usuario");
            registros[4]=joyeria1.Joyeria1.con. rs.getString("privilegio");
            
            model.addRow(registros);
                } x.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void cargar_edit_usuario(String valor,JTextField x1,JTextField x2,JTextField x3, JTextField x4,JTextField x5, JTextField x6,JTextField x7, JTextField x8 , JTextField x9,JRadioButton  x10, JRadioButton x11)
{       String c="";
        String sql="Select * from personas,usuarios where personas.cedula='"+valor+"'\n"+
                "And usuarios.cedula='"+valor+"'";
        try {

            joyeria1.Joyeria1.con.Consultar(sql);
            while (joyeria1.Joyeria1.con.rs.next()){
            x1.setText(joyeria1.Joyeria1.con.rs.getString("cedula"));
            x2.setText(joyeria1.Joyeria1.con.rs.getString("nombres"));
            x3.setText(joyeria1.Joyeria1.con.rs.getString("ape_pat"));
            x4.setText(joyeria1.Joyeria1.con.rs.getString("ape_mat"));
            x5.setText(joyeria1.Joyeria1.con.rs.getString("telefono"));
            x6.setText(joyeria1.Joyeria1.con.rs.getString("celular"));
            x7.setText(joyeria1.Joyeria1.con.rs.getString("direccion"));
            x8.setText(joyeria1.Joyeria1.con.rs.getString("nombre_usuario"));
            x9.setText(joyeria1.Joyeria1.con.rs.getString("clave_usuario"));
            c=joyeria1.Joyeria1.con.rs.getString("privilegio");
                System.out.println("Valor de Privilegio :"+c);
            if(c.equals("Admin"))
                    {
                    x10.setSelected(true);
                    }else   
                            {
                            x11.setSelected(true);
                            }
                
                        }
            
            }
        catch(SQLException ex){
        
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
                System.out.println( "Usuario Eliminado");
                joyeria1.Joyeria1.ven.Mensaje("Usuario Eliminado","Usuario");
                //obj1.cargar_(Administracion_clientes.tabla_clientes);
                

            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR al actualizar el pedido el estado" + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
   /* public void actualizar_cliente( String _nom,String _ape_pat,String _ape_mat,String _dir,String _telef,String _ciudad,String _mail,String _sex,String _estado_civil,String cod)
    {
        int n = 0;
        
        try {
            String sql="update PERSONA SET NOMBRES=?, APELLIDO_PATERNO=?,APELLIDO_MATERNO=?,DIRECCION=?,TELEFONO=?,CIUDAD=?,E_MAIL=?,SEXO=?,ESTADO_CIVIL=? WHERE RUC ="+cod+"";
            // String sql="SELECT * FROM cliente where ced_client like '%"+valor+"%'"
            //PreparedStatement pst = (PreparedStatement) cn.prepareStatement(sql);
            joyeria1.Joyeria1.con.Ejecutar(sql);


            joyeria1.Joyeria1.con.pst.setString(1, _nom);
            pst.setString(2, _ape_pat);
            pst.setString(3, _ape_mat);
            pst.setString(4, _dir);
            pst.setString(5, _telef);
            pst.setString(6, _ciudad);
            pst.setString(7, _mail);
            pst.setString(8, _sex);
            pst.setString(9, _estado_civil);
    //        pst.setString(10, _fecha);
            
            
            n = pst.executeUpdate();

            if (n > 0) {
                JOptionPane.showMessageDialog(null, "CLIENTE MODIFICADO CORRECTAMENTE", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR CLIENTE " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }        
    }

    */
}
