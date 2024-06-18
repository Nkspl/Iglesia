
package iglesia.logicas.GUI;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Inventarios extends javax.swing.JFrame {

 
    public Inventarios() {
        initComponents();
        btnCerrarSesion.setToolTipText("Cerrar sesion");
        btnMiUsuario.setToolTipText("Mi usuario");
        btnHome.setToolTipText("Inico");
        btnMenu.setToolTipText("Menu");
        txtBuscar_Inv.setToolTipText("Ingresa la descripcion del activo a buscar");
         setSize(1280, 730);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        jPanel_principal = new javax.swing.JPanel();
        txtBuscar_Inv = new javax.swing.JTextField();
        btnBuscar_Inv = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnBusquedaPorFiltro = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnHome = new javax.swing.JMenu();
        btnMenu = new javax.swing.JMenu();
        jMinventario = new javax.swing.JMenuItem();
        jMmaestro = new javax.swing.JMenuItem();
        jMusuarios = new javax.swing.JMenuItem();
        jMdocumentos = new javax.swing.JMenuItem();
        jMreportes = new javax.swing.JMenuItem();
        jMespacioCabesal = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        btnMiUsuario = new javax.swing.JMenu();
        btnCerrarSesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        content.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_principal.setBackground(new java.awt.Color(255, 255, 255));

        txtBuscar_Inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscar_InvActionPerformed(evt);
            }
        });

        btnBuscar_Inv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/Icono Buscar.gif"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Comunidad", "Balance actual"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Solo comunidad San Jose", "Solo comunidad San Sebastian", "Solo comunidad Madre De Dios", "Solo comunidad Santa Cecilia", "Solo comunidad Santiago Apostol", "Solo comunidad Jesus Buen Pastor", "Solo comunidad Nuestra Señora Del Pilar", "Solo comunidad San Gaspar", "Todos" }));

        jLabel1.setText("Busqueda por filtro");

        btnBusquedaPorFiltro.setText("Buscar");
        btnBusquedaPorFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaPorFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnBusquedaPorFiltro))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusquedaPorFiltro))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel_principalLayout = new javax.swing.GroupLayout(jPanel_principal);
        jPanel_principal.setLayout(jPanel_principalLayout);
        jPanel_principalLayout.setHorizontalGroup(
            jPanel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_principalLayout.createSequentialGroup()
                .addComponent(txtBuscar_Inv, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar_Inv, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel_principalLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_principalLayout.setVerticalGroup(
            jPanel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_principalLayout.createSequentialGroup()
                .addGroup(jPanel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_principalLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscar_Inv, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscar_Inv)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 204, 255));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(80, 35));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/HOME.png"))); // NOI18N
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnHome);

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

        jMespacioCabesal.setText("Inventario                                                                                                                                                                                                                                                                                                                                        ");
        jMespacioCabesal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jMespacioCabesalMouseMoved(evt);
            }
        });
        jMenuBar1.add(jMespacioCabesal);

        jMenu4.setText("Nombre usuario");
        jMenuBar1.add(jMenu4);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMespacioCabesalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMespacioCabesalMouseMoved
        // TODO add your handling code here:    
        
        // NADA EN ABSOLUTO
    }//GEN-LAST:event_jMespacioCabesalMouseMoved

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

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
       Home inicio = new Home();
       inicio.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
       Login logueo = new Login();
       logueo.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void txtBuscar_InvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscar_InvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscar_InvActionPerformed

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

    private void btnBusquedaPorFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaPorFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBusquedaPorFiltroActionPerformed

    
    
     private void ShowPanel(JPanel p){
        p.setSize(1280, 730);
        p.setLocation(0, 0);
        content.removeAll();
        content.add(p,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
       
     }

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
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inventarios().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar_Inv;
    private javax.swing.JButton btnBusquedaPorFiltro;
    private javax.swing.JMenu btnCerrarSesion;
    private javax.swing.JMenu btnHome;
    private javax.swing.JMenu btnMenu;
    private javax.swing.JMenu btnMiUsuario;
    private javax.swing.JPanel content;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMdocumentos;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMespacioCabesal;
    private javax.swing.JMenuItem jMinventario;
    private javax.swing.JMenuItem jMmaestro;
    private javax.swing.JMenuItem jMreportes;
    private javax.swing.JMenuItem jMusuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_principal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscar_Inv;
    // End of variables declaration//GEN-END:variables
}
