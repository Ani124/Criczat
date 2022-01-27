
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class HomePage extends javax.swing.JFrame {

       logSinPage lspHome = new logSinPage();
     Desktop browser= Desktop.getDesktop();
     static int i=1;
     String label1c;
     String label2c;
     String label3c;
     String label4c;
     String label5c;
     String label6c;
     String label7c;
     String label8c;
     String label9c;
     String label10c;
     String label11c;
     
     
     

     JButton b;
    public HomePage() {
        initComponents();
         if(lspHome.checkLogin==1){
            b=new JButton("NEWS EDIT");
            b.setBackground(Color.green);
            b.setBounds(300,450,100,50);
            add(b);
            b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            homeTesting rpTest=new homeTesting();
                            
                            rpTest.setVisible(true);
                            setVisible(false);
                            
			}
		});
        }
       try{
            String url = "jdbc:mysql://localhost:3306/news";
        String username = "root";
        String password =""; 
      
         Class.forName("com.mysql.jdbc.Driver");
         
        Connection con =  DriverManager.getConnection(url,username,password);
         
            Statement st = con.createStatement();
         
           String query ="SELECT caption,news FROM linknews ";
          
          ResultSet rs=st.executeQuery(query);
            rs.next();
              label1.setText(rs.getNString("caption"));
              label1.setForeground(Color.black);
              label1.setBackground(Color.green);
              label1.setFont(new Font("Serif", Font.BOLD, 20));
              label1c=rs.getNString("news");
              //label1.setBorder(BorderFactory.createLineBorder(Color.black, 5));
            rs.next();
              label2.setText(rs.getNString("caption"));
              label2.setForeground(Color.red);
              label2.setBackground(Color.green);
              label2.setFont(new Font("Serif", Font.BOLD, 20));
              label2c=rs.getNString("news");
                rs.next();
              label3.setText(rs.getNString("caption"));
              label3.setForeground(Color.red);
              label3.setBackground(Color.green);
              label3.setFont(new Font("Serif", Font.BOLD, 20));
              label3c=rs.getNString("news");
                rs.next();
              label4.setText(rs.getNString("caption"));
              label4.setForeground(Color.red);
              label4.setBackground(Color.green);
              label4.setFont(new Font("Serif", Font.BOLD, 20));
              label4c=rs.getNString("news");
                rs.next();
              label5.setText(rs.getNString("caption"));
              label5.setForeground(Color.red);
              label5.setBackground(Color.green);
              label5.setFont(new Font("Serif", Font.BOLD, 20));
              label5c=rs.getNString("news");
              rs.next();
              label6.setText(rs.getNString("caption"));
              label6.setForeground(Color.red);
              label6.setBackground(Color.green);
              label6.setFont(new Font("Serif", Font.BOLD, 20));
              label6c=rs.getNString("news");
                rs.next();
              label7.setText(rs.getNString("caption"));
              label7.setForeground(Color.red);
              label7.setBackground(Color.green);
              label7.setFont(new Font("Serif", Font.BOLD, 20));
              label7c=rs.getNString("news");
                rs.next();
              label8.setText(rs.getNString("caption"));
              label8.setForeground(Color.red);
              label8.setBackground(Color.green);
              label8.setFont(new Font("Serif", Font.BOLD, 20));
              label8c=rs.getNString("news");
                rs.next();
              label9.setText(rs.getNString("caption"));
              label9.setForeground(Color.red);
              label9.setBackground(Color.green);
              label9.setFont(new Font("Serif", Font.BOLD, 20));
              label9c=rs.getNString("news");
                rs.next();
              label10.setText(rs.getNString("caption"));
              label10.setForeground(Color.red);
              label10.setBackground(Color.green);
              label10.setFont(new Font("Serif", Font.BOLD, 20));
              label10c=rs.getNString("news");
              
                rs.next();
              label11.setText(rs.getNString("caption"));
              label11.setForeground(Color.red);
              label11.setBackground(Color.green);
              label11.setFont(new Font("Serif", Font.BOLD, 20));
             label11c=rs.getNString("news");
          
           st.close();
            rs.close();
            con.close();
         
         }catch(Exception e){
             System.out.println(e);
         }
    }

 /**   HomePage(String g4, String g40, String g41) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
**/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        label10 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        jLabel1.setText("CricZat");

        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton3.setText("Rankings");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton2.setText("Live Scores");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton4.setText("Players");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(12, 12, 12)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Latest News");

        label10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label10MouseClicked(evt);
            }
        });

        label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label1MouseClicked(evt);
            }
        });

        label4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label4MouseClicked(evt);
            }
        });

        label6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label6MouseClicked(evt);
            }
        });

        label9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label9MouseClicked(evt);
            }
        });

        label8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label8MouseClicked(evt);
            }
        });

        label2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label2MouseClicked(evt);
            }
        });

        label3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label3MouseClicked(evt);
            }
        });

        label7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label7MouseClicked(evt);
            }
        });

        label5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label5MouseClicked(evt);
            }
        });

        label11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label11, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 220, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jScrollPane1.setViewportView(jPanel4);

        jScrollPane3.setViewportView(jScrollPane1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel6.setText("jLabel6");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel2);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 153, 255));
        jLabel7.setText("Latest Photos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
       // new logSinPage().setVisible(true);
       if(true){
        logSinPage lspHome=new logSinPage();
        if(lspHome.checkLogin == 1){
            LoggedInPage lp = new LoggedInPage();
            lp.name.setText(lspHome.userN);
            lp.emailShow.setText(lspHome.emailS);
            lp.numberShow.setText(lspHome.phoneNumber);

            lp.setVisible(true);
            this.dispose();
        }else{
            lspHome.setVisible(true);
            lspHome.setLocationRelativeTo(null);
            this.dispose();
        }
       }
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Players().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        RankingPage rp1=new RankingPage();
       if(true){
           rp1.setVisible(true);
           this.dispose();
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        liveScore ls = new liveScore();
        ls.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void label10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label10MouseClicked
        Desktop browser =Desktop.getDesktop();
        try {
            browser.browse(new URI(label10c));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_label10MouseClicked

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked
        Desktop browser =Desktop.getDesktop();
        try {
            browser.browse(new URI(label1c));
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_label1MouseClicked

    private void label4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label4MouseClicked
        Desktop browser =Desktop.getDesktop();
        try {
            browser.browse(new URI(label4c));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_label4MouseClicked

    private void label6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label6MouseClicked
        Desktop browser =Desktop.getDesktop();
        try {
            browser.browse(new URI(label6c));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_label6MouseClicked

    private void label9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label9MouseClicked
        Desktop browser =Desktop.getDesktop();
        try {
            browser.browse(new URI(label9c));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_label9MouseClicked

    private void label8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label8MouseClicked
        Desktop browser =Desktop.getDesktop();
        try {
            browser.browse(new URI(label8c));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_label8MouseClicked

    private void label2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label2MouseClicked
        Desktop browser =Desktop.getDesktop();
        try {
            browser.browse(new URI(label2c));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_label2MouseClicked

    private void label3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label3MouseClicked
        Desktop browser =Desktop.getDesktop();
        try {
            browser.browse(new URI(label3c));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_label3MouseClicked

    private void label7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label7MouseClicked
        Desktop browser =Desktop.getDesktop();
        try {
            browser.browse(new URI(label7c));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_label7MouseClicked

    private void label5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label5MouseClicked
        Desktop browser =Desktop.getDesktop();
        try {
            browser.browse(new URI(label5c));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_label5MouseClicked

    private void label11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label11MouseClicked
        Desktop browser =Desktop.getDesktop();
        try {
            browser.browse(new URI(label11c));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_label11MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         try{
             
            String url = "jdbc:mysql://localhost:3306/news";
        String username = "root";
        String password =""; 
      
         Class.forName("com.mysql.jdbc.Driver");
         
        Connection con =  DriverManager.getConnection(url,username,password);
         
           PreparedStatement ps = con.prepareStatement("select picture from writtennews ");
           
            
          
          
         ImageIcon imgThisImg = new ImageIcon("C:\\Users\\Ani\\Downloads");

            jLabel2.setIcon(imgThisImg);
         }catch(Exception e)
         {
             System.out.println(e);
    }
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    // End of variables declaration//GEN-END:variables
}
