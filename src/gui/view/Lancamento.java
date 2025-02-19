/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.view;

import daos.DaoArmadilha;
import daos.DaoEspecie;
import daos.HibernateDao;
import java.awt.Color;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelos.Armadilha;
import modelos.Especie;
import modelos.LancamentoEspecie;

/**
 *
 * @author fabio
 */
public class Lancamento extends javax.swing.JDialog {

    int cont = 0;
    int grau = 0;
    String color;
    LancamentoEspecie lancamentoEspecie = new LancamentoEspecie();
    Armadilha a = new Armadilha();
    Especie esp = new Especie();
    /**
     * Creates new form Lancamento
     */
    public Lancamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        novo();
        popularLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel18 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLancamento = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLPesqEspecie = new javax.swing.JLabel();
        jTextFieldFiltroEspecie = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListArmadilha = new javax.swing.JList();
        jTextFieldFiltroArmadilha = new javax.swing.JTextField();
        jLPesqArmadilha = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jtLancamentoEspecie = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLancamentoLatitude = new javax.swing.JTextField();
        jLancamentoLongitude = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldArmadilha = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jTNivel1 = new javax.swing.JTextField();
        jTNivel2 = new javax.swing.JTextField();
        jTNivel3 = new javax.swing.JTextField();
        jTNivel4 = new javax.swing.JTextField();
        jTNivel5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListEspecie = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Auto Ecologia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLancamento.setText("Lançar");
        jLancamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLancamentoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("Lançamento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLPesqEspecie.setText("Pesquisa por Espécie");

        jTextFieldFiltroEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFiltroEspecieActionPerformed(evt);
            }
        });
        jTextFieldFiltroEspecie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldFiltroEspecieKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldFiltroEspecieKeyReleased(evt);
            }
        });

        jListArmadilha.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListArmadilhaValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jListArmadilha);

        jTextFieldFiltroArmadilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFiltroArmadilhaActionPerformed(evt);
            }
        });
        jTextFieldFiltroArmadilha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldFiltroArmadilhaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldFiltroArmadilhaKeyReleased(evt);
            }
        });

        jLPesqArmadilha.setText("Pesquisa por Armadilha");

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Espécie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        jPanel15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jtLancamentoEspecie.setEditable(false);
        jtLancamentoEspecie.setColumns(30);
        jtLancamentoEspecie.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jPanel15.add(jtLancamentoEspecie);

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLancamentoLatitude.setEditable(false);
        jLancamentoLatitude.setEnabled(false);

        jLancamentoLongitude.setEditable(false);
        jLancamentoLongitude.setEnabled(false);

        jLabel2.setText("Latitude");

        jLabel3.setText("Longitude");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLancamentoLongitude)
                    .addComponent(jLancamentoLatitude)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 119, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLancamentoLatitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLancamentoLongitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Armadilha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        jTextFieldArmadilha.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTextFieldArmadilha, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldArmadilha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTNivel1.setEditable(false);
        jTNivel1.setBackground(new java.awt.Color(204, 204, 204));
        jTNivel1.setColumns(2);
        jTNivel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTNivel1MouseClicked(evt);
            }
        });
        jTNivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNivel1ActionPerformed(evt);
            }
        });
        jPanel19.add(jTNivel1);

        jTNivel2.setEditable(false);
        jTNivel2.setBackground(new java.awt.Color(204, 204, 204));
        jTNivel2.setColumns(2);
        jTNivel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTNivel2MouseClicked(evt);
            }
        });
        jPanel19.add(jTNivel2);

        jTNivel3.setEditable(false);
        jTNivel3.setBackground(new java.awt.Color(204, 204, 204));
        jTNivel3.setColumns(2);
        jTNivel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTNivel3MouseClicked(evt);
            }
        });
        jPanel19.add(jTNivel3);

        jTNivel4.setEditable(false);
        jTNivel4.setBackground(new java.awt.Color(204, 204, 204));
        jTNivel4.setColumns(2);
        jTNivel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTNivel4MouseClicked(evt);
            }
        });
        jPanel19.add(jTNivel4);

        jTNivel5.setEditable(false);
        jTNivel5.setBackground(new java.awt.Color(204, 204, 204));
        jTNivel5.setColumns(2);
        jTNivel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTNivel5MouseClicked(evt);
            }
        });
        jPanel19.add(jTNivel5);

        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jListEspecie.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListEspecieValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(jListEspecie);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldFiltroEspecie, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jLPesqEspecie)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLPesqArmadilha)
                            .addComponent(jTextFieldFiltroArmadilha, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLancamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLPesqEspecie)
                            .addComponent(jLPesqArmadilha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFiltroEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFiltroArmadilha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLancamento)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFiltroEspecieKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFiltroEspecieKeyPressed

    }//GEN-LAST:event_jTextFieldFiltroEspecieKeyPressed

    private void jTextFieldFiltroEspecieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFiltroEspecieKeyReleased
        popularLista();
    }//GEN-LAST:event_jTextFieldFiltroEspecieKeyReleased

    private void jListArmadilhaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListArmadilhaValueChanged
        obterArmadilha();
    }//GEN-LAST:event_jListArmadilhaValueChanged

    private void jTextFieldFiltroArmadilhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFiltroArmadilhaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFiltroArmadilhaKeyPressed

    private void jTextFieldFiltroArmadilhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFiltroArmadilhaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFiltroArmadilhaKeyReleased

    private void jTNivel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNivel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNivel1ActionPerformed

    private void jTextFieldFiltroEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFiltroEspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFiltroEspecieActionPerformed

    private void jTextFieldFiltroArmadilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFiltroArmadilhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFiltroArmadilhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTNivel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTNivel1MouseClicked
        if (cont == 0) {

            jTNivel1.setBackground(Color.decode("#66FF66"));

            jTNivel2.setBackground(Color.decode("#CCCCCC"));
            jTNivel3.setBackground(Color.decode("#CCCCCC"));
            jTNivel4.setBackground(Color.decode("#CCCCCC"));
            jTNivel5.setBackground(Color.decode("#CCCCCC"));
            color = "#66FF66";
            grau = 1;
            cont += 1;
        } else {
            jTNivel1.setBackground(Color.decode("#CCCCCC"));
            jTNivel2.setBackground(Color.decode("#CCCCCC"));

            jTNivel3.setBackground(Color.decode("#CCCCCC"));
            jTNivel4.setBackground(Color.decode("#CCCCCC"));
            jTNivel5.setBackground(Color.decode("#CCCCCC"));
            color = "#CCCCCC";
            grau = 0;
            cont = 0;
        }
    }//GEN-LAST:event_jTNivel1MouseClicked

    private void jTNivel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTNivel2MouseClicked
        jTNivel1.setBackground(Color.decode("#66FF66"));
        jTNivel2.setBackground(Color.decode("#00CC00"));

        jTNivel3.setBackground(Color.decode("#CCCCCC"));
        jTNivel4.setBackground(Color.decode("#CCCCCC"));
        jTNivel5.setBackground(Color.decode("#CCCCCC"));
        cont = 0;
        color = "#00CC00";
        grau = 2;
    }//GEN-LAST:event_jTNivel2MouseClicked

    private void jTNivel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTNivel3MouseClicked
        jTNivel1.setBackground(Color.decode("#66FF66"));
        jTNivel2.setBackground(Color.decode("#00CC00"));
        jTNivel3.setBackground(Color.YELLOW);

        jTNivel4.setBackground(Color.decode("#CCCCCC"));
        jTNivel5.setBackground(Color.decode("#CCCCCC"));
        cont = 0;
        color = "YELLOW";
        grau = 3;
        
    }//GEN-LAST:event_jTNivel3MouseClicked

    private void jTNivel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTNivel4MouseClicked
        jTNivel1.setBackground(Color.decode("#66FF66"));
        jTNivel2.setBackground(Color.decode("#00CC00"));
        jTNivel3.setBackground(Color.YELLOW);
        jTNivel4.setBackground(Color.red);

        jTNivel5.setBackground(Color.decode("#CCCCCC"));
        cont = 0;
        color = "red";
        grau = 4;
    }//GEN-LAST:event_jTNivel4MouseClicked

    private void jTNivel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTNivel5MouseClicked
        jTNivel1.setBackground(Color.decode("#66FF66"));
        jTNivel2.setBackground(Color.decode("#00CC00"));
        jTNivel3.setBackground(Color.YELLOW);
        jTNivel4.setBackground(Color.red);
        jTNivel5.setBackground(Color.decode("#670000"));
        cont = 0;
        color = "#670000";
        grau = 5;
    }//GEN-LAST:event_jTNivel5MouseClicked

    private void jLancamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLancamentoActionPerformed
        if (valida() == false) {
            persist();
            JOptionPane.showMessageDialog(null, "Lançamento realizado com sucesso");
        }
    }//GEN-LAST:event_jLancamentoActionPerformed

    private void jListEspecieValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListEspecieValueChanged
        obterEspecie();
    }//GEN-LAST:event_jListEspecieValueChanged

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
            java.util.logging.Logger.getLogger(Lancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Lancamento dialog = new Lancamento(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLPesqArmadilha;
    private javax.swing.JLabel jLPesqEspecie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jLancamento;
    private javax.swing.JTextField jLancamentoLatitude;
    private javax.swing.JTextField jLancamentoLongitude;
    private javax.swing.JList jListArmadilha;
    private javax.swing.JList jListEspecie;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTNivel1;
    private javax.swing.JTextField jTNivel2;
    private javax.swing.JTextField jTNivel3;
    private javax.swing.JTextField jTNivel4;
    private javax.swing.JTextField jTNivel5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldArmadilha;
    private javax.swing.JTextField jTextFieldFiltroArmadilha;
    private javax.swing.JTextField jTextFieldFiltroEspecie;
    private javax.swing.JTextField jtLancamentoEspecie;
    // End of variables declaration//GEN-END:variables

    private void popularLista() {
        List<Especie> especies;
        List<Armadilha> armadilhas;
            especies = new DaoEspecie().retrieveNomeEspecie(jTextFieldFiltroEspecie.getText());
        try {

            armadilhas = new DaoArmadilha().retrieveNomeArmadilha(Integer.parseInt(jTextFieldFiltroArmadilha.toString()));


        } catch (Exception e) {
            armadilhas = new DaoArmadilha().retrieveArmadilha();
            especies = new DaoEspecie().retrieveEspecie();
        }
        DefaultListModel dlm = new DefaultListModel();
        for (Especie especie : especies) {
            dlm.add(0, especie);
        }

        jListEspecie.setModel(dlm);

        dlm = new DefaultListModel();
        for (Armadilha armadilha : armadilhas) {
            dlm.add(0, armadilha);
        }
        jListArmadilha.setModel(dlm);
    }


    private void novo() {

    }

    private void obterArmadilha() {
        if (jListArmadilha.getSelectedIndex() == -1) {
            return;
        }

        a = (Armadilha) jListArmadilha.getSelectedValue();

        jTextFieldArmadilha.setText(String.valueOf(a.getId()));
        jLancamentoLatitude.setText(String.valueOf(a.getLatitude()));
        jLancamentoLongitude.setText(String.valueOf(a.getLongitude()));
    }

    private void obterEspecie() {
        if (jListEspecie.getSelectedIndex() == -1) {
            return;
        }
        esp = (Especie) jListEspecie.getSelectedValue();
        jtLancamentoEspecie.setText(esp.getNomeEspecie());

    }

    private boolean valida() {
        StringBuilder builder = new StringBuilder();

        if (jTextFieldArmadilha.getText().trim().length() <= 0) {
            jTextFieldArmadilha.setBackground(Color.red);
            builder.append("Armadilha Obrigatório \n");
        } else {
            jTextFieldArmadilha.setBackground(Color.white);

        }
        if (jTextArea1.getText().trim().length() <= 0) {
            jTextArea1.setBackground(Color.red);
            builder.append("Auto Ecologia Obrigatória \n");
        } else {
            jTextArea1.setBackground(Color.white);

        }
        if (jtLancamentoEspecie.getText().trim().length() <= 0) {
            jtLancamentoEspecie.setBackground(Color.red);
            builder.append("Especie Obrigatório \n");
        } else {
            jtLancamentoEspecie.setBackground(Color.white);

        }
       

        if (builder.length() > 0) {
            JOptionPane.showMessageDialog(null, builder.toString());
            return true;
        }
        return false;
    }

    private void persist() {
        lancamentoEspecie.setArmadilha(a);
        lancamentoEspecie.setEspecie(esp);
        lancamentoEspecie.setAutoEcologia(jTextArea1.getText());
        lancamentoEspecie.setCorGrauEst(color);
        lancamentoEspecie.setGrauEst(grau);
        lancamentoEspecie.setDate(Calendar.getInstance());
        
        new HibernateDao<LancamentoEspecie>().persistir(lancamentoEspecie);
        dispose();
    }
}
