/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author HTCM
 */
import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class User extends javax.swing.JFrame {

    /**
     * Creates new form Log
     */
    public Connection con;
    public Statement st1, state7, st;
    public ResultSet res7, res;
    public String ans, query7;

    public User() {
        initComponents();
        connection();
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }

    public void connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mu_blood_donors?zeroDateTimeBehavior=convertToNull", "root", "");
            st1 = con.createStatement();
            //JOptionPane.showMessageDialog(null, "Connected!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No connection!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        All = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        select_column = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        TxAreabtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usn = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        AdminEnter = new javax.swing.JButton();
        pas = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Uname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        Clr = new javax.swing.JButton();
        SubmitOne = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        setForeground(new java.awt.Color(0, 153, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(204, 0, 51));
        jTabbedPane1.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        All.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        All.setText("All Blood Donor's Information");
        All.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllMouseClicked(evt);
            }
        });
        All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllActionPerformed(evt);
            }
        });
        jPanel3.add(All, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel11.setText("Search by");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 130, -1));

        select_column.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        select_column.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        select_column.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                select_columnMouseClicked(evt);
            }
        });
        select_column.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_columnActionPerformed(evt);
            }
        });
        jPanel3.add(select_column, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 110, -1));

        btnSearch.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        btnSearch.setText("Submit");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel3.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, -1, 30));

        TxAreabtn.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        TxAreabtn.setText("Clear");
        TxAreabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxAreabtnActionPerformed(evt);
            }
        });
        jPanel3.add(TxAreabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, -1, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search Information Here");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 40));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Blood_group", "Religion", "Last_donation", "Phone_number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 140, 1020, 330));

        jTabbedPane1.addTab("Search", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("Username");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("Password");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        usn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel4.add(usn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 420, 40));

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 51));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, -1, 30));

        AdminEnter.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        AdminEnter.setForeground(new java.awt.Color(204, 0, 51));
        AdminEnter.setText("Enter");
        AdminEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminEnterActionPerformed(evt);
            }
        });
        jPanel4.add(AdminEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, -1, 30));

        pas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel4.add(pas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 420, 40));

        jTabbedPane1.addTab("Admin Login", jPanel4);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("Username");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        Uname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(Uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 420, 40));

        jLabel6.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        Pass.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 420, 40));

        Clr.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        Clr.setForeground(new java.awt.Color(204, 0, 51));
        Clr.setText("Clear");
        Clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClrActionPerformed(evt);
            }
        });
        jPanel2.add(Clr, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, -1, 30));

        SubmitOne.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        SubmitOne.setForeground(new java.awt.Color(204, 0, 51));
        SubmitOne.setText("Enter");
        SubmitOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitOneActionPerformed(evt);
            }
        });
        jPanel2.add(SubmitOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, -1, 30));

        jTabbedPane1.addTab("Authority login", jPanel2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1030, 520));

        jLabel1.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to MU Blood Donor's Group!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 590));

        jMenu1.setForeground(new java.awt.Color(204, 0, 51));
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(204, 0, 51));
        jMenuItem2.setText("New");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(204, 0, 51));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        usn.setText("");
        pas.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AdminEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminEnterActionPerformed
        // TODO add your handling code here:
        try {
            String p = pas.getText();
            String u = usn.getText();
            String log = "select * from autho_pass where User_name='" + usn.getText() + "' and Password='" + pas.getText() + "'";
            st = con.createStatement();
            res = st.executeQuery(log);
            int ok = 0;
            res.next();
            if ((u.equals(res.getString("User_name"))) && (p.equals(res.getString("Password")))) {
                {
                    JOptionPane.showMessageDialog(null, "Login successfully!");
                    new Front_page().setVisible(true);
                    this.setVisible(false);
                }

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Invalid password or username!");
            //ex.printStackTrace();
        }
        //        String u = usn.getText();
        //        String p = pas.getText();
        //        if (((u.equals("MU_member")) && (p.equals("login"))) || ((u.equals("Member_MU")) && (p.equals("login")))) {
        //            new Front_page().setVisible(true);
        //            this.setVisible(false);
        //        } else {
        //            JOptionPane.showMessageDialog(null, "Invalid password or username");
        //        }
    }//GEN-LAST:event_AdminEnterActionPerformed

    private void AllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllMouseClicked
        // TODO add your handling code here:
        select_column.setSelectedItem("A+");
        //search.setText("");
    }//GEN-LAST:event_AllMouseClicked

    private void AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AllActionPerformed

    private void select_columnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_columnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_columnActionPerformed

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String str1 = (String) select_column.getSelectedItem();
        //            System.out. String str1 = (String) select_column.getSelectedItem();println(str1+"\n");
        //String item1 = search.getText();
        //            query7 = "select * from information where " + str1 + " = '" + item1 + "'";
        int ok = 0;
        if (All.isSelected()) {
            query7 = "select * from information";
        } else {
            query7 = "select * from information where Blood_group='" + str1 + "'";
        }
        try {
            state7 = con.createStatement();
            res7 = state7.executeQuery(query7);
            jTable1.setModel(DbUtils.resultSetToTableModel(res7));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void TxAreabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxAreabtnActionPerformed
        // TODO add your handling code here:
        //search.setText("");
        All.setSelected(false);
        //count.setSelectedItem("A+");
        select_column.setSelectedItem("A+");
        try {
//            state7 = con.createStatement();
//            query7 = "select * from information";
//            res7 = state7.executeQuery(query7);
            jTable1.setModel(new DefaultTableModel(null, new String[]{"ID", "Name", "Gender", "Blood_group", "Religion", "Last_donation", "Phone_number"}));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Exception:" + e);
        }
    }//GEN-LAST:event_TxAreabtnActionPerformed

    private void select_columnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_select_columnMouseClicked
        // TODO add your handling code here:
        All.setSelected(false);
    }//GEN-LAST:event_select_columnMouseClicked

    private void ClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClrActionPerformed
        // TODO add your handling code here:
        Uname.setText("");
        Pass.setText("");
    }//GEN-LAST:event_ClrActionPerformed

    private void SubmitOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitOneActionPerformed
        // TODO add your handling code here:
        try {
            String u = Uname.getText();
            String p = Pass.getText();
            String log = "select * from autho_pass where User_name='" + Uname.getText() + "' and Password='" + Pass.getText() + "' and Position = 'Main'";
            st = con.createStatement();
            res = st.executeQuery(log);
            int ok = 0;
            res.next();
            if ((u.equals(res.getString("User_name"))) && (p.equals(res.getString("Password")))) {
                JOptionPane.showMessageDialog(null, "Login successfully!");
                new Authority().setVisible(true);
                this.setVisible(false);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Invalid password or username!");
        }
//        try {
//            String Un = "", Ps = "";
//            Un = Uname.getText();
//            Ps = Pass.getText();
//            if (((Un.equals("MU_authority")) && (Ps.equals("login"))) || ((Un.equals("MU_blood_donor")) && (Ps.equals("loginhere")))) {
//                JOptionPane.showMessageDialog(null, "Login to Authority page!");
//                new Authority().setVisible(true);
//                this.setVisible(false);
//            } else {
//                JOptionPane.showMessageDialog(null, "Invalid Password or Username");
//            }
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Exception in login page!");
//        }
    }//GEN-LAST:event_SubmitOneActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        TableColumnModel modelecolonne = jTable1.getColumnModel();
        TableModel modele = jTable1.getModel();
        int tot = modelecolonne.getColumnCount();
        for (int i = 0; i < tot; i++) {
            int taille = 0;
            int tot2 = modele.getRowCount();
            for (int j = 0; j < tot2; j++) {
                if (modele.getValueAt(j, i) != null) {
                    int taille2 = modele.getValueAt(j, i).toString().length() * 7;
                    if (taille2 > taille) {
                        taille = taille2;
                    }
                }
                modelecolonne.getColumn(i).setPreferredWidth(taille);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(0);
         All.setSelected(false);
         select_column.setSelectedItem("A+");
         jTable1.setModel(new DefaultTableModel(null, new String[]{"ID", "Name", "Gender", "Blood_group", "Religion", "Last_donation", "Phone_number"}));
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jTable1MouseEntered

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminEnter;
    private javax.swing.JCheckBox All;
    private javax.swing.JButton Clr;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JButton SubmitOne;
    private javax.swing.JButton TxAreabtn;
    private javax.swing.JTextField Uname;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField pas;
    private javax.swing.JComboBox<String> select_column;
    private javax.swing.JTextField usn;
    // End of variables declaration//GEN-END:variables
}
