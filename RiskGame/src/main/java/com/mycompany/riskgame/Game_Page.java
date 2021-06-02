/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.riskgame;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import com.mycompany.riskgame.SClient;
import com.mycompany.riskgame.Server;
import javax.swing.JTextField;
 

/**
 *
 * @author x
 */
public class Game_Page extends javax.swing.JFrame {


    /**
     * Creates new form Game_Page
     */
    public static Game_Page ThisGame;
    Random rand;
    public Thread tmr;
    ImageIcon icons_right[];
    ImageIcon icons_left[];
    ImageIcon icons[];
    public Players_Page parent3;
    public int rivalselection = -1;
    public int myselection = -1;

    public Game_Page() {

//        try {
            initComponents();
            ThisGame=this;
            btn_a.setBackground(Color.red);
            btn_b.setBackground(Color.blue);
            btn_c.setBackground(Color.yellow);
            btn_d.setBackground(Color.red);
            btn_e.setBackground(Color.yellow);
            btn_f.setBackground(Color.blue);
            btn_g.setBackground(Color.red);
            btn_h.setBackground(Color.blue);
            
          //   icons[0] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("gri.png"))).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));

//
//            ThisGame = this;
//            rand = new Random();
//
//            icons_right = new ImageIcon[7];
//            icons_right[0] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die0.png"))).getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
//            icons_right[1] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die1.png"))).getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
//            icons_right[2] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die2.png"))).getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
//            icons_right[3] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die3.png"))).getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
//            icons_right[4] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die4.png"))).getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
//            icons_right[5] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die5.png"))).getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
//            icons_right[6] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die6.png"))).getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
//
//            icons_left = new ImageIcon[7];
//            icons_left[0] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die0.png"))).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
//            icons_left[1] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die1.png"))).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
//            icons_left[2] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die2.png"))).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
//            icons_left[3] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die3.png"))).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
//            icons_left[4] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die4.png"))).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
//            icons_left[5] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die5.png"))).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
//            icons_left[6] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die6.png"))).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
//
//        } catch (IOException ex) {
//            Logger.getLogger(Game_Page.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        jLabel3.setIcon(icons_right[0]);
//        jLabel4.setIcon(icons_left[0]);
//        tmr = new Thread();
//        
//        while (SClient.socket.isConnected()) {
//            try {
//                Thread.sleep(100);
//                if (rivalselection == -1 || myselection == -1) {
//                    int g = rand.nextInt(2);
//                    jLabel4.setIcon(icons_right[g]);
//                } else {
//
//                    jLabel4.setIcon(icons_right[rivalselection]);
//
//                }
//                
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Game_Page.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            
//            
//        }
      //  tmr_slider = new Thread(() ->{}
            
    

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
        btn_a = new javax.swing.JButton();
        btn_b = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_d = new javax.swing.JButton();
        btn_e = new javax.swing.JButton();
        btn_h = new javax.swing.JButton();
        btn_f = new javax.swing.JButton();
        btn_g = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_a.setText("5");
        btn_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aActionPerformed(evt);
            }
        });

        btn_b.setText("3");
        btn_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bActionPerformed(evt);
            }
        });

        btn_c.setText("1");
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });

        btn_d.setText("5");
        btn_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dActionPerformed(evt);
            }
        });

        btn_e.setText("1");
        btn_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eActionPerformed(evt);
            }
        });

        btn_h.setText("3");
        btn_h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hActionPerformed(evt);
            }
        });

        btn_f.setText("3");
        btn_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fActionPerformed(evt);
            }
        });

        btn_g.setText("5");
        btn_g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_b, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_c, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161)
                                .addComponent(btn_h, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btn_d, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_g, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_a, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btn_e, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_f, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_a, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_e, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_b, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_c, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_h, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(btn_d, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_g, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 89, Short.MAX_VALUE)))))
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btn_f, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\x\\Documents\\GitHub\\RiskGame\\RiskGame\\src\\main\\java\\images\\die0.png")); // NOI18N
        jLabel3.setText("Dice1");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\x\\Documents\\GitHub\\RiskGame\\RiskGame\\src\\main\\java\\images\\die0.png")); // NOI18N
        jLabel4.setText("Dice2");

        jButton1.setText("Active");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_fActionPerformed

    private void btn_gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btn_gActionPerformed

    private void btn_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btn_aActionPerformed

    private void btn_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btn_bActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btn_eActionPerformed

    private void btn_hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btn_hActionPerformed

    private void btn_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btn_dActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       // jLabel3.setIcon(new ImageIcon("die1.png"));
