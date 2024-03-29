/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bth5_c2;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import bth5_c2.BacSi;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 84346
 */
public class DatLichKham extends javax.swing.JFrame {

    /**
     * Creates new form DatLichKham
     */
    public DatLichKham() {
        initComponents();
        addCB();
    }
    
    public void addCB()
    {
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        
        try{
            Connection conn = BTH5_C2.getMyConnection();
            String SQL = "Select * from BACSI";
            
            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                String MaBS = rs.getString(1);
                String TenBS = rs.getString(2);
                cbm.addElement(new BacSi(MaBS, TenBS));
            }
            
            CBTenBS.setModel(cbm);
            
        }catch(Exception e)
        {
            System.out.print(e);
        }
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MaKB = new javax.swing.JTextField();
        TenBN = new javax.swing.JTextField();
        NgayKham = new com.toedter.calendar.JDateChooser();
        YeuCauKham = new javax.swing.JTextField();
        them = new javax.swing.JButton();
        CBTenBS = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        MaBN = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Thông tin BN");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dat lich kham");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Mã BN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tên BN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Ngày khám");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Yc khám");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("BS khám");

        MaKB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MaKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaKBActionPerformed(evt);
            }
        });
        MaKB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MaKBKeyPressed(evt);
            }
        });

        TenBN.setEditable(false);
        TenBN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        NgayKham.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        YeuCauKham.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        them.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        them.setText("Đặt lịch");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        CBTenBS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CBTenBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTenBSActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Mã KB");

        MaBN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MaBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaBNActionPerformed(evt);
            }
        });
        MaBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MaBNKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Đặt lịch");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MaKB)
                    .addComponent(TenBN)
                    .addComponent(YeuCauKham)
                    .addComponent(NgayKham, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(CBTenBS, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MaBN, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(them))
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaKB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(MaBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TenBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NgayKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(YeuCauKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CBTenBS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(them)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MaKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaKBActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MaKBActionPerformed

    private void CBTenBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTenBSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBTenBSActionPerformed

    private void MaKBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MaKBKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaKBKeyPressed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        // TODO add your handling code here:
        String MaKB = this.MaKB.getText();
        String MaBN = this.MaBN.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(this.NgayKham.getDate());
        String YeuCauKham = this.YeuCauKham.getText();
        Object item = CBTenBS.getSelectedItem();
        String MaBS = ((BacSi)item).getMaBS();
        
        try
        {
            Connection conn = BTH5_C2.getMyConnection();    
            String SQL = "Insert into KHAMBENH (MAKB,MABN,MABS,NGAYKHAM,YEUCAUKHAM,THANHTOAN) "
                    + "values (?,?,?,?,?,?)";
            
            PreparedStatement ps = conn.prepareStatement(SQL);
            
            ps.setString(1, MaKB);
            ps.setString(2, MaBN);
            ps.setString(3, MaBS);
            ps.setString(4, date);
            ps.setString(5, YeuCauKham);
            ps.setString(6, "0");
            
            int rs = ps.executeUpdate();
            if(rs >= 1)
            {
                JOptionPane.showMessageDialog(this, "dat lich thanh cong");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "dat lich that bai");
            }
        }catch (Exception e){
            System.out.println("loi!");
            System.out.println(e);
        }
    }//GEN-LAST:event_themActionPerformed

    private void MaBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaBNActionPerformed

    private void MaBNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MaBNKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String MaBN = this.MaBN.getText();
            try{
            Connection conn = BTH5_C2.getMyConnection();
            String SQL = "Select TENBN from BENHNHAN where MABN = ?";
            
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setString(1, MaBN);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                String tenBN = rs.getString(1);
                TenBN.setText(tenBN);
            }
            
        }catch(Exception e)
        {
            System.out.print(e);
        }
        }
    }//GEN-LAST:event_MaBNKeyPressed

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
            java.util.logging.Logger.getLogger(DatLichKham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatLichKham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatLichKham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatLichKham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatLichKham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBTenBS;
    private javax.swing.JTextField MaBN;
    private javax.swing.JTextField MaKB;
    private com.toedter.calendar.JDateChooser NgayKham;
    private javax.swing.JTextField TenBN;
    private javax.swing.JTextField YeuCauKham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton them;
    // End of variables declaration//GEN-END:variables
}
