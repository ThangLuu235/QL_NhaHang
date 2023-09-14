package GUI;

import DAO.ConnectDB;
import java.awt.Component;
import java.awt.Image;
import java.math.BigDecimal;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;


public class Tables extends javax.swing.JFrame {

    final String header[] = {"TableID","TableName","Status"};
    final DefaultTableModel tb = new DefaultTableModel(header, 0);
    
    ConnectDB cn = new ConnectDB();
    Connection conn;
    
    public Tables() throws ClassNotFoundException {
        initComponents();
        loadBang();
    }
    
public void loadBang(){
    try{
        conn = cn.getConnection();
        int number;
        Vector row;
        String sql ="SELECT * FROM Tables";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ResultSetMetaData metadata = rs.getMetaData();
        number = metadata.getColumnCount();
        tb.setRowCount(0);
        while(rs.next()){
            row = new Vector();
            for(int i =1;i<=number;i++)
                row.addElement(rs.getString(i));
            tb.addRow(row);
            tbTable.setModel(tb);
        }
        st.close();
        rs.close();

    } catch(Exception e){
    }
    tbTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
     @Override
        public void valueChanged(ListSelectionEvent e){
            if(tbTable.getSelectedRow() >= 0 ){
                txtTableID.setText(tbTable.getValueAt(tbTable.getSelectedRow(), 0)+ "" );
                txtTableName.setText(tbTable.getValueAt(tbTable.getSelectedRow(), 1)+ "" );
                txtStatus.setText(tbTable.getValueAt(tbTable.getSelectedRow(), 2)+ "" );
                
                txtTableID.setEnabled(false);
            }
        }
     });   
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTableID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnReload = new javax.swing.JButton();
        txtTableName = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 900));

        jPanel1.setBackground(new java.awt.Color(64, 66, 88));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DANH SÁCH BÀN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(107, 114, 142));
        jPanel2.setPreferredSize(new java.awt.Dimension(950, 850));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mã Bàn");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Trạng thái");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tên bàn");

        txtTableID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(80, 87, 122));

        tbTable.setBackground(new java.awt.Color(71, 78, 104));
        tbTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbTable.setForeground(new java.awt.Color(255, 255, 255));
        tbTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tbTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbTable.setGridColor(new java.awt.Color(64, 66, 88));
        tbTable.setRowHeight(28);
        tbTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbTable);

        jPanel3.setBackground(new java.awt.Color(71, 78, 104));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Thao Tác");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnReload.setText("RELOAD");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnReload)
                        .addGap(148, 148, 148)
                        .addComponent(btnTimKiem)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnTimKiem)
                    .addComponent(btnReload))
                .addGap(29, 29, 29))
        );

        txtTableName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtStatus.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTableID, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 221, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTableID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(129, 129, 129)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        Xoa();
        loadBang();
    }//GEN-LAST:event_btnReloadActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String searchName = txtTimKiem.getText();
        try {
            conn = cn.getConnection();
            String sql_search = "SELECT * FROM Tables WHERE TableName LIKE ?";
            try (PreparedStatement stmt_search = conn.prepareStatement(sql_search)) {
                stmt_search.setString(1, "%" + searchName + "%");
                ResultSet rs = stmt_search.executeQuery();
                if (rs.next()) {
                    // Found at least one matching food item, display it in a table
                    DefaultTableModel model = new DefaultTableModel();
                    model.addColumn("TableID");
                    model.addColumn("TableName");
                    model.addColumn("Status");
                    do {
                        Object[] row = new Object[3];
                        row[0] = rs.getInt("TableID");
                        row[1] = rs.getString("TableName");
                        row[2] = rs.getString("Status");
                        model.addRow(row);
                    } while (rs.next());
                    tbTable.setModel(model);
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy danh mục hàng nào.");
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {                                        
            conn = cn.getConnection();
            if (txtTableName.getText().isEmpty() || txtStatus.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(this, "Hãy nhập đầy đủ các cột");
            } else {
                String sql_update = "UPDATE Tables SET TableName = ?, Status = ?  WHERE TableID = ? ";
                try (PreparedStatement stmt_update = conn.prepareStatement(sql_update)) {
                    stmt_update.setString(1, txtTableName.getText());
                    stmt_update.setInt(2, Integer.parseInt(txtStatus.getText()));
                    stmt_update.setInt(3, Integer.parseInt(txtTableID.getText()));
                    int kq = stmt_update.executeUpdate();
                    if (kq > 0) {
                        JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                        Xoa();
                    } else {
                        JOptionPane.showMessageDialog(this, "Không tìm thấy bàn nào");
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            conn = cn.getConnection();
            if (txtTableID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hãy chọn một sản phẩm để xóa");
            } else {
                int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa sản phẩm này không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    String sql = "DELETE FROM Tables WHERE TableID = ?";
                    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                        stmt.setString(1, txtTableID.getText());
                        int kq = stmt.executeUpdate();
                        if (kq > 0) {
                            JOptionPane.showMessageDialog(this, "Xóa bàn thành công");
                            Xoa();
                        } else {
                            JOptionPane.showMessageDialog(this, "Xóa bànthất bại");
                        }
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {                                        
            conn = cn.getConnection();
            if (txtTableName.getText().isEmpty() || txtStatus.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(this, "Hãy nhập đầy đủ các cột");
            } else {
                String sql_insert = "INSERT INTO Tables (TableName, Status) "
                        + "VALUES (?, ? )";
                try (PreparedStatement stmt_insert = conn.prepareStatement(sql_insert)) {
                    stmt_insert.setString(1, txtTableName.getText());
                    stmt_insert.setInt(2, Integer.parseInt(txtStatus.getText()));
                    int rowsInserted = stmt_insert.executeUpdate();
                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(this, "Thêm bàn hàng mới thành công.");
                        // Clear the text fields
                        txtTableName.setText("");
                        txtStatus.setText("");
                        // Refresh the table to display the new record
                        loadBang();
                    } else {
                        JOptionPane.showMessageDialog(this, "Thêm bàn hàng mới thất bại.");
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tbTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbTableAncestorAdded

    }//GEN-LAST:event_tbTableAncestorAdded
    
    
    public void Xoa(){
        txtTableID.setText("");
        txtTableName.setText("");
        txtStatus.setText("");
       
        txtTableID.setEnabled(true);
        loadBang();
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Tables().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTable;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTableID;
    private javax.swing.JTextField txtTableName;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
