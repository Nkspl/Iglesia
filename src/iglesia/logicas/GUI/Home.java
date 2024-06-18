
package iglesia.logicas.GUI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JFrame;


public class Home extends javax.swing.JFrame {


    public Home() {
        initComponents();
        SetDate();
        btnCerrarSecion.setToolTipText("Cerrar sesion");
        setLocationRelativeTo(null);
        setSize(1280, 730);
        // Establecer tamaño maximizada de forma predeterminada
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy:' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }
    
    private void InitContent() {
       setLocationRelativeTo(null); 
    }
    
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        nombreAplicacion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_prin = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        tnMaestroInventario = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnDocumentos = new javax.swing.JButton();
        btn_reportes = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        dateText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCerrarSecion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(0, 204, 255));
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        nombreAplicacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombreAplicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreAplicacion.setText("TEMPLO");

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));

        btn_prin.setBackground(new java.awt.Color(102, 204, 255));
        btn_prin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_prin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/Inicio -Home.png"))); // NOI18N
        btn_prin.setText("Inicio");
        btn_prin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_prin.setBorderPainted(false);
        btn_prin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_prin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_prin.setIconTextGap(13);
        btn_prin.setInheritsPopupMenu(true);
        btn_prin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prinActionPerformed(evt);
            }
        });

        btnInventario.setBackground(new java.awt.Color(102, 204, 255));
        btnInventario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/inventario (1).png"))); // NOI18N
        btnInventario.setText("Inventario");
        btnInventario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btnInventario.setBorderPainted(false);
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInventario.setIconTextGap(13);
        btnInventario.setInheritsPopupMenu(true);
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        tnMaestroInventario.setBackground(new java.awt.Color(102, 204, 255));
        tnMaestroInventario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tnMaestroInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/Maestro Inv.png"))); // NOI18N
        tnMaestroInventario.setText("Maestro Inventario");
        tnMaestroInventario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        tnMaestroInventario.setBorderPainted(false);
        tnMaestroInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tnMaestroInventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tnMaestroInventario.setIconTextGap(13);
        tnMaestroInventario.setInheritsPopupMenu(true);
        tnMaestroInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnMaestroInventarioActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(102, 204, 255));
        btnUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/equipo.png"))); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setIconTextGap(13);
        btnUsuarios.setInheritsPopupMenu(true);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnDocumentos.setBackground(new java.awt.Color(102, 204, 255));
        btnDocumentos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDocumentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/documentos (1).png"))); // NOI18N
        btnDocumentos.setText("Documentos");
        btnDocumentos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btnDocumentos.setBorderPainted(false);
        btnDocumentos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDocumentos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDocumentos.setIconTextGap(13);
        btnDocumentos.setInheritsPopupMenu(true);
        btnDocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocumentosActionPerformed(evt);
            }
        });

        btn_reportes.setBackground(new java.awt.Color(102, 204, 255));
        btn_reportes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/papel.png"))); // NOI18N
        btn_reportes.setText("Reportes");
        btn_reportes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_reportes.setBorderPainted(false);
        btn_reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_reportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_reportes.setIconTextGap(13);
        btn_reportes.setInheritsPopupMenu(true);
        btn_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(nombreAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_prin, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tnMaestroInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(nombreAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_prin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(tnMaestroInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        mensaje.setText("Bienvenido: Usuario");

        header.setBackground(new java.awt.Color(102, 204, 255));
        header.setPreferredSize(new java.awt.Dimension(744, 150));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        dateText.setText("Hoy  {dayname} {day} de {month} de {year}");
        header.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 51, 460, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/imagen iglesia~2.jpg"))); // NOI18N

        btnCerrarSecion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iglesia/Resource/Iconos/cerrar-sesion.png"))); // NOI18N
        btnCerrarSecion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSecionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(493, 493, 493)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarSecion)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnCerrarSecion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );

        menu.getAccessibleContext().setAccessibleDescription("");

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

    private void btn_prinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prinActionPerformed
    Home inicio = new Home();
    inicio.setVisible(true);
        this.dispose();   
    }//GEN-LAST:event_btn_prinActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
    Inventarios inventar = new Inventarios();
    inventar.setVisible(true);
        this.dispose();   
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void tnMaestroInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnMaestroInventarioActionPerformed
    Maestros maest = new Maestros();
    maest.setVisible(true);
    this.dispose();
        
       /* Maestro maest =new Maestro();
       maest.setVisible(true);
         this.dispose(); */ 
    }//GEN-LAST:event_tnMaestroInventarioActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        Usuarios user = new Usuarios();
        user.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnDocumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocumentosActionPerformed
        Documentos document = new Documentos();
        document.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_btnDocumentosActionPerformed

    private void btn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportesActionPerformed
        Reportes report = new Reportes();
        report.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btn_reportesActionPerformed

    private void btnCerrarSecionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSecionMouseClicked
      Login logueo = new Login();
      logueo.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnCerrarSecionMouseClicked


    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrarSecion;
    private javax.swing.JButton btnDocumentos;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btn_prin;
    private javax.swing.JButton btn_reportes;
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nombreAplicacion;
    private javax.swing.JButton tnMaestroInventario;
    // End of variables declaration//GEN-END:variables
}
