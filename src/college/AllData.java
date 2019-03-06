/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class AllData extends javax.swing.JFrame {

    /**
     * Creates new form AllData
     */
    Connection c;
    Statement s;
    PreparedStatement ps;
    DefaultTableModel dtm=new DefaultTableModel();
    public AllData() {
        try {
            initComponents();
            table.setModel(dtm); 
            
            dtm.addColumn("ID");
            dtm.addColumn("Name");
            dtm.addColumn("Age");
            dtm.addColumn("Gender");
            dtm.addColumn("Level");
            dtm.addColumn("DEpt");
            dtm.addColumn("Grade");
            dtm.addColumn("Ssn");
            
            
            Class.forName("com.mysql.jdbc.Driver");
            
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/college?zeroDateTimeBehavior=convertToNull", "root", "");
            s=c.createStatement();
            String sql="SELECT * FROM student ";
            ResultSet rs=s.executeQuery(sql);
            while(rs.next()){
                dtm.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Not Found", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Sql Exception", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox();
        level = new javax.swing.JComboBox();
        dept = new javax.swing.JComboBox();
        grade = new javax.swing.JTextField();
        ssn = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Modify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Add To Db");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Age");

        jLabel3.setText("Gender");

        jLabel4.setText("Level");

        jLabel5.setText("Department");

        jLabel6.setText("Grade");

        jLabel7.setText("Ssn");

        name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        name.setEnabled(false);

        age.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        age.setEnabled(false);

        gender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        gender.setEnabled(false);

        level.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        level.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        level.setEnabled(false);

        dept.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dept.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CS", "IS", "IT", "SE" }));
        dept.setEnabled(false);

        grade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        grade.setEnabled(false);

        ssn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ssn.setEnabled(false);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Save Modification");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gender, 0, 158, Short.MAX_VALUE)
                            .addComponent(level, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(age)
                            .addComponent(name)
                            .addComponent(dept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grade)
                            .addComponent(ssn)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row=table.getSelectedRow();
        if(row>=0){
        
            try {
                String value=(String) table.getValueAt(row,0);
                int v=Integer.parseInt(value);
                name.setEnabled(true);
                age.setEnabled(true);
                gender.setEnabled(true);
                level.setEnabled(true);
                dept.setEnabled(true);
                grade.setEnabled(true);
                ssn.setEnabled(true);
                String sql="select * from student where id='"+value+"'";
                ResultSet rs= s.executeQuery(sql);
                while(rs.next()){
                    name.setText(rs.getString(2));
                    age.setText(rs.getString(3));
                    gender.setSelectedItem(rs.getString(4));
                    level.setSelectedItem(rs.getString(5));
                    dept.setSelectedItem(rs.getString(6));          
                    grade.setText(rs.getString(7));
                    ssn.setText(rs.getString(8));
                }
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Sql Exception", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
        
       
       else {
        
            name.setEnabled(true);
         age.setEnabled(true);
         gender.setEnabled(true);
         level.setEnabled(true);
         dept.setEnabled(true);
         grade.setEnabled(true);
         ssn.setEnabled(true);
        }
       
        
        
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            
            String sql="INSERT INTO student (Name,Age,Gender,Level,Dept,Grade,Ssn) VALUES( ?, ?, ?,?,?,?,?)";
            ps=c.prepareStatement(sql);
            String g=grade.getText();
            String a=age.getText();
            String l=level.getSelectedItem()+"";
            String s=ssn.getText();
            if(g.equals("") || a.equals("") || l.equals("") || s.equals("")){
                JOptionPane.showMessageDialog(null,"You Forget Something You Cant Add Without Full Detail Click Modify","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
            ps.setString(1, name.getText());
            ps.setInt(2, Integer.parseInt(age.getText()));
            ps.setString(3, gender.getSelectedItem()+"");
            ps.setInt(4, Integer.parseInt(level.getSelectedItem()+""));
            ps.setString(5, dept.getSelectedItem()+"");
            ps.setFloat(6, Float.parseFloat(grade.getText()+""));
            ps.setInt(7, Integer.parseInt(ssn.getText())); 
            ps.execute();
            name.setEnabled(true);
            age.setEnabled(true);
            gender.setEnabled(true);
            level.setEnabled(true);
            dept.setEnabled(true);
            grade.setEnabled(true);
            ssn.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Your Data is Inserted Sucessfully","Confirmation",JOptionPane.INFORMATION_MESSAGE);
            AllData d=new AllData();
            this.dispose();
             d.setSize(750, 600);
            d.setLocation(300, 50);
            d.setVisible(true);
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Sql Exception", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int row=table.getSelectedRow();
            if(row>=0){
            String value=(String) table.getValueAt(row, 0);
            String sql="delete from student where id='"+value+"'";
            int result= s.executeUpdate(sql);
            if(result==1){
                JOptionPane.showMessageDialog(null,"Record Has Been Deleted", "Confirmation",JOptionPane.INFORMATION_MESSAGE);
                AllData d=new AllData();
            this.dispose();
            d.setSize(750, 600);
            d.setLocation(300, 50);
            d.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Error in Deleting", "Error",JOptionPane.ERROR_MESSAGE);
            }
           
            }
             else{
                    JOptionPane.showMessageDialog(null,"Select A Student To Delete", "Error",JOptionPane.ERROR_MESSAGE);
                    }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Sql Exception", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                    this.dispose();
                    SearchEngine s=new SearchEngine();
                    s.setLocation(500, 200);
                    s.setSize(400,300);
                    s.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            int row=table.getSelectedRow();
              String g=grade.getText();
            String a=age.getText();
            String l=level.getSelectedItem()+"";
            String sl=ssn.getText();
            if(row>=0){
              if(g.equals("") || a.equals("") || l.equals("") || s.equals("")){
                JOptionPane.showMessageDialog(null,"You Forget To Modify The Data Click Modify","Error",JOptionPane.ERROR_MESSAGE);
            }
              else{
              
            
            String value=(String) table.getValueAt(row, 0);
            String sql="UPDATE  student set Name='"+name.getText()+"',Age='"+Integer.parseInt(age.getText())+"',Gender='"+gender.getSelectedItem()+"',Level='"+Integer.parseInt(level.getSelectedItem()+"")+"',Ssn='"+Integer.parseInt(ssn.getText())+"',Dept='"+dept.getSelectedItem()+"',Grade='"+Integer.parseInt(grade.getText())+"' WHERE ID="+value;
            int result= s.executeUpdate(sql);
            if(result==1){
                JOptionPane.showMessageDialog(null,"record has Been Updated", "Confirmation",JOptionPane.INFORMATION_MESSAGE);
                AllData d=new AllData();
                this.dispose();
                d.setSize(750, 600);
                d.setLocation(300, 50);
                d.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Error in Updating", "Error",JOptionPane.ERROR_MESSAGE);
            }
            }
            }
            else{
                JOptionPane.showMessageDialog(null,"Select A Student To Modify", "Error",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Sql Exception", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(AllData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JComboBox dept;
    private javax.swing.JComboBox gender;
    private javax.swing.JTextField grade;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox level;
    private javax.swing.JTextField name;
    private javax.swing.JTextField ssn;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
