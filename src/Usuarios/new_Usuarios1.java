/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author Guaman
 */

import static Usuarios.admin_usuario.tabla_usuarios;
import clases.Registro_Base;
import clases.Validacion;
import java.awt.Color;
import javax.swing.JOptionPane;

public class new_Usuarios1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form new_Usuarios1
     */
    Validacion obj = new Validacion();
    Class_Usuario cargar = new Class_Usuario();

    public new_Usuarios1() {
        initComponents();
    }
  void limpiar()
    {
    txt_cedula.setText("");
   
    txt_nombres.setText("");
    txt_apePa.setText("");
     txt_apeMat.setText("");
     txt_telefono.setText("");
     txt_celular.setText("");
     txt_direccion.setText("");
     txt_nombre_usu.setText("");
     txt_pass.setText("");
     rb_admin.setSelected(true);
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txt_pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rb_admin = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rb_emplea = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_apePa = new javax.swing.JTextField();
        txt_apeMat = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_celular = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_nombre_usu = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();

        setClosable(true);

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel1.setText("Cedula:");

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel11.setText("Privilegio:");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel2.setText("Nombres:");

        rb_admin.setText("Administrador");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel3.setText("Apellido Paterno:");

        rb_emplea.setText("Empleado");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel4.setText("Apellido Materno:");

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel5.setText("Telefono:");

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel6.setText("Celular:");

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel7.setText("Dirección");

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel8.setText("Nombre Usuario:");

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel9.setText("Contraseña:");

        jLabel10.setFont(new java.awt.Font("Shruti", 0, 18)); // NOI18N
        jLabel10.setText("Datos de Usuarios");

        txt_cedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cedulaFocusLost(evt);
            }
        });

        txt_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombresKeyTyped(evt);
            }
        });

        txt_apePa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apePaKeyTyped(evt);
            }
        });

        txt_apeMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apeMatKeyTyped(evt);
            }
        });

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });

        txt_celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_celularKeyTyped(evt);
            }
        });

        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txt_apeMat))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_apePa))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(76, 76, 76)
                                .addComponent(txt_telefono))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(85, 85, 85)
                                .addComponent(txt_celular))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(77, 77, 77)
                                .addComponent(txt_direccion))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel2))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombres)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_registrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cancelar)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombre_usu)
                                    .addComponent(txt_pass)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_admin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rb_emplea)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel10))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_apePa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_apeMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_nombre_usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(rb_admin)
                    .addComponent(rb_emplea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_cedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cedulaFocusLost
        if(txt_cedula.getText().equals("")){
            //JOptionPane.showMessageDialog(null, "Aviso: el campo está vacío!");
        }else{
            if(Validacion.esCedulaValida(txt_cedula.getText())){
                txt_cedula.setBackground(Color.WHITE);
            }else{
                txt_cedula.setBackground(Color.getHSBColor(255,153,153));
                JOptionPane.showMessageDialog(null, "Error:  La cédula ingresada es incorrecta","Super Barato",JOptionPane.ERROR_MESSAGE);
                txt_cedula.setText("");
                txt_cedula.requestFocus();
            }          }
    }//GEN-LAST:event_txt_cedulaFocusLost

    private void txt_nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombresKeyTyped
        obj.sololetras(evt);
    }//GEN-LAST:event_txt_nombresKeyTyped

    private void txt_apePaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apePaKeyTyped
        obj.sololetras(evt);
    }//GEN-LAST:event_txt_apePaKeyTyped

    private void txt_apeMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apeMatKeyTyped
        obj.sololetras(evt);
    }//GEN-LAST:event_txt_apeMatKeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        obj.solotelefonos(evt,txt_telefono.getText());
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_celularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_celularKeyTyped
        obj.solocedulasycelular(evt, txt_celular.getText());
    }//GEN-LAST:event_txt_celularKeyTyped
Registro_Base insertar_registro = new Registro_Base();
    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        if(txt_cedula.getText().isEmpty() || txt_nombres.getText().isEmpty()||txt_apePa.getText().isEmpty()||txt_apeMat.getText().isEmpty())
        {joyeria1.Joyeria1.ven.Mensaje_Error("Por favor Complete los campos Vacios","Campos Vacios");
        }else{
            Object [] datos = new Object[8];
            datos[0]=txt_cedula.getText();
            datos[1]=txt_nombres.getText();
            datos[2]=txt_apePa.getText();
            datos[3]=txt_apeMat.getText();
            datos[4]=txt_telefono.getText();
            datos[5]=txt_celular.getText();
            datos[6]=txt_direccion.getText();
            datos[7]=1;
            Object [] campos = new Object[8];
            campos[0]="cedula";
            campos[1]="nombres";
            campos[2]="ape_pat";
            campos[3]="ape_mat";
            campos[4]="telefono";
            campos[5]="celular";
            campos[6]="direccion";
            campos[7]="estado";
            insertar_registro.InsertaRegistro("personas",campos,datos);
            String clave= String.valueOf(txt_pass.getPassword());
            System.out.println(clave);
            Object[] datosusu = new Object[4];
            datosusu[0]=txt_cedula.getText();
            datosusu[1]=txt_nombre_usu.getText();
            datosusu[2]=clave;
            if(rb_admin.isSelected())
            {
                datosusu[3]="Admin";
            }
            else
            {
                datosusu[3]="Emple";
            }
            Object[] camposusu= new Object[4];
            camposusu[0]="cedula";
            camposusu[1]="nombre_usuario";
            camposusu[2]="clave_usuario";
            camposusu[3]="privilegio";
            insertar_registro.InsertaRegistro("usuarios",camposusu,datosusu);
            joyeria1.Joyeria1.ven.Mensaje("Usuario Registrado","Registro");
            limpiar();
            dispose();
            cargar.cargar_Usuarios(tabla_usuarios);
        }
    }//GEN-LAST:event_btn_registrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rb_admin;
    private javax.swing.JRadioButton rb_emplea;
    private javax.swing.JTextField txt_apeMat;
    private javax.swing.JTextField txt_apePa;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre_usu;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
