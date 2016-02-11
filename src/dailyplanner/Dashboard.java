package dailyplanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.text.BadLocationException;

/*
 * Dashboard.java
 *
 * Created on Sep 27, 2014, 7:58:07 AM
 */
/**
 *
 * @author Administrator
 */
public class Dashboard extends javax.swing.JFrame {
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost:3306/DailyPlanner";
    static final String USER="root";
    static final String PASS="prakhar";
    public static Connection conn=null;
    public static PreparedStatement ins=null,seek=null,del=null,upd=null,TODO=null,NOTE=null;
    static String uname,name,pass,fileStore;
    ButtonGroup butgrp1=new ButtonGroup();
    ButtonGroup butgrp2=new ButtonGroup();
    JPanel mainPanel1,leftPanel1,rightPanel1,mainPanel2,leftPanel2,rightPanel2;
    public Map<ButtonModel, JRadioButton> modelToRadioButton =
    new LinkedHashMap<ButtonModel, JRadioButton>();
    public Dashboard(String s1,String s2,String s3,String s4) {
        uname=s1;
        name=s2;
        pass=s3;
        fileStore=s4;
        initComponents();
    }
    Vector<String> notes = new Vector<String>();
 
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        creNote = new javax.swing.JButton();
        updNote = new javax.swing.JButton();
        delNote = new javax.swing.JButton();
        refNote = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        searchgo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        creMem = new javax.swing.JButton();
        delMem = new javax.swing.JButton();
        updMem = new javax.swing.JButton();
        refTodo = new javax.swing.JButton();
        chpw = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        name_dis = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(-16711936,true));

        jTabbedPane1.setBackground(new java.awt.Color(-16711681,true));

        jPanel2.setBackground(new java.awt.Color(-256,true));

        jScrollPane1.setBackground(new java.awt.Color(-4144960,true));

        creNote.setBackground(new java.awt.Color(-16711681,true));
        creNote.setFont(new java.awt.Font("Dialog", 1, 12));
        creNote.setText("Create NOTE");
        creNote.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        creNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creNoteActionPerformed(evt);
            }
        });

        updNote.setBackground(new java.awt.Color(-16711681,true));
        updNote.setFont(new java.awt.Font("Dialog", 1, 12));
        updNote.setText("Update NOTE");
        updNote.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updNoteActionPerformed(evt);
            }
        });

        delNote.setBackground(new java.awt.Color(-16711681,true));
        delNote.setFont(new java.awt.Font("Dialog", 1, 12));
        delNote.setText("Delete NOTE");
        delNote.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delNoteActionPerformed(evt);
            }
        });

        refNote.setBackground(new java.awt.Color(-16711681,true));
        refNote.setFont(new java.awt.Font("Dialog", 1, 12));
        refNote.setText("Refresh");
        refNote.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refNoteActionPerformed(evt);
            }
        });

        search.setText("SEARCH");
        search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFocusGained(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        searchgo.setFont(new java.awt.Font("Dialog", 1, 12));
        searchgo.setText("GO");
        searchgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchgoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchgo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delNote)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(delNote, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(updNote, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(creNote, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(refNote, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(searchgo)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("NOTES", jPanel2);

        jPanel3.setBackground(new java.awt.Color(-256,true));

        creMem.setBackground(new java.awt.Color(-16711681,true));
        creMem.setFont(new java.awt.Font("Dialog", 1, 12));
        creMem.setText("Create MEMO");
        creMem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        creMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creMemActionPerformed(evt);
            }
        });

        delMem.setBackground(new java.awt.Color(-16711681,true));
        delMem.setFont(new java.awt.Font("Dialog", 1, 12));
        delMem.setText("Delete MEMO");
        delMem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delMemActionPerformed(evt);
            }
        });

        updMem.setBackground(new java.awt.Color(-16711681,true));
        updMem.setFont(new java.awt.Font("Dialog", 1, 12));
        updMem.setText("Update MEMO");
        updMem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updMemActionPerformed(evt);
            }
        });

        refTodo.setBackground(new java.awt.Color(-16711681,true));
        refTodo.setFont(new java.awt.Font("Dialog", 1, 12));
        refTodo.setText("Refresh");
        refTodo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(refTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(creMem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updMem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delMem)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delMem, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(creMem, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(updMem, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(refTodo, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("TO-DO MEMO", jPanel3);

        chpw.setBackground(new java.awt.Color(-16711681,true));
        chpw.setFont(new java.awt.Font("Dialog", 1, 12));
        chpw.setText("Change Password");
        chpw.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chpwActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(-16711681,true));
        logout.setFont(new java.awt.Font("Dialog", 1, 12));
        logout.setText("Logout");
        logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        name_dis.setBackground(new java.awt.Color(-256,true));
        name_dis.setFont(new java.awt.Font("Dialog", 1, 14));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(name_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(chpw, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(chpw, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addComponent(name_dis, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void chpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chpwActionPerformed
    ChangePW ch=new ChangePW(uname);
    ch.setVisible(true);
}//GEN-LAST:event_chpwActionPerformed

private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
    this.setVisible(false);
}//GEN-LAST:event_logoutActionPerformed

private void creMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creMemActionPerformed
    CreateMEMO CM=new CreateMEMO(1, uname);
    CM.display("", "YYYY-MM-DD hh:mm:ss");
    CM.setVisible(true);
}//GEN-LAST:event_creMemActionPerformed

private void delMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delMemActionPerformed
    ButtonModel buttonModel = butgrp2.getSelection();
    if (buttonModel == null)
    JOptionPane.showMessageDialog(rootPane,"No radio button is selected!!");
    else {
    if (modelToRadioButton.containsKey(buttonModel)) {
      JRadioButton b = modelToRadioButton.get(buttonModel);
        try {
                Class.forName(JDBC_DRIVER);
                conn=(Connection) DriverManager.getConnection(DB_URL,USER,PASS);
                del=(PreparedStatement)conn.prepareStatement("DELETE FROM ToDo WHERE UName=? AND Memo=?");
                del.setString(1, uname);
                del.setString(2, b.getText());
                del.executeUpdate();
                del.close();
                conn.close();
            } catch (Exception ex) {
                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Oops!! Something went Wrong!!"); 
            }
        }
    else {
      JOptionPane.showMessageDialog(rootPane,"Weird, unrecognised button model!!");
    }
    }
    this.displayTODOtable();
}//GEN-LAST:event_delMemActionPerformed

private void updMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updMemActionPerformed
    ButtonModel buttonModel = butgrp2.getSelection();
    if (buttonModel == null)
    JOptionPane.showMessageDialog(rootPane,"No radio button is selected!!");
    else {
    if (modelToRadioButton.containsKey(buttonModel)) {
        try{        
        try {
                    JRadioButton b = modelToRadioButton.get(buttonModel);
                    Class.forName(JDBC_DRIVER);
                    conn=(Connection) DriverManager.getConnection(DB_URL,USER,PASS);
                    seek=(PreparedStatement)conn.prepareStatement("SELECT * FROM ToDo WHERE UName=? AND Memo=?");
                    seek.setString(1, uname);
                    seek.setString(2, b.getText());
                    ResultSet rs=(ResultSet)seek.executeQuery();
                    rs.next();
                    CreateMEMO CM=new CreateMEMO(2, rs.getString(1), rs.getString(2));
                    CM.display(rs.getString(2),rs.getString(3).toString());
                    CM.setVisible(true);
                    seek.close();
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (Exception ex) {
                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Oops!! Something went Wrong!!"); 
            }
        }
    else {
      JOptionPane.showMessageDialog(rootPane,"Weird, unrecognised button model!!");
    }
    }
}//GEN-LAST:event_updMemActionPerformed

private void creNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creNoteActionPerformed
    CreateNOTE CN=new CreateNOTE(uname,fileStore);
    CN.setVisible(true);
}//GEN-LAST:event_creNoteActionPerformed

private void updNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updNoteActionPerformed
    ButtonModel buttonModel = butgrp1.getSelection();
    if (buttonModel == null)
    JOptionPane.showMessageDialog(rootPane,"No radio button is selected!!");
    else{
        if (modelToRadioButton.containsKey(buttonModel)) 
        {
            try{
                JRadioButton b = modelToRadioButton.get(buttonModel);
                String topic= b.getText();
                Class.forName(JDBC_DRIVER);
                conn=(Connection) DriverManager.getConnection(DB_URL,USER,PASS);
                seek=(PreparedStatement)conn.prepareStatement("SELECT * FROM Note WHERE UName=? AND Topic=?");
                seek.setString(1, uname);
                seek.setString(2, b.getText());
                ResultSet rs=(ResultSet)seek.executeQuery();
                rs.next();
                String key1=rs.getString(5),key2=rs.getString(6),key3=rs.getString(7),key4=rs.getString(8),key5=rs.getString(9);
                String s[]={key1,key2,key3,key4,key5};
                String top=rs.getString(2);
                String file=rs.getString(4);
                rs.close();
                seek.close();
                conn.close();
                new Notepad(topic,s,file,this).setVisible(true);
            }
            catch(Exception Ex){
                Ex.printStackTrace();
            }
        }
        
        else {
          JOptionPane.showMessageDialog(rootPane,"Weird, unrecognised button model!!");
        }
    }
}//GEN-LAST:event_updNoteActionPerformed

private void delNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delNoteActionPerformed
    ButtonModel buttonModel = butgrp1.getSelection();
    if (buttonModel == null)
    JOptionPane.showMessageDialog(rootPane,"No radio button is selected!!");
    else {
        if (modelToRadioButton.containsKey(buttonModel)) {
          JRadioButton b = modelToRadioButton.get(buttonModel);
            try {
                    String Topic=b.getText();
                    String str=fileStore+File.separator+uname+Topic;
                    File delete= new File(str);
                    delete.delete();
                    Class.forName(JDBC_DRIVER);
                    conn=(Connection) DriverManager.getConnection(DB_URL,USER,PASS);
                    del=(PreparedStatement)conn.prepareStatement("DELETE FROM Note WHERE UName=? AND Topic=?;");
                    del.setString(1, uname);
                    del.setString(2, Topic);
                    del.executeUpdate();
                    del.close();
                    conn.close();
                } catch (Exception ex) {
                    Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(rootPane, "Oops!! Something went Wrong!!"); 
                }
            }
        else {
          JOptionPane.showMessageDialog(rootPane,"Weird, unrecognised button model!!");
        }
    }
    this.displayNOTEtable();
}//GEN-LAST:event_delNoteActionPerformed

private void refNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refNoteActionPerformed
    this.displayNOTEtable();
}//GEN-LAST:event_refNoteActionPerformed

