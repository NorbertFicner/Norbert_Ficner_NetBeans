/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listazakupow;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author zalman
 */
public class ListaZakupow extends javax.swing.JFrame {

    /**
     * Creates new form ListaZakupow
     */
    public ListaZakupow() {
        initComponents();
        
        FileUtils fu = new FileUtils();
        jTextAreaText.setText(fu.readFromFile());
        
        addKeyListenerTojTextFieldWpiszCoKupiles();
        addKeyListenerTojTextFieldPodajWartosc();
        addKeyListenerTojjTextFieldDataZakupu();
        addTooltipToElements();
        fillCBProducts();
        ileProduktow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelWprowadzZakupy = new javax.swing.JPanel();
        jLabelWpiszcoKup = new javax.swing.JLabel();
        jLabelPodajWar = new javax.swing.JLabel();
        jLabelTypZakTow = new javax.swing.JLabel();
        jLabelDatZak = new javax.swing.JLabel();
        jTextFieldWpiszCoKupiles = new javax.swing.JTextField();
        jTextFieldPodajWartosc = new javax.swing.JTextField();
        jComboBoxTypZakupionegoTowaru = new javax.swing.JComboBox<>();
        jTextFieldDataZakupu = new javax.swing.JTextField();
        jButtonZapisz = new javax.swing.JButton();
        jLabelWydatkiZDzisiaj = new javax.swing.JLabel();
        jLabelWydatkiZTygodnia = new javax.swing.JLabel();
        jTextFieldWydatkiZDzisiaj = new javax.swing.JTextField();
        jTextFieldWydatkiZTygodnia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaText = new javax.swing.JTextArea();
        jLabelDzisiejszeZakupy = new javax.swing.JLabel();
        jPanelListaZakupow = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelWpiszcoKup.setText("Wpisz co kupileś");

        jLabelPodajWar.setText("Podaj wartość");

        jLabelTypZakTow.setText("Typ zakupionego towaru");

        jLabelDatZak.setText("Data zakupu:");

        jTextFieldWpiszCoKupiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldWpiszCoKupilesActionPerformed(evt);
            }
        });

        jComboBoxTypZakupionegoTowaru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonZapisz.setText("ZAPISZ");
        jButtonZapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZapiszActionPerformed(evt);
            }
        });

        jLabelWydatkiZDzisiaj.setText("Wydatki z dzisiaj: ");

        jLabelWydatkiZTygodnia.setText("Wydatki z tygodnia:");

        jTextFieldWydatkiZDzisiaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldWydatkiZDzisiajActionPerformed(evt);
            }
        });

        jTextAreaText.setColumns(20);
        jTextAreaText.setRows(5);
        jScrollPane1.setViewportView(jTextAreaText);

        jLabelDzisiejszeZakupy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDzisiejszeZakupy.setText("Dzisiejsze zakupy");

        javax.swing.GroupLayout jPanelWprowadzZakupyLayout = new javax.swing.GroupLayout(jPanelWprowadzZakupy);
        jPanelWprowadzZakupy.setLayout(jPanelWprowadzZakupyLayout);
        jPanelWprowadzZakupyLayout.setHorizontalGroup(
            jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWprowadzZakupyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelWprowadzZakupyLayout.createSequentialGroup()
                        .addComponent(jLabelWpiszcoKup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(jLabelPodajWar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTypZakTow, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWprowadzZakupyLayout.createSequentialGroup()
                        .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelWprowadzZakupyLayout.createSequentialGroup()
                                .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelWprowadzZakupyLayout.createSequentialGroup()
                                        .addComponent(jTextFieldWpiszCoKupiles)
                                        .addGap(14, 14, 14)
                                        .addComponent(jTextFieldPodajWartosc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanelWprowadzZakupyLayout.createSequentialGroup()
                                        .addComponent(jLabelDzisiejszeZakupy)
                                        .addGap(18, 18, 18)))
                                .addComponent(jComboBoxTypZakupionegoTowaru, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)))
                .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldWydatkiZDzisiaj, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonZapisz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDataZakupu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDatZak, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jTextFieldWydatkiZTygodnia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelWydatkiZDzisiaj))
                    .addComponent(jLabelWydatkiZTygodnia))
                .addGap(36, 36, 36))
        );
        jPanelWprowadzZakupyLayout.setVerticalGroup(
            jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWprowadzZakupyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWpiszcoKup)
                    .addComponent(jLabelPodajWar)
                    .addComponent(jLabelTypZakTow)
                    .addComponent(jLabelDatZak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPodajWartosc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldWpiszCoKupiles, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxTypZakupionegoTowaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldDataZakupu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDzisiejszeZakupy)
                    .addComponent(jButtonZapisz, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelWprowadzZakupyLayout.createSequentialGroup()
                        .addComponent(jLabelWydatkiZDzisiaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldWydatkiZDzisiaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabelWydatkiZTygodnia)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldWydatkiZTygodnia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Wprowadź zakupy", jPanelWprowadzZakupy);

        javax.swing.GroupLayout jPanelListaZakupowLayout = new javax.swing.GroupLayout(jPanelListaZakupow);
        jPanelListaZakupow.setLayout(jPanelListaZakupowLayout);
        jPanelListaZakupowLayout.setHorizontalGroup(
            jPanelListaZakupowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jPanelListaZakupowLayout.setVerticalGroup(
            jPanelListaZakupowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lista zakupów", jPanelListaZakupow);

        jMenu1.setText("File");
        jMenuBar.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar.add(jMenu2);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldWydatkiZDzisiajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldWydatkiZDzisiajActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldWydatkiZDzisiajActionPerformed

    private void jTextFieldWpiszCoKupilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldWpiszCoKupilesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldWpiszCoKupilesActionPerformed
    String AktualnyText;
    private void jButtonZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZapiszActionPerformed
        String CoKupic = jTextFieldWpiszCoKupiles.getText().trim();
        String Wartosc = jTextFieldPodajWartosc.getText().trim();
        String KategoriaZakupu =jComboBoxTypZakupionegoTowaru.getSelectedItem().toString().trim();
        String DataZakupu = jTextFieldDataZakupu.getText().trim();
        String Zapis = (CoKupic + ";" + Wartosc + ";" + KategoriaZakupu + ";" + DataZakupu+"\n");
        //AktualnyText =  AktualnyText + Zapis + "\n";
        
        
     
        String PokazWJArea = jTextAreaText.getText() + Zapis.replaceAll(";","\t");
        jTextAreaText.setText(PokazWJArea);
        
        jTextFieldWpiszCoKupiles.setText("");
        jTextFieldPodajWartosc.setText("");
        jTextFieldDataZakupu.setText("");
        
      /*  try{
            FileWriter fw = new FileWriter(file_name);
            fw.write(ZapiszDoPliku);
            fw.close();
        }
        catch(IOException e){
            System.out.println("Błąd " + e);
        }
        */
        FileUtils stf = new FileUtils();
        stf.saveToFile(Zapis);
    }//GEN-LAST:event_jButtonZapiszActionPerformed

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
            java.util.logging.Logger.getLogger(ListaZakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaZakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaZakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaZakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaZakupow().setVisible(true);
            }
        });
    }
    private void addKeyListenerTojTextFieldWpiszCoKupiles(){
        jTextFieldWpiszCoKupiles.addKeyListener(new KeyListener() {
            @Override
         
            public void keyTyped(KeyEvent e) {             
                char ch = e.getKeyChar();
                //int kodascii = (int)ch;
                if(ch >= 65 && ch<= 90 || ch>=97 && ch<=122 || ch == 32 || ch == KeyEvent.VK_BACK_SPACE){
                    jTextFieldWpiszCoKupiles.setEditable(true);
                     //if(e.getKeyChar()==KeyEvent.VK_ENTER){
                        //System.out.println("Wprowadzono dane po nacisnienciu eneteru");
                        //jTextAreaText.setText(jTextFieldWpiszCoKupiles.getText());
                }
                else{
                 jTextFieldWpiszCoKupiles.setEditable(false);

             }
            }
           
            

            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println("2 keyTyped" + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //System.out.println("3 keyTyped" + e.getKeyChar());
            }
        });
    }
    private void addKeyListenerTojTextFieldPodajWartosc(){
        jTextFieldPodajWartosc.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {  
               char ch = e.getKeyChar();
               String temp =  jTextFieldPodajWartosc.getText();              
              
               if(temp.contains(",")){
                   String[]splitted = temp.split(",");
                   if(splitted[1].length() < 2){
               if(ch >= '0' && ch <='9' || ch == KeyEvent.VK_BACK_SPACE ){
                   
                    jTextFieldPodajWartosc.setEditable(true); 
                   
                   //System.out.println("Naciesnieto cyfre " + ch);
               }
               else{
                   jTextFieldPodajWartosc.setEditable(false);
               }
                }
               }
               else{
                    if(ch >= '0' && ch <='9' || ch == KeyEvent.VK_BACK_SPACE || ch == 44 && temp.length() != 0){
                   
                    jTextFieldPodajWartosc.setEditable(true); 
                   
                   //System.out.println("Naciesnieto cyfre " + ch);
               }
               else{
                   jTextFieldPodajWartosc.setEditable(false);
               }
                       
                       
               }
                       
            
            }
            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
              
            }
        });
    }
    
    private void addKeyListenerTojjTextFieldDataZakupu(){
        jTextFieldDataZakupu.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                 String temp = jTextFieldDataZakupu.getText();
                char ch = e.getKeyChar();

               if(ch >= '0' && ch <='9' && temp.length() < 10 || ch == KeyEvent.VK_BACK_SPACE ){
                   jTextFieldDataZakupu.setEditable(true);
                   if((temp.length()== 4 || temp.length() == 7) && ch !=KeyEvent.VK_BACK_SPACE){
                       jTextFieldDataZakupu.setText(temp+'-');  
                   }
               }
               
               
               else{
                   jTextFieldDataZakupu.setEditable(false);
               }               
            }
            @Override
            public void keyPressed(KeyEvent e) {
             
            }

            @Override
            public void keyReleased(KeyEvent e) {
              
            }
        });
        
    }
    
    private void addTooltipToElements(){
        jTextFieldWpiszCoKupiles.setToolTipText("<html>"
                + "<h3>Wprowadź tekst</h3>"
                + "<p>Nie używaj polskich znkaów"
                + "</html>");
        jTextFieldPodajWartosc.setToolTipText("<html>"
                + "<h3>Wprowadź wartość towaru</h3>"
                + "Używaj tylko cyfr i przecinka"
                + "</html>");
        jComboBoxTypZakupionegoTowaru.setToolTipText("<html>"
                + "<h3>Wybierz typ towaru</h3>" );
        jTextFieldDataZakupu.setToolTipText("<html>"
                + "<h3>Wprowadź date zakupu</h3>"
                + "Używaj tylko cyfr"
                + "</html>");
        jButtonZapisz.setToolTipText("<html>"
         + "<h3>Kliknij aby zapisać wpisane dane</h3>"
         + "KLIKNIJ!!!"
         + "</html>");
        
    }
        
    private void fillCBProducts(){

        try{
            Scanner sc = new Scanner (new File (product_type));
            jComboBoxTypZakupionegoTowaru.removeAllItems();
            while(sc.hasNext()){
                jComboBoxTypZakupionegoTowaru.addItem(sc.nextLine());
        }
        }
            catch (FileNotFoundException ex) {
            System.out.print(ex.toString());
        }
        ArtyicleType atu = new ArtyicleType();  
       
        
          }
    private void ileProduktow(){
        HowManyProducts hmpro = new HowManyProducts();
        hmpro.ileProduktow();
    }
    private String product_type = "produkty.txt";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonZapisz;
    private javax.swing.JComboBox<String> jComboBoxTypZakupionegoTowaru;
    private javax.swing.JLabel jLabelDatZak;
    private javax.swing.JLabel jLabelDzisiejszeZakupy;
    private javax.swing.JLabel jLabelPodajWar;
    private javax.swing.JLabel jLabelTypZakTow;
    private javax.swing.JLabel jLabelWpiszcoKup;
    private javax.swing.JLabel jLabelWydatkiZDzisiaj;
    private javax.swing.JLabel jLabelWydatkiZTygodnia;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelListaZakupow;
    private javax.swing.JPanel jPanelWprowadzZakupy;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaText;
    private javax.swing.JTextField jTextFieldDataZakupu;
    private javax.swing.JTextField jTextFieldPodajWartosc;
    private javax.swing.JTextField jTextFieldWpiszCoKupiles;
    private javax.swing.JTextField jTextFieldWydatkiZDzisiaj;
    private javax.swing.JTextField jTextFieldWydatkiZTygodnia;
    // End of variables declaration//GEN-END:variables
}
