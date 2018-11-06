import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yasir
 */
public class CalendarLogin extends javax.swing.JFrame {

    /**
     * Creates new form calendarLogin
     */
    public CalendarLogin() {
        initComponents();
        
        this.setLocationRelativeTo(null);// bring the form in the center
        
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
        jPanel1.setForeground(new Color(0, 0, 0));
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
                    
                    PreparedStatement ps;
                    ResultSet rs;
                    String uname = jTextField1.getText();
                    String pass = String.valueOf(jPasswordField1.getPassword());
                    
                    String query = "SELECT * FROM Registration WHERE userid = ? AND password = ?";
                    
                    try {
                            ps = dbconnection.getConnection().prepareStatement(query);
            
                            ps.setString(1, uname);
                            ps.setString(2, pass);
                            
                            rs = ps.executeQuery();
                            
                            if (rs.next())
                            {
                                JOptionPane.showMessageDialog(null, "Welcome To Your Calendar!");
                                CalendarMonthly monthly = new CalendarMonthly();
                                monthly.CalendarMonthly();
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Incorrect Username & Password!");
                            }
                    }catch (SQLException ex) {
                        Logger.getLogger(CalendarRegistration.class.getName()).log(Level.SEVERE, null, ex);
                    }

        	}
        });
        jLabelRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new Color(0, 51, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 28)); // NOI18N
        jLabel1.setForeground(Color.LIGHT_GRAY);
        jLabel1.setText("Admin Login");

        jLabel2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(210, 215, 211));
        jLabel2.setText("Username:");

        jLabel3.setFont(new Font("Berlin Sans FB", Font.PLAIN, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(210, 215, 211));
        jLabel3.setText("Password:");

        jTextField1.setBackground(new java.awt.Color(108, 122, 137));
        jTextField1.setFont(new Font("Arial", Font.PLAIN, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(210, 215, 211));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordField1.setFont(new Font("Arial", Font.PLAIN, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(210, 215, 211));

        jLabel4.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 236, 236));
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new Font("Berlin Sans FB", Font.BOLD, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 236, 236));
        jLabel5.setText("-");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton1.setFont(new Font("Arial", Font.BOLD, 18)); // NOI18N
        jButton1.setForeground(new Color(0, 0, 102));
        jButton1.setText("Login");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelRegister.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18)); // NOI18N
        jLabelRegister.setForeground(Color.LIGHT_GRAY);
        jLabelRegister.setText("Not a member yet? Click here to register!");
        jLabelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(58, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGap(484)
        							.addComponent(jLabel5)
        							.addGap(10)
        							.addComponent(jLabel4))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGap(14)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel3)
        								.addComponent(jLabel2))
        							.addGap(43)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))))
        					.addContainerGap(16, Short.MAX_VALUE))
        				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabelRegister)
        					.addGap(100))
        				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        					.addComponent(jButton1)
        					.addGap(227))))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(230, Short.MAX_VALUE)
        			.addComponent(jLabel1)
        			.addGap(195))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(jLabel4))
        			.addGap(46)
        			.addComponent(jLabel1)
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2))
        			.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3))
        			.addGap(29)
        			.addComponent(jButton1)
        			.addGap(33)
        			.addComponent(jLabelRegister)
        			.addGap(48))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jPanel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        System.exit(0);// to clode the login form
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterMouseClicked
        
        CalendarRegistration rig = new CalendarRegistration();
        rig.setVisible(true);
        rig.pack();
        rig.setLocationRelativeTo(null);
        rig.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelRegisterMouseClicked

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
            java.util.logging.Logger.getLogger(CalendarLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalendarLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}