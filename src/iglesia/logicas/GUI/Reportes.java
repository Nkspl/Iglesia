
package iglesia.logicas.GUI;

import javax.swing.JFrame;

/**
 *
 * @author nikens.pierrelouis
 */
public class Reportes extends javax.swing.JFrame {

   
    public Reportes() {
        initComponents();
         btnInicio.setToolTipText("Inico");
         btnMenu.setToolTipText("Menu");
         btnCerrarSesion.setToolTipText("Cerrar sesion");
         btnMiUsuario.setToolTipText("Mi usuario");
         setLocationRelativeTo(null);
         setSize(1280, 730);
         setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnImprimirReportes = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnInicio = new javax.swing.JMenu();
        btnMenu = new javax.swing.JMenu();
        jMinventario = new javax.swing.JMenuItem();
        jMmaestro = new javax.swing.JMenuItem();
        jMusuarios = new javax.swing.JMenuItem();
        jMdocumentos = new javax.swing.JMenuItem();
        jMreportes = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnMiUsuario = new javax.swing.JMenu();
        btnCerrarSesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Accion", "Fecha", "codigo", "Descripcion", "Usuario/Autor"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Reportes de movimientos en el sistema");

        btnImprimirReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/impresora.png"))); // NOI18N
        btnImprimirReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimirReportesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(468, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251)
                .addComponent(btnImprimirReportes)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImprimirReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 204, 255));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(80, 35));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/HOME.png"))); // NOI18N
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnInicio);

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/menu-hamburguesa.png"))); // NOI18N

        jMinventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/inventario (1).png"))); // NOI18N
        jMinventario.setText("Inventario");
        jMinventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMinventarioActionPerformed(evt);
            }
        });
        btnMenu.add(jMinventario);

        jMmaestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/Maestro Inv.png"))); // NOI18N
        jMmaestro.setText("Maestro inventario");
        jMmaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmaestroActionPerformed(evt);
            }
        });
        btnMenu.add(jMmaestro);

        jMusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/equipo.png"))); // NOI18N
        jMusuarios.setText("Usuarios");
        jMusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMusuariosActionPerformed(evt);
            }
        });
        btnMenu.add(jMusuarios);

        jMdocumentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/documentos (1).png"))); // NOI18N
        jMdocumentos.setText("Documentos");
        jMdocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMdocumentosActionPerformed(evt);
            }
        });
        btnMenu.add(jMdocumentos);

        jMreportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/papel.png"))); // NOI18N
        jMreportes.setText("Reportes");
        jMreportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMreportesActionPerformed(evt);
            }
        });
        btnMenu.add(jMreportes);

        jMenuBar1.add(btnMenu);

        jMenu3.setText("Reportes                                                                                                                                                                                                                                                                                                                                                               ");
        jMenuBar1.add(jMenu3);

        btnMiUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/usuario.png"))); // NOI18N
        jMenuBar1.add(btnMiUsuario);

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/cerrar-sesion.png"))); // NOI18N
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnCerrarSesion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMinventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMinventarioActionPerformed
       Inventarios invent = new  Inventarios();
       invent.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMinventarioActionPerformed

    private void jMmaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmaestroActionPerformed
        Maestros maest = new Maestros();
        maest.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMmaestroActionPerformed

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
          Login logueo = new Login();
          logueo.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void jMusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMusuariosActionPerformed
        Usuarios user = new Usuarios();
        user.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jMusuariosActionPerformed

    private void jMdocumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMdocumentosActionPerformed
         Documentos document = new Documentos();
        document.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jMdocumentosActionPerformed

    private void jMreportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMreportesActionPerformed
       Reportes report = new Reportes();
        report.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jMreportesActionPerformed

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        Home inicio = new Home();
       inicio.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnInicioMouseClicked

    
    
    // Boton para imprimir los reportes en formato 
    private void btnImprimirReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirReportesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirReportesMouseClicked

    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnCerrarSesion;
    private javax.swing.JLabel btnImprimirReportes;
    private javax.swing.JMenu btnInicio;
    private javax.swing.JMenu btnMenu;
    private javax.swing.JMenu btnMiUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMdocumentos;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMinventario;
    private javax.swing.JMenuItem jMmaestro;
    private javax.swing.JMenuItem jMreportes;
    private javax.swing.JMenuItem jMusuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
