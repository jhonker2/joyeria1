/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joyeria1;
import Login.Inicio;
import clases.clase_JOption;
import clases.conexion;
import clases.verificacion;
import de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import nueva_empresa.new_empresa;
/**
 *
 * @author Guaman
 */
public class Joyeria1 {

    /**
     * @param args the command line arguments
     */
    public static conexion con = new conexion();
    public static clase_JOption ven = new clase_JOption();
       //verificacion obj = new verificacion();
    public static void main(String[] args) {
        // TODO code application logic here\
                 try
        {
           UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel());
        } catch (Exception ex)
        {
            javax.swing.JOptionPane.showMessageDialog(null, "Error en look & feel: " + ex.getMessage());
        }
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {

            public void run()
            {
            con.conectar();
            verificacion.existe_empresa();
            //verificacion.existe_adminsitrador();
            
            }
        });
       
       
    }
    
}
