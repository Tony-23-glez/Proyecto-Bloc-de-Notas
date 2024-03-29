/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package editortexto;

import java.awt.Font;
import javax.swing.JTextArea;

/**
 *
 * @author TECMM PROFESOR
 */
public class Fuente extends javax.swing.JFrame {
    JTextArea caja;
    String fuente;
    int estilo, tamaño;
    /**
     * Creates new form Fuente
     */
    public Fuente(JTextArea caja) {
        initComponents();
        this.caja = caja;
        estilo=Font.PLAIN;
        tamaño=12;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        listaFuentes = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaEstilo = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        muestra = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Fuente");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        listaFuentes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fuente:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        listaFuentes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Arial", "Times New Roman", "Chiller", "Thoma", "Book Antiqua" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaFuentes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaFuentesValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaFuentes);

        jPanel1.add(jScrollPane2);

        listaEstilo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estilo de fuente:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        listaEstilo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Cursiva", "Negrita", "Subrayado", "Normal" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaEstilo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaEstiloValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaEstilo);

        jPanel1.add(jScrollPane3);

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamaño:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 0, 153))); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "6", "8", "10", "12", "14", "18", "24", "36" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Muestra:"));
        jPanel2.setLayout(new java.awt.BorderLayout());

        muestra.setText("Texto de muestra...");
        jPanel2.add(muestra, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(153, 255, 51));
        jPanel3.setForeground(new java.awt.Color(204, 255, 102));

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 65, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       caja.setFont(new Font(fuente,estilo,tamaño));       
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listaFuentesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaFuentesValueChanged
       fuente = listaFuentes.getSelectedValue();
       muestra.setFont(new Font(fuente,estilo,tamaño));
       
    }//GEN-LAST:event_listaFuentesValueChanged

    private void listaEstiloValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaEstiloValueChanged
        estilo = listaEstilo.getSelectedIndex();
        muestra.setFont(new Font(fuente,estilo,tamaño));        
    }//GEN-LAST:event_listaEstiloValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaEstilo;
    private javax.swing.JList<String> listaFuentes;
    private javax.swing.JLabel muestra;
    // End of variables declaration//GEN-END:variables
}
