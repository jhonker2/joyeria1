

package pedidos;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.*;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
/**
 *
 * @author Guaman
 */
public class Celda_textArea extends DefaultCellEditor implements TableCellRenderer{
private JComponent component = new JTextArea();
    private String value = ""; // valor de la celda

    public Celda_textArea(JTextField textField) {
        super(textField);
    }


    /** Constructor de clase 
    public Celda_textArea() {
       new JTextArea();
    }
*/
    /** retorna valor de celda */
    @Override
    public Object getCellEditorValue() {
        return ((JTextArea)component);        
    }

    /** Segun el valor de la celda selecciona/deseleciona el JCheckBox */
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        //Color de fondo en modo edicion
        ( (JTextArea) component).setBackground( new Color(200,200,0) );
        //obtiene valor de celda y coloca en el JCheckBox
        
        return ( (JTextArea) component);     
    }

    /** cuando termina la manipulacion de la celda */
    @Override
    public boolean stopCellEditing() {        
        value = String.valueOf((JTextArea)component);
        return super.stopCellEditing();
    }

    /** retorna componente */
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
         if (value == null)
            return null;         
         return ( (JTextArea) component );
    }

}
