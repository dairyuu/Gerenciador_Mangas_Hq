/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import javax.swing.JFrame;

/**
 *
 * @author Sanchez
 */
public class Tela_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Principal
     */
    public Tela_Principal() {
        super("Programa para cadastro de Mangas e Hqs");
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

        button_Deletar_Colecao_Hq = new java.awt.Button();
        button_Deletar_Volumes_Hq = new java.awt.Button();
        button_Pesquisar_Manga = new java.awt.Button();
        button_Adicionar_Manga = new java.awt.Button();
        label2 = new java.awt.Label();
        label1 = new java.awt.Label();
        button_Adicionar_Hq = new java.awt.Button();
        button_Pesquisar_Hq = new java.awt.Button();
        button_Deletar_Volumes_Manga = new java.awt.Button();
        button_Deletar_Colecao_Manga = new java.awt.Button();
        button_Mostrar_Todos_Manga = new java.awt.Button();
        button_Mostrar_Todos_Hq = new java.awt.Button();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        button_Deletar_Colecao_Hq.setLabel("Deletar Coleção");
        button_Deletar_Colecao_Hq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Deletar_Colecao_HqActionPerformed(evt);
            }
        });

        button_Deletar_Volumes_Hq.setLabel("Deletar Volumes");
        button_Deletar_Volumes_Hq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Deletar_Volumes_HqActionPerformed(evt);
            }
        });

        button_Pesquisar_Manga.setLabel("Pesquisar");
        button_Pesquisar_Manga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Pesquisar_MangaActionPerformed(evt);
            }
        });

        button_Adicionar_Manga.setLabel("Adicionar Manga");
        button_Adicionar_Manga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Adicionar_MangaActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label2.setText("HQ");

        label1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label1.setText("Manga");

        button_Adicionar_Hq.setLabel("Adicionar HQ");
        button_Adicionar_Hq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Adicionar_HqActionPerformed(evt);
            }
        });

        button_Pesquisar_Hq.setLabel("Pesquisar");
        button_Pesquisar_Hq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Pesquisar_HqActionPerformed(evt);
            }
        });

        button_Deletar_Volumes_Manga.setLabel("Deletar Volumes");
        button_Deletar_Volumes_Manga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Deletar_Volumes_MangaActionPerformed(evt);
            }
        });

        button_Deletar_Colecao_Manga.setLabel("Deletar Coleção");
        button_Deletar_Colecao_Manga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Deletar_Colecao_MangaActionPerformed(evt);
            }
        });

        button_Mostrar_Todos_Manga.setLabel("Mostrar Todos");
        button_Mostrar_Todos_Manga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Mostrar_Todos_MangaActionPerformed(evt);
            }
        });

        button_Mostrar_Todos_Hq.setLabel("Mostrar Todos");
        button_Mostrar_Todos_Hq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Mostrar_Todos_HqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button_Adicionar_Manga, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button_Pesquisar_Manga, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button_Deletar_Volumes_Manga, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button_Pesquisar_Hq, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button_Adicionar_Hq, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button_Deletar_Volumes_Hq, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button_Deletar_Colecao_Manga, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(button_Mostrar_Todos_Manga, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button_Deletar_Colecao_Hq, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(button_Mostrar_Todos_Hq, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_Adicionar_Manga, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Adicionar_Hq, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_Pesquisar_Manga, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Pesquisar_Hq, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button_Deletar_Volumes_Manga, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_Deletar_Colecao_Manga, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button_Deletar_Volumes_Hq, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_Deletar_Colecao_Hq, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_Mostrar_Todos_Manga, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(button_Mostrar_Todos_Hq, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_Adicionar_MangaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Adicionar_MangaActionPerformed
        // TODO add your handling code here:
        Tela_Add_Manga tela = new Tela_Add_Manga(this);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLocation(400, 190);
        tela.setVisible(true);
    }//GEN-LAST:event_button_Adicionar_MangaActionPerformed

    private void button_Adicionar_HqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Adicionar_HqActionPerformed
        // TODO add your handling code here:
        Tela_Add_Hq tela = new Tela_Add_Hq(this);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLocation(400, 190);
        tela.setVisible(true);
    }//GEN-LAST:event_button_Adicionar_HqActionPerformed

    private void button_Pesquisar_MangaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Pesquisar_MangaActionPerformed
    // TODO add your handling code here:
        Tela_Pesquisar_Manga tela =  new Tela_Pesquisar_Manga(this);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLocation(400, 190);
        tela.setVisible(true);
    }//GEN-LAST:event_button_Pesquisar_MangaActionPerformed

    private void button_Pesquisar_HqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Pesquisar_HqActionPerformed
        // TODO add your handling code here:
        Tela_Pesquisar_Hq tela = new Tela_Pesquisar_Hq(this);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLocation(400, 190);
        tela.setVisible(true);
    }//GEN-LAST:event_button_Pesquisar_HqActionPerformed

    private void button_Deletar_Volumes_MangaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Deletar_Volumes_MangaActionPerformed
        // TODO add your handling code here:
        Tela_Deletar_Volume_Manga tela = new Tela_Deletar_Volume_Manga(this);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLocation(400, 190);
        tela.setVisible(true);
    }//GEN-LAST:event_button_Deletar_Volumes_MangaActionPerformed

    private void button_Deletar_Volumes_HqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Deletar_Volumes_HqActionPerformed
        // TODO add your handling code here:
        Tela_Deletar_Volume_Hq tela = new Tela_Deletar_Volume_Hq(this);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLocation(400, 190);
        tela.setVisible(true);
    }//GEN-LAST:event_button_Deletar_Volumes_HqActionPerformed

    private void button_Deletar_Colecao_MangaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Deletar_Colecao_MangaActionPerformed
        // TODO add your handling code here:
        Tela_Deletar_Colecao_Manga tela = new Tela_Deletar_Colecao_Manga(this);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLocation(400, 190);
        tela.setVisible(true);
    }//GEN-LAST:event_button_Deletar_Colecao_MangaActionPerformed

    private void button_Deletar_Colecao_HqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Deletar_Colecao_HqActionPerformed
        // TODO add your handling code here:
        Tela_Deletar_Colecao_Hq tela = new Tela_Deletar_Colecao_Hq(this);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLocation(400, 190);
        tela.setVisible(true);
    }//GEN-LAST:event_button_Deletar_Colecao_HqActionPerformed

    private void button_Mostrar_Todos_MangaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Mostrar_Todos_MangaActionPerformed
        // TODO add your handling code here:
        Tela_Mostrar_Todos_Mangas tela = new Tela_Mostrar_Todos_Mangas(this);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLocation(450, 150);
        tela.setVisible(true);
    }//GEN-LAST:event_button_Mostrar_Todos_MangaActionPerformed

    private void button_Mostrar_Todos_HqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Mostrar_Todos_HqActionPerformed
        // TODO add your handling code here:
        Tela_Mostrar_Todos_Hq tela = new Tela_Mostrar_Todos_Hq(this);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLocation(450, 150);
        tela.setVisible(true);
    }//GEN-LAST:event_button_Mostrar_Todos_HqActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button_Adicionar_Hq;
    private java.awt.Button button_Adicionar_Manga;
    private java.awt.Button button_Deletar_Colecao_Hq;
    private java.awt.Button button_Deletar_Colecao_Manga;
    private java.awt.Button button_Deletar_Volumes_Hq;
    private java.awt.Button button_Deletar_Volumes_Manga;
    private java.awt.Button button_Mostrar_Todos_Hq;
    private java.awt.Button button_Mostrar_Todos_Manga;
    private java.awt.Button button_Pesquisar_Hq;
    private java.awt.Button button_Pesquisar_Manga;
    private java.awt.Label label1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
