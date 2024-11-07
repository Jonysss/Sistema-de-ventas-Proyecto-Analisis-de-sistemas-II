/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaLogica.Conexion;
import java.awt.Frame;
import java.io.File;
import java.sql.Connection;
import javax.swing.JDialog;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author USUARIO
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        this.setTitle("Sistema de Compras y Ventas ");
        this.setExtendedState(FrmMenu.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblidusuario = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblapellidos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        mnuarchivo = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        mnualmacen = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        mnucompras = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        mnuventas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuconsultas = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnuconfiguraciones = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnureportes = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        mnuayuda = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 255));
        jLabel1.setText("Usuario:");

        lblidusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblidusuario.setForeground(new java.awt.Color(255, 0, 0));
        lblidusuario.setText("jLabel2");

        lblnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 51, 204));
        lblnombre.setText("jLabel3");

        lblapellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblapellidos.setForeground(new java.awt.Color(0, 51, 255));
        lblapellidos.setText("jLabel4");

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("PRODUCTOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("CATEGORIAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 255));
        jButton3.setText("COMPRAS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("PROVEEDORES");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 153, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 102, 0));
        jButton5.setText("VENTAS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 153, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 102, 102));
        jButton6.setText("CLIENTES");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 153, 51));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pro.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(46, 46, 46)
                .addComponent(jButton2)
                .addGap(62, 62, 62)
                .addComponent(jButton3)
                .addGap(52, 52, 52)
                .addComponent(jButton4)
                .addGap(41, 41, 41)
                .addComponent(jButton5)
                .addGap(40, 40, 40)
                .addComponent(jButton6))
        );

        jButton8.setBackground(new java.awt.Color(204, 0, 204));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setText("CHATBOT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(92, 92, 92)
                        .addComponent(lblidusuario)
                        .addGap(122, 122, 122)
                        .addComponent(lblnombre)
                        .addGap(135, 135, 135)
                        .addComponent(lblapellidos)
                        .addContainerGap(474, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(45, 45, 45))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 389, Short.MAX_VALUE)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblidusuario)
                    .addComponent(lblnombre)
                    .addComponent(lblapellidos))
                .addGap(28, 28, 28))
        );

        mnuarchivo.setBackground(new java.awt.Color(0, 153, 0));
        mnuarchivo.setForeground(new java.awt.Color(204, 51, 255));
        mnuarchivo.setMnemonic('f');
        mnuarchivo.setText("Archivo");
        mnuarchivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Cerrar Sesion");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        mnuarchivo.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Salir");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        mnuarchivo.add(saveMenuItem);

        menuBar.add(mnuarchivo);

        mnualmacen.setBackground(new java.awt.Color(255, 51, 51));
        mnualmacen.setForeground(new java.awt.Color(0, 0, 255));
        mnualmacen.setMnemonic('e');
        mnualmacen.setText("Almacen");
        mnualmacen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Productos");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        mnualmacen.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Categorias");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        mnualmacen.add(copyMenuItem);

        menuBar.add(mnualmacen);

        mnucompras.setBackground(new java.awt.Color(51, 255, 51));
        mnucompras.setMnemonic('h');
        mnucompras.setText("Compras");
        mnucompras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Compras");
        contentsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentsMenuItemActionPerformed(evt);
            }
        });
        mnucompras.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Proveedores");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        mnucompras.add(aboutMenuItem);

        menuBar.add(mnucompras);

        mnuventas.setForeground(new java.awt.Color(0, 153, 0));
        mnuventas.setText("Ventas");
        mnuventas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem1.setText("Ventas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuventas.add(jMenuItem1);

        jMenuItem2.setText("Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuventas.add(jMenuItem2);

        menuBar.add(mnuventas);

        mnuconsultas.setForeground(new java.awt.Color(51, 51, 255));
        mnuconsultas.setText("Dashboard");
        mnuconsultas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem3.setText("ver Dashboard");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuconsultas.add(jMenuItem3);

        menuBar.add(mnuconsultas);

        mnuconfiguraciones.setForeground(new java.awt.Color(0, 153, 153));
        mnuconfiguraciones.setText("Confi");
        mnuconfiguraciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem5.setText("Conf. Usuarios");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnuconfiguraciones.add(jMenuItem5);

        jMenuItem6.setText("Empleados");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mnuconfiguraciones.add(jMenuItem6);

        menuBar.add(mnuconfiguraciones);

        mnureportes.setForeground(new java.awt.Color(102, 0, 102));
        mnureportes.setText("Reportes");
        mnureportes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem8.setText("Ver reportes");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        mnureportes.add(jMenuItem8);

        menuBar.add(mnureportes);

        mnuayuda.setForeground(new java.awt.Color(255, 51, 51));
        mnuayuda.setText("Ayuda");
        mnuayuda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem7.setText("Ayuda");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        mnuayuda.add(jMenuItem7);

        menuBar.add(mnuayuda);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        FrmVenta form= new FrmVenta();
      contenedor.add(form);
      form.toFront();
      form.setVisible(true);
      FrmVenta.txtidusuario.setText(lblidusuario.getText());
      FrmVenta.txtnombreusuario.setText(lblnombre.getText()+" "+lblapellidos.getText());
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
      FrmProducto form = new FrmProducto();
      contenedor.add(form);
      form.toFront();
      form.setVisible(true);
      
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        FrmCategoria form = new FrmCategoria();
      contenedor.add(form);
      form.toFront();
      form.setVisible(true);
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
       FrmProveedor form = new FrmProveedor();
      contenedor.add(form);
      form.toFront();
      form.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         FrmCliente form= new FrmCliente();
      contenedor.add(form);
      form.toFront();
      form.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
           FrmUsuarios form= new FrmUsuarios();
      contenedor.add(form);
      form.toFront();
      form.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
          FrmEmpleados form= new FrmEmpleados();
      contenedor.add(form);
      form.toFront();
      form.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        dispose();
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
     FrmLogin form= new FrmLogin();
      
      form.setVisible(true);
      form.pack();
      this.setVisible(false);
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void contentsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentsMenuItemActionPerformed
    FrmCompra form= new FrmCompra();
      contenedor.add(form);
      form.toFront();
      form.setVisible(true);
      FrmCompra.txtidusuario.setText(lblidusuario.getText());
      FrmCompra.txtnombreusuario.setText(lblnombre.getText()+" "+lblapellidos.getText());
    }//GEN-LAST:event_contentsMenuItemActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
     FrmReportes form = new FrmReportes();
    form.setLocationRelativeTo(null); // Opcional: centra la ventana
    form.setVisible(true);
        
        
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed
private Connection conn=new Conexion().getConexion();
    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked
        
        JasperReport report;
JasperPrint print;

try {
    // Ubicación del archivo JRXML del reporte
    String reportPath = new File("").getAbsolutePath() + "/src/Reportes/report1.jrxml";
    
    // Compilación del reporte
    report = JasperCompileManager.compileReport(reportPath);
    
    // Llenado del reporte (en este caso, no se pasan parámetros)
    print = JasperFillManager.fillReport(report, null, this.conn);
    
    // Visualización del reporte
    JasperViewer view = new JasperViewer(print, false);
    view.setTitle("Comprobante Venta");
    view.setVisible(true);
} catch (JRException e) {
    e.printStackTrace();
}
   

        
        
    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         FrmDash form = new FrmDash();
    form.setLocationRelativeTo(null); // Opcional: centra la ventana
    form.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
          FrmAyuda form = new FrmAyuda();
    form.setLocationRelativeTo(null); // Opcional: centra la ventana
    form.setVisible(true);
        
        
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         FrmProducto form = new FrmProducto();
    contenedor.add(form);        // Agrega la ventana al contenedor (suponiendo que `contenedor` es un JDesktopPane)
    
    try {
        form.setVisible(true);   // Muestra la ventana
        form.setSelected(true);  // Selecciona la ventana para traerla al frente
        form.toFront();          // Asegura que esté al frente de las otras ventanas
    } catch (java.beans.PropertyVetoException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      FrmCategoria form = new FrmCategoria();
    contenedor.add(form);        // Agrega la ventana al contenedor (suponiendo que `contenedor` es un JDesktopPane)
    
    try {
        form.setVisible(true);   // Muestra la ventana
        form.setSelected(true);  // Selecciona la ventana para traerla al frente
        form.toFront();          // Asegura que esté al frente de las otras ventanas
    } catch (java.beans.PropertyVetoException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    FrmCompra form = new FrmCompra();
    contenedor.add(form);        // Agrega la ventana al contenedor (suponiendo que `contenedor` es un JDesktopPane)
    
    try {
        form.setVisible(true);   // Muestra la ventana
        form.setSelected(true);  // Selecciona la ventana para traerla al frente
        form.toFront();          // Asegura que esté al frente de las otras ventanas
    } catch (java.beans.PropertyVetoException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         FrmProveedor form = new FrmProveedor();
    contenedor.add(form);        // Agrega la ventana al contenedor (suponiendo que `contenedor` es un JDesktopPane)
    
    try {
        form.setVisible(true);   // Muestra la ventana
        form.setSelected(true);  // Selecciona la ventana para traerla al frente
        form.toFront();          // Asegura que esté al frente de las otras ventanas
    } catch (java.beans.PropertyVetoException e) {
        e.printStackTrace();
    }
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
              FrmVenta form = new FrmVenta();
    contenedor.add(form);        // Agrega la ventana al contenedor (suponiendo que `contenedor` es un JDesktopPane)
    
    try {
        form.setVisible(true);   // Muestra la ventana
        form.setSelected(true);  // Selecciona la ventana para traerla al frente
        form.toFront();          // Asegura que esté al frente de las otras ventanas
    } catch (java.beans.PropertyVetoException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      FrmCliente form = new FrmCliente();
    contenedor.add(form);        // Agrega la ventana al contenedor (suponiendo que `contenedor` es un JDesktopPane)
    
    try {
        form.setVisible(true);   // Muestra la ventana
        form.setSelected(true);  // Selecciona la ventana para traerla al frente
        form.toFront();          // Asegura que esté al frente de las otras ventanas
    } catch (java.beans.PropertyVetoException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JPanel contenedor;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblapellidos;
    public static javax.swing.JLabel lblidusuario;
    public static javax.swing.JLabel lblnombre;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnualmacen;
    private javax.swing.JMenu mnuarchivo;
    private javax.swing.JMenu mnuayuda;
    private javax.swing.JMenu mnucompras;
    private javax.swing.JMenu mnuconfiguraciones;
    private javax.swing.JMenu mnuconsultas;
    private javax.swing.JMenu mnureportes;
    private javax.swing.JMenu mnuventas;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
