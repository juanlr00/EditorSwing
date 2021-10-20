/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.swingeditor;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Juan Lamas Rubio
 */
public class Principal1 extends javax.swing.JFrame {

    /**
     * Creates new form Principal1
     */
    public Principal1() {
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

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BarraMenu = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        Abrir = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        Fuente = new javax.swing.JMenu();
        Rojo = new javax.swing.JMenuItem();
        Azul = new javax.swing.JMenuItem();
        Negro = new javax.swing.JMenuItem();
        Opciones = new javax.swing.JMenu();
        Mayusculas = new javax.swing.JMenuItem();
        Minusculas = new javax.swing.JMenuItem();
        AcercaDe = new javax.swing.JMenu();
        InfoAlumno = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 285, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        Archivo.setText("Archivo");

        Abrir.setText("Abrir...");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        Archivo.add(Abrir);

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        Archivo.add(Guardar);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Archivo.add(Salir);

        BarraMenu.add(Archivo);

        Fuente.setText("Fuente");
        Fuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuenteActionPerformed(evt);
            }
        });

        Rojo.setText("Rojo");
        Rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RojoActionPerformed(evt);
            }
        });
        Fuente.add(Rojo);

        Azul.setText("Azul");
        Azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AzulActionPerformed(evt);
            }
        });
        Fuente.add(Azul);

        Negro.setText("Negro");
        Negro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NegroActionPerformed(evt);
            }
        });
        Fuente.add(Negro);

        BarraMenu.add(Fuente);

        Opciones.setText("Opciones");
        Opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionesActionPerformed(evt);
            }
        });

        Mayusculas.setText("Mayusculas");
        Mayusculas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MayusculasStateChanged(evt);
            }
        });
        Mayusculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MayusculasActionPerformed(evt);
            }
        });
        Mayusculas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MayusculasKeyReleased(evt);
            }
        });
        Opciones.add(Mayusculas);

        Minusculas.setText("Minusculas");
        Minusculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusculasActionPerformed(evt);
            }
        });
        Opciones.add(Minusculas);

        BarraMenu.add(Opciones);

        AcercaDe.setText("Acerca de");

        InfoAlumno.setText("Juan Lamas Rubio");
        InfoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoAlumnoActionPerformed(evt);
            }
        });
        AcercaDe.add(InfoAlumno);

        BarraMenu.add(AcercaDe);

        setJMenuBar(BarraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Este método sirve para abrir un archivo
    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
       JFileChooser openFile = new JFileChooser();
       openFile.showSaveDialog(null);
    }//GEN-LAST:event_AbrirActionPerformed
//Con este metodo puedo guardar el archivo
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        JFileChooser saveFile = new JFileChooser();
        saveFile.showSaveDialog(null);
        File file = saveFile.getSelectedFile();
    }//GEN-LAST:event_GuardarActionPerformed
//Este simplemente sirve para poder salir del programa
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed
//Esto muestra la informacion del alumno
    private void InfoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoAlumnoActionPerformed
        jOptionPane1.showMessageDialog(null,"Juan Lamas Rubio\n"
            + "44332233\n" + "juanlamas2000@hotmail.com\n" );
    }//GEN-LAST:event_InfoAlumnoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
 
    }//GEN-LAST:event_jTextField1ActionPerformed
//Para poner el texto en minúsculas
    private void MinusculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusculasActionPerformed
        jTextArea1.setText(jTextArea1.getText().toLowerCase());
    }//GEN-LAST:event_MinusculasActionPerformed

    private void OpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionesActionPerformed
        
    }//GEN-LAST:event_OpcionesActionPerformed
//Para poner el texto en mayúsculas
    private void MayusculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MayusculasActionPerformed
        jTextArea1.setText(jTextArea1.getText().toUpperCase());
    }//GEN-LAST:event_MayusculasActionPerformed

    private void MayusculasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MayusculasStateChanged
        
    }//GEN-LAST:event_MayusculasStateChanged

    private void MayusculasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MayusculasKeyReleased
      
    }//GEN-LAST:event_MayusculasKeyReleased

    private void FuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuenteActionPerformed

    }//GEN-LAST:event_FuenteActionPerformed
//Poner el texto de color rojo
    private void RojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RojoActionPerformed
        Color color = new Color(255, 0, 0);
        jTextArea1.setForeground(color);
    }//GEN-LAST:event_RojoActionPerformed
//Poner el texto de color azul
    private void AzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AzulActionPerformed
        Color color = new Color(0, 0, 255);
        jTextArea1.setForeground(color);
    }//GEN-LAST:event_AzulActionPerformed
//Poner el texto de color negro
    private void NegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NegroActionPerformed
        Color color = new Color(0, 0, 0);
        jTextArea1.setForeground(color);
    }//GEN-LAST:event_NegroActionPerformed

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
            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abrir;
    private javax.swing.JMenu AcercaDe;
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenuItem Azul;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu Fuente;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JMenuItem InfoAlumno;
    private javax.swing.JMenuItem Mayusculas;
    private javax.swing.JMenuItem Minusculas;
    private javax.swing.JMenuItem Negro;
    private javax.swing.JMenu Opciones;
    private javax.swing.JMenuItem Rojo;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
