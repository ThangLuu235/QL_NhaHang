package GUI;


import DAO.ConnectDB;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Main extends javax.swing.JFrame {
      private int loggedInUserRole = Login.loggedInUserRole;
      
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.loggedInUserRole = loggedInUserRole; 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JButton();
        btnStaff = new javax.swing.JButton();
        btnFood = new javax.swing.JButton();
        btnCategory = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnTables = new javax.swing.JButton();
        btnBookingTables = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        Right = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 900));

        jPanel1.setBackground(new java.awt.Color(71, 78, 104));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 900));
        jPanel1.setVerifyInputWhenFocusTarget(false);

        Left.setBackground(new java.awt.Color(64, 66, 88));
        Left.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(64, 66, 88), null, null));
        Left.setMinimumSize(new java.awt.Dimension(250, 900));
        Left.setPreferredSize(new java.awt.Dimension(250, 900));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DANH MỤC");

        btnDangXuat.setBackground(new java.awt.Color(107, 114, 142));
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setMaximumSize(new java.awt.Dimension(300, 50));
        btnDangXuat.setMinimumSize(new java.awt.Dimension(230, 25));
        btnDangXuat.setPreferredSize(new java.awt.Dimension(230, 25));
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnStaff.setBackground(new java.awt.Color(71, 78, 104));
        btnStaff.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnStaff.setForeground(new java.awt.Color(255, 255, 255));
        btnStaff.setText("→ STAFF");
        btnStaff.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnStaff.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnStaff.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffActionPerformed(evt);
            }
        });

        btnFood.setBackground(new java.awt.Color(71, 78, 104));
        btnFood.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnFood.setForeground(new java.awt.Color(255, 255, 255));
        btnFood.setText("→ FOOD");
        btnFood.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnFood.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFood.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodActionPerformed(evt);
            }
        });

        btnCategory.setBackground(new java.awt.Color(71, 78, 104));
        btnCategory.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnCategory.setForeground(new java.awt.Color(255, 255, 255));
        btnCategory.setText("→ CATEGORIES");
        btnCategory.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCategory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCategory.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });

        btnCustomer.setBackground(new java.awt.Color(71, 78, 104));
        btnCustomer.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomer.setText("→ CUSTOMER");
        btnCustomer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCustomer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        btnTables.setBackground(new java.awt.Color(71, 78, 104));
        btnTables.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnTables.setForeground(new java.awt.Color(255, 255, 255));
        btnTables.setText("→ TABLES");
        btnTables.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnTables.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTables.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablesActionPerformed(evt);
            }
        });

        btnBookingTables.setBackground(new java.awt.Color(71, 78, 104));
        btnBookingTables.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnBookingTables.setForeground(new java.awt.Color(255, 255, 255));
        btnBookingTables.setText("→ BOOKING TABLES");
        btnBookingTables.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBookingTables.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBookingTables.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBookingTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingTablesActionPerformed(evt);
            }
        });

        btnReport.setBackground(new java.awt.Color(71, 78, 104));
        btnReport.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnReport.setForeground(new java.awt.Color(255, 255, 255));
        btnReport.setText("→ REPORT");
        btnReport.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReport.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnOrder.setBackground(new java.awt.Color(71, 78, 104));
        btnOrder.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder.setText("→ ORDER");
        btnOrder.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnOrder.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOrder.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCategory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStaff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTables, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBookingTables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LeftLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(btnStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFood, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTables, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBookingTables, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                    .addContainerGap(495, Short.MAX_VALUE)
                    .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(349, 349, 349)))
        );

        Right.setBackground(new java.awt.Color(64, 66, 88));
        Right.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Right.setForeground(new java.awt.Color(255, 255, 255));
        Right.setMinimumSize(new java.awt.Dimension(840, 900));
        Right.setPreferredSize(new java.awt.Dimension(950, 900));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SUSHI RESTAURANT");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("WELCOME TO ");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel2))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel3)))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(673, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
         dispose();
         Login LoginFrame = new Login();
                LoginFrame.setVisible(true);
                LoginFrame.pack();
                LoginFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffActionPerformed
        
        if (loggedInUserRole == 1) {
        // Cho phép quản trị viên truy cập vào trang quản lý nhân viên
        Staff staffFrame = new Staff();
        Right.removeAll();
        Right.add(staffFrame.getContentPane());
        Right.revalidate();
        Right.repaint();
    } else {
        // Ngăn nhân viên truy cập vào trang quản lý nhân viên
        JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào danh mục nhân viên.");
    }
    }//GEN-LAST:event_btnStaffActionPerformed

    private void btnFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodActionPerformed
        if (loggedInUserRole == 1) {
        // Cho phép quản trị viên truy cập trang quản lý món ăn
        food foodFrame = null;
        try {
            foodFrame = new food();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Right.removeAll();
        Right.add(foodFrame.getContentPane());
        Right.revalidate();
        Right.repaint();
    } else {
        JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào danh mục món ăn.");
    }
    }//GEN-LAST:event_btnFoodActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        try {
             
            Customer CustomerFrame = new Customer();
            Right.removeAll();
            Right.add(CustomerFrame.getContentPane());
            Right.revalidate();
            Right.repaint();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryActionPerformed
        try {
            Category CategoryFrame = new Category();
            Right.removeAll();
            Right.add(CategoryFrame.getContentPane());
            Right.revalidate();
            Right.repaint();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCategoryActionPerformed

    private void btnTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablesActionPerformed
        try {
            Tables TablesFrame = new Tables();
            Right.removeAll();
            Right.add(TablesFrame.getContentPane());
            Right.revalidate();
            Right.repaint();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTablesActionPerformed

    private void btnBookingTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingTablesActionPerformed
         try {
            BookingTables BookingTablesFrame = new BookingTables();
            Right.removeAll();
            Right.add(BookingTablesFrame.getContentPane());
            Right.revalidate();
            Right.repaint();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBookingTablesActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        if (loggedInUserRole == 1) {
        // Cho phép quản trị viên truy cập vào trang báo cáo
        Report ReportFrame = new Report();
        Right.removeAll();
        Right.add(ReportFrame.getContentPane());
        Right.revalidate();
        Right.repaint();
    } else {
        // Ngăn nhân viên truy cập vào trang báo cáo
        JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào trang báo cáo.");
    }
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
//         try {
//            Order OrderFrame = new Order();
//            Right.removeAll();
//            Right.add(OrderFrame.getContentPane());
//            Right.revalidate();
//            Right.repaint();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
            Ban BanFrame = new Ban();
            Right.removeAll();
            Right.add(BanFrame.getContentPane());
            Right.revalidate();
            Right.repaint();
        
    }//GEN-LAST:event_btnOrderActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (isUserLoggedIn()) {
                new Main().setVisible(true);
            } else {
                new Login().setVisible(true);            }
            }
        });
    }
    // lưu trạng thái đăng nhập
   private static boolean loggedIn = false;
   private static boolean isUserLoggedIn() {
    return loggedIn;
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton btnBookingTables;
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnFood;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnStaff;
    private javax.swing.JButton btnTables;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
