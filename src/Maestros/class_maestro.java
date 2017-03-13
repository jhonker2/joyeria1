/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maestros;

import clases.Validacion;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhonker2
 */
public class class_maestro {
    DefaultTableModel model;
            Validacion obj1 =new Validacion();
    
     public void cargar_Maestros( JTable x ){
    String [] titulos={"CEDULA","NOMBRES Y APELLIDO ","TELEFONO","CELULAR"};
    String [] registros= new String [4];
        String sql="select maestros.cedula, CONCAT(personas.nombres,' ',personas.ape_pat)AS nombre_maestro,personas.telefono,personas.celular from maestros, personas\n" +
                    "where personas.cedula = maestros.cedula;";
    model= new DefaultTableModel(null,titulos);
        try {
            joyeria1.Joyeria1.con.Consultar(sql);
            while (joyeria1.Joyeria1.con.rs.next()){
            registros[0]=joyeria1.Joyeria1.con.rs.getString("cedula");
            registros[1]=joyeria1.Joyeria1.con.rs.getString("nombre_maestro");
            registros[2]=joyeria1.Joyeria1.con.rs.getString("telefono");
            registros[3]=joyeria1.Joyeria1.con.rs.getString("celular");
            
            model.addRow(registros);
                } x.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}
