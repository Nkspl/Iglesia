
package iglesia.logicas.GUI;

import javax.swing.JFrame;



public class Documentos extends javax.swing.JFrame {

    public Documentos() {
        initComponents();
        btnCerrarSesion.setToolTipText("Cerrar sesion");
        btnMiUsuario.setToolTipText("Mi usuario");
        btnHome.setToolTipText("Inico");
        btnMenu.setToolTipText("Menu");
        setLocationRelativeTo(null);
        setSize(1370, 730);
        // Establecer tamaño maximizada de forma predeterminada
        setExtendedState(JFrame.MAXIMIZED_BOTH);      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPDocumentos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnHome = new javax.swing.JMenu();
        btnMenu = new javax.swing.JMenu();
        jMenuInventario = new javax.swing.JMenuItem();
        jMenuMaestro = new javax.swing.JMenuItem();
        jMenuUsuarios = new javax.swing.JMenuItem();
        jMenuDocumentos = new javax.swing.JMenuItem();
        jMenuReportes = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnMiUsuario = new javax.swing.JMenu();
        btnCerrarSesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPDocumentos.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPDocumentosLayout = new javax.swing.GroupLayout(jPDocumentos);
        jPDocumentos.setLayout(jPDocumentosLayout);
        jPDocumentosLayout.setHorizontalGroup(
            jPDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        jPDocumentosLayout.setVerticalGroup(
            jPDocumentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDocumentosLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 204, 255));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/HOME.png"))); // NOI18N
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnHome);

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/menu-hamburguesa.png"))); // NOI18N

        jMenuInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/inventario (1).png"))); // NOI18N
        jMenuInventario.setText("Inventario");
        jMenuInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInventarioActionPerformed(evt);
            }
        });
        btnMenu.add(jMenuInventario);

        jMenuMaestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/Maestro Inv.png"))); // NOI18N
        jMenuMaestro.setText("Maestro Inventario");
        jMenuMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMaestroActionPerformed(evt);
            }
        });
        btnMenu.add(jMenuMaestro);

        jMenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/equipo.png"))); // NOI18N
        jMenuUsuarios.setText("Usuarios");
        jMenuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUsuariosActionPerformed(evt);
            }
        });
        btnMenu.add(jMenuUsuarios);

        jMenuDocumentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/documentos (1).png"))); // NOI18N
        jMenuDocumentos.setText("Documentos");
        jMenuDocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDocumentosActionPerformed(evt);
            }
        });
        btnMenu.add(jMenuDocumentos);

        jMenuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/papel.png"))); // NOI18N
        jMenuReportes.setText("Reportes");
        jMenuReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuReportesActionPerformed(evt);
            }
        });
        btnMenu.add(jMenuReportes);

        jMenuBar1.add(btnMenu);

        jMenu1.setText("Documentos                                                                                                                                                                                                                                                                                                                                           ");
        jMenuBar1.add(jMenu1);

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
            .addComponent(jPDocumentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPDocumentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInventarioActionPerformed
        Inventarios inventar = new Inventarios();
        inventar.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_jMenuInventarioActionPerformed

    private void jMenuMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMaestroActionPerformed
      Maestros maest = new Maestros();
    maest.setVisible(true);
    this.dispose();  
    }//GEN-LAST:event_jMenuMaestroActionPerformed

    private void jMenuDocumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDocumentosActionPerformed
        Documentos document = new Documentos();
        document.setVisible(true);
        this.dispose();         
    }//GEN-LAST:event_jMenuDocumentosActionPerformed
 
    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        Home inicio = new Home();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeMouseClicked

    private void jMenuReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuReportesActionPerformed
        Reportes report = new Reportes();
        report.setVisible(true);
        this.dispose(); 
      
    }//GEN-LAST:event_jMenuReportesActionPerformed

    private void jMenuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUsuariosActionPerformed
          Usuarios user = new Usuarios();
          user.setVisible(true);
          this.dispose(); 
    }//GEN-LAST:event_jMenuUsuariosActionPerformed

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
       Login logueo = new Login();
       logueo.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

 
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
            java.util.logging.Logger.getLogger(Documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Documentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnCerrarSesion;
    private javax.swing.JMenu btnHome;
    private javax.swing.JMenu btnMenu;
    private javax.swing.JMenu btnMiUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuDocumentos;
    private javax.swing.JMenuItem jMenuInventario;
    private javax.swing.JMenuItem jMenuMaestro;
    private javax.swing.JMenuItem jMenuReportes;
    private javax.swing.JMenuItem jMenuUsuarios;
    private javax.swing.JPanel jPDocumentos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
