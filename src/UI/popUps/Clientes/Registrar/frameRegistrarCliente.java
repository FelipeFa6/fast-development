/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.popUps.Clientes.Registrar;

import UI.main.Conexion;
import UI.main.mainFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
/**
 *
 * @author momo
 */
public class frameRegistrarCliente extends javax.swing.JFrame {

    /**
     * Creates new form frameRegistrarLibro
     */
    public frameRegistrarCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnConfirmarRegistro = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblRutCliente = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        lblRutTrabajador = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        lblCodSerial = new javax.swing.JLabel();
        lblDiasArriendo = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblRutTrabajador1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblRutTrabajador2 = new javax.swing.JLabel();
        lblRutTrabajador3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblRutTrabajador4 = new javax.swing.JLabel();
        cbxDay = new javax.swing.JComboBox<>();
        cbxMonth = new javax.swing.JComboBox<>();
        txtYear = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        cbxPrefijo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(46, 49, 49));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnConfirmarRegistro.setText("Confirmar registro");
        btnConfirmarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarRegistroActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Registrar Cliente:");

        lblRutCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRutCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblRutCliente.setText("Apellido Paterno:");

        txtApellidoP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblRutTrabajador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRutTrabajador.setForeground(new java.awt.Color(255, 255, 255));
        lblRutTrabajador.setText("Apellido Materno:");

        lblCodSerial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCodSerial.setForeground(new java.awt.Color(255, 255, 255));
        lblCodSerial.setText("RUT:");

        lblDiasArriendo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDiasArriendo.setForeground(new java.awt.Color(255, 255, 255));
        lblDiasArriendo.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblRutTrabajador1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRutTrabajador1.setForeground(new java.awt.Color(255, 255, 255));
        lblRutTrabajador1.setText("Direccion:");

        lblRutTrabajador2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRutTrabajador2.setForeground(new java.awt.Color(255, 255, 255));
        lblRutTrabajador2.setText("Telefono:");

        lblRutTrabajador3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRutTrabajador3.setForeground(new java.awt.Color(255, 255, 255));
        lblRutTrabajador3.setText("Correo electrónico:");

        lblRutTrabajador4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRutTrabajador4.setForeground(new java.awt.Color(255, 255, 255));
        lblRutTrabajador4.setText("Fecha de nacimiento:");

        cbxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un día", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbxDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDayActionPerformed(evt);
            }
        });

        cbxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un mes", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cbxMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMonthActionPerformed(evt);
            }
        });

        txtYear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtYear.setToolTipText("Ingrese el Año");
        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });

        cbxPrefijo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+56", "+591", "+55", "+57", "+593", "+596", "+51" }));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmarRegistro))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDiasArriendo)
                            .addComponent(lblCodSerial))
                        .addGap(123, 123, 123)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRutCliente)
                            .addComponent(lblRutTrabajador)
                            .addComponent(lblRutTrabajador1)
                            .addComponent(lblRutTrabajador2)
                            .addComponent(lblRutTrabajador3)
                            .addComponent(lblRutTrabajador4))
                        .addGap(51, 51, 51)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(cbxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDireccion)
                                .addComponent(txtApellidoM, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtApellidoP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                                    .addComponent(cbxPrefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtTelefono))
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTitulo)
                    .addContainerGap(198, Short.MAX_VALUE)))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodSerial)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiasArriendo)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRutCliente)
                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRutTrabajador)
                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRutTrabajador1)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRutTrabajador2)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPrefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRutTrabajador3)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblRutTrabajador4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnConfirmarRegistro))
                .addContainerGap())
            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTitulo)
                    .addContainerGap(286, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //Back to main Frame
        mainFrame mainF = new mainFrame();
        mainF.setVisible(true);
        mainF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnConfirmarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarRegistroActionPerformed

        boolean send = true;
        
        String rut = txtRut.getText();
        String nombre = txtNombre.getText();
        String apellidoP = txtApellidoP.getText();
        String apellidoM = txtApellidoM.getText();
        String direccion = txtDireccion.getText();
        String prefijo = cbxPrefijo.getSelectedItem().toString();
        String telefono = txtTelefono.getText();
        String correo = txtCorreo.getText();
        String dia = cbxDay.getSelectedItem().toString();
        String mes = cbxMonth.getSelectedItem().toString();
        String year = txtYear.getText().toString();
        
        try {
            int intFechaY = Integer.parseInt(year);
            //Current Date
            java.util.Date date = new java.util.Date();  
            SimpleDateFormat currentY = new SimpleDateFormat("yyyy"); 
            int intCurrentY = Integer.parseInt(currentY.format(date));
            
            if(intFechaY > intCurrentY){
                JOptionPane.showMessageDialog(null, "Año mal ingresado.");
                System.out.println("Año mal ingresado.");
                send = false;
            }   
            //Verificacion de cbx fecha
            if(dia.equalsIgnoreCase("Seleccione un día")){
                JOptionPane.showMessageDialog(null, "Porfavor ingrese un día.");
                System.out.println("Día ingresado incorrecto");
                send = false;
            }
            if(mes.equalsIgnoreCase("Seleccione un mes")){
                JOptionPane.showMessageDialog(null, "Porfavor ingrese un mes.");
                System.out.println("Mes ingresado incorrecto");
                send = false;
            }
            
            
            //Verificaciones de casillas INPUT
            if(rut.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Ingrese un RUT");
                System.out.println("RUT no ingresado");
                send = false;
            }
            if(nombre.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Ingrese un Nombre");
                System.out.println("Nombre no ingresado");
                send = false;
            }
            if(apellidoP.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Ingrese un Apellido Paterno");
                System.out.println("Apellido Paterno no ingresado");
                send = false;
            }
            if(apellidoM.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Ingrese un Apellido Materno");
                System.out.println("Apellido Materno no ingresado");
                send = false;
            }
            if(direccion.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Ingrese una Direccion");
                System.out.println("Direccion no ingresada");
                send = false;
            }
            if(telefono.equalsIgnoreCase("") || telefono.length() != 9){
                JOptionPane.showMessageDialog(null, "Ingrese un número de 9 dígitos.");
                System.out.println("Telefono ingresado incorrectamente.");
                send = false;
            }
            if(correo.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Ingrese un correo electrónico");
                System.out.println("Correo Electrónico ingresado incorrectamente.");
                send = false;
            }
            
            
            //Conexion a BDD
            System.out.println(send);
            if(send){
                String tel = prefijo + telefono;    //CONCATENACION DEL PREFIJO Y EL TELEFONO INGRESADO
                String fechaNacimiento  =  year + "-" + mes + "-" + dia ;
                
                Date sqlDate = Date.valueOf(fechaNacimiento); //Cast to SQLDate
                System.out.println("3");
                
                //Datos cargados del input
                System.out.println("");
                System.out.println("-------------");
                System.out.println("DATOS CARGADOS:");
                System.out.println("-------------");
                System.out.println("RUT Cliente: " + rut);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido Paterno: " + apellidoP);
                System.out.println("Apellido Materno: " + apellidoM);
                System.out.println("Direccion: " + direccion);
                System.out.println("telefono: " + tel); //OJO ACA QUE NO SON LAS PRIMERAS VARIABLES, ES UNA CONCATENACION
                System.out.println("Correo electronico: " + correo);
                System.out.println("Fecha de Nacimiento: " + fechaNacimiento);

                String query = " INSERT INTO CLIENTE(RUT_CLIENTE, NOMBRE, APELLIDO_PATERNO, APELLIDO_MATERNO, DIRECCION,"
                    + "TELEFONO, CORREO, FECHA_NACIMIENTO)"
                    + " values(?, ?, ?, ?, ?, ?, ?, ?)";
                
                
                try {
                    Conexion conector = new Conexion();
                    Connection conn = conector.conectar();
                    //Prepared Statement
                    PreparedStatement preparedStmt = conn.prepareStatement(query);
                    preparedStmt.setString(1, rut);
                    preparedStmt.setString(2, nombre);
                    preparedStmt.setString(3, apellidoP);
                    preparedStmt.setString(4, apellidoM);
                    preparedStmt.setString(5, direccion);
                    preparedStmt.setString(6, tel);
                    preparedStmt.setString(7, correo);
                    preparedStmt.setDate(8, sqlDate);

                    preparedStmt.execute();
                    conn.close();
                    preparedStmt.close();
                    JOptionPane.showMessageDialog(null, "Acción realizada con exito.");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Fatal ERROR.");
                    System.out.println("------------------");
                    System.out.println("Got an Exception");
                    System.out.println("ERROR: " + e.toString());
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Casillas mal rellenadas.");
                System.out.println("------------------------");
                System.out.println("Casillas mal rellenadas");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fatal ERROR.");
            System.out.println("ERROR: " + e.toString());
        }
    }//GEN-LAST:event_btnConfirmarRegistroActionPerformed

    private void cbxDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDayActionPerformed

    private void cbxMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMonthActionPerformed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frameRegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameRegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameRegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameRegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>;
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameRegistrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnConfirmarRegistro;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxDay;
    private javax.swing.JComboBox<String> cbxMonth;
    private javax.swing.JComboBox<String> cbxPrefijo;
    private javax.swing.JLabel lblCodSerial;
    private javax.swing.JLabel lblDiasArriendo;
    private javax.swing.JLabel lblRutCliente;
    private javax.swing.JLabel lblRutTrabajador;
    private javax.swing.JLabel lblRutTrabajador1;
    private javax.swing.JLabel lblRutTrabajador2;
    private javax.swing.JLabel lblRutTrabajador3;
    private javax.swing.JLabel lblRutTrabajador4;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}