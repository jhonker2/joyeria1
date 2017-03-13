/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.sql.*;
/**
 *
 * @author meow
 */
public class conexion {
    private String user;
    private String password;
    private String db;
    private String host;
    private String url;
    private Connection conn = null;
    public static ResultSet rs;
    public Statement stm;
    private  CallableStatement stmt;
   
    public conexion(String usuario, String contrasena, String bd, String servidor) {
            this.user = usuario;
            this.password = contrasena;
            this.db = bd;
            this.host = servidor;
            this.url = "jdbc:mysql://" + this.host + "/" + this.db;
        }

    public conexion() {
            this.user = "root";
            this.password = "";
            this.db = "joyerias";
            this.host = "127.0.0.1:3306";
            this.url = "jdbc:mysql://" + this.host + "/" + this.db;
        }
     public String getDb() {
        return db;
        }

    public Connection conectar() {
        try {   Class.forName("org.gjt.mm.mysql.Driver");
               //Class.forName("com.mysql.jdbc.Driver" );
                conn = DriverManager.getConnection(url, user, password);
                if (conn != null){
                        System.out.println("Conexion a base de datos "+url+" ... Ok");
                        stm = conn.createStatement();
                    }
            }
        catch(SQLException ex) {
                System.out.println("Hubo un problema al intentar conectarse con la base de datos "+url);
                System.out.println(ex.getMessage());
            }
        catch(ClassNotFoundException ex) {
                System.out.println(ex);
            }
        return conn;
        }

    public void Consultar(String strSQL ) throws SQLException {
          rs= stm.executeQuery(strSQL);
    }

    public boolean ExisteRegistro()  throws SQLException {
        while(rs.next()) {
            return true;
            }
        return false;
    }

    public String ExtraeDato ( String colNombre )  throws SQLException {
        return rs.getString(colNombre);
    }

    public void Ejecutar(String SQLstr ) throws SQLException{
        stm.execute(SQLstr);
        }           
}
