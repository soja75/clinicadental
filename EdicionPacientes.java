/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Consultorio.Paciente;
import Consultorio.Consultorio;
import javax.swing.DefaultListModel;
import java.io.Serializable;
import javax.swing.ListModel;
/**
 *
 * @author emilio
 */
public class EdicionPacientes extends javax.swing.JFrame {

    /**
     * Creates new form EdicionPacientes
     */
    public EdicionPacientes() {
        initComponents();
        clean();  
        jScrollPane1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        loadName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        loadDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        loadBornDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        loadDomicilio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        loadPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        loadEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        loadBarrio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        loadLocalidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        loadTrabajo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        loadJerarquia = new javax.swing.JTextField();
        loadBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        consolatxt = new javax.swing.JTextArea();
        deleteBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listPacientes = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 150));

        jLabel1.setText("Nombre y Apellido");

        loadName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadNameActionPerformed(evt);
            }
        });

        jLabel2.setText("DNI");

        loadDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadDniActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha de Nacimiento");

        loadBornDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBornDateActionPerformed(evt);
            }
        });

        jLabel4.setText("Domicilio");

        loadDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadDomicilioActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefono");

        loadPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadPhoneActionPerformed(evt);
            }
        });

        jLabel6.setText("E-Mail");

        jLabel7.setText("Barrio");

        jLabel8.setText("Localidad");

        loadLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadLocalidadActionPerformed(evt);
            }
        });

        jLabel9.setText("Lugar de Trabajo");

        jLabel10.setText("Jerarquia");

        loadBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save-icon.png"))); // NOI18N
        loadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtnActionPerformed(evt);
            }
        });

        consolatxt.setColumns(20);
        consolatxt.setRows(5);
        jScrollPane1.setViewportView(consolatxt);

        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/trash-icon.png"))); // NOI18N
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        listPacientes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listPacientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listPacientesValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listPacientes);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/back-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(loadDni)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loadBornDate)
                            .addComponent(jLabel4)
                            .addComponent(loadDomicilio)
                            .addComponent(jLabel5)
                            .addComponent(loadPhone)
                            .addComponent(loadName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(loadEmail)
                            .addComponent(jLabel7)
                            .addComponent(loadBarrio)
                            .addComponent(jLabel8)
                            .addComponent(loadLocalidad)
                            .addComponent(jLabel9)
                            .addComponent(loadTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addComponent(loadJerarquia))
                        .addGap(18, 18, 18)
                        .addComponent(loadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 9, Short.MAX_VALUE))))
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loadName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loadDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loadBornDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loadDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loadPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadJerarquia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(loadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadNameActionPerformed

    private void loadDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadDniActionPerformed

    private void loadBornDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBornDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadBornDateActionPerformed

    private void loadDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadDomicilioActionPerformed

    private void loadPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadPhoneActionPerformed

    private void loadLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadLocalidadActionPerformed

    private void loadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtnActionPerformed
        String nombre;
        int DNI=0;
        String nacimiento;
        String domicilio;
        int telefono=0;
        String email;
        String barrio;
        String localidad;
        String lugardetrabajo;
        String jerarquia;
        int edad=0;
        String errores = "";
        jScrollPane1.setVisible(true);
        try {
            DNI = Integer.parseInt(this.loadDni.getText());
        } catch (Exception ex) {
             errores+= "DNI debe ser un número.\n";
        }
        
        try {
            telefono = Integer.parseInt(this.loadPhone.getText());
        } catch (Exception ex) {
             errores+= "Telefono debe tener menos de 10 digitos.\n";
        }
        
        nombre = this.loadName.getText();
        if (nombre.length()==0){
            errores += "Debe ingresar un nombre\n";
        }
        
        nacimiento=this.loadBornDate.getText();
        
        
        
        domicilio=this.loadDomicilio.getText();
        
        email=this.loadEmail.getText();
        
        barrio=this.loadBarrio.getText();
        
        localidad=this.loadLocalidad.getText();
        
        lugardetrabajo=this.loadTrabajo.getText();
        
        jerarquia=this.loadJerarquia.getText();
        
        if (errores.length()>0){
            consolatxt.setText(errores);
            return;
        }else{
            Paciente aux = new Paciente(nombre,DNI,edad,nacimiento,domicilio,barrio,localidad,telefono,lugardetrabajo,jerarquia,email);
            aux.calcularEdad(aux.nacimiento);
            Consultorio.addPaciente(aux);
            clean();
        }
        
        
        
        
        
        
    }//GEN-LAST:event_loadBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
       ListModel<Paciente> a = this.listPacientes.getModel();
       Paciente b = a.getElementAt(this.listPacientes.getAnchorSelectionIndex());
       Consultorio.delete(b);
       clean();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void listPacientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listPacientesValueChanged

    }//GEN-LAST:event_listPacientesValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        inicio v1 =new inicio();
        v1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EdicionPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdicionPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdicionPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdicionPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EdicionPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea consolatxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList listPacientes;
    private javax.swing.JTextField loadBarrio;
    private javax.swing.JTextField loadBornDate;
    private javax.swing.JButton loadBtn;
    private javax.swing.JTextField loadDni;
    private javax.swing.JTextField loadDomicilio;
    private javax.swing.JTextField loadEmail;
    private javax.swing.JTextField loadJerarquia;
    private javax.swing.JTextField loadLocalidad;
    private javax.swing.JTextField loadName;
    private javax.swing.JTextField loadPhone;
    private javax.swing.JTextField loadTrabajo;
    // End of variables declaration//GEN-END:variables

private void clean() {
        Consultorio.load();
        this.loadName.setText("");
        this.loadDni.setText("");
        this.loadPhone.setText("");
        this.loadBornDate.setText("");
        this.loadDomicilio.setText("");
        this.loadJerarquia.setText("");
        this.loadBarrio.setText("");
        this.loadLocalidad.setText("");
        this.loadEmail.setText("");
        this.loadTrabajo.setText("");
        load();

    }
private void load() {

        DefaultListModel model = new DefaultListModel();
        for (Paciente paciente : Consultorio.getPaciente()) {
            model.addElement(paciente);
        }

        listPacientes.setModel(model);

    }
}
