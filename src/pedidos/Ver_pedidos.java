/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import Factura.Facturar;
import static Factura.Facturar.lb_abono;
import static Factura.Facturar.lb_total;
import static Factura.Facturar.tabla_detalle;
import Pagos.Pagos;
import clases.Consultas;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static menu_admin.Menu_Admin.Escritorio;

/**
 *
 * @author Guaman
 */
public class Ver_pedidos extends javax.swing.JInternalFrame {
 Consultas obj = new Consultas();
 private Pagos pagos;
 private Facturar fact;
    /**
     * Creates new form new_pedidos
     */
    public Ver_pedidos() {
        initComponents();
        Date fecha= jCalendar1.getDate();
SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        obj.cargar_pedido(formato1.format(fecha), tabla_pedido);
    }

    public static double Redondear(double numero,int digitos)
{
      int cifras=(int) Math.pow(10,digitos);
      return Math.rint(numero*cifras)/cifras;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Opciones = new javax.swing.JPopupMenu();
        Abonar = new javax.swing.JMenuItem();
        Facturar = new javax.swing.JMenuItem();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_pedido = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lb_fecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_entregar = new javax.swing.JButton();

        Abonar.setText("Abonar");
        Abonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbonarActionPerformed(evt);
            }
        });
        Opciones.add(Abonar);

        Facturar.setText("Facturar");
        Opciones.add(Facturar);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pedidos");

        jCalendar1.setDecorationBackgroundColor(new java.awt.Color(153, 255, 153));
        jCalendar1.setSundayForeground(new java.awt.Color(255, 0, 0));
        jCalendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendar1PropertyChange(evt);
            }
        });

        tabla_pedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Pedido", "Precio", "Abonos", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_pedido.setComponentPopupMenu(Opciones);
        tabla_pedido.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla_pedido);
        if (tabla_pedido.getColumnModel().getColumnCount() > 0) {
            tabla_pedido.getColumnModel().getColumn(2).setMinWidth(10);
            tabla_pedido.getColumnModel().getColumn(2).setPreferredWidth(10);
            tabla_pedido.getColumnModel().getColumn(2).setMaxWidth(10);
        }

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jLabel1.setText("Pedidos de :");

        lb_fecha.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        lb_fecha.setText("dd/mm/yyyy");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jLabel3.setText("Calendario:");

        btn_entregar.setText("Entregar Pedido");
        btn_entregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 716, Short.MAX_VALUE)
                        .addComponent(btn_entregar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_entregar)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar1PropertyChange
Date fecha= jCalendar1.getDate();
SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
lb_fecha.setText(formato.format(fecha));
obj.cargar_pedido(formato.format(fecha), tabla_pedido);
    }//GEN-LAST:event_jCalendar1PropertyChange

    private void AbonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbonarActionPerformed

         if(Consultas.estacerrado(pagos)){
            int  fila = tabla_pedido.getSelectedRow();
            if(fila==-1)
                {
                JOptionPane.showMessageDialog(null, "No  ha seleccionado ningun registro");
                }
                else
                {
            
                int codigo=Integer.parseInt(tabla_pedido.getValueAt(fila, 0).toString());
                pagos.id_cliente=codigo;
                
                    System.err.println(codigo);
                this.dispose();
                pagos = new Pagos();
            Escritorio.add(pagos);
            Consultas.centrar(pagos);
            pagos.show();
            pagos.codigo2.setText(String.valueOf(codigo));
          }
            
            
             }else{
            JOptionPane.showMessageDialog(this," La ventana Pagos ya esta abierta ","Sistema",JOptionPane.INFORMATION_MESSAGE);
        }   
    }//GEN-LAST:event_AbonarActionPerformed

    private void btn_entregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entregarActionPerformed
         
        int  fila = tabla_pedido.getSelectedRow();
        String[]  dato=new String[3];
            if(fila==-1)
                {
                JOptionPane.showMessageDialog(null, "No  ha seleccionado ningun registro");
                }
                else
                {
                    int seleccion = JOptionPane.showOptionDialog(this, // Componente padre
                    "¿Esta seguro de Entregar este Pedido?", //Mensaje
                        "Seleccione una opción", // Título
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,    // null para icono por defecto.
                        new Object[] { "Si", "No"},    // null para YES, NO y CANCEL
                      "Si");

                    if (seleccion != -1)
                    {
                        if((seleccion + 1)==1)
                            {// PRESIONO SI
                                int codigo=Integer.parseInt(tabla_pedido.getValueAt(fila, 0).toString());
                                fact.codigo_pedido=codigo;
                                String precio=tabla_pedido.getValueAt(fila, 2).toString();
                                String pedido=tabla_pedido.getValueAt(fila, 3).toString();
                                double abono =Double.parseDouble(tabla_pedido.getValueAt(fila, 4).toString());
                                double total =Double.parseDouble(tabla_pedido.getValueAt(fila, 5).toString());
                                
                                this.dispose();
                                fact = new Facturar();
                                Escritorio.add(fact);
                                Consultas.centrar(fact);
                                fact.show();
                                DefaultTableModel tabladet = (DefaultTableModel)tabla_detalle.getModel();

                                dato[0]=pedido;
                                dato[1]=precio;
                                tabladet.addRow(dato);
                                tabla_detalle.setModel(tabladet);
                                lb_abono.setText(String.valueOf(Redondear(abono,3)));
                                lb_total.setText(String.valueOf(Redondear(total, 3)));
                                
                            }
                            else{
                            
                            }
                    }
                }
    }//GEN-LAST:event_btn_entregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abonar;
    private javax.swing.JMenuItem Facturar;
    private javax.swing.JPopupMenu Opciones;
    private javax.swing.JButton btn_entregar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_fecha;
    private javax.swing.JTable tabla_pedido;
    // End of variables declaration//GEN-END:variables
}