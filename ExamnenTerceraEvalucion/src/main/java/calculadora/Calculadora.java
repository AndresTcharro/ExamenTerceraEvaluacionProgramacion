/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @Ramiro Ándres Tupiza Charro 
 */
public class Calculadora extends javax.swing.JFrame {


    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        labelUnidades = new javax.swing.JLabel();
        labelDescuento = new javax.swing.JLabel();
        labelIva = new javax.swing.JLabel();
        labelSubtotal = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        btnTotal = new javax.swing.JButton();
        btnRest = new javax.swing.JButton();
        campoArticulo = new javax.swing.JTextField();
        campoUnidades = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        labelSubtotalAplicado = new javax.swing.JLabel();
        labelDescuentoAplicado = new javax.swing.JLabel();
        labelIvaAplicado = new javax.swing.JLabel();
        labelTtoalAplicado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setText("Calculadora ");

        labelPrecio.setText("Precio artículo ");

        labelUnidades.setText("Unidades");

        labelDescuento.setText("Descuento 20%");

        labelIva.setText("IVA 14%");

        labelSubtotal.setText("Subtotal ");

        labelTotal.setText("Total ");

        btnTotal.setText("TOTAL ");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        btnRest.setText("REST");
        btnRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        labelSubtotalAplicado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelDescuentoAplicado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelIvaAplicado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelTtoalAplicado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(labelTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPrecio)
                            .addComponent(labelUnidades)
                            .addComponent(labelDescuento)
                            .addComponent(labelIva)
                            .addComponent(labelSubtotal)
                            .addComponent(labelTotal))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(campoUnidades)
                                    .addComponent(labelDescuentoAplicado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelIvaAplicado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(labelSubtotalAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelTtoalAplicado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTotal)
                .addGap(48, 48, 48)
                .addComponent(btnRest)
                .addGap(35, 35, 35)
                .addComponent(btnExit)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelTitulo)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrecio)
                    .addComponent(campoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUnidades))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDescuento)
                    .addComponent(labelDescuentoAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIva)
                    .addComponent(labelIvaAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSubtotal)
                    .addComponent(labelSubtotalAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotal)
                    .addComponent(labelTtoalAplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTotal)
                    .addComponent(btnRest)
                    .addComponent(btnExit))
                .addContainerGap(14, Short.MAX_VALUE))
        );

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

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        // Botón encargado de realizar todas las operaciones que nos pide el ejercicio :
        try{
        String precioArticulo = campoArticulo.getText(); //El texto que capturamos con el Jlabel lo pasamos a un string 
        String unidadArticulo = campoUnidades.getText();
        
        //Los string que hemos obtenido antes lo convertimos en double ya que vamos a utilizar numero con decimales 
        int costeArticulo= Integer.parseInt(precioArticulo) * Integer.parseInt(unidadArticulo); 
        
        //Calculos para el Subtotal , Descuento, Iva y el total del articulo 
        double subTotal= costeArticulo;
        double descuento= subTotal*0.20;
        double iva= subTotal * 0.14;
        double totalArticulo= (subTotal+descuento+iva);
        
        //Creamos un objeto para cada valor que queremos enviar a nuestros Jlabel dandeles el formato de que nos aparcezca el simbolo del $ y que solo aparezcan 2 decimales
        String formatoIva = String.format("%.2f$", iva);
        String formatoSubtotal = String.format("%.2f$", subTotal);
        String formatoDescuento = String.format("%.2f$", descuento);
        String formatoTotal = String.format("%.2f$", totalArticulo);
        //Aqui es donde pasamos los resultado obtenido anterior mente a nuestros JLabel 
        labelSubtotalAplicado.setText(formatoSubtotal);
        labelDescuentoAplicado.setText(formatoDescuento); 
        labelIvaAplicado.setText(formatoIva);
        labelTtoalAplicado.setText(formatoTotal);
        
        //De ejemplo vamos a capturar la Excepción "NumberFormatException"
        }catch (NumberFormatException ex){
            
            //Con el JOptionPane.showMessageDialog" nos ayudamos para lanzar un mensaje en una ventana emergente al usuarrio 
            JOptionPane.showMessageDialog(this, "Debe introducir solo valores númericos y que sean enteros");
        }
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestActionPerformed
        // Botón para resetear nuestra campos y labels 
        
        campoArticulo.setText(null);
        campoUnidades.setText(null);
        labelSubtotalAplicado.setText(null);
        labelDescuentoAplicado.setText(null);
        labelIvaAplicado.setText(null);
        labelTtoalAplicado.setText(null);
        
    }//GEN-LAST:event_btnRestActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Botón de salir :
        System.exit(WIDTH);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRest;
    private javax.swing.JButton btnTotal;
    private javax.swing.JTextField campoArticulo;
    private javax.swing.JTextField campoUnidades;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDescuento;
    private javax.swing.JLabel labelDescuentoAplicado;
    private javax.swing.JLabel labelIva;
    private javax.swing.JLabel labelIvaAplicado;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labelSubtotalAplicado;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelTtoalAplicado;
    private javax.swing.JLabel labelUnidades;
    // End of variables declaration//GEN-END:variables
}
