
package iglesia.logicas.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Nikens
 */
public class Maestros extends javax.swing.JFrame {

    
    boolean a= true;
    public Maestros() {
        initComponents();
         btnInicio.setToolTipText("Inico");
         btnMenu.setToolTipText("Menu");
         btnCerrarSesion.setToolTipText("Cerrar sesion");
         btnMiUsuario.setToolTipText("Mi usuario");
         setLocationRelativeTo(null);
         setSize(1280, 730);
         setExtendedState(JFrame.MAXIMIZED_BOTH);
         AgregarActivos agregar = new AgregarActivos();
         showPanel(agregar);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        menuIcon = new javax.swing.JPanel();
        linehidemenu = new javax.swing.JPanel();
        hidemenu = new javax.swing.JPanel();
        buttonhidemenu = new javax.swing.JLabel();
        menuhide = new javax.swing.JPanel();
        menu2 = new javax.swing.JPanel();
        nombreAplicacion2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnAgregarActivos = new javax.swing.JButton();
        btnModificarActivos = new javax.swing.JButton();
        btnBorrarActivos = new javax.swing.JButton();
        btnUsuarios2 = new javax.swing.JButton();
        btnDocumentos2 = new javax.swing.JButton();
        btn_reportes2 = new javax.swing.JButton();
        Dashboard = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        btnInicio = new javax.swing.JMenu();
        btnMenu = new javax.swing.JMenu();
        jMinventario = new javax.swing.JMenuItem();
        jMmaestro = new javax.swing.JMenuItem();
        jMusuarios = new javax.swing.JMenuItem();
        jMdocumentos = new javax.swing.JMenuItem();
        jMreportes = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnMiUsuario = new javax.swing.JMenu();
        btnCerrarSesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 730));

        menu.setPreferredSize(new java.awt.Dimension(300, 695));
        menu.setLayout(new java.awt.BorderLayout());

        menuIcon.setBackground(new java.awt.Color(0, 204, 255));
        menuIcon.setPreferredSize(new java.awt.Dimension(50, 695));
        menuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linehidemenu.setBackground(new java.awt.Color(0, 204, 255));

        javax.swing.GroupLayout linehidemenuLayout = new javax.swing.GroupLayout(linehidemenu);
        linehidemenu.setLayout(linehidemenuLayout);
        linehidemenuLayout.setHorizontalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linehidemenuLayout.setVerticalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        menuIcon.add(linehidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 10));

        hidemenu.setBackground(new java.awt.Color(0, 204, 255));
        hidemenu.setLayout(new java.awt.BorderLayout());

        buttonhidemenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/atras.png"))); // NOI18N
        buttonhidemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseExited(evt);
            }
        });
        hidemenu.add(buttonhidemenu, java.awt.BorderLayout.CENTER);

        menuIcon.add(hidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 5, 50, 50));

        menu.add(menuIcon, java.awt.BorderLayout.LINE_START);

        menuhide.setPreferredSize(new java.awt.Dimension(287, 640));

        menu2.setBackground(new java.awt.Color(102, 204, 255));
        menu2.setPreferredSize(new java.awt.Dimension(270, 640));

        nombreAplicacion2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        nombreAplicacion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreAplicacion2.setText("Maestro de inventario");

        jSeparator3.setPreferredSize(new java.awt.Dimension(50, 5));

        btnAgregarActivos.setBackground(new java.awt.Color(102, 204, 255));
        btnAgregarActivos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarActivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/boton-agregar.png"))); // NOI18N
        btnAgregarActivos.setText("Agregar activos");
        btnAgregarActivos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btnAgregarActivos.setBorderPainted(false);
        btnAgregarActivos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregarActivos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregarActivos.setIconTextGap(13);
        btnAgregarActivos.setInheritsPopupMenu(true);
        btnAgregarActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActivosActionPerformed(evt);
            }
        });

        btnModificarActivos.setBackground(new java.awt.Color(102, 204, 255));
        btnModificarActivos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificarActivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/editar.png"))); // NOI18N
        btnModificarActivos.setText("Modificar un activo");
        btnModificarActivos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btnModificarActivos.setBorderPainted(false);
        btnModificarActivos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModificarActivos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificarActivos.setIconTextGap(13);
        btnModificarActivos.setInheritsPopupMenu(true);
        btnModificarActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActivosActionPerformed(evt);
            }
        });

        btnBorrarActivos.setBackground(new java.awt.Color(102, 204, 255));
        btnBorrarActivos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBorrarActivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/eliminar.png"))); // NOI18N
        btnBorrarActivos.setText("Borrar un activo");
        btnBorrarActivos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btnBorrarActivos.setBorderPainted(false);
        btnBorrarActivos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBorrarActivos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBorrarActivos.setIconTextGap(13);
        btnBorrarActivos.setInheritsPopupMenu(true);
        btnBorrarActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActivosActionPerformed(evt);
            }
        });

        btnUsuarios2.setBackground(new java.awt.Color(102, 204, 255));
        btnUsuarios2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUsuarios2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/equipo.png"))); // NOI18N
        btnUsuarios2.setText("Usuarios");
        btnUsuarios2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btnUsuarios2.setBorderPainted(false);
        btnUsuarios2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarios2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios2.setIconTextGap(13);
        btnUsuarios2.setInheritsPopupMenu(true);
        btnUsuarios2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarios2ActionPerformed(evt);
            }
        });

        btnDocumentos2.setBackground(new java.awt.Color(102, 204, 255));
        btnDocumentos2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDocumentos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/documentos (1).png"))); // NOI18N
        btnDocumentos2.setText("Documentos");
        btnDocumentos2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btnDocumentos2.setBorderPainted(false);
        btnDocumentos2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDocumentos2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDocumentos2.setIconTextGap(13);
        btnDocumentos2.setInheritsPopupMenu(true);
        btnDocumentos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocumentos2ActionPerformed(evt);
            }
        });

        btn_reportes2.setBackground(new java.awt.Color(102, 204, 255));
        btn_reportes2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reportes2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/papel.png"))); // NOI18N
        btn_reportes2.setText("Reportes");
        btn_reportes2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_reportes2.setBorderPainted(false);
        btn_reportes2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_reportes2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_reportes2.setIconTextGap(13);
        btn_reportes2.setInheritsPopupMenu(true);
        btn_reportes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportes2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu2Layout = new javax.swing.GroupLayout(menu2);
        menu2.setLayout(menu2Layout);
        menu2Layout.setHorizontalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarActivos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarActivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrarActivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuarios2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDocumentos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_reportes2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(menu2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(nombreAplicacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu2Layout.setVerticalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(nombreAplicacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menu2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(btnModificarActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAgregarActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menu2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnBorrarActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menu2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnUsuarios2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menu2Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(btnDocumentos2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menu2Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btn_reportes2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(263, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuhideLayout = new javax.swing.GroupLayout(menuhide);
        menuhide.setLayout(menuhideLayout);
        menuhideLayout.setHorizontalGroup(
            menuhideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu2, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
        );
        menuhideLayout.setVerticalGroup(
            menuhideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu2, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        Dashboard.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );

        getContentPane().add(Dashboard, java.awt.BorderLayout.CENTER);

        jMenuBar2.setBackground(new java.awt.Color(0, 204, 255));
        jMenuBar2.setPreferredSize(new java.awt.Dimension(70, 35));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/HOME.png"))); // NOI18N
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });
        jMenuBar2.add(btnInicio);

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

        jMenuBar2.add(btnMenu);

        jMenu1.setText("Maestro de  inventario                                                                                                                                                                                                                                                                                                                                          ");
        jMenuBar2.add(jMenu1);

        btnMiUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/usuario.png"))); // NOI18N
        jMenuBar2.add(btnMiUsuario);

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/cerrar-sesion.png"))); // NOI18N
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });
        jMenuBar2.add(btnCerrarSesion);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changecolor(JPanel hover, Color rand){
    hover.setBackground(rand);
}
    // Metodo para cambiar el boton de color 
    public void clickmenu(JPanel h1, int numberbool){
    if (numberbool==1){
    h1.setBackground(new Color(102,204,255));
    }
    else{
    h1.setBackground(new Color(0,204,255));
    }
}
    
   // Metodo para cambiar la imagen del icono
   public void changeimage(JLabel button, String resourcheimg){
   ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
   button.setIcon(aimg);
   }


   // metodo para esconder y mostrar opciones del menu
   public void hideshow(JPanel menushowhide, boolean dashboard,JLabel button){
   if(dashboard == true){
   menushowhide.setPreferredSize(new Dimension(50,menushowhide.getHeight()));
   changeimage(button, "/iglesia/Resource/Iconos/menu-puntos.png");
   }
   else{
   menushowhide.setPreferredSize(new Dimension(300,menushowhide.getHeight()));
   changeimage(button, "/iglesia/Resource/Iconos/atras.png");
 }
}  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void btnAgregarActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActivosActionPerformed
        AgregarActivos agregar = new AgregarActivos();
        showPanel(agregar);
    }//GEN-LAST:event_btnAgregarActivosActionPerformed

    private void btnModificarActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActivosActionPerformed
          ActualizarActivos actualizar = new ActualizarActivos();
          showPanel(actualizar);
    }//GEN-LAST:event_btnModificarActivosActionPerformed

    private void btnBorrarActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActivosActionPerformed
          EliminarActivos borrar = new EliminarActivos();
          showPanel(borrar );
    }//GEN-LAST:event_btnBorrarActivosActionPerformed

    private void btnUsuarios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarios2ActionPerformed
     Usuarios user = new Usuarios();
     user.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnUsuarios2ActionPerformed

    private void btnDocumentos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocumentos2ActionPerformed
        Documentos document = new Documentos();
        document.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDocumentos2ActionPerformed

    private void btn_reportes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportes2ActionPerformed
        Reportes report = new Reportes();
        report.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btn_reportes2ActionPerformed

    
    
    
    
    
    
    private void buttonhidemenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseEntered
       changecolor(linehidemenu,new Color(247,78,105));
    }//GEN-LAST:event_buttonhidemenuMouseEntered

    private void buttonhidemenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseExited
     changecolor(linehidemenu,new Color(0,204,255));
    }//GEN-LAST:event_buttonhidemenuMouseExited

    private void buttonhidemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseClicked
      clickmenu(hidemenu,1);
   if(a == true){
      hideshow(menu, a, buttonhidemenu);
      SwingUtilities.updateComponentTreeUI(this);
      a=false;
   }
   else{
   hideshow(menu, a, buttonhidemenu);
    SwingUtilities.updateComponentTreeUI(this);
     a=true;
   }
   
    }//GEN-LAST:event_buttonhidemenuMouseClicked
