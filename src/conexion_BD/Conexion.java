/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {

    protected Connection miConexion;

    public boolean conectar(String conector, String Base, String Usuario, String Clave) {
        try {
            Class.forName(conector);
            miConexion = DriverManager.getConnection(Base, Usuario, Clave);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            return false;
        }
    }

    public void cerrar() {
        try {
            miConexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
