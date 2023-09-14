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
import model.Food;


public class food extends javax.swing.JFrame {

    final String header[] = {"FoodId","FoodName","Food_CatID","Description","Price", "Quantity"};
    final DefaultTableModel tb = new DefaultTableModel(header, 0);
    
    ConnectDB cn = new ConnectDB();
    Connection conn;
    
    public food() throws ClassNotFoundException {
        initComponents();
        loadBang();
    }
    public Vector<Food> layDSMonAn() throws SQLException{
        int number;
        Vector<Food> dsMonAn = new Vector<>();
        String sql ="SELECT * FROM Food";
         Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ResultSetMetaData metadata = rs.getMetaData();
        number = metadata.getColumnCount();
        tb.setRowCount(0);
        while(rs.next()){
           Food food = new Food();
           food.setFoodID(rs.getInt(0));
           food.setFoodName(rs.getString(1));
           food.setImageURL(rs.getString(3));
           food.setDescription(rs.getString(4));
           food.setPrice(rs.getFloat(5));
           food.setQuantity(rs.getInt(6));
           dsMonAn.add(food);
        }
        st.close();
        rs.close();
        
        return dsMonAn;
    }
            
    public void loadBang(){
    try{
        conn = cn.getConnection();
        int number;
        Vector row;
        String sql ="SELECT FoodID, FoodName, Food_CatID,Description, Price, Quantity FROM Food";
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
            tbFood.setModel(tb);
        }
        st.close();
        rs.close();

    } catch(Exception e){
    }
    tbFood.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
     @Override
        public void valueChanged(ListSelectionEvent e){
            if(tbFood.getSelectedRow() >= 0 ){
                txtFoodID.setText(tbFood.getValueAt(tbFood.getSelectedRow(), 0)+ "" );
                txtFoodName.setText(tbFood.getValueAt(tbFood.getSelectedRow(), 1)+ "" );
                txtFood_CatID.setText(tbFood.getValueAt(tbFood.getSelectedRow(), 2)+ "" );
                txtDescription.setText(tbFood.getValueAt(tbFood.getSelectedRow(), 3)+ "" );
                txtPrice.setText(tbFood.getValueAt(tbFood.getSelectedRow(), 4)+ "" );
                txtQuantity.setText(tbFood.getValueAt(tbFood.getSelectedRow(), 5)+ "" );
                txtFoodID.setEnabled(false);
            }
        }
     });   
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFoodID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFood = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnReload = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtFoodName = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        txtFood_CatID = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 900));

        jPanel1.setBackground(new java.awt.Color(64, 66, 88));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MÓN ĂN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mô tả");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mã món");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Giá");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tên món");

        txtFoodID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mã loại món");

        jScrollPane1.setBackground(new java.awt.Color(80, 87, 122));

        tbFood.setBackground(new java.awt.Color(71, 78, 104));
        tbFood.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbFood.setForeground(new java.awt.Color(255, 255, 255));
        tbFood.setModel(new javax.swing.table.DefaultTableModel(
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
        tbFood.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbFood.setGridColor(new java.awt.Color(64, 66, 88));
        tbFood.setRowHeight(28);
        tbFood.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbFoodAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbFood);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btnThem)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(btnSua)
                .addGap(18, 18, 18)
                .addComponent(btnReload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
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

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Số lượng");

        txtFoodName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtDescription.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtFood_CatID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtPrice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtQuantity.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFoodID, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFood_CatID, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(jLabel7)
                                        .addGap(68, 68, 68))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addGap(30, 30, 30)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtFoodID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtFood_CatID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
             String sql_search = "SELECT * FROM Food WHERE FoodName LIKE ?";
             try (PreparedStatement stmt_search = conn.prepareStatement(sql_search)) {
                 stmt_search.setString(1, "%" + searchName + "%");
                 ResultSet rs = stmt_search.executeQuery();
                 if (rs.next()) {
                     // Found at least one matching food item, display it in a table
                     DefaultTableModel model = new DefaultTableModel();
                     model.addColumn("Food ID");
                     model.addColumn("Food Name");
                     model.addColumn("Price");
                     model.addColumn("Quantity");
                     do {
                         Object[] row = new Object[4];
                         row[0] = rs.getInt("FoodID");
                         row[1] = rs.getString("FoodName");
                         row[2] = rs.getDouble("Price");
                         row[3] = rs.getInt("Quantity");
                         model.addRow(row);
                     } while (rs.next());
                     tbFood.setModel(model);
                 } else {
                     JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm nào.");
                 }
             }
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {                                        
            conn = cn.getConnection();
            if (txtFoodID.getText().isEmpty() || txtFoodName.getText().isEmpty() || txtPrice.getText().isEmpty()
                    || txtQuantity.getText().isEmpty() || txtFood_CatID.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(this, "Hãy nhập đầy đủ các cột");
            } else {
                String sql_update = "UPDATE Food SET FoodName = ?, Food_CatID = ?, Description = ?, Price = ?, Quantity = ? WHERE FoodID = ?";
                try (PreparedStatement stmt_update = conn.prepareStatement(sql_update)) {
                    stmt_update.setString(1, txtFoodName.getText());
                       stmt_update.setString(2, txtFood_CatID.getText());
                    stmt_update.setString(3, txtDescription.getText());
                    stmt_update.setBigDecimal(4, new BigDecimal(txtPrice.getText()));
                    stmt_update.setInt(5, Integer.parseInt(txtQuantity.getText()));
                    stmt_update.setInt(6, Integer.parseInt(txtFoodID.getText()));
                    int kq = stmt_update.executeUpdate();
                    if (kq > 0) {
                        JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                        Xoa();
                    } else {
                        JOptionPane.showMessageDialog(this, "Không tìm thấy món ăn này");
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(food.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            conn = cn.getConnection();
            if (txtFoodID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hãy chọn một sản phẩm để xóa");
            } else {
                int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa sản phẩm này không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    String sql = "DELETE FROM Food WHERE FoodID = ?";
                    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                        stmt.setString(1, txtFoodID.getText());
                        int kq = stmt.executeUpdate();
                        if (kq > 0) {
                            JOptionPane.showMessageDialog(this, "Xóa sản phẩm thành công");
                            Xoa();
                        } else {
                            JOptionPane.showMessageDialog(this, "Xóa sản phẩm thất bại");
                        }
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(food.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {                                        
            conn = cn.getConnection();
            if (txtFoodName.getText().isEmpty() || txtFood_CatID.getText().isEmpty() 
                    || txtPrice.getText().isEmpty() || txtQuantity.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hãy nhập đầy đủ các cột");
            } else {
                String sql_insert = "INSERT INTO Food (FoodName, Food_CatID, Description, Price, Quantity) "
                        + "VALUES (?, ?, ?, ?, ?)";
                try (PreparedStatement stmt_insert = conn.prepareStatement(sql_insert)) {
                    stmt_insert.setString(1, txtFoodName.getText());
                    stmt_insert.setInt(2, Integer.parseInt(txtFood_CatID.getText()));
                    stmt_insert.setString(3, txtDescription.getText());
                    stmt_insert.setBigDecimal(4, new BigDecimal(txtPrice.getText()));
                    stmt_insert.setInt(5, Integer.parseInt(txtQuantity.getText()));
                    int kq = stmt_insert.executeUpdate();
                    if (kq > 0) {
                        JOptionPane.showMessageDialog(this, "Thêm mới thành công");
                        Xoa();
                    } else {
                        JOptionPane.showMessageDialog(this, "Thêm mới thất bại");
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(food.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tbFoodAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbFoodAncestorAdded

    }//GEN-LAST:event_tbFoodAncestorAdded
    
    
    public void Xoa(){
        txtFoodID.setText("");
        txtFoodName.setText("");
        txtFood_CatID.setText("");
        txtDescription.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
        
        txtFoodID.setEnabled(true);
        loadBang();
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new food().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(food.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbFood;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtFoodID;
    private javax.swing.JTextField txtFoodName;
    private javax.swing.JTextField txtFood_CatID;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
