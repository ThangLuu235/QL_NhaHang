package GUI;

import DAO.ConnectDB;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Staff extends javax.swing.JFrame {

    final String header[] = {"EmployeeID","Name","DateOfBirth","PhoneNumber","Address","CMND","Email","Username","Password","Role"};
    final DefaultTableModel tb = new DefaultTableModel(header,0);
    
    ConnectDB cn = new ConnectDB();
    Connection conn;
    
    public Staff() {
        initComponents();
        loadBang();
    }
    
public void loadBang(){
    try{
        conn = cn.getConnection();
        int number;
        Vector row;
        String sql ="SELECT * FROM Employees";
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
            tbStaff.setModel(tb);
        }
        st.close();
        rs.close();

    } catch(Exception e){
    }
    tbStaff.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
     @Override
        public void valueChanged(ListSelectionEvent e){
            if(tbStaff.getSelectedRow() >= 0 ){
                txtID.setText(tbStaff.getValueAt(tbStaff.getSelectedRow(), 0)+ "" );
                txtName.setText(tbStaff.getValueAt(tbStaff.getSelectedRow(), 1)+ "" );
                txtdate.setText(tbStaff.getValueAt(tbStaff.getSelectedRow(), 2)+ "" );
                txtPhone.setText(tbStaff.getValueAt(tbStaff.getSelectedRow(), 3)+ "" );
                txtAddress.setText(tbStaff.getValueAt(tbStaff.getSelectedRow(), 4)+ "" );
                txtCMND.setText(tbStaff.getValueAt(tbStaff.getSelectedRow(), 5)+ "" );
                txtEmail.setText(tbStaff.getValueAt(tbStaff.getSelectedRow(), 6)+ "" );
                txtUserName.setText(tbStaff.getValueAt(tbStaff.getSelectedRow(), 7)+ "" );
                txtPass.setText(tbStaff.getValueAt(tbStaff.getSelectedRow(), 8)+ "" );
                txtRole.setText(tbStaff.getValueAt(tbStaff.getSelectedRow(), 9)+ "" );
                txtID.setEnabled(false);
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
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbStaff = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnReload = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtRole = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 900));

        jPanel1.setBackground(new java.awt.Color(64, 66, 88));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NHÂN VIÊN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(107, 114, 142));
        jPanel2.setPreferredSize(new java.awt.Dimension(950, 850));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SĐT");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mã nhân viên");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Địa chỉ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tên nhân viên");

        txtID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtPhone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ngày sinh");

        txtdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(80, 87, 122));

        tbStaff.setBackground(new java.awt.Color(71, 78, 104));
        tbStaff.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbStaff.setForeground(new java.awt.Color(255, 255, 255));
        tbStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbStaff.setGridColor(new java.awt.Color(64, 66, 88));
        tbStaff.setRowHeight(30);
        jScrollPane1.setViewportView(tbStaff);

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
        jLabel10.setText("Email");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CMND");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Username");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Quyền truy cập");

        txtCMND.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtAddress.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtPass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtRole.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtUserName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(28, 28, 28))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(494, 494, 494)
                                .addComponent(jLabel11)
                                .addGap(34, 34, 34)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {                                        
            conn = cn.getConnection();
            if (txtName.getText().isEmpty() || txtdate.getText().isEmpty() || txtPhone.getText().isEmpty()
                    || txtAddress.getText().isEmpty() || txtCMND.getText().isEmpty() || txtEmail.getText().isEmpty()
                    || txtUserName.getText().isEmpty() || txtPass.getText().isEmpty() || txtRole.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hãy nhập đầy đủ thông tin của nhân viên");
            } else {
                String sql_check_pk = "SELECT EmployeeID FROM Employees WHERE EmployeeID = ?";
                String sql_insert = "INSERT INTO Employees (Name, DateOfBirth, PhoneNumber, Address, CMND, Email, Username, Password, Role) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement stmt_check_pk = conn.prepareStatement(sql_check_pk);
                        PreparedStatement stmt_insert = conn.prepareStatement(sql_insert)) {
                    stmt_check_pk.setString(1, txtID.getText());
                    ResultSet rs = stmt_check_pk.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(this, "Nhân viên này đã tồn tại");
                    } else {
                        stmt_insert.setString(1, txtName.getText());
                        stmt_insert.setString(2, txtdate.getText());
                        stmt_insert.setString(3, txtPhone.getText());
                        stmt_insert.setString(4, txtAddress.getText());
                        stmt_insert.setString(5, txtCMND.getText());
                        stmt_insert.setString(6, txtEmail.getText());
                        stmt_insert.setString(7, txtUserName.getText());
                        stmt_insert.setString(8, txtPass.getText());
                        stmt_insert.setString(9, txtRole.getText());
                        int kq = stmt_insert.executeUpdate();
                        if (kq > 0) {
                            JOptionPane.showMessageDialog(this, "Thêm mới nhân viên thành công");
                            Xoa();
                            loadBang();
                        }
                    }
                }
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {                                        
            conn = cn.getConnection();
            if (txtID.getText().isEmpty() || txtName.getText().isEmpty() || txtEmail.getText().isEmpty()
                    || txtPhone.getText().isEmpty() || txtdate.getText().isEmpty() || txtAddress.getText().isEmpty()
                    || txtCMND.getText().isEmpty() || txtUserName.getText().isEmpty() || txtPass.getText().isEmpty()
                    || txtRole.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hãy nhập đầy đủ các cột");
            } else {
                String sql_update = "UPDATE Employees SET Name = ?, DateOfBirth = ?, PhoneNumber = ?, Address = ?, CMND = ?, Email = ?, Username = ?, Password = ?, Role = ? WHERE EmployeeID = ?";
                try (PreparedStatement stmt_update = conn.prepareStatement(sql_update)) {
                    stmt_update.setString(1, txtName.getText());
                    stmt_update.setString(2, txtdate.getText());
                    stmt_update.setString(3, txtPhone.getText());
                    stmt_update.setString(4, txtAddress.getText());
                    stmt_update.setString(5, txtCMND.getText());
                    stmt_update.setString(6, txtEmail.getText());
                    stmt_update.setString(7, txtUserName.getText());
                    stmt_update.setString(8, txtPass.getText());
                    stmt_update.setString(9, txtRole.getText());
                    stmt_update.setString(10, txtID.getText());
                    int kq = stmt_update.executeUpdate();
                    if (kq > 0) {
                        JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                        Xoa();
                    } else {
                        JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên này");
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
    try {
        conn = cn.getConnection();
        if (txtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hãy chọn một nhân viên để xóa");
        } else {
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa nhân viên này không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                String sql = "DELETE FROM Employees WHERE EmployeeID = ?";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setString(1, txtID.getText());
                    int kq = stmt.executeUpdate();
                    if (kq > 0) {
                        JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công");
                        Xoa();
                    } else {
                        JOptionPane.showMessageDialog(this, "Xóa nhân viên thất bại");
                    }
                }
            }
        }
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
         try {
            conn = cn.getConnection();
            String keyword = txtTimKiem.getText();
            if (keyword.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm");
            } else {
                String sql = "SELECT * FROM Employees WHERE EmployeeID LIKE ? OR Name LIKE ?";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setString(1, "%" + keyword + "%");
                    stmt.setString(2, "%" + keyword + "%");
                    ResultSet rs = stmt.executeQuery();
                    DefaultTableModel model = (DefaultTableModel) tbStaff.getModel();
                    model.setRowCount(0);
                    while (rs.next()) {
                        Object[] row = new Object[10];
                        row[0] = rs.getInt("EmployeeID");
                        row[1] = rs.getString("Name");
                        row[2] = rs.getString("DateOfBirth");
                        row[3] = rs.getString("PhoneNumber");
                        row[4] = rs.getString("Address");
                        row[5] = rs.getString("CMND");
                        row[6] = rs.getString("Email");
                        row[7] = rs.getString("Username");
                        row[8] = rs.getString("Password");
                        row[9] = rs.getInt("Role");
                        model.addRow(row);
                    }
                    if (model.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả nào");
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        Xoa();
        loadBang();
    }//GEN-LAST:event_btnReloadActionPerformed
    
    
    public void Xoa(){
        txtID.setText("");
        txtName.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtdate.setText("");
        txtAddress.setText("");
        txtCMND.setText("");
        txtUserName.setText("");
        txtPass.setText("");
        txtRole.setText("");
        
        txtID.setEnabled(true);
        loadBang();
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTable tbStaff;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtdate;
    // End of variables declaration//GEN-END:variables
}
