/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author adalberto
 */
public class Ejercicio5 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio5
     */
    double v[];
    public Ejercicio5() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdAutomatico = new javax.swing.JButton();
        cmdCalcular = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 13), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setBackground(new java.awt.Color(0, 0, 0));
        cmdCrear.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmdCrear.setForeground(new java.awt.Color(102, 255, 102));
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, -1));

        cmdManual.setBackground(new java.awt.Color(0, 0, 0));
        cmdManual.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmdManual.setForeground(new java.awt.Color(102, 255, 102));
        cmdManual.setText("Llenado Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel4.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, -1));

        cmdAutomatico.setBackground(new java.awt.Color(0, 0, 0));
        cmdAutomatico.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmdAutomatico.setForeground(new java.awt.Color(102, 255, 102));
        cmdAutomatico.setText("Llenado Automatico");
        cmdAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomaticoActionPerformed(evt);
            }
        });
        jPanel4.add(cmdAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        cmdCalcular.setBackground(new java.awt.Color(0, 0, 0));
        cmdCalcular.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmdCalcular.setForeground(new java.awt.Color(102, 255, 102));
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, -1));

        cmdMostrar.setBackground(new java.awt.Color(0, 0, 0));
        cmdMostrar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmdMostrar.setForeground(new java.awt.Color(102, 255, 102));
        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 170, -1));

        cmdBorrar.setBackground(new java.awt.Color(0, 0, 0));
        cmdBorrar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmdBorrar.setForeground(new java.awt.Color(102, 255, 102));
        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, -1));

        cmdSalir.setBackground(new java.awt.Color(0, 0, 0));
        cmdSalir.setFont(new java.awt.Font("Ravie", 2, 11)); // NOI18N
        cmdSalir.setForeground(new java.awt.Color(102, 255, 102));
        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        jPanel4.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 170, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 230, 260));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 13), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Cantidad:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtCantidad.setBackground(new java.awt.Color(153, 255, 204));
        txtCantidad.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 200, 70));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 13), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(153, 255, 204));
        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 100));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 250, 170));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("SUMATORIA Y PRODUCTORIA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int cantidad;

        if(txtCantidad.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite la cantidad.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCantidad.requestFocusInWindow();
        }else if(Integer.parseInt(txtCantidad.getText().trim())==0){
            JOptionPane.showMessageDialog(this, "La cantidad no puede ser cero.","ERROR",JOptionPane.ERROR_MESSAGE);
            txtCantidad.requestFocusInWindow();
            txtCantidad.selectAll();
        }else{
            cantidad=Integer.parseInt(txtCantidad.getText());
            v = new double [cantidad];

            if (cantidad%2!=0){
                JOptionPane.showMessageDialog(this, "Digite la longitud que sea  par","ERROR", JOptionPane.ERROR_MESSAGE);
                txtCantidad.selectAll();
                txtCantidad.requestFocusInWindow();
            }else{
                v = new double [cantidad];
                JOptionPane.showMessageDialog(this, "Vector Creado Exitosamente");
            }
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
        double num;
        for (int i = 0; i < v.length; i++) {
            num=Double.parseDouble(JOptionPane.showInputDialog(this,"Digite el elemento en la posición "+i));
            v[i]=num;
        }
    }//GEN-LAST:event_cmdManualActionPerformed

    private void cmdAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomaticoActionPerformed
        double numero,n;

        numero=Double.parseDouble(JOptionPane.showInputDialog(this,"Digite el número hasta donde quiere el llenado: "));
        while(numero<v.length){
            JOptionPane.showMessageDialog(this, "Digite un número mayor a: "+v.length);
            numero=Double.parseDouble(JOptionPane.showInputDialog(this,"Digite el número hasta donde quiere el llenado: "));
        }
        for (int i = 0; i < v.length; i++) {
            n=(int)(Math.random()*numero+1);
            v[i]=n;
        }
        JOptionPane.showMessageDialog(this, "Vector Creado Exitosamente");
    }//GEN-LAST:event_cmdAutomaticoActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        double sumatoria=0,productoria=1;
        String res1,res2;
        int n;
        n=v.length/2;
        for (int i = 0; i < n; i++) {
            productoria = productoria * v[i];
        }
        for (int i = n; i < v.length; i++) {
            sumatoria=sumatoria+v[i];
        }
        res1=String.valueOf(productoria);
        txtResultado.append("La productoria es: "+res1);
        res2=String.valueOf(sumatoria);
        txtResultado.append("\nLa sumatoria es: "+res2+"\n");
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        for (int i = 0; i < v.length; i++) {
            txtResultado.append(v[i]+"\n");
        }
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtCantidad.setText("");
        txtResultado.setText("");
        v=null;
        txtCantidad.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c=evt.getKeyChar();
        if(!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

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
            java.util.logging.Logger.getLogger(Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAutomatico;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
