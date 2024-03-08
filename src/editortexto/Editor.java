/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package editortexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author TECMM PROFESOR
 */
public class Editor extends javax.swing.JFrame {
    
    String ruta = "";
    String titulo;

    /**
     * Creates new form Editor
     */
    public Editor() {
        initComponents();
        titulo = "Sin titulo";
        setTitle(titulo + ": Editor");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtaContenido = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuFileOpen = new javax.swing.JMenuItem();
        mnuFileSave = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        mnuEdit = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        mnuFormat = new javax.swing.JMenu();
        mnuView = new javax.swing.JMenu();
        mnuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBackground(new java.awt.Color(204, 102, 255));

        txtaContenido.setColumns(20);
        txtaContenido.setRows(5);
        jScrollPane1.setViewportView(txtaContenido);

        mnuFile.setMnemonic('A');
        mnuFile.setText("Archivo");
        mnuFile.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                mnuFileAncestorRemoved(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem1.setText("Nuevo");
        mnuFile.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Ventana nueva");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuFile.add(jMenuItem2);

        mnuFileOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuFileOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abrir.png"))); // NOI18N
        mnuFileOpen.setText("Abrir...");
        mnuFileOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFileOpenActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFileOpen);

        mnuFileSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuFileSave.setText("Guardar");
        mnuFileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFileSaveActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFileSave);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Guardar como...");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnuFile.add(jMenuItem5);
        mnuFile.add(jSeparator1);

        jMenuItem6.setText("Configurar página");
        mnuFile.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setText("Imprimir");
        mnuFile.add(jMenuItem7);
        mnuFile.add(jSeparator2);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem8.setText("Salir");
        jMenuItem8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem8MouseClicked(evt);
            }
        });
        mnuFile.add(jMenuItem8);

        jMenuBar1.add(mnuFile);

        mnuEdit.setMnemonic('e');
        mnuEdit.setText("Edición");

        jMenuItem9.setText("Deshacer");
        mnuEdit.add(jMenuItem9);
        mnuEdit.add(jSeparator3);

        jMenuItem10.setText("Cortar");
        mnuEdit.add(jMenuItem10);

        jMenuItem11.setText("Copiar");
        mnuEdit.add(jMenuItem11);

        jMenuItem12.setText("Pegar");
        mnuEdit.add(jMenuItem12);

        jMenuItem13.setText("Eliminar");
        mnuEdit.add(jMenuItem13);
        mnuEdit.add(jSeparator4);

        jMenuItem14.setText("Buscar en web");
        mnuEdit.add(jMenuItem14);

        jMenuItem15.setText("Buscar...");
        mnuEdit.add(jMenuItem15);

        jMenuItem16.setText("Buscar siguiente");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        mnuEdit.add(jMenuItem16);

        jMenuItem17.setText("Buscar anterior");
        mnuEdit.add(jMenuItem17);

        jMenuItem18.setText("Reemplazar");
        mnuEdit.add(jMenuItem18);

        jMenuItem19.setText("Ir a...");
        mnuEdit.add(jMenuItem19);
        mnuEdit.add(jSeparator5);

        jMenuItem20.setText("Seleccionar todo");
        mnuEdit.add(jMenuItem20);

        jMenuItem21.setText("Hora y fecha");
        mnuEdit.add(jMenuItem21);

        jMenuBar1.add(mnuEdit);

        mnuFormat.setMnemonic('f');
        mnuFormat.setText("Formato");
        jMenuBar1.add(mnuFormat);

        mnuView.setMnemonic('v');
        mnuView.setText("Ver");
        jMenuBar1.add(mnuView);

        mnuHelp.setMnemonic('y');
        mnuHelp.setText("Ayuda");
        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void mnuFileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFileSaveActionPerformed
        JFileChooser fc = new JFileChooser();
        //Verificar que haya algo para guardar
        String texto = txtaContenido.getText();
        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay texto para guardar", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            if (!ruta.isEmpty()) {
                try {
                    PrintWriter pw = new PrintWriter(new File(ruta));
                    pw.print(txtaContenido.getText());
                    pw.close();
                } catch (Exception e) {
                }
            } else {
                
                fc.addChoosableFileFilter(new FileNameExtensionFilter(
                        "*.txt", "txt", "Todos los archivos"));
                int seleccion = fc.showSaveDialog(null);
                try {
                    if (seleccion == JFileChooser.APPROVE_OPTION) {
                        File JFC = fc.getSelectedFile();
                        String path = JFC.getAbsolutePath();
                        PrintWriter pw = new PrintWriter(JFC);
                        pw.print(txtaContenido.getText());
                        pw.close();

                        //Comprobar la asignacion de la extension
                        if (!path.endsWith(".txt")) {
                            File temp = new File(path + ".txt");
                            JFC.renameTo(temp);
                        }
                        JOptionPane.showMessageDialog(this, "Archivo guardado correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                        titulo = JFC.getName();
                        this.setTitle(titulo + ": Editor");
                        
                        ruta = JFC.getPath();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_mnuFileSaveActionPerformed

    private void mnuFileOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFileOpenActionPerformed
        String path = "";
        JFileChooser JFC = new JFileChooser();
        JFC.setFileFilter(new FileNameExtensionFilter("todos los archivos *.TXT", "txt", "TXT"));
        int abrir = JFC.showDialog(null, "Abrir");
        if (abrir == JFileChooser.APPROVE_OPTION) {
            FileReader FR = null;
            BufferedReader BR = null;
            
            try {
                File archivo = JFC.getSelectedFile();//abre un archivo .lengf
                ruta = archivo.getPath();

                String PATH = JFC.getSelectedFile().getAbsolutePath();
                if (PATH.endsWith(".txt") || PATH.endsWith(".TXT")) {
                    
                    FR = new FileReader(archivo);
                    BR = new BufferedReader(FR);
                    
                    String linea;//variable para leer linea por linea el archivo de entrada
                    if (path.compareTo(archivo.getAbsolutePath()) == 0) {
                        JOptionPane.showMessageDialog(this, "Archivo Abierto", "Aviso", JOptionPane.ERROR_MESSAGE);
                        
                    } else {
                        path = archivo.getAbsolutePath();
                        txtaContenido.setText(null);//limpiamos el textArea antes de sobreescribir
                        while ((linea = BR.readLine()) != null) { //cuando termina el texto del archivo?
                            txtaContenido.append(linea + "\n");//utilizamos append para escribir en el textArea
                            
                        }
                        this.setTitle(archivo.getName() + ": Editor");
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Archivo no soportado", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
                
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (null != FR) {
                        FR.close();
                    }
                    
                } catch (IOException ex) {
                    ex.printStackTrace();
                    //Logger.getLogger(fileChooser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_mnuFileOpenActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Editor2().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnuFileAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_mnuFileAncestorRemoved
//POR EL MOMENTO NO HAY NADA
    }//GEN-LAST:event_mnuFileAncestorRemoved

    private void jMenuItem8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem8MouseClicked
// POR EL MOMENTO NO HAY NADA
    }//GEN-LAST:event_jMenuItem8MouseClicked

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
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenu mnuEdit;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuFileOpen;
    private javax.swing.JMenuItem mnuFileSave;
    private javax.swing.JMenu mnuFormat;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuView;
    private javax.swing.JTextArea txtaContenido;
    // End of variables declaration//GEN-END:variables
}
