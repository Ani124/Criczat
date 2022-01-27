import java.awt.Image;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shafa
 */
public class Players extends javax.swing.JFrame {

    logSinPage lsp2=new logSinPage();
    LoggedInPage lp2=new LoggedInPage();
    public Players() {
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

        jButton2 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        imagedis = new javax.swing.JLabel();
        namedis = new javax.swing.JLabel();
        matches = new javax.swing.JLabel();
        runs = new javax.swing.JLabel();
        average = new javax.swing.JLabel();
        highest = new javax.swing.JLabel();
        strikerate = new javax.swing.JLabel();
        hundreds = new javax.swing.JLabel();
        fifties = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        jTextField5.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 343, 30));

        search.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 127, 30));

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setText("Search For A Player");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        label1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        label2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        label4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        label3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        label5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        label6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        label7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        label7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, -1, -1));

        jButton3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 100, 40));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        jLabel11.setText("CricZat");

        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton4.setText("Rankings");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton5.setText("Live Scores");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton6.setText("Players");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(12, 12, 12)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel11))
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 690, -1));

        jButton8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton8.setText("ADD NEW");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 410, -1, 40));
        getContentPane().add(imagedis, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 110, 120));

        namedis.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        getContentPane().add(namedis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 270, 30));

        matches.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(matches, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 49, 25));

        runs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(runs, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 59, 25));

        average.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(average, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 56, 25));

        highest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(highest, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 43, 25));

        strikerate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(strikerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 62, 25));

        hundreds.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(hundreds, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 54, 25));

        fifties.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(fifties, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 51, 25));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/player2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/players", "root", "");
            //String sql = "select * from playersdata where name =?";
            PreparedStatement ps = con.prepareStatement("select * from playersdata where name =?");
            ps.setString(1, jTextField1.getText());
            //System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                label1.setText("Matches");
                label2.setText("Runs");
                label3.setText("Average");
                label4.setText("Highest");
                label5.setText("StrikeRate");
                label6.setText("Hundreds");
                label7.setText("Fifty");
                namedis.setText(rs.getString("name"));
                matches.setText(rs.getString("matches"));
                runs.setText(rs.getString("runs"));
                average.setText(rs.getString("average"));
                highest.setText(rs.getString("highest"));
                strikerate.setText(rs.getString("strikerate"));
                hundreds.setText(rs.getString("hundreds"));
                fifties.setText(rs.getString("fifties"));
                byte[] img = rs.getBytes("images");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(imagedis.getWidth(), imagedis.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                imagedis.setIcon(newImage);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Record Not Found");
            }
            
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HomePage home = new HomePage();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        RankingPage rp1=new RankingPage();
       if(true){
           rp1.setVisible(true);
           this.dispose();
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new Players().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      
        if(true){
            if(lsp2.checkLogin==1){
                lp2.setVisible(true);
                lp2.name.setText(lsp2.userN);
                lp2.emailShow.setText(lsp2.emailS);
                lp2.numberShow.setText(lsp2.phoneNumber);
                
                this.dispose();
                
            }
            else{
           // logSinPage lspHome=new logSinPage();
            lsp2.setVisible(true);
            lsp2.setLocationRelativeTo(null);
            this.dispose();

            }
          
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        liveScore ls = new liveScore();
        ls.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                //name.setText("");
                namedis.setText("");
                matches.setText("");
                runs.setText("");
                average.setText("");
                highest.setText("");
                strikerate.setText("");
                hundreds.setText("");
                fifties.setText("");
                jTextField1.setText("");
                imagedis.setIcon(null);
                label1.setText("");
                label2.setText("");
                label3.setText("");
                label4.setText("");
                label5.setText("");
                label6.setText("");
                label7.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       EditPage ep = new EditPage();
        logSinPage f = new logSinPage();
        if(f.checkLogin == 1){
            ep.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"You are not an admin");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Players().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel average;
    private javax.swing.JLabel fifties;
    private javax.swing.JLabel highest;
    private javax.swing.JLabel hundreds;
    private javax.swing.JLabel imagedis;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel matches;
    private javax.swing.JLabel namedis;
    private javax.swing.JLabel runs;
    private javax.swing.JButton search;
    private javax.swing.JLabel strikerate;
    // End of variables declaration//GEN-END:variables
}