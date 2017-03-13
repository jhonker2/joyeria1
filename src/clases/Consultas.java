/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import conexion_BD.conectar;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import menu_admin.Menu_Admin;
import pedidos.Celda_textArea;
import pedidos.Render_textArea;

/**
 *
 * @author Guaman
 */
public class Consultas {
    //Connection cn = cc.conexion();
    conectar cc=new conectar();
    Connection cn = cc.conexion();
    DefaultTableModel model;
            clase_JOption ven = new clase_JOption();

    public static void centrar(JInternalFrame obj){
 Dimension dimension_es = Menu_Admin.Escritorio.getSize();
 Dimension dimension_form = obj.getSize();
 obj.setLocation((dimension_es.width - dimension_form.width)/2,
 (dimension_es.height- dimension_form.height)/2);
}
    public static boolean  estacerrado(Object obj){
        JInternalFrame[] activos = Menu_Admin.Escritorio.getAllFrames();
        boolean cerrado=true;
        int i=0;
        while (i < activos.length && cerrado){
            if(activos[i]==obj){
		cerrado=false;
            }
            i++;
        }
    return cerrado;
    }
    
    public String fechaactual(){
    Date fecha= new Date();
    SimpleDateFormat formatofecha= new SimpleDateFormat("d/MM/yyyy");
    return formatofecha.format(fecha);
}

    public String buscar_empresa()
    {
    String c="";
    String sql="select nombre_empresa from empresas";
        try {
            joyeria1.Joyeria1.con.Consultar(sql);
            if(joyeria1.Joyeria1.con.rs.next())
            {              
                c=joyeria1.Joyeria1.con.rs.getString("nombre_empresa");
            }           
            System.out.println(c);
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            return c;
    }
    
    public String buscar_cliente(String codigo){
        String c="";
        String sql="select cedula from pedidos where codigo_pedido="+codigo;
        try {
            joyeria1.Joyeria1.con.Consultar(sql);
            if(joyeria1.Joyeria1.con.rs.next())
            {              
                c=joyeria1.Joyeria1.con.rs.getString("cedula");
            }           
            System.out.println(c);
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            return c;
    }
    
    public void cargar_pedido(String valor, JTable x ){
    String [] titulos={"CODIGO","CLIENTE","PRECIO","PEDIDO","ABONO","TOTAL","FECHA ENTREGA","HORA"};
    String [] registros= new String [8];
    String sql="select codigo_pedido, CONCAT(personas.nombres,' ',personas.ape_pat)AS nombre_cli,pedidos.precio,pedidos.pedido,pedidos.abono,pedidos.total,pedidos.fecha_entrega,pedidos.hora_entrega from personas,clientes,pedidos where personas.cedula=clientes.cedula AND   personas.cedula=pedidos.cedula AND pedidos.estado='No entregado' AND pedidos.fecha_entrega='"+valor+"'"; 
    model= new DefaultTableModel(null,titulos);
        try {
             joyeria1.Joyeria1.con.Consultar(sql);
            while (joyeria1.Joyeria1.con.rs.next()){
            registros[0]=joyeria1.Joyeria1.con.rs.getString("codigo_pedido");
            registros[1]=joyeria1.Joyeria1.con.rs.getString("nombre_cli");
            registros[2]=joyeria1.Joyeria1.con.rs.getString("precio");
            registros[3]=joyeria1.Joyeria1.con.rs.getString("pedido");
            registros[4]=joyeria1.Joyeria1.con.rs.getString("abono");
            registros[5]=joyeria1.Joyeria1.con.rs.getString("total");
            registros[6]=joyeria1.Joyeria1.con.rs.getString("fecha_entrega");
            registros[7]=joyeria1.Joyeria1.con.rs.getString("hora_entrega");
            
            model.addRow(registros);
                } x.setModel(model);
                Render_textArea formato = new Render_textArea();
                     x.setRowHeight(70);
                //x.getColumnModel().getColumn( 2 ).setCellEditor( new Celda_textArea() );
                x.getColumnModel().getColumn(3).setCellRenderer(formato);
                //x.getColumnModel().getColumn(0).setPreferredWidth(30);
                x.getColumnModel().getColumn(1).setPreferredWidth(6);
               
                
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void llenarMaestros(JComboBox servicio) {

String sql = "select personas.nombres from personas,maestros where personas.cedula = maestros.cedula"; //Declaracion de la variable String "cadena de caracteres" que almacena la consulta a vendedores
servicio.addItem("Seleccione al Maestro");

        try {
            joyeria1.Joyeria1.con.Consultar(sql);
                    while (joyeria1.Joyeria1.con.rs.next()) {
                        servicio.addItem(joyeria1.Joyeria1.con.rs.getString("nombres"));
                        }//fin del while
                    joyeria1.Joyeria1.con.rs.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al llenar el combo " + e.getMessage());
                                   }
}//FIN DE LA FUNCION LLENAR GRUPOS
    
    public String buscar_cedula(String valor)
    {
    String c="";
    String sql="select maestros.cedula from maestros,personas where personas.nombres ='"+valor+"'";
        try {
            joyeria1.Joyeria1.con.Consultar(sql);
            if(joyeria1.Joyeria1.con.rs.next())
            {              
                c=joyeria1.Joyeria1.con.rs.getString("cedula");
            }           
            System.out.println(c);
        } catch (SQLException ex) {
           
        }
            
            return c;
    }
    
    public void agregarAbono(Double abono, String codigo, Double saldo){
        int n = 0;
        
        try {
            String sql="update pedidos set abono=abono+?, total=? WHERE codigo_pedido="+codigo+"";
            // String sql="SELECT * FROM cliente where ced_client like '%"+valor+"%'"
            PreparedStatement pst = (PreparedStatement) cn.prepareStatement(sql);
            pst.setDouble(1, abono);            
            pst.setDouble(2, saldo);

            n = pst.executeUpdate();

            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Abono registrado", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR al guardar el abono " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    
    }

}