private void refTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refTodoActionPerformed
    this.displayTODOtable();
}//GEN-LAST:event_refTodoActionPerformed

private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_searchActionPerformed

private void searchgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchgoActionPerformed
    ResultSet rstd;
    String sear=search.getText();
    if(sear=="")
    JOptionPane.showMessageDialog(rootPane,"Search Field Empty!!");
    else{
        try {
            Class.forName(JDBC_DRIVER);
            conn=(Connection) DriverManager.getConnection(DB_URL,USER,PASS);
            NOTE=(PreparedStatement)conn.prepareStatement("SELECT Topic,DateTime FROM Note WHERE (Topic=? OR KeyWord1=? OR KeyWord2=? OR KeyWord3=? OR KeyWord4=? OR KeyWord5=?) AND UName=?");
            NOTE.setString(1, sear);
            NOTE.setString(2, sear);
            NOTE.setString(3, sear);
            NOTE.setString(4, sear);
            NOTE.setString(5, sear);
            NOTE.setString(6, sear);
            NOTE.setString(7, uname);
            mainPanel1=new JPanel();
            mainPanel1.setLayout(new BoxLayout(mainPanel1, BoxLayout.X_AXIS));
            leftPanel1=new JPanel();
            leftPanel1.setSize(100, WIDTH);
            //leftPanel1.setLayout(new BoxLayout(leftPanel1, BoxLayout.Y_AXIS));
            leftPanel1.setAlignmentX(Component.CENTER_ALIGNMENT);
            leftPanel1.revalidate();
            rightPanel1=new JPanel();
            rightPanel1.setSize(1000, WIDTH);
            //rightPanel1.setLayout(new BoxLayout(rightPanel1, BoxLayout.Y_AXIS));
            rightPanel1.setAlignmentX(Component.CENTER_ALIGNMENT);
            rightPanel1.revalidate();
            rstd=(ResultSet)NOTE.executeQuery();
            boolean val=rstd.next();
            if(!val)
            JOptionPane.showMessageDialog(rootPane,"Search Not Found!!\n Please Refresh");
            else{
                while(val){
                    String memo=rstd.getString(1);
                    JRadioButton rdbut=new JRadioButton(memo);
                    rdbut.setAlignmentX(LEFT_ALIGNMENT);
                    String date=rstd.getTimestamp(2).toString();
                    JLabel jl=new JLabel();
                    jl.setAlignmentX(RIGHT_ALIGNMENT);
                    jl.setText(date);
                    jl.setAlignmentX(Component.CENTER_ALIGNMENT);
                    rdbut.setAlignmentX(Component.CENTER_ALIGNMENT);
                    butgrp1.add(rdbut);
                    leftPanel1.add(rdbut,BorderLayout.NORTH);
                    rightPanel1.add(jl,BorderLayout.NORTH);
                    ButtonModel buttonModel = rdbut.getModel();
                    modelToRadioButton.put(buttonModel, rdbut);
                    val=rstd.next();
                }
                mainPanel1.add(leftPanel1);
                mainPanel1.add(rightPanel1);
                jScrollPane1.setViewportView(mainPanel1);
                NOTE.close();
                conn.close();
                JOptionPane.showMessageDialog(rootPane,"Search Completed !!\nPlease Refresh to go back");
            }
        } catch (Exception ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Oops!! Something went Wrong!!");
        }
    }
}//GEN-LAST:event_searchgoActionPerformed

