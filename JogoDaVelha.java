
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class JogoDaVelha extends javax.swing.JFrame {

    boolean vezDoX = true;
    boolean jogoFinalizado = false;

    public JogoDaVelha() {
        initComponents();
        reiniciarJogo();
    }

    public void adicionarElemento(JButton botao) {
        if (jogoFinalizado) {
            return;
        }

        if (!botao.getText().equals("")) {
            return;
        }

        if (vezDoX) {
            botao.setText("X");
            VezX.setText("O");
        } else {
            botao.setText("O");
            VezX.setText("X");
        }

        verificarVencedor();
        vezDoX = !vezDoX;
    }

    public void verificarVencedor() {
        String q1 = Quadrado1.getText();
        String q2 = Quadrado2.getText();
        String q3 = Quadrado3.getText();
        String q4 = Quadrado4.getText();
        String q5 = Quadrado5.getText();
        String q6 = Quadrado6.getText();
        String q7 = Quadrado7.getText();
        String q8 = Quadrado8.getText();
        String q9 = Quadrado9.getText();

        // Linhas
        if (!q1.equals("") && q1.equals(q2) && q2.equals(q3)) {
            mostrarVencedor(q1);
            return;
        }
        if (!q4.equals("") && q4.equals(q5) && q5.equals(q6)) {
            mostrarVencedor(q4);
            return;
        }
        if (!q7.equals("") && q7.equals(q8) && q8.equals(q9)) {
            mostrarVencedor(q7);
            return;
        }

        // Colunas
        if (!q1.equals("") && q1.equals(q4) && q4.equals(q7)) {
            mostrarVencedor(q1);
            return;
        }
        if (!q2.equals("") && q2.equals(q5) && q5.equals(q8)) {
            mostrarVencedor(q2);
            return;
        }
        if (!q3.equals("") && q3.equals(q6) && q6.equals(q9)) {
            mostrarVencedor(q3);
            return;
        }

        // Diagonais
        if (!q1.equals("") && q1.equals(q5) && q5.equals(q9)) {
            mostrarVencedor(q1);
            return;
        }
        if (!q3.equals("") && q3.equals(q5) && q5.equals(q7)) {
            mostrarVencedor(q3);
            return;
        }

        // Empate
        if (!q1.equals("") && !q2.equals("") && !q3.equals("")
                && !q4.equals("") && !q5.equals("") && !q6.equals("")
                && !q7.equals("") && !q8.equals("") && !q9.equals("")) {
            JOptionPane.showMessageDialog(this, "Deu empate!");
            jogoFinalizado = true;
        }
    }

    public void mostrarVencedor(String jogador) {
        JOptionPane.showMessageDialog(this, "Jogador " + jogador + " venceu!");
        jogoFinalizado = true;
    }

    public void reiniciarJogo() {
        Quadrado1.setText("");
        Quadrado2.setText("");
        Quadrado3.setText("");
        Quadrado4.setText("");
        Quadrado5.setText("");
        Quadrado6.setText("");
        Quadrado7.setText("");
        Quadrado8.setText("");
        Quadrado9.setText("");

        vezDoX = true;
        jogoFinalizado = false;
        VezX.setText("X");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Quadrado1 = new javax.swing.JButton();
        Quadrado4 = new javax.swing.JButton();
        Quadrado7 = new javax.swing.JButton();
        Quadrado2 = new javax.swing.JButton();
        Quadrado5 = new javax.swing.JButton();
        Quadrado8 = new javax.swing.JButton();
        Quadrado3 = new javax.swing.JButton();
        Quadrado6 = new javax.swing.JButton();
        Quadrado9 = new javax.swing.JButton();
        Recomecar = new javax.swing.JButton();
        Vez = new javax.swing.JLabel();
        VezX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Quadrado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quadrado1ActionPerformed(evt);
            }
        });

        Quadrado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quadrado4ActionPerformed(evt);
            }
        });

        Quadrado7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quadrado7ActionPerformed(evt);
            }
        });

        Quadrado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quadrado2ActionPerformed(evt);
            }
        });

        Quadrado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quadrado5ActionPerformed(evt);
            }
        });

        Quadrado8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quadrado8ActionPerformed(evt);
            }
        });

        Quadrado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quadrado3ActionPerformed(evt);
            }
        });

        Quadrado6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quadrado6ActionPerformed(evt);
            }
        });

        Quadrado9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quadrado9ActionPerformed(evt);
            }
        });

        Recomecar.setText("Recomeçar");
        Recomecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecomecarActionPerformed(evt);
            }
        });

        Vez.setText("VEZ: ");

        VezX.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VezX.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Quadrado7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quadrado4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quadrado1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Quadrado5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Quadrado2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quadrado8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Quadrado6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Quadrado3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quadrado9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Recomecar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Vez)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VezX)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Quadrado1, Quadrado2, Quadrado3, Quadrado4, Quadrado5, Quadrado6, Quadrado7, Quadrado8, Quadrado9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VezX, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Quadrado3)
                        .addGap(18, 18, 18)
                        .addComponent(Quadrado6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Quadrado9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Quadrado2)
                            .addGap(18, 18, 18)
                            .addComponent(Quadrado5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Quadrado8))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(Quadrado1)
                            .addGap(18, 18, 18)
                            .addComponent(Quadrado4)
                            .addGap(18, 18, 18)
                            .addComponent(Quadrado7))))
                .addGap(21, 21, 21)
                .addComponent(Recomecar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Quadrado1, Quadrado2, Quadrado3, Quadrado4, Quadrado5, Quadrado6, Quadrado7, Quadrado8, Quadrado9});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RecomecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecomecarActionPerformed
        reiniciarJogo();
    }//GEN-LAST:event_RecomecarActionPerformed

    private void Quadrado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quadrado1ActionPerformed
        adicionarElemento(Quadrado1);
    }//GEN-LAST:event_Quadrado1ActionPerformed

    private void Quadrado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quadrado2ActionPerformed
        adicionarElemento(Quadrado2);
    }//GEN-LAST:event_Quadrado2ActionPerformed

    private void Quadrado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quadrado3ActionPerformed
        adicionarElemento(Quadrado3);
    }//GEN-LAST:event_Quadrado3ActionPerformed

    private void Quadrado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quadrado4ActionPerformed
        adicionarElemento(Quadrado4);
    }//GEN-LAST:event_Quadrado4ActionPerformed

    private void Quadrado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quadrado5ActionPerformed
        adicionarElemento(Quadrado5);
    }//GEN-LAST:event_Quadrado5ActionPerformed

    private void Quadrado6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quadrado6ActionPerformed
        adicionarElemento(Quadrado6);
    }//GEN-LAST:event_Quadrado6ActionPerformed

    private void Quadrado7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quadrado7ActionPerformed
        adicionarElemento(Quadrado7);
    }//GEN-LAST:event_Quadrado7ActionPerformed

    private void Quadrado8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quadrado8ActionPerformed
        adicionarElemento(Quadrado8);
    }//GEN-LAST:event_Quadrado8ActionPerformed

    private void Quadrado9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quadrado9ActionPerformed
        adicionarElemento(Quadrado9);
    }//GEN-LAST:event_Quadrado9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Quadrado1;
    private javax.swing.JButton Quadrado2;
    private javax.swing.JButton Quadrado3;
    private javax.swing.JButton Quadrado4;
    private javax.swing.JButton Quadrado5;
    private javax.swing.JButton Quadrado6;
    private javax.swing.JButton Quadrado7;
    private javax.swing.JButton Quadrado8;
    private javax.swing.JButton Quadrado9;
    private javax.swing.JButton Recomecar;
    private javax.swing.JLabel Vez;
    private javax.swing.JLabel VezX;
    // End of variables declaration//GEN-END:variables
}
