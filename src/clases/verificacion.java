/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import Login.Inicio;
import Usuarios.new_usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nueva_empresa.new_empresa;

/**
 *
 * @author Guaman
 */
public class verificacion {

    public static void existe_empresa()
     {
        String c="";
        boolean existe=true;
        boolean existe1=true;
         String SQL="select nombre_empresa from empresas";
         String SQL2="select privilegio from usuarios where privilegio='Admin'";
       try {
           joyeria1.Joyeria1.con.Consultar(SQL);
            if(joyeria1.Joyeria1.con.rs.next())
            {              
                existe=joyeria1.Joyeria1.con.ExisteRegistro();
            }           
             System.out.println(existe);
            
            joyeria1.Joyeria1.con.Consultar(SQL2);
            if(joyeria1.Joyeria1.con.rs.next())
            {              
                existe1=joyeria1.Joyeria1.con.ExisteRegistro();
            }           
             System.out.println(existe1);
       
            if(existe==false || existe1 ==false)
                        {
                System.out.println("Empresa existe :) " +c);
                Inicio ini= new Inicio();
                ini.setVisible(true);
                ini.setLocationRelativeTo(null);
            }
            if(existe==true){
                System.out.println(" Empresa no existe "+c );
                JOptionPane.showMessageDialog(null,"Debe Configurar los datos \n  de la Empresa");
                new_empresa emp= new new_empresa();
                emp.setVisible(true);
                emp.setLocationRelativeTo(null);
                }
            if(existe1==true){
                System.out.println(" Administrador no existe "+c );
                JOptionPane.showMessageDialog(null,"Debe Configurar los datos \n  del Administrador");
                new_usuario usu= new new_usuario();
                usu.setVisible(true);
                usu.setLocationRelativeTo(null);
                }
        } catch (SQLException ex) {
           Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    

}