private void searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFocusGained
    if(search.getText()=="SEARCH")
    search.setText("");
}//GEN-LAST:event_searchFocusGained

public void display(){
        name_dis.setText("Hello  "+name+"!!");
    }

public void displayTODOtable(){
    ResultSet rstd;
    try {
        Class.forName(JDBC_DRIVER);
        conn=(Connection) DriverManager.getConnection(DB_URL,USER,PASS);
        TODO=(PreparedStatement)conn.prepareStatement("SELECT Memo,DateTime FROM ToDo WHERE UName=? ORDER BY DateTime");
        TODO.setString(1, uname);
        mainPanel2=new JPanel();
        mainPanel2.setLayout(new BoxLayout(mainPanel2, BoxLayout.X_AXIS));
        leftPanel2=new JPanel(new GridBagLayout());
        rightPanel2=new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        JLabel jl1=new JLabel();
        JLabel jl2=new JLabel();
            jl1.setText("MEMO");
            jl2.setText("TIME");
            constraints.ipadx = 10;
            constraints.ipady = 10;
            constraints.gridwidth = 2;
            constraints.gridheight = 1;
            constraints.gridx = 0;
            constraints.gridy = 0;
            leftPanel2.add(jl1,constraints);
            constraints.gridx=2;
            rightPanel2.add(jl2,constraints);
        rstd=(ResultSet)TODO.executeQuery();
        int i=1;
        while(rstd.next()){
            String memo=rstd.getString(1);
            JRadioButton rdbut=new JRadioButton(memo);
            String date=rstd.getTimestamp(2).toString();
            int len=date.length();
            date=date.substring(0,len-2);
            JLabel jl=new JLabel();
            jl.setText(date);
            constraints.ipadx = 10;
            constraints.ipady = 10;
            constraints.gridwidth = 2;
            constraints.gridheight = 1;
            constraints.gridx = 0;
            constraints.gridy = i;
            butgrp2.add(rdbut);
            leftPanel2.add(rdbut,constraints);
            constraints.ipadx = 10;
            constraints.ipady = 10;
            constraints.gridwidth = 2;
            constraints.gridheight = 1;
            constraints.gridx = 2;
            constraints.gridy = i;
            rightPanel2.add(jl,constraints);
            ButtonModel buttonModel = rdbut.getModel();
            modelToRadioButton.put(buttonModel, rdbut);
            i++;
        }
        mainPanel2.add(leftPanel2);
        mainPanel2.add(rightPanel2);
        jScrollPane2.setViewportView(mainPanel2);
        TODO.close();
        conn.close();
    } catch (Exception ex) {
        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(rootPane, "Oops!! Something went Wrong!!");
    }
}