try {
            // TODO add your handling code here:
            Random rd=new Random();
            int random=0;
            random=rd.nextInt(6)+1;
            
            icons_right = new ImageIcon[7];
            
           //            
            //icons[0] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("gri.png"))).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
            switch(random){
                case 1:
                    icons_right[1] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die1.png"))).getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));

                   // jLabel3.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("die1.png"))).getImage().getScaledInstance(50, 49, Image.SCALE_DEFAULT)));
                    break;
                case 2:
                   icons_right[2] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die2.png"))).getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
                    //jLabel3.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("die2.png"))).getImage().getScaledInstance(50, 49, Image.SCALE_DEFAULT)));
                    break;
                case 3:
                    icons_right[3] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die3.png"))).getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));

                  //  jLabel3.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("die3.png"))).getImage().getScaledInstance(50, 49, Image.SCALE_DEFAULT)));
                    break;
                case 4:
                    icons_right[4] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die4.png"))).getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));

                  //  jLabel3.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("die4.png"))).getImage().getScaledInstance(50, 49, Image.SCALE_DEFAULT)));
                    break;
                case 5:
                    icons_right[5] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die5.png"))).getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));

                  //  jLabel3.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("die5.png"))).getImage().getScaledInstance(50, 49, Image.SCALE_DEFAULT)));
                    break;
                case 6:
                    icons_right[6] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die6.png"))).getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));

                 //   jLabel3.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("die6.png"))).getImage().getScaledInstance(50, 49, Image.SCALE_DEFAULT)));
                    break;
            }
            
            
            //txt_score.setText(Integer.toString(1 +(int) (Math.random()*6)));
            // icons_right[0].set(dice0.png);
       
        
            icons_left = new ImageIcon[7];
            switch(random){
                case 1:
                    icons_left[1] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die1.png"))).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));

                    //jLabel4.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("die1.png"))).getImage().getScaledInstance(50, 49, Image.SCALE_DEFAULT)));
                    break;
                case 2:
                    icons_left[2] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die2.png"))).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));

                   // jLabel4.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("die2.png"))).getImage().getScaledInstance(50, 49, Image.SCALE_DEFAULT)));
                    break;
                case 3:
                    icons_left[3] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die3.png"))).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));

                   // jLabel4.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("die3.png"))).getImage().getScaledInstance(50, 49, Image.SCALE_DEFAULT)));
                    break;
                case 4:
                    icons_left[4] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die4.png"))).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));

                   // jLabel4.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("die4.png"))).getImage().getScaledInstance(50, 49, Image.SCALE_DEFAULT)));
                    break;
                case 5:
                    icons_left[5] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die5.png"))).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));

                  //  jLabel4.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("die5.png"))).getImage().getScaledInstance(50, 49, Image.SCALE_DEFAULT)));
                    break;
                case 6:
                    icons_left[6] = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("die6.png"))).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));

                  //  jLabel4.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("die6.png"))).getImage().getScaledInstance(50, 49, Image.SCALE_DEFAULT)));
                    break;
            }
             } catch (IOException ex) {
            Logger.getLogger(Game_Page.class.getName()).log(Level.SEVERE, null, ex);
            
            
             }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Game_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game_Page().setVisible(true);
            } 
            
            
            
            
            
            
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_a;
    private javax.swing.JButton btn_b;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_d;
    private javax.swing.JButton btn_e;
    private javax.swing.JButton btn_f;
    private javax.swing.JButton btn_g;
    private javax.swing.JButton btn_h;
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
