
package iglesia.logicas.GUI;

import javax.swing.JFrame;

public class Usuarios extends javax.swing.JFrame {

 
    public Usuarios() {
        initComponents();
        jTextFieldBusqueda.setToolTipText("Ingresa el nombre de usuario a buscar");
        btnCerrarSesion.setToolTipText("Cerrar sesion");
        btnMiUsuario.setToolTipText("Mi usuario");
        setLocationRelativeTo(null);
        setSize(1280, 730);
        // Establecer tamaño maximizada de forma predeterminada
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnHabilitarUsuario = new javax.swing.JButton();
        btnHabilitarUsuario1 = new javax.swing.JButton();
        btnHabilitarUsuario2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMHome = new javax.swing.JMenu();
        jMmenu = new javax.swing.JMenu();
        jMinventario = new javax.swing.JMenuItem();
        jMmaestroInventario = new javax.swing.JMenuItem();
        jMusuarios = new javax.swing.JMenuItem();
        jMdocumentos = new javax.swing.JMenuItem();
        jMreportes = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnMiUsuario = new javax.swing.JMenu();
        btnCerrarSesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 730));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Correo electronico", "Rut", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextFieldBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextFieldBusquedaMouseEntered(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/Icono Buscar.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        btnHabilitarUsuario.setBackground(new java.awt.Color(102, 204, 255));
        btnHabilitarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHabilitarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/Habilitar.png"))); // NOI18N
        btnHabilitarUsuario.setText("           Habilitar");
        btnHabilitarUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btnHabilitarUsuario.setBorderPainted(false);
        btnHabilitarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHabilitarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHabilitarUsuario.setIconTextGap(13);
        btnHabilitarUsuario.setInheritsPopupMenu(true);
        btnHabilitarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabilitarUsuarioActionPerformed(evt);
            }
        });

        btnHabilitarUsuario1.setBackground(new java.awt.Color(102, 204, 255));
        btnHabilitarUsuario1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHabilitarUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/eliminar.png"))); // NOI18N
        btnHabilitarUsuario1.setText("          Eliminar");
        btnHabilitarUsuario1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btnHabilitarUsuario1.setBorderPainted(false);
        btnHabilitarUsuario1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHabilitarUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHabilitarUsuario1.setIconTextGap(13);
        btnHabilitarUsuario1.setInheritsPopupMenu(true);
        btnHabilitarUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabilitarUsuario1ActionPerformed(evt);
            }
        });

        btnHabilitarUsuario2.setBackground(new java.awt.Color(102, 204, 255));
        btnHabilitarUsuario2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHabilitarUsuario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/bloqueado.png"))); // NOI18N
        btnHabilitarUsuario2.setText("         Deshabilitar");
        btnHabilitarUsuario2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btnHabilitarUsuario2.setBorderPainted(false);
        btnHabilitarUsuario2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHabilitarUsuario2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHabilitarUsuario2.setIconTextGap(13);
        btnHabilitarUsuario2.setInheritsPopupMenu(true);
        btnHabilitarUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabilitarUsuario2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHabilitarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHabilitarUsuario2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
            .addComponent(btnHabilitarUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnHabilitarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHabilitarUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHabilitarUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(487, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setText("Registro de usuarios activos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton1)
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldBusqueda)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 204, 255));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(70, 35));

        jMHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/HOME.png"))); // NOI18N
        jMHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMHomeMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMHome);

        jMmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/menu-hamburguesa.png"))); // NOI18N

        jMinventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/inventario (1).png"))); // NOI18N
        jMinventario.setText("Inventario");
        jMinventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMinventarioActionPerformed(evt);
            }
        });
        jMmenu.add(jMinventario);

        jMmaestroInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/Maestro Inv.png"))); // NOI18N
        jMmaestroInventario.setText("Maestro inventario");
        jMmaestroInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmaestroInventarioActionPerformed(evt);
            }
        });
        jMmenu.add(jMmaestroInventario);

        jMusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/equipo.png"))); // NOI18N
        jMusuarios.setText("Usuarios");
        jMusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMusuariosActionPerformed(evt);
            }
        });
        jMmenu.add(jMusuarios);

        jMdocumentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/documentos (1).png"))); // NOI18N
        jMdocumentos.setText("Documentos");
        jMdocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMdocumentosActionPerformed(evt);
            }
        });
        jMmenu.add(jMdocumentos);

        jMreportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/papel.png"))); // NOI18N
        jMreportes.setText("Reportes");
        jMreportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMreportesActionPerformed(evt);
            }
        });
        jMmenu.add(jMreportes);

        jMenuBar1.add(jMmenu);

        jMenu1.setText("Usuarios                                                                                                                                                                                                                                                                                                                                                                                        ");
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1382, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMHomeMouseClicked
     Home inicio = new Home();
       inicio.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMHomeMouseClicked

    private void jTextFieldBusquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaMouseEntered
       
    }//GEN-LAST:event_jTextFieldBusquedaMouseEntered

    private void btnHabilitarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabilitarUsuarioActionPerformed
       
    }//GEN-LAST:event_btnHabilitarUsuarioActionPerformed

    private void btnHabilitarUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabilitarUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHabilitarUsuario1ActionPerformed

    private void btnHabilitarUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabilitarUsuario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHabilitarUsuario2ActionPerformed

    private void jMmaestroInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmaestroInventarioActionPerformed
         Maestros maest = new Maestros();
    maest.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jMmaestroInventarioActionPerformed

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        Login logueo = new Login();
        logueo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void jMinventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMinventarioActionPerformed
       Inventarios invent = new  Inventarios();
       invent.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMinventarioActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnCerrarSesion;
    private javax.swing.JButton btnHabilitarUsuario;
    private javax.swing.JButton btnHabilitarUsuario1;
    private javax.swing.JButton btnHabilitarUsuario2;
    private javax.swing.JMenu btnMiUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMHome;
    private javax.swing.JMenuItem jMdocumentos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMinventario;
    private javax.swing.JMenuItem jMmaestroInventario;
    private javax.swing.JMenu jMmenu;
    private javax.swing.JMenuItem jMreportes;
    private javax.swing.JMenuItem jMusuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBusqueda;
    // End of variables declaration//GEN-END:variables
}