public void displayNOTEtable() {
        //
    String tempo="";
    notes.clear();
    ResultSet rstd;
    try {
        Class.forName(JDBC_DRIVER);
        conn=(Connection) DriverManager.getConnection(DB_URL,USER,PASS);
        NOTE=(PreparedStatement)conn.prepareStatement("SELECT * FROM Note WHERE UName=? ORDER BY DateTime");
        NOTE.setString(1, uname);
        mainPanel1=new JPanel();
        mainPanel1.setLayout(new BoxLayout(mainPanel1, BoxLayout.X_AXIS));
        leftPanel1=new JPanel(new GridBagLayout());
        rightPanel1=new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        JLabel jl1=new JLabel();
        JLabel jl2=new JLabel();
            jl1.setText("TOPIC");
            jl2.setText("TIME");
            constraints.ipadx = 10;
            constraints.ipady = 10;
            constraints.gridwidth = 2;
            constraints.gridheight = 1;
            constraints.gridx = 0;
            constraints.gridy = 0;
            leftPanel1.add(jl1,constraints);
            constraints.gridx=2;
            rightPanel1.add(jl2,constraints);
        rstd=(ResultSet)NOTE.executeQuery();
        int i=1;
        while(rstd.next()){
            tempo="";
            String topic=rstd.getString(2);
            //chnge
            tempo+=topic+" ";
            JRadioButton rdbut=new JRadioButton(topic);
            String date=rstd.getTimestamp(3).toString();
            int len=date.length();
            date=date.substring(0,len-2);
            //
            tempo+=rstd.getString(4)+" ";
            tempo+=rstd.getString(5)+" "+rstd.getString(6)+" "+rstd.getString(7)+" "+rstd.getString(8)+" "+rstd.getString(9);
            boolean add = notes.add(tempo);
            if(!add)JOptionPane.showMessageDialog(null, "No more Notes possible.... Dashboard full");
            //
            JLabel jl=new JLabel();
            jl.setText(date);
            constraints.ipadx = 10;
            constraints.ipady = 10;
            constraints.gridwidth = 2;
            constraints.gridheight = 1;
            constraints.gridx = 0;
            constraints.gridy = i;
            butgrp1.add(rdbut);
            leftPanel1.add(rdbut,constraints);
            constraints.ipadx = 10;
            constraints.ipady = 10;
            constraints.gridwidth = 2;
            constraints.gridheight = 1;
            constraints.gridx = 2;
            constraints.gridy = i;
            rightPanel1.add(jl,constraints);
            ButtonModel buttonModel = rdbut.getModel();
            modelToRadioButton.put(buttonModel, rdbut);
            i++;
        }
        mainPanel1.add(leftPanel1);
        mainPanel1.add(rightPanel1);
        jScrollPane1.setViewportView(mainPanel1);
        NOTE.close();
        conn.close();
    } catch (Exception ex) {
        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(rootPane, "Oops!! Something went Wrong!!");
    }  
}

public void saveKeywords(String keywords[],String top){
    try{        
        Class.forName(JDBC_DRIVER);
        conn=(Connection) DriverManager.getConnection(DB_URL,USER,PASS);
        upd=(PreparedStatement)conn.prepareStatement("UPDATE Note SET KeyWord1=?,KeyWord2=?,KeyWord3=?,KeyWord4=?,KeyWord5=? WHERE UName=? AND Topic=?;");
        for(int i=0;i<keywords.length;i++){
            upd.setString(i+1,keywords[i]);
        }
        upd.setString(6,uname);
        upd.setString(7,top);
        upd.executeUpdate();
        upd.close();
        conn.close();
    }
    catch(Exception Ex){
        Ex.printStackTrace();
    }
}
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() { 
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chpw;
    private javax.swing.JButton creMem;
    private javax.swing.JButton creNote;
    private javax.swing.JButton delMem;
    private javax.swing.JButton delNote;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel name_dis;
    private javax.swing.JButton refNote;
    private javax.swing.JButton refTodo;
    private javax.swing.JTextField search;
    private javax.swing.JButton searchgo;
    private javax.swing.JButton updMem;
    private javax.swing.JButton updNote;
    // End of variables declaration//GEN-END:variables
 
}
