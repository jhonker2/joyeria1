package conexion_BD;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author JJR
 */

public class conectar {
Connection conect = null;
   public Connection conexion()
    {
      try {
             
           //Cargamos el Driver MySQL
           Class.forName("org.gjt.mm.mysql.Driver");
           conect = DriverManager.getConnection("jdbc:mysql://localhost/joyerias","root","");
           //JOptionPane.showMessageDialog(null, "CONECCION EXITOSA");
           //Cargamos el Driver Access
           //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           //Conectar en red base 
           //String strConect = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);DBQ=//servidor/bd_cw/cw.mdb";
           //Conectar Localmente
           //String strConect = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);DBQ=D:/cwnetbeans/cw.mdb";
          //conect = DriverManager.getConnection(strConect,"",""); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error "+e);
        }
        return conect;
     
}}