//Boton para ir a ventana de inicio desde la barra de menu superior en la venta de Maestro de inventario
    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        Home inicio = new Home();
        inicio.setVisible(true);
        this.dispose();   
    }//GEN-LAST:event_btnInicioMouseClicked

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

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        Login logueo = new Login();
        logueo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void jMreportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMreportesActionPerformed
         Reportes report = new Reportes();
        report.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jMreportesActionPerformed

   
    private void showPanel(JPanel p){
    p.setSize(980, 695);
    p.setLocation(0, 0);
    Dashboard.removeAll();
    Dashboard.add(p,BorderLayout.CENTER);
    Dashboard.revalidate();
    Dashboard.repaint();
    
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
            java.util.logging.Logger.getLogger(Maestros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maestros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maestros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maestros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maestros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dashboard;
    private javax.swing.JButton btnAgregarActivos;
    private javax.swing.JButton btnBorrarActivos;
    private javax.swing.JMenu btnCerrarSesion;
    private javax.swing.JButton btnDocumentos2;
    private javax.swing.JMenu btnInicio;
    private javax.swing.JMenu btnMenu;
    private javax.swing.JMenu btnMiUsuario;
    private javax.swing.JButton btnModificarActivos;
    private javax.swing.JButton btnUsuarios2;
    private javax.swing.JButton btn_reportes2;
    private javax.swing.JLabel buttonhidemenu;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JMenuItem jMdocumentos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMinventario;
    private javax.swing.JMenuItem jMmaestro;
    private javax.swing.JMenuItem jMreportes;
    private javax.swing.JMenuItem jMusuarios;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menu2;
    private javax.swing.JPanel menuIcon;
    private javax.swing.JPanel menuhide;
    private javax.swing.JLabel nombreAplicacion2;
    // End of variables declaration//GEN-END:variables
}
