/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kalkulator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author zalman
 */
public class kalkulator extends javax.swing.JFrame {

    /**
     * Creates new form kalkulator
     */
    public kalkulator() {
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

        nf_jPanel1 = new javax.swing.JPanel();
        nf_jTextFieldObliczenia = new javax.swing.JTextField();
        nf_jButton7 = new javax.swing.JButton();
        nf_jButton4 = new javax.swing.JButton();
        nf_jButton1 = new javax.swing.JButton();
        nf_jButton2 = new javax.swing.JButton();
        nf_jButton5 = new javax.swing.JButton();
        nf_jButton8 = new javax.swing.JButton();
        nf_jButton9 = new javax.swing.JButton();
        nf_jButton6 = new javax.swing.JButton();
        nf_jButton3 = new javax.swing.JButton();
        nf_jButton0 = new javax.swing.JButton();
        nf_jButtonCE = new javax.swing.JButton();
        nf_jButtonPrzecinek = new javax.swing.JButton();
        nf_jButtonDodawanie = new javax.swing.JButton();
        nf_jButtonDzielenie = new javax.swing.JButton();
        nf_jButtonMnozenie = new javax.swing.JButton();
        nf_jButtonOdejmowanie = new javax.swing.JButton();
        nf_jButtonPierwiastkowanie = new javax.swing.JButton();
        nf_jButtonPiotegowanie = new javax.swing.JButton();
        nf_jButtonRowna = new javax.swing.JButton();
        nf_jLabelObliczenia = new javax.swing.JLabel();
        nf_jMenuBar = new javax.swing.JMenuBar();
        nf_jMenuPlik = new javax.swing.JMenu();
        nf_jCheckBoxMenuItemZapis = new javax.swing.JCheckBoxMenuItem();
        nf_jMenuItemZamknij = new javax.swing.JMenuItem();
        nf_jMenu_Tools = new javax.swing.JMenu();
        jMenuItemIleDniMieDat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator Norbert Ficner");
        setResizable(false);

        nf_jTextFieldObliczenia.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nf_jTextFieldObliczenia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nf_jTextFieldObliczenia.setToolTipText("");

        nf_jButton7.setText("7");
        nf_jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButton7ActionPerformed(evt);
            }
        });

        nf_jButton4.setText("4");
        nf_jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButton4ActionPerformed(evt);
            }
        });

        nf_jButton1.setText("1");
        nf_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButton1ActionPerformed(evt);
            }
        });

        nf_jButton2.setText("2");
        nf_jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButton2ActionPerformed(evt);
            }
        });

        nf_jButton5.setText("5");
        nf_jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButton5ActionPerformed(evt);
            }
        });

        nf_jButton8.setText("8");
        nf_jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButton8ActionPerformed(evt);
            }
        });

        nf_jButton9.setText("9");
        nf_jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButton9ActionPerformed(evt);
            }
        });

        nf_jButton6.setText("6");
        nf_jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButton6ActionPerformed(evt);
            }
        });

        nf_jButton3.setText("3");
        nf_jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButton3ActionPerformed(evt);
            }
        });

        nf_jButton0.setText("0");
        nf_jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButton0ActionPerformed(evt);
            }
        });

        nf_jButtonCE.setText("CE");
        nf_jButtonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButtonCEActionPerformed(evt);
            }
        });

        nf_jButtonPrzecinek.setText(",");
        nf_jButtonPrzecinek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButtonPrzecinekActionPerformed(evt);
            }
        });

        nf_jButtonDodawanie.setText("+");
        nf_jButtonDodawanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButtonDodawanieActionPerformed(evt);
            }
        });

        nf_jButtonDzielenie.setText("/");
        nf_jButtonDzielenie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButtonDzielenieActionPerformed(evt);
            }
        });

        nf_jButtonMnozenie.setText("*");
        nf_jButtonMnozenie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButtonMnozenieActionPerformed(evt);
            }
        });

        nf_jButtonOdejmowanie.setText("-");
        nf_jButtonOdejmowanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButtonOdejmowanieActionPerformed(evt);
            }
        });

        nf_jButtonPierwiastkowanie.setText("√");
        nf_jButtonPierwiastkowanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButtonPierwiastkowanieActionPerformed(evt);
            }
        });

        nf_jButtonPiotegowanie.setText("pot.");
        nf_jButtonPiotegowanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButtonPiotegowanieActionPerformed(evt);
            }
        });

        nf_jButtonRowna.setText("=");
        nf_jButtonRowna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jButtonRownaActionPerformed(evt);
            }
        });

        nf_jLabelObliczenia.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout nf_jPanel1Layout = new javax.swing.GroupLayout(nf_jPanel1);
        nf_jPanel1.setLayout(nf_jPanel1Layout);
        nf_jPanel1Layout.setHorizontalGroup(
            nf_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nf_jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nf_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nf_jLabelObliczenia, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nf_jTextFieldObliczenia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, nf_jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(nf_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nf_jPanel1Layout.createSequentialGroup()
                                .addGroup(nf_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(nf_jPanel1Layout.createSequentialGroup()
                                        .addComponent(nf_jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nf_jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(nf_jPanel1Layout.createSequentialGroup()
                                        .addComponent(nf_jButtonCE, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nf_jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nf_jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(nf_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(nf_jPanel1Layout.createSequentialGroup()
                                        .addComponent(nf_jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nf_jButtonDzielenie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(nf_jPanel1Layout.createSequentialGroup()
                                        .addComponent(nf_jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nf_jButtonMnozenie, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(nf_jPanel1Layout.createSequentialGroup()
                                .addComponent(nf_jButtonPrzecinek, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(nf_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(nf_jPanel1Layout.createSequentialGroup()
                                        .addComponent(nf_jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nf_jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(nf_jPanel1Layout.createSequentialGroup()
                                        .addComponent(nf_jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nf_jButtonPiotegowanie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(nf_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nf_jButtonPierwiastkowanie, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nf_jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(nf_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nf_jButtonOdejmowanie, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nf_jButtonDodawanie, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(nf_jButtonRowna, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nf_jPanel1Layout.setVerticalGroup(
            nf_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nf_jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nf_jTextFieldObliczenia, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nf_jLabelObliczenia, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nf_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nf_jPanel1Layout.createSequentialGroup()
                        .addGroup(nf_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(nf_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nf_jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nf_jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nf_jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nf_jButtonCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nf_jButtonMnozenie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(nf_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nf_jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nf_jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(nf_jPanel1Layout.createSequentialGroup()
                                .addComponent(nf_jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(nf_jButtonDzielenie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(nf_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nf_jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(nf_jButtonDodawanie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nf_jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nf_jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(nf_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nf_jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nf_jButtonOdejmowanie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nf_jButtonPiotegowanie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nf_jButtonPierwiastkowanie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nf_jButtonPrzecinek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(nf_jButtonRowna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        nf_jMenuPlik.setText("Plik");

        nf_jCheckBoxMenuItemZapis.setSelected(true);
        nf_jCheckBoxMenuItemZapis.setText("Zapis historii działań");
        nf_jCheckBoxMenuItemZapis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jCheckBoxMenuItemZapisActionPerformed(evt);
            }
        });
        nf_jMenuPlik.add(nf_jCheckBoxMenuItemZapis);

        nf_jMenuItemZamknij.setText("Zamknij");
        nf_jMenuItemZamknij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf_jMenuItemZamknijActionPerformed(evt);
            }
        });
        nf_jMenuPlik.add(nf_jMenuItemZamknij);

        nf_jMenuBar.add(nf_jMenuPlik);

        nf_jMenu_Tools.setText("Tools");

        jMenuItemIleDniMieDat.setText("Ile dni pomiedzy datami");
        jMenuItemIleDniMieDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIleDniMieDatActionPerformed(evt);
            }
        });
        nf_jMenu_Tools.add(jMenuItemIleDniMieDat);

        nf_jMenuBar.add(nf_jMenu_Tools);

        setJMenuBar(nf_jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nf_jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nf_jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nf_jCheckBoxMenuItemZapisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jCheckBoxMenuItemZapisActionPerformed
    }//GEN-LAST:event_nf_jCheckBoxMenuItemZapisActionPerformed

    private void nf_jMenuItemZamknijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jMenuItemZamknijActionPerformed
        System.exit(0);
    }//GEN-LAST:event_nf_jMenuItemZamknijActionPerformed

    private void nf_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButton1ActionPerformed

        nf_jTextFieldObliczenia.setText(nf_jTextFieldObliczenia.getText() + "1");
    }//GEN-LAST:event_nf_jButton1ActionPerformed

    private void nf_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButton2ActionPerformed

        nf_jTextFieldObliczenia.setText(nf_jTextFieldObliczenia.getText() + "2");
    }//GEN-LAST:event_nf_jButton2ActionPerformed

    private void nf_jButtonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButtonCEActionPerformed
        nf_jTextFieldObliczenia.setText("");
    }//GEN-LAST:event_nf_jButtonCEActionPerformed

    private void nf_jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButton3ActionPerformed

        nf_jTextFieldObliczenia.setText(nf_jTextFieldObliczenia.getText() + "3");
    }//GEN-LAST:event_nf_jButton3ActionPerformed

    private void nf_jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButton4ActionPerformed

        nf_jTextFieldObliczenia.setText(nf_jTextFieldObliczenia.getText() + "4");
    }//GEN-LAST:event_nf_jButton4ActionPerformed

    private void nf_jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButton5ActionPerformed

        nf_jTextFieldObliczenia.setText(nf_jTextFieldObliczenia.getText() + "5");
    }//GEN-LAST:event_nf_jButton5ActionPerformed

    private void nf_jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButton6ActionPerformed

        nf_jTextFieldObliczenia.setText(nf_jTextFieldObliczenia.getText() + "6");
    }//GEN-LAST:event_nf_jButton6ActionPerformed

    private void nf_jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButton7ActionPerformed

        nf_jTextFieldObliczenia.setText(nf_jTextFieldObliczenia.getText() + "7");
    }//GEN-LAST:event_nf_jButton7ActionPerformed

    private void nf_jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButton8ActionPerformed

        nf_jTextFieldObliczenia.setText(nf_jTextFieldObliczenia.getText() + "8");
    }//GEN-LAST:event_nf_jButton8ActionPerformed

    private void nf_jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButton9ActionPerformed

        nf_jTextFieldObliczenia.setText(nf_jTextFieldObliczenia.getText() + "9");
    }//GEN-LAST:event_nf_jButton9ActionPerformed
    
    private void nf_jButtonDodawanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButtonDodawanieActionPerformed
        wybordzialania = 1;
        liczba1 = Double.parseDouble(nf_jTextFieldObliczenia.getText());
        nf_jTextFieldObliczenia.setText("");
        
    }//GEN-LAST:event_nf_jButtonDodawanieActionPerformed

    private void nf_jButtonRownaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButtonRownaActionPerformed
       
        liczba2 = Double.parseDouble(nf_jTextFieldObliczenia.getText()); 
        
        switch(wybordzialania){
           case 1:
               wynik = liczba1 + liczba2;
               nf_jTextFieldObliczenia.setText(wynik + "");
               break;
           case 2:
               wynik = liczba1 - liczba2;
               nf_jTextFieldObliczenia.setText(wynik + "");
               break;
           case 3:
               wynik = liczba1 * liczba2;
               nf_jTextFieldObliczenia.setText(wynik + "");
               break;
           case 4:                    
               if(liczba1 == 0|| liczba2 == 0){
                   nf_jTextFieldObliczenia.setText(wynik + "0");
               }
               else{
                    wynik = liczba1 / liczba2;
                    nf_jTextFieldObliczenia.setText(wynik + "");
                    break;       
               }
           case 5:
               wynik = Math.pow(liczba1,liczba2);
                nf_jTextFieldObliczenia.setText(wynik + "");         
        }        
               
        wybordzialania = 0;
        
    }//GEN-LAST:event_nf_jButtonRownaActionPerformed

    private void nf_jButtonPrzecinekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButtonPrzecinekActionPerformed
        nf_jTextFieldObliczenia.setText(nf_jTextFieldObliczenia.getText() + ".");
    }//GEN-LAST:event_nf_jButtonPrzecinekActionPerformed

    private void nf_jButtonOdejmowanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButtonOdejmowanieActionPerformed
        wybordzialania = 2;
        liczba1 = Double.parseDouble(nf_jTextFieldObliczenia.getText());
        nf_jTextFieldObliczenia.setText("");
    }//GEN-LAST:event_nf_jButtonOdejmowanieActionPerformed

    private void nf_jButtonMnozenieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButtonMnozenieActionPerformed
        wybordzialania = 3;
        liczba1 = Double.parseDouble(nf_jTextFieldObliczenia.getText());
        nf_jTextFieldObliczenia.setText("");
    }//GEN-LAST:event_nf_jButtonMnozenieActionPerformed

    private void nf_jButtonDzielenieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButtonDzielenieActionPerformed
        wybordzialania = 4;
        liczba1 = Double.parseDouble(nf_jTextFieldObliczenia.getText());
        nf_jTextFieldObliczenia.setText("");
    }//GEN-LAST:event_nf_jButtonDzielenieActionPerformed

    private void nf_jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButton0ActionPerformed
        nf_jTextFieldObliczenia.setText(nf_jTextFieldObliczenia.getText() + "0");
    }//GEN-LAST:event_nf_jButton0ActionPerformed

    private void nf_jButtonPiotegowanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButtonPiotegowanieActionPerformed
        wybordzialania = 5;
        liczba1 = Double.parseDouble(nf_jTextFieldObliczenia.getText());
        nf_jTextFieldObliczenia.setText("");
    }//GEN-LAST:event_nf_jButtonPiotegowanieActionPerformed

    private void nf_jButtonPierwiastkowanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf_jButtonPierwiastkowanieActionPerformed
        liczba1 = Double.parseDouble(nf_jTextFieldObliczenia.getText());
        wynik = Math.sqrt(liczba1);
        nf_jTextFieldObliczenia.setText(wynik + "");     
    }//GEN-LAST:event_nf_jButtonPierwiastkowanieActionPerformed

    private void jMenuItemIleDniMieDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIleDniMieDatActionPerformed
        DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("dd MM yyyy");
        
        String info = "\n";
        while(!info.equals("ok")){
         String data = JOptionPane.showInputDialog("Wprowadz date w formacie dd mm yyyy np: 01 01 2000\n"       
        +""+info);
        if(data != null && data.length()== 10){
             //nf_jTextFieldObliczenia.setText(data);
        LocalDate ldnow = LocalDate.now();
        try{
            LocalDate ldinput = LocalDate.parse(data, formatter);
            //nf_jTextFieldObliczenia.setText(ldnow + " " + ldinput);
            long days = ChronoUnit.DAYS.between(ldinput, ldnow);
             //nf_jTextFieldObliczenia.setText("Ilosc dni: " + days);
            JOptionPane.showMessageDialog(rootPane,days + " dni","Ilość dni", HEIGHT);
            info = "ok";
        }
        catch(DateTimeParseException ex){
            info = "Wprowadzono zły format daty!!";
         }    
        }      
        else{
            info = "ok";
        }
        }      
        
    }//GEN-LAST:event_jMenuItemIleDniMieDatActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator().setVisible(true);
            }
        });
    }
    String minusplus;
    double liczba1, liczba2,wynik;
    int wybordzialania;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItemIleDniMieDat;
    private javax.swing.JButton nf_jButton0;
    private javax.swing.JButton nf_jButton1;
    private javax.swing.JButton nf_jButton2;
    private javax.swing.JButton nf_jButton3;
    private javax.swing.JButton nf_jButton4;
    private javax.swing.JButton nf_jButton5;
    private javax.swing.JButton nf_jButton6;
    private javax.swing.JButton nf_jButton7;
    private javax.swing.JButton nf_jButton8;
    private javax.swing.JButton nf_jButton9;
    private javax.swing.JButton nf_jButtonCE;
    private javax.swing.JButton nf_jButtonDodawanie;
    private javax.swing.JButton nf_jButtonDzielenie;
    private javax.swing.JButton nf_jButtonMnozenie;
    private javax.swing.JButton nf_jButtonOdejmowanie;
    private javax.swing.JButton nf_jButtonPierwiastkowanie;
    private javax.swing.JButton nf_jButtonPiotegowanie;
    private javax.swing.JButton nf_jButtonPrzecinek;
    private javax.swing.JButton nf_jButtonRowna;
    private javax.swing.JCheckBoxMenuItem nf_jCheckBoxMenuItemZapis;
    private javax.swing.JLabel nf_jLabelObliczenia;
    private javax.swing.JMenuBar nf_jMenuBar;
    private javax.swing.JMenuItem nf_jMenuItemZamknij;
    private javax.swing.JMenu nf_jMenuPlik;
    private javax.swing.JMenu nf_jMenu_Tools;
    private javax.swing.JPanel nf_jPanel1;
    private javax.swing.JTextField nf_jTextFieldObliczenia;
    // End of variables declaration//GEN-END:variables
}
