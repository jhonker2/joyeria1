

package pedidos;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;
/**
 *
 * @author Guaman
 */
public class Render_textArea extends JTextArea implements TableCellRenderer {

   // private JComponent component = new JTextArea();

    /** Constructor de clase 
    public Render_textArea() {
        setLineWrap(true);
        setOpaque(true);
        setWrapStyleWord(true);
        
    }
*/
    @Override
  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) 
  {
        
       
      //Color de fondo de la celda
      //( (JTextArea) component).setBackground( new Color(242, 243, 244) );
      //obtiene valor boolean y coloca valor en el JCheckBox
//      String b = value.toString();
  //    ( (JTextArea) component).setText(b );
    //  ((JTextArea) component).setLineWrap(true);
      //setText(value.toString());
      //setToolTipText((String)value);
       //setText((String)value);
        setToolTipText((String)value);
           this.setText(value.toString());
        this.setWrapStyleWord(true);                    
        this.setLineWrap(true);   
        System.out.println(value.toString());
        // current table column width in pixels
        int colWidth = table.getColumnModel().getColumn(column).getWidth();
        // set the text area width (height doesn't matter here)
        setSize(new Dimension(colWidth, 1)); 
 
        // get the text area preferred height and add the row margin
        int height = getPreferredSize().height + table.getRowMargin();
        // ensure the row height fits the cell with most lines
        if (height != table.getRowHeight(row)) {
            table.setRowHeight(row, height);
          // rowHeight = height;
        }
        return this;
       
  }

}
