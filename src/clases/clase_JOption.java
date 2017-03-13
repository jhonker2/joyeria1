/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Guaman
 */
public class clase_JOption {
    
    public  void Mensaje_Error(String message, String title) {
   JOptionPane pane = new JOptionPane(message, JOptionPane.ERROR_MESSAGE);
   JDialog dialog = pane.createDialog(title);
   dialog.setAlwaysOnTop(true);
   dialog.setVisible(true);
}
    public  void Mensaje(String message, String title) {
   JOptionPane pane = new JOptionPane(message, JOptionPane.INFORMATION_MESSAGE);
   JDialog dialog = pane.createDialog(title);
   dialog.setAlwaysOnTop(true);
   dialog.setVisible(true);
}
    
     public void Mensaje_warning(String message, String title) {
   JOptionPane pane = new JOptionPane(message, JOptionPane.WARNING_MESSAGE);
   JDialog dialog = pane.createDialog(title);
   dialog.setAlwaysOnTop(true);
   dialog.setVisible(true);
}
     
    public void Mensaje_confirmar(String message, String title) {
   JOptionPane pane = new JOptionPane(message, JOptionPane.YES_NO_OPTION);
   JDialog dialog = pane.createDialog(title);
   dialog.setAlwaysOnTop(true);
   dialog.setVisible(true);
}
    
}
