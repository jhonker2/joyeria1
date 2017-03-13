/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import menu_admin.Menu_Admin;
import menu_emp.Menu_Emp;

/**
 *
 * @author Guaman
 */
public class Login {
    public void Comparar(JFrame x, String Usuario, String Contraseña) {
        try {
System.out.print(Usuario+Contraseña);
            String sql = "select * from usuarios where nombre_usuario='"+Usuario+"'";
            joyeria1.Joyeria1.con.Consultar(sql);
            
            if(joyeria1.Joyeria1.con.rs.next()) {
                
            if( !Contraseña.equalsIgnoreCase(joyeria1.Joyeria1.con.rs.getString("clave_usuario")))
                   
{ JOptionPane.showMessageDialog(null, "Usuario Y Contraseña Incorrecta");   } else {
    
    if(joyeria1.Joyeria1.con.rs.getString("privilegio").equalsIgnoreCase("Admin"))
    {
        JOptionPane.showMessageDialog(null, "Bienvenido al Sistema "+Usuario.toUpperCase(),"MENSAJE",JOptionPane.INFORMATION_MESSAGE);
        Menu_Admin obj = new Menu_Admin();
        obj.setVisible(true);
        x.dispose();
    }
    else if (joyeria1.Joyeria1.con.rs.getString("privilegio").equalsIgnoreCase("Emple"))
    {
        joyeria1.Joyeria1.ven.Mensaje("Bienvenido al Sistema "+Usuario.toUpperCase(),"MENSAJE");
        Menu_Emp obj1 = new Menu_Emp();
        obj1.setVisible(true);
        x.dispose();
        
    }
    
    
    
    
}
   }} catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, "USUARIO NO EXISTE","ERROR",JOptionPane.ERROR_MESSAGE);
          JOptionPane.showMessageDialog(null, "Error en la Base de Datos" + ex.getMessage());
        }
    }
}
