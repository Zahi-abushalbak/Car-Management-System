/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.databaseproject;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Properties;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;


/**
 *
 * @author Hadi
 */

public class NewJFrame extends javax.swing.JFrame {
     
     
    
     
    /**
     * Creates new form NewJFrame
     */
    String username="admin";
    String passcode="123";
    String password="admin";
    int FulltimeCount=0;
    int ParttimeCount=0;
    //getting the password from the database
    boolean Parttime = false;
    boolean Fulltime = false;
    boolean Staff = false;
    boolean Manager = false;
    boolean Electric = false;
    boolean Fueled = false;
    boolean Female=false;
    boolean Male=false;
    boolean Dark=true;
    boolean Light=false;
    int incrementVar =0;
    int incrementVar1 =0;
    int incrementVar2=0;
    String M="Male";
    String F="Female";
    public NewJFrame() {
        initComponents();
        this.jLabel10.setVisible(false);
        HomePanel.setVisible(false);
        tab4.setVisible(false);
        empadd.setVisible(false);
        empview.setVisible(false);
        caradd.setVisible(false);
        carview.setVisible(false);
        insuranceadd.setVisible(false);
        insuranceview.setVisible(false);
        maintenanceadd.setVisible(false);
        maintenanceview.setVisible(false);
        FeedBack.setVisible(false);
        Settings.setVisible(false);
        forgotpassword.setVisible(false);
        this.Taxiadd.setVisible(false);
        this.Taxiview.setVisible(false);
        this.Gasadd.setVisible(false);
        this.Gasview.setVisible(false);
        this.empedit.setVisible(false);
        this.insuranceedit.setVisible(false);
        this.maintenanceedit.setVisible(false);
        this.caredit.setVisible(false);
        this.gasstationedit.setVisible(false);
        this.Taxiedit.setVisible(false);
        this.Reserveacar.setVisible(false);
        this.Reserveataxi.setVisible(false);
        this.Couponadd.setVisible(false);
        this.Reports.setVisible(false);
        this.jLabel69.setVisible(false);
        this.jTextField26.setVisible(false);
        this.jButton31.setVisible(false);
        this.jLabel74.setVisible(false);
        this.jLabel77.setVisible(false);
        this.jTextField30.setVisible(false);
        this.jTextField31.setVisible(false);
        this.jTextField32.setVisible(false);
        this.jLabel80.setVisible(false);
        this.jLabel81.setVisible(false);
        this.jLabel16.setVisible(false);
        this.jLabel82.setVisible(false);
        this.jLabel83.setVisible(false);
        this.jLabel84.setVisible(false);
        this.jTextField33.setVisible(false);
        this.jTextField34.setVisible(false);
        this.jTextField35.setVisible(false);
        this.jLabel85.setVisible(false);
        this.jLabel86.setVisible(false);
        this.jTextField36.setVisible(false);
        this.jTextField37.setVisible(false);
        jButton1.setFocusPainted(false);
        jButton3.setFocusPainted(false);
        jButton4.setFocusPainted(false);
        jButton6.setFocusPainted(false);
        jButton7.setFocusPainted(false);
        jButton9.setFocusPainted(false);
        jButton10.setFocusPainted(false);
        jButton11.setFocusPainted(false);
        jButton12.setFocusPainted(false);
        jButton14.setFocusPainted(false);
        jButton15.setFocusPainted(false);
        jButton17.setFocusPainted(false);
        jButton18.setFocusPainted(false);
        jButton20.setFocusPainted(false);
        jButton22.setFocusPainted(false);
        jButton24.setFocusPainted(false);
        jButton26.setFocusPainted(false);
        jButton28.setFocusPainted(false);
        jButton30.setFocusPainted(false);
        jButton31.setFocusPainted(false);
        jButton32.setFocusPainted(false);
        jButton34.setFocusPainted(false);
        jButton35.setFocusPainted(false);
        jButton36.setFocusPainted(false);
        jButton37.setFocusPainted(false);
        jButton38.setFocusPainted(false);
        jButton39.setFocusPainted(false);
        jButton40.setFocusPainted(false);
        jButton41.setFocusPainted(false);
        jButton42.setFocusPainted(false);
        jButton43.setFocusPainted(false);
        jButton44.setFocusPainted(false);
        jButton46.setFocusPainted(false);
        jButton47.setFocusPainted(false);
        jButton48.setFocusPainted(false);
        jButton50.setFocusPainted(false);
        jButton51.setFocusPainted(false);
        jButton52.setFocusPainted(false);
        jButton54.setFocusPainted(false);
        jButton56.setFocusPainted(false);
        jButton57.setFocusPainted(false);
        jButton59.setFocusPainted(false);
        jButton60.setFocusPainted(false);
        jButton62.setFocusPainted(false);
        jButton64.setFocusPainted(false);
        jButton65.setFocusPainted(false);
        jButton67.setFocusPainted(false);
        jButton68.setFocusPainted(false);
        jButton70.setFocusPainted(false);
        jButton71.setFocusPainted(false);
        jButton73.setFocusPainted(false);
        jButton74.setFocusPainted(false);
        jButton75.setFocusPainted(false);
        jButton76.setFocusPainted(false);
        jButton78.setFocusPainted(false);
        jButton79.setFocusPainted(false);
        jButton80.setFocusPainted(false);
        jButton81.setFocusPainted(false);
        jButton82.setFocusPainted(false);
        jButton83.setFocusPainted(false);
        jButton84.setFocusPainted(false);
        jButton85.setFocusPainted(false);
        jButton86.setFocusPainted(false);
        jButton87.setFocusPainted(false);
        jButton88.setFocusPainted(false);
        jButton89.setFocusPainted(false);
        jButton90.setFocusPainted(false);
        jButton91.setFocusPainted(false);
        jButton92.setFocusPainted(false);
        jButton93.setFocusPainted(false);
        jButton94.setFocusPainted(false);
        jButton95.setFocusPainted(false);
        jButton97.setFocusPainted(false);
        jButton98.setFocusPainted(false);
        jButton99.setFocusPainted(false);
         jButton101.setFocusPainted(false);
         jButton102.setFocusPainted(false);
         jButton103.setFocusPainted(false);
         jButton104.setFocusPainted(false);
         jButton105.setFocusPainted(false);
         jButton106.setFocusPainted(false);
         jButton107.setFocusPainted(false);
         jButton108.setFocusPainted(false);
         jButton109.setFocusPainted(false);
         jButton110.setFocusPainted(false);
         jButton111.setFocusPainted(false);
         jButton112.setFocusPainted(false);
         jButton113.setFocusPainted(false);
         jButton114.setFocusPainted(false);
         jButton115.setFocusPainted(false);
         jButton116.setFocusPainted(false);
         jButton117.setFocusPainted(false);
         jButton118.setFocusPainted(false);
         jButton119.setFocusPainted(false);
         jButton120.setFocusPainted(false);
         jButton121.setFocusPainted(false);
         jButton122.setFocusPainted(false);
         jButton123.setFocusPainted(false);
         jButton124.setFocusPainted(false);
         jButton125.setFocusPainted(false);
         jButton126.setFocusPainted(false);
         jButton127.setFocusPainted(false);
         jButton128.setFocusPainted(false);
         jButton129.setFocusPainted(false);
         jButton130.setFocusPainted(false);
         jButton131.setFocusPainted(false);
         jButton132.setFocusPainted(false);
         jButton133.setFocusPainted(false);
         jButton134.setFocusPainted(false);
         jButton135.setFocusPainted(false);
         jButton136.setFocusPainted(false);
         jButton137.setFocusPainted(false);
         jButton138.setFocusPainted(false);
         jButton139.setFocusPainted(false);
         jButton140.setFocusPainted(false);
         jButton141.setFocusPainted(false);
         jButton142.setFocusPainted(false);
         jButton143.setFocusPainted(false);
         jButton144.setFocusPainted(false);
         jLabel121.setVisible(false);
         jTextField88.setVisible(false);
         jLabel201.setVisible(false);
         jLabel202.setVisible(false);
         jTextField85.setVisible(false);
         jTextField87.setVisible(false);
        this.jLabel205.setVisible(false);
        this.jLabel204.setVisible(false);
        this.jTextField55.setVisible(false);
        this.jTextField59.setVisible(false);
        this.jButton45.setVisible(false);
        
        this.jLabel3.setVisible(false);


        // getting the username and password from the database
           try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="select * from vt.userpassword";
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            int i =1;
            while(rs.next())
            {

                username = rs.getString(1);
                password= rs.getString(2);
            }
            con.close();
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this,"Error During getting the username and password","Error",JOptionPane.ERROR_MESSAGE);
        } 
           setTitle("Paltel BTL System");
           ImageIcon logo = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\paltel-16x16.png");
           setIconImage(logo.getImage());

    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel71 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jButton112 = new javax.swing.JButton();
        jButton113 = new javax.swing.JButton();
        jLabel169 = new javax.swing.JLabel();
        HomePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jButton114 = new javax.swing.JButton();
        jButton115 = new javax.swing.JButton();
        jButton116 = new javax.swing.JButton();
        jButton117 = new javax.swing.JButton();
        jButton118 = new javax.swing.JButton();
        jLabel199 = new javax.swing.JLabel();
        tab4 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jButton119 = new javax.swing.JButton();
        jLabel102 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        jButton39 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        empadd = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jButton120 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel82 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel83 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel80 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        empview = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton121 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        caradd = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton122 = new javax.swing.JButton();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        carview = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton123 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        insuranceadd = new javax.swing.JPanel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jButton124 = new javax.swing.JButton();
        jLabel103 = new javax.swing.JLabel();
        insuranceview = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jButton125 = new javax.swing.JButton();
        jLabel104 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        maintenanceadd = new javax.swing.JPanel();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jButton126 = new javax.swing.JButton();
        jLabel146 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jLabel175 = new javax.swing.JLabel();
        maintenanceview = new javax.swing.JPanel();
        jButton26 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jButton127 = new javax.swing.JButton();
        jLabel171 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        FeedBack = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jButton28 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton128 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        Settings = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jButton129 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jLabel203 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jLabel204 = new javax.swing.JLabel();
        jTextField55 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jLabel205 = new javax.swing.JLabel();
        forgotpassword = new javax.swing.JPanel();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jButton32 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jButton130 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        Taxiadd = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jButton131 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jButton44 = new javax.swing.JButton();
        jLabel173 = new javax.swing.JLabel();
        Taxiview = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel174 = new javax.swing.JLabel();
        jButton132 = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        jButton40 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        Gasadd = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jButton133 = new javax.swing.JButton();
        jLabel178 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jTextField44 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jButton50 = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();
        jButton52 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        Gasview = new javax.swing.JPanel();
        jButton54 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel179 = new javax.swing.JLabel();
        jButton134 = new javax.swing.JButton();
        jLabel99 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        empedit = new javax.swing.JPanel();
        jTextField49 = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jButton135 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jTextField48 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jTextField50 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        jTextField54 = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jTextField60 = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        jTextField61 = new javax.swing.JTextField();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jLabel181 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jTextField85 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField86 = new javax.swing.JTextField();
        jLabel200 = new javax.swing.JLabel();
        jTextField87 = new javax.swing.JTextField();
        jTextField88 = new javax.swing.JTextField();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        insuranceedit = new javax.swing.JPanel();
        jTextField63 = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel182 = new javax.swing.JLabel();
        jButton136 = new javax.swing.JButton();
        jLabel125 = new javax.swing.JLabel();
        jButton60 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jTextField47 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jLabel187 = new javax.swing.JLabel();
        maintenanceedit = new javax.swing.JPanel();
        jTextField75 = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel133 = new javax.swing.JLabel();
        jButton137 = new javax.swing.JButton();
        jLabel183 = new javax.swing.JLabel();
        jButton62 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jLabel112 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jButton87 = new javax.swing.JButton();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jButton89 = new javax.swing.JButton();
        jLabel186 = new javax.swing.JLabel();
        caredit = new javax.swing.JPanel();
        jTextField76 = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel135 = new javax.swing.JLabel();
        jButton138 = new javax.swing.JButton();
        jLabel185 = new javax.swing.JLabel();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jLabel115 = new javax.swing.JLabel();
        jTextField52 = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        jTextField56 = new javax.swing.JTextField();
        jLabel122 = new javax.swing.JLabel();
        jTextField62 = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jTextField69 = new javax.swing.JTextField();
        jButton88 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jLabel184 = new javax.swing.JLabel();
        gasstationedit = new javax.swing.JPanel();
        jTextField77 = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel137 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jButton139 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jLabel124 = new javax.swing.JLabel();
        jTextField70 = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        jTextField71 = new javax.swing.JTextField();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jLabel189 = new javax.swing.JLabel();
        Taxiedit = new javax.swing.JPanel();
        jTextField78 = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel139 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jButton140 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jLabel130 = new javax.swing.JLabel();
        jButton93 = new javax.swing.JButton();
        jTextField72 = new javax.swing.JTextField();
        jTextField73 = new javax.swing.JTextField();
        jLabel147 = new javax.swing.JLabel();
        jTextField74 = new javax.swing.JTextField();
        jLabel148 = new javax.swing.JLabel();
        jButton94 = new javax.swing.JButton();
        jLabel191 = new javax.swing.JLabel();
        Reserveacar = new javax.swing.JPanel();
        jTextField79 = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jButton141 = new javax.swing.JButton();
        jLabel192 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jTextField80 = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        jButton81 = new javax.swing.JButton();
        jLabel193 = new javax.swing.JLabel();
        Reserveataxi = new javax.swing.JPanel();
        jTextField81 = new javax.swing.JTextField();
        jLabel143 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        jButton142 = new javax.swing.JButton();
        jLabel195 = new javax.swing.JLabel();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jTextField82 = new javax.swing.JTextField();
        jLabel145 = new javax.swing.JLabel();
        jButton80 = new javax.swing.JButton();
        jLabel194 = new javax.swing.JLabel();
        Couponadd = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jLabel149 = new javax.swing.JLabel();
        jButton143 = new javax.swing.JButton();
        jLabel196 = new javax.swing.JLabel();
        jTextField64 = new javax.swing.JTextField();
        jLabel150 = new javax.swing.JLabel();
        jTextField83 = new javax.swing.JTextField();
        jLabel151 = new javax.swing.JLabel();
        jTextField84 = new javax.swing.JTextField();
        jLabel152 = new javax.swing.JLabel();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jLabel197 = new javax.swing.JLabel();
        Reports = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jButton144 = new javax.swing.JButton();
        jLabel198 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jButton101 = new javax.swing.JButton();
        jLabel153 = new javax.swing.JLabel();
        jButton102 = new javax.swing.JButton();
        jLabel154 = new javax.swing.JLabel();
        jButton103 = new javax.swing.JButton();
        jLabel155 = new javax.swing.JLabel();
        jButton104 = new javax.swing.JButton();
        jLabel156 = new javax.swing.JLabel();
        jButton105 = new javax.swing.JButton();
        jLabel157 = new javax.swing.JLabel();
        jButton106 = new javax.swing.JButton();
        jLabel158 = new javax.swing.JLabel();
        jButton107 = new javax.swing.JButton();
        jLabel159 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jButton108 = new javax.swing.JButton();
        jLabel162 = new javax.swing.JLabel();
        jButton109 = new javax.swing.JButton();
        jButton110 = new javax.swing.JButton();
        jLabel163 = new javax.swing.JLabel();
        jButton111 = new javax.swing.JButton();
        jLabel164 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        LoginPanel.setBackground(new java.awt.Color(69, 63, 61));
        LoginPanel.setPreferredSize(new java.awt.Dimension(1300, 900));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jPanel45.setBackground(new java.awt.Color(42, 39, 39));
        jPanel45.setForeground(new java.awt.Color(244, 253, 255));
        jPanel45.setPreferredSize(new java.awt.Dimension(800, 900));

        jTextField1.setBackground(new java.awt.Color(42, 39, 39));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(244, 253, 255));
        jTextField1.setText("Enter Username");
        jTextField1.setBorder(null);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(42, 39, 39));
        jButton1.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(244, 253, 255));
        jButton1.setText("LogIn");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(42, 39, 39));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(244, 253, 255));
        jPasswordField1.setText("Enter Username");
        jPasswordField1.setBorder(null);
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(87, 80, 77));
        jLabel71.setText("I forgot my password");
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
        });

        jLabel165.setFont(new java.awt.Font("Footlight MT Light", 1, 55)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(244, 253, 255));
        jLabel165.setText("Sign in");

        jLabel166.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/icons8-username-48.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jLabel167.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/icons8-password-48.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jSeparator2.setBackground(new java.awt.Color(129, 133, 137));
        jSeparator2.setForeground(new java.awt.Color(244, 253, 255));

        jSeparator4.setBackground(new java.awt.Color(129, 133, 137));
        jSeparator4.setForeground(new java.awt.Color(244, 253, 255));

        jTextField7.setBackground(new java.awt.Color(42, 39, 39));
        jTextField7.setForeground(new java.awt.Color(42, 39, 39));
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(87, 80, 77));
        jLabel10.setText("Wrong Password or Username, Please Try Again.");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel166, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel167, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel45Layout.createSequentialGroup()
                                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(227, 227, 227))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                                .addComponent(jLabel165)
                                .addGap(321, 321, 321))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel45Layout.createSequentialGroup()
                                        .addComponent(jLabel71)
                                        .addGap(8, 8, 8)))
                                .addGap(311, 311, 311))))))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel165)
                .addGap(160, 160, 160)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel166))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel167))
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel71)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/paltel.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jLabel168.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(244, 253, 255));
        jLabel168.setText("Theme");

        jButton112.setBackground(new java.awt.Color(69, 63, 61));
        jButton112.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton112.setForeground(new java.awt.Color(244, 253, 255));
        jButton112.setText("Dark");
        jButton112.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton112.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton112MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton112MouseExited(evt);
            }
        });
        jButton112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton112ActionPerformed(evt);
            }
        });

        jButton113.setBackground(new java.awt.Color(69, 63, 61));
        jButton113.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton113.setForeground(new java.awt.Color(244, 253, 255));
        jButton113.setText("Light");
        jButton113.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton113.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton113MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton113MouseExited(evt);
            }
        });
        jButton113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton113ActionPerformed(evt);
            }
        });

        jLabel169.setBackground(new java.awt.Color(0, 0, 204));
        jLabel169.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(244, 253, 255));
        jLabel169.setText("Paltel Group");
        jLabel169.setPreferredSize(new java.awt.Dimension(120, 35));

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel168)
                                    .addGap(197, 197, 197))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(155, 155, 155))))))
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel5)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225)
                        .addComponent(jLabel168)
                        .addGap(18, 18, 18)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(LoginPanel, "card2");

        HomePanel.setBackground(new java.awt.Color(42, 39, 39));
        HomePanel.setForeground(new java.awt.Color(43, 45, 49));
        HomePanel.setPreferredSize(new java.awt.Dimension(1300, 900));

        jPanel2.setBackground(new java.awt.Color(69, 63, 61));

        jLabel11.setFont(new java.awt.Font("Footlight MT Light", 1, 9)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(244, 253, 255));
        jLabel11.setText("CopyRights © for Paltel Company 2023");

        jLabel4.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/paltel-120x120.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jLabel170.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(244, 253, 255));
        jLabel170.setText("BTL System");

        jButton114.setBackground(new java.awt.Color(69, 63, 61));
        jButton114.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/icons8-home-48.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton114.setBorder(null);
        jButton114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton114ActionPerformed(evt);
            }
        });

        jButton115.setBackground(new java.awt.Color(69, 63, 61));
        jButton115.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/settings.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton115.setBorder(null);
        jButton115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton115ActionPerformed(evt);
            }
        });

        jButton116.setBackground(new java.awt.Color(69, 63, 61));
        jButton116.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/3669434_feedback_ic_icon.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton116.setBorder(null);
        jButton116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton116ActionPerformed(evt);
            }
        });

        jButton117.setBackground(new java.awt.Color(69, 63, 61));
        jButton117.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/icons8-reports-48.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton117.setBorder(null);
        jButton117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton117ActionPerformed(evt);
            }
        });

        jButton118.setBackground(new java.awt.Color(69, 63, 61));
        jButton118.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/logout.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton118.setBorder(null);
        jButton118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton118ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel170)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel11))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel95)
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton117, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel170)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel95)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jButton114)
                        .addGap(27, 27, 27)
                        .addComponent(jButton115)
                        .addGap(31, 31, 31)
                        .addComponent(jButton116)
                        .addGap(26, 26, 26)
                        .addComponent(jButton117)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton118)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel199.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/t7seen.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel199, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(HomePanel, "card3");

        tab4.setBackground(new java.awt.Color(42, 39, 39));
        tab4.setPreferredSize(new java.awt.Dimension(1300, 900));

        jPanel14.setBackground(new java.awt.Color(69, 63, 61));
        jPanel14.setPreferredSize(new java.awt.Dimension(1300, 70));

        jButton119.setBackground(new java.awt.Color(69, 63, 61));
        jButton119.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton119.setToolTipText("");
        jButton119.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton119ActionPerformed(evt);
            }
        });

        jLabel102.setBackground(new java.awt.Color(69, 63, 61));
        jLabel102.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/icons8-home-48.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jLabel57.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Home");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton119)
                .addGap(530, 530, 530)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel102)
                .addGap(25, 25, 25))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102)
                    .addComponent(jButton119))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(244, 253, 255));
        jLabel12.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/employees.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel12.setText(" Employees");

        jButton3.setBackground(new java.awt.Color(42, 39, 39));
        jButton3.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/plus.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton3.setText("Add");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton3.setPreferredSize(new java.awt.Dimension(23, 23));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(42, 39, 39));
        jButton4.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/view.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton4.setText("View");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton34.setBackground(new java.awt.Color(42, 39, 39));
        jButton34.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/edit.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton34.setText("Edit");
        jButton34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(244, 253, 255));
        jLabel15.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/maintenance.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel15.setText(" Maintenance");

        jButton11.setBackground(new java.awt.Color(42, 39, 39));
        jButton11.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(244, 253, 255));
        jButton11.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/plus.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton11.setText("Add");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(42, 39, 39));
        jButton12.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(244, 253, 255));
        jButton12.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/view.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton12.setText("View");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton37.setBackground(new java.awt.Color(42, 39, 39));
        jButton37.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton37.setForeground(new java.awt.Color(244, 253, 255));
        jButton37.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/edit.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton37.setText("Edit");
        jButton37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton95.setBackground(new java.awt.Color(42, 39, 39));
        jButton95.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton95.setForeground(new java.awt.Color(244, 253, 255));
        jButton95.setText("Add a Coupon");
        jButton95.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton95ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(244, 253, 255));
        jLabel14.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/insurance-company.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel14.setText("Insurance");

        jButton9.setBackground(new java.awt.Color(42, 39, 39));
        jButton9.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(244, 253, 255));
        jButton9.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/plus.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton9.setText("Add");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(42, 39, 39));
        jButton10.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(244, 253, 255));
        jButton10.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/view.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton10.setText("View");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton36.setBackground(new java.awt.Color(42, 39, 39));
        jButton36.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton36.setForeground(new java.awt.Color(244, 253, 255));
        jButton36.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/edit.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton36.setText("Edit");
        jButton36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton38.setBackground(new java.awt.Color(42, 39, 39));
        jButton38.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton38.setForeground(new java.awt.Color(244, 253, 255));
        jButton38.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/plus.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton38.setText("Add");
        jButton38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(244, 253, 255));
        jLabel78.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/taxi-sign.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel78.setText(" Taxi Bureau");

        jButton39.setBackground(new java.awt.Color(42, 39, 39));
        jButton39.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton39.setForeground(new java.awt.Color(244, 253, 255));
        jButton39.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/view.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton39.setText("View");
        jButton39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton51.setBackground(new java.awt.Color(42, 39, 39));
        jButton51.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton51.setForeground(new java.awt.Color(244, 253, 255));
        jButton51.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/edit.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton51.setText("Edit");
        jButton51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        jButton73.setBackground(new java.awt.Color(42, 39, 39));
        jButton73.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton73.setForeground(new java.awt.Color(244, 253, 255));
        jButton73.setText("Reserve a Car");
        jButton73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        jButton76.setBackground(new java.awt.Color(42, 39, 39));
        jButton76.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton76.setForeground(new java.awt.Color(244, 253, 255));
        jButton76.setText("Reserve a Taxi");
        jButton76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(244, 253, 255));
        jLabel13.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/car.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel13.setText(" Cars");

        jButton6.setBackground(new java.awt.Color(42, 39, 39));
        jButton6.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(244, 253, 255));
        jButton6.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/plus.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton6.setText("Add");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(42, 39, 39));
        jButton7.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(244, 253, 255));
        jButton7.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/view.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton7.setText("View");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton35.setBackground(new java.awt.Color(42, 39, 39));
        jButton35.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton35.setForeground(new java.awt.Color(244, 253, 255));
        jButton35.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/edit.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton35.setText("Edit");
        jButton35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jLabel89.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(244, 253, 255));
        jLabel89.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/icons8-gas-station-48.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel89.setText("Gas Station");

        jButton46.setBackground(new java.awt.Color(42, 39, 39));
        jButton46.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton46.setForeground(new java.awt.Color(244, 253, 255));
        jButton46.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/plus.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton46.setText("Add");
        jButton46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setBackground(new java.awt.Color(42, 39, 39));
        jButton47.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton47.setForeground(new java.awt.Color(244, 253, 255));
        jButton47.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/view.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton47.setText("View");
        jButton47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setBackground(new java.awt.Color(42, 39, 39));
        jButton48.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jButton48.setForeground(new java.awt.Color(244, 253, 255));
        jButton48.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/edit.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton48.setText("Edit");
        jButton48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tab4Layout = new javax.swing.GroupLayout(tab4);
        tab4.setLayout(tab4Layout);
        tab4Layout.setHorizontalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tab4Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137)
                .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel78)
                    .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(120, 120, 120))
        );
        tab4Layout.setVerticalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab4Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab4Layout.createSequentialGroup()
                        .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel89)
                            .addComponent(jLabel78))
                        .addGap(18, 18, 18)
                        .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tab4Layout.createSequentialGroup()
                                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tab4Layout.createSequentialGroup()
                                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton95, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tab4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tab4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tab4Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tab4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(120, 120, 120))
        );

        getContentPane().add(tab4, "card4");

        empadd.setBackground(new java.awt.Color(42, 39, 39));
        empadd.setPreferredSize(new java.awt.Dimension(1300, 900));

        jTextField3.setBackground(new java.awt.Color(69, 63, 61));
        jTextField3.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(244, 253, 255));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel17.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(244, 253, 255));
        jLabel17.setText("Last Name");

        jTextField4.setBackground(new java.awt.Color(69, 63, 61));
        jTextField4.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(244, 253, 255));
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel18.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(244, 253, 255));
        jLabel18.setText("Mid Name");

        jTextField5.setBackground(new java.awt.Color(69, 63, 61));
        jTextField5.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(244, 253, 255));
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel19.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(244, 253, 255));
        jLabel19.setText("SSN");

        jTextField6.setBackground(new java.awt.Color(69, 63, 61));
        jTextField6.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(244, 253, 255));
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel20.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(244, 253, 255));
        jLabel20.setText("Phone Number");

        jLabel21.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(244, 253, 255));
        jLabel21.setText("Birth Date");

        jLabel22.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(244, 253, 255));
        jLabel22.setText("Gender");

        jTextField9.setBackground(new java.awt.Color(69, 63, 61));
        jTextField9.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(244, 253, 255));
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel23.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(244, 253, 255));
        jLabel23.setText("Address");

        jButton14.setBackground(new java.awt.Color(42, 39, 39));
        jButton14.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(244, 253, 255));
        jButton14.setText("Save");
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(69, 63, 61));
        jTextField2.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(244, 253, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(87, 80, 77));
        jLabel6.setText("Please use ONLY English as a language for the data");

        jPanel13.setBackground(new java.awt.Color(69, 63, 61));
        jPanel13.setPreferredSize(new java.awt.Dimension(1300, 80));

        jLabel58.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(244, 253, 255));
        jLabel58.setText("Adding an Employee");

        jButton120.setBackground(new java.awt.Color(69, 63, 61));
        jButton120.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton120.setToolTipText("");
        jButton120.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton120ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/employees.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton120)
                .addGap(415, 415, 415)
                .addComponent(jLabel58)
                .addGap(394, 394, 394)
                .addComponent(jLabel3)
                .addGap(25, 25, 25))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton120)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                            .addComponent(jLabel58)
                            .addGap(8, 8, 8))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel79.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(244, 253, 255));
        jLabel79.setText("First Name");

        jDateChooser1.setBackground(new java.awt.Color(69, 63, 61));
        jDateChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jDateChooser1.setForeground(new java.awt.Color(69, 63, 61));
        jDateChooser1.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N

        jRadioButton5.setBackground(new java.awt.Color(42, 39, 39));
        jRadioButton5.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(244, 253, 255));
        jRadioButton5.setText("Male");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setBackground(new java.awt.Color(42, 39, 39));
        jRadioButton6.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(244, 253, 255));
        jRadioButton6.setText("Female");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(42, 39, 39));

        jCheckBox3.setBackground(new java.awt.Color(42, 39, 39));
        jCheckBox3.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(244, 253, 255));
        jCheckBox3.setText("Staff");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(244, 253, 255));
        jLabel82.setText("Major");

        jTextField33.setBackground(new java.awt.Color(69, 63, 61));
        jTextField33.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField33.setForeground(new java.awt.Color(244, 253, 255));
        jTextField33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(42, 39, 39));
        jCheckBox4.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(244, 253, 255));
        jCheckBox4.setText("Manager");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(244, 253, 255));
        jLabel83.setText("Office Number");

        jTextField34.setBackground(new java.awt.Color(69, 63, 61));
        jTextField34.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField34.setForeground(new java.awt.Color(244, 253, 255));
        jTextField34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel84.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(244, 253, 255));
        jLabel84.setText("Start Date");

        jTextField35.setBackground(new java.awt.Color(69, 63, 61));
        jTextField35.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField35.setForeground(new java.awt.Color(244, 253, 255));
        jTextField35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel82))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel83))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel83)
                            .addComponent(jLabel84))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel82)
                        .addGap(3, 3, 3)
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(42, 39, 39));

        jCheckBox1.setBackground(new java.awt.Color(42, 39, 39));
        jCheckBox1.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(244, 253, 255));
        jCheckBox1.setText("Full Time");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(244, 253, 255));
        jLabel80.setText("Salary");

        jTextField30.setBackground(new java.awt.Color(69, 63, 61));
        jTextField30.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField30.setForeground(new java.awt.Color(244, 253, 255));
        jTextField30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jCheckBox2.setBackground(new java.awt.Color(42, 39, 39));
        jCheckBox2.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(244, 253, 255));
        jCheckBox2.setText("Part Time");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(244, 253, 255));
        jLabel16.setText("Hours Worked");

        jTextField31.setBackground(new java.awt.Color(69, 63, 61));
        jTextField31.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField31.setForeground(new java.awt.Color(244, 253, 255));
        jTextField31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel81.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(244, 253, 255));
        jLabel81.setText("Wage per hour");

        jTextField32.setBackground(new java.awt.Color(69, 63, 61));
        jTextField32.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField32.setForeground(new java.awt.Color(244, 253, 255));
        jTextField32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jTextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel80)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel81)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93))
        );

        javax.swing.GroupLayout empaddLayout = new javax.swing.GroupLayout(empadd);
        empadd.setLayout(empaddLayout);
        empaddLayout.setHorizontalGroup(
            empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empaddLayout.createSequentialGroup()
                .addGroup(empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empaddLayout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(empaddLayout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addGroup(empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79))
                        .addGap(18, 18, 18)
                        .addGroup(empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(empaddLayout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addGroup(empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(empaddLayout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addGroup(empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addGroup(empaddLayout.createSequentialGroup()
                                        .addComponent(jRadioButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton6))))
                            .addGroup(empaddLayout.createSequentialGroup()
                                .addGroup(empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, empaddLayout.createSequentialGroup()
                                        .addGroup(empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20))
                                        .addGap(18, 18, 18)
                                        .addGroup(empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21))))
                                .addGap(18, 18, 18)
                                .addGroup(empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(empaddLayout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        empaddLayout.setVerticalGroup(
            empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empaddLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel79))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(empaddLayout.createSequentialGroup()
                        .addGroup(empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(empaddLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(empaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(45, 45, 45))
        );

        getContentPane().add(empadd, "card5");

        empview.setBackground(new java.awt.Color(42, 39, 39));
        empview.setPreferredSize(new java.awt.Dimension(1300, 900));

        jButton15.setBackground(new java.awt.Color(42, 39, 39));
        jButton15.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton15.setForeground(new java.awt.Color(244, 253, 255));
        jButton15.setText("View");
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(69, 63, 61));
        jPanel15.setPreferredSize(new java.awt.Dimension(1300, 70));

        jButton121.setBackground(new java.awt.Color(69, 63, 61));
        jButton121.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton121.setToolTipText("");
        jButton121.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton121ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/employees.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jLabel59.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(244, 253, 255));
        jLabel59.setText("View Employees");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton121)
                .addGap(449, 449, 449)
                .addComponent(jLabel59)
                .addGap(429, 429, 429)
                .addComponent(jLabel1)
                .addGap(42, 42, 42))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton121)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel59)))
                .addGap(14, 14, 14))
        );

        jTable1.setBackground(new java.awt.Color(69, 63, 61));
        jTable1.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(244, 253, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "First Name", "Middle Name", "Last Name", "SSN", "Phone number", "Birth date", "Gender", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable1);

        javax.swing.GroupLayout empviewLayout = new javax.swing.GroupLayout(empview);
        empview.setLayout(empviewLayout);
        empviewLayout.setHorizontalGroup(
            empviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empviewLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane8)
            .addGroup(empviewLayout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        empviewLayout.setVerticalGroup(
            empviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empviewLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(314, 314, 314)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        getContentPane().add(empview, "card6");

        caradd.setBackground(new java.awt.Color(42, 39, 39));
        caradd.setPreferredSize(new java.awt.Dimension(1300, 900));

        jTextField10.setBackground(new java.awt.Color(69, 63, 61));
        jTextField10.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(244, 253, 255));
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel28.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(244, 253, 255));
        jLabel28.setText("Car brand");

        jTextField11.setBackground(new java.awt.Color(69, 63, 61));
        jTextField11.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(244, 253, 255));
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel29.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(244, 253, 255));
        jLabel29.setText("Color");

        jTextField12.setBackground(new java.awt.Color(69, 63, 61));
        jTextField12.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(244, 253, 255));
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel30.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(244, 253, 255));
        jLabel30.setText("Plate Number");

        jTextField13.setBackground(new java.awt.Color(69, 63, 61));
        jTextField13.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(244, 253, 255));
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField14.setBackground(new java.awt.Color(69, 63, 61));
        jTextField14.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(244, 253, 255));
        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField15.setBackground(new java.awt.Color(69, 63, 61));
        jTextField15.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(244, 253, 255));
        jTextField15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField16.setBackground(new java.awt.Color(69, 63, 61));
        jTextField16.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(244, 253, 255));
        jTextField16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel31.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(244, 253, 255));
        jLabel31.setText("State of the Car");

        jLabel32.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(244, 253, 255));
        jLabel32.setText("Mainte. Company Name");

        jLabel33.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(244, 253, 255));
        jLabel33.setText("Clearence Date");

        jLabel34.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(244, 253, 255));
        jLabel34.setText("Last mainte.Date");

        jTextField17.setBackground(new java.awt.Color(69, 63, 61));
        jTextField17.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(244, 253, 255));
        jTextField17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel35.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(244, 253, 255));
        jLabel35.setText("Insur. expiration Date");

        jTextField18.setBackground(new java.awt.Color(69, 63, 61));
        jTextField18.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(244, 253, 255));
        jTextField18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel36.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(244, 253, 255));
        jLabel36.setText("Insur. Company Name");

        jButton18.setBackground(new java.awt.Color(42, 39, 39));
        jButton18.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton18.setForeground(new java.awt.Color(244, 253, 255));
        jButton18.setText("Save");
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(87, 80, 77));
        jLabel40.setText("Please use ONLY English as a language for the date");

        jPanel16.setBackground(new java.awt.Color(69, 63, 61));
        jPanel16.setPreferredSize(new java.awt.Dimension(1300, 80));

        jLabel60.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(244, 253, 255));
        jLabel60.setText("Adding a Car");

        jLabel7.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/car.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jButton122.setBackground(new java.awt.Color(69, 63, 61));
        jButton122.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton122.setToolTipText("");
        jButton122.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton122ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton122)
                .addGap(457, 457, 457)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(436, 436, 436)
                .addComponent(jLabel7)
                .addGap(25, 25, 25))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton122)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel60)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jCheckBox5.setBackground(new java.awt.Color(42, 39, 39));
        jCheckBox5.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(244, 253, 255));
        jCheckBox5.setText("Fueled");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setBackground(new java.awt.Color(42, 39, 39));
        jCheckBox6.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(244, 253, 255));
        jCheckBox6.setText("Electric");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jLabel85.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(244, 253, 255));
        jLabel85.setText("Fuel Type");

        jLabel86.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(244, 253, 255));
        jLabel86.setText("Capacity");

        jTextField36.setBackground(new java.awt.Color(69, 63, 61));
        jTextField36.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField36.setForeground(new java.awt.Color(244, 253, 255));
        jTextField36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField37.setBackground(new java.awt.Color(69, 63, 61));
        jTextField37.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField37.setForeground(new java.awt.Color(244, 253, 255));
        jTextField37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        javax.swing.GroupLayout caraddLayout = new javax.swing.GroupLayout(caradd);
        caradd.setLayout(caraddLayout);
        caraddLayout.setHorizontalGroup(
            caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, caraddLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(384, 384, 384))
            .addGroup(caraddLayout.createSequentialGroup()
                .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(caraddLayout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(jLabel40))
                    .addGroup(caraddLayout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addGroup(caraddLayout.createSequentialGroup()
                                .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel32)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel35)
                                    .addComponent(jTextField18)))))
                    .addGroup(caraddLayout.createSequentialGroup()
                        .addGap(468, 468, 468)
                        .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addGap(34, 34, 34)
                        .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(caraddLayout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(caraddLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(caraddLayout.createSequentialGroup()
                                .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel86))
                                .addGap(0, 0, 0)
                                .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel85)
                                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        caraddLayout.setVerticalGroup(
            caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caraddLayout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(caraddLayout.createSequentialGroup()
                        .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(caraddLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(caraddLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(caraddLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(caraddLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(caraddLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox6)
                .addGap(18, 18, 18)
                .addGroup(caraddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(caraddLayout.createSequentialGroup()
                        .addComponent(jLabel86)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(caraddLayout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel40)
                .addGap(45, 45, 45))
        );

        getContentPane().add(caradd, "card7");

        carview.setBackground(new java.awt.Color(42, 39, 39));
        carview.setPreferredSize(new java.awt.Dimension(1300, 900));

        jButton17.setBackground(new java.awt.Color(42, 39, 39));
        jButton17.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton17.setForeground(new java.awt.Color(244, 253, 255));
        jButton17.setText("view");
        jButton17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(87, 80, 77));
        jLabel24.setText("MCo.Name is \"Maintenance Company's Name\"");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(87, 80, 77));
        jLabel25.setText("MDate is \"Last Maintenance Date\"");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(87, 80, 77));
        jLabel26.setText("ICo.Name is \"Insurance Company's Name\"");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(87, 80, 77));
        jLabel27.setText("IDate is \"The due to Insurance Date\"");

        jPanel17.setBackground(new java.awt.Color(69, 63, 61));

        jLabel61.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(244, 253, 255));
        jLabel61.setText("View Cars");

        jLabel8.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/car.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jButton123.setBackground(new java.awt.Color(69, 63, 61));
        jButton123.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton123.setToolTipText("");
        jButton123.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton123ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton123)
                .addGap(497, 497, 497)
                .addComponent(jLabel61)
                .addGap(476, 476, 476)
                .addComponent(jLabel8)
                .addGap(40, 40, 40))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton123)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                            .addComponent(jLabel61)
                            .addGap(8, 8, 8))))
                .addGap(13, 13, 13))
        );

        jTable2.setBackground(new java.awt.Color(69, 63, 61));
        jTable2.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jTable2.setForeground(new java.awt.Color(244, 253, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Brand", "Color", "Plate Number", "State", "Clearence Date", "MCo. Name", "MDate", "ICo. Name", "IDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable2);

        javax.swing.GroupLayout carviewLayout = new javax.swing.GroupLayout(carview);
        carview.setLayout(carviewLayout);
        carviewLayout.setHorizontalGroup(
            carviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carviewLayout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 98, Short.MAX_VALUE))
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(carviewLayout.createSequentialGroup()
                .addGroup(carviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(carviewLayout.createSequentialGroup()
                        .addGap(568, 568, 568)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(carviewLayout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addGroup(carviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(carviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel25))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        carviewLayout.setVerticalGroup(
            carviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carviewLayout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(carviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(carviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(50, 50, 50))
        );

        getContentPane().add(carview, "card8");

        insuranceadd.setBackground(new java.awt.Color(42, 39, 39));
        insuranceadd.setPreferredSize(new java.awt.Dimension(1300, 900));

        jTextField19.setBackground(new java.awt.Color(69, 63, 61));
        jTextField19.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(244, 253, 255));
        jTextField19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField20.setBackground(new java.awt.Color(69, 63, 61));
        jTextField20.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(244, 253, 255));
        jTextField20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField21.setBackground(new java.awt.Color(69, 63, 61));
        jTextField21.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(244, 253, 255));
        jTextField21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField22.setBackground(new java.awt.Color(69, 63, 61));
        jTextField22.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(244, 253, 255));
        jTextField22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel41.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(244, 253, 255));
        jLabel41.setText("Price");

        jLabel42.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(244, 253, 255));
        jLabel42.setText("Address");

        jLabel43.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(244, 253, 255));
        jLabel43.setText("Insur. Company Name");

        jLabel44.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(244, 253, 255));
        jLabel44.setText("Phone Number");

        jButton20.setBackground(new java.awt.Color(42, 39, 39));
        jButton20.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton20.setForeground(new java.awt.Color(244, 253, 255));
        jButton20.setText("Save");
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(87, 80, 77));
        jLabel48.setText("Please use ONLY English as a language for the date ");

        jPanel18.setBackground(new java.awt.Color(69, 63, 61));
        jPanel18.setPreferredSize(new java.awt.Dimension(1300, 80));

        jLabel62.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(244, 253, 255));
        jLabel62.setText("Adding an Insurance Company");

        jButton124.setBackground(new java.awt.Color(69, 63, 61));
        jButton124.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton124.setToolTipText("");
        jButton124.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton124ActionPerformed(evt);
            }
        });

        jLabel103.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(244, 253, 255));
        jLabel103.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/insurance-company.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton124)
                .addGap(338, 338, 338)
                .addComponent(jLabel62)
                .addGap(317, 317, 317)
                .addComponent(jLabel103)
                .addGap(51, 51, 51))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton124))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel62)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout insuranceaddLayout = new javax.swing.GroupLayout(insuranceadd);
        insuranceadd.setLayout(insuranceaddLayout);
        insuranceaddLayout.setHorizontalGroup(
            insuranceaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insuranceaddLayout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(insuranceaddLayout.createSequentialGroup()
                .addGroup(insuranceaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insuranceaddLayout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addGroup(insuranceaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(insuranceaddLayout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addGroup(insuranceaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(insuranceaddLayout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(462, 462, 462))
        );
        insuranceaddLayout.setVerticalGroup(
            insuranceaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insuranceaddLayout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel48)
                .addGap(222, 222, 222))
        );

        getContentPane().add(insuranceadd, "card9");

        insuranceview.setBackground(new java.awt.Color(42, 39, 39));
        insuranceview.setPreferredSize(new java.awt.Dimension(1300, 900));

        jButton22.setBackground(new java.awt.Color(42, 39, 39));
        jButton22.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton22.setForeground(new java.awt.Color(244, 253, 255));
        jButton22.setText("View");
        jButton22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jPanel19.setBackground(new java.awt.Color(69, 63, 61));

        jLabel63.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(244, 253, 255));
        jLabel63.setText("View Insurance Companies");

        jButton125.setBackground(new java.awt.Color(69, 63, 61));
        jButton125.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton125.setToolTipText("");
        jButton125.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton125ActionPerformed(evt);
            }
        });

        jLabel104.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(244, 253, 255));
        jLabel104.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/insurance-company.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton125)
                .addGap(362, 362, 362)
                .addComponent(jLabel63)
                .addGap(341, 341, 341)
                .addComponent(jLabel104)
                .addGap(37, 37, 37))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addComponent(jButton125)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addGap(22, 22, 22))))
            .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTable3.setBackground(new java.awt.Color(69, 63, 61));
        jTable3.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jTable3.setForeground(new java.awt.Color(244, 253, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Price", "Address", "Insurance Companie Name", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(jTable3);

        javax.swing.GroupLayout insuranceviewLayout = new javax.swing.GroupLayout(insuranceview);
        insuranceview.setLayout(insuranceviewLayout);
        insuranceviewLayout.setHorizontalGroup(
            insuranceviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insuranceviewLayout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insuranceviewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(576, 576, 576))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insuranceviewLayout.createSequentialGroup()
                .addComponent(jScrollPane10)
                .addContainerGap())
        );
        insuranceviewLayout.setVerticalGroup(
            insuranceviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insuranceviewLayout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        getContentPane().add(insuranceview, "card10");

        maintenanceadd.setBackground(new java.awt.Color(42, 39, 39));
        maintenanceadd.setForeground(new java.awt.Color(255, 255, 255));
        maintenanceadd.setPreferredSize(new java.awt.Dimension(1300, 900));

        jTextField23.setBackground(new java.awt.Color(69, 63, 61));
        jTextField23.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(244, 253, 255));
        jTextField23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField24.setBackground(new java.awt.Color(69, 63, 61));
        jTextField24.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(244, 253, 255));
        jTextField24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField25.setBackground(new java.awt.Color(69, 63, 61));
        jTextField25.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField25.setForeground(new java.awt.Color(244, 253, 255));
        jTextField25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel45.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(244, 253, 255));
        jLabel45.setText("Phone Number");

        jLabel46.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(244, 253, 255));
        jLabel46.setText("Location");

        jLabel47.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(244, 253, 255));
        jLabel47.setText("Periodically Check Price");

        jButton24.setBackground(new java.awt.Color(42, 39, 39));
        jButton24.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton24.setForeground(new java.awt.Color(244, 253, 255));
        jButton24.setText("Save");
        jButton24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(87, 80, 77));
        jLabel49.setText("Please use ONLY English as a language for the data");

        jPanel20.setBackground(new java.awt.Color(69, 63, 61));
        jPanel20.setPreferredSize(new java.awt.Dimension(1300, 80));

        jLabel64.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(244, 253, 255));
        jLabel64.setText("Adding a Maintenance Company");

        jButton126.setBackground(new java.awt.Color(69, 63, 61));
        jButton126.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton126.setToolTipText("");
        jButton126.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton126ActionPerformed(evt);
            }
        });

        jLabel146.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(244, 253, 255));
        jLabel146.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/maintenance.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel146.setToolTipText("");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton126)
                .addGap(318, 318, 318)
                .addComponent(jLabel64)
                .addGap(297, 297, 297)
                .addComponent(jLabel146)
                .addGap(42, 42, 42))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton126)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addGap(8, 8, 8)))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel146, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel87.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(244, 253, 255));
        jLabel87.setText("Mainten.Company Name");

        jTextField38.setBackground(new java.awt.Color(69, 63, 61));
        jTextField38.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField38.setForeground(new java.awt.Color(244, 253, 255));
        jTextField38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jButton41.setBackground(new java.awt.Color(42, 39, 39));
        jButton41.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton41.setForeground(new java.awt.Color(244, 253, 255));
        jButton41.setText("Insert");
        jButton41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setBackground(new java.awt.Color(42, 39, 39));
        jButton42.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton42.setForeground(new java.awt.Color(244, 253, 255));
        jButton42.setText("Info");
        jButton42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jLabel175.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel175.setForeground(new java.awt.Color(87, 80, 77));
        jLabel175.setText("Make sure the company name was entered");

        javax.swing.GroupLayout maintenanceaddLayout = new javax.swing.GroupLayout(maintenanceadd);
        maintenanceadd.setLayout(maintenanceaddLayout);
        maintenanceaddLayout.setHorizontalGroup(
            maintenanceaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maintenanceaddLayout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maintenanceaddLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addGap(462, 462, 462))
            .addGroup(maintenanceaddLayout.createSequentialGroup()
                .addGroup(maintenanceaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(maintenanceaddLayout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addGroup(maintenanceaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46)
                            .addGroup(maintenanceaddLayout.createSequentialGroup()
                                .addGroup(maintenanceaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(maintenanceaddLayout.createSequentialGroup()
                                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel175))))
                    .addGroup(maintenanceaddLayout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        maintenanceaddLayout.setVerticalGroup(
            maintenanceaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maintenanceaddLayout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(maintenanceaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel175))
                .addGap(18, 18, 18)
                .addGroup(maintenanceaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        getContentPane().add(maintenanceadd, "card11");

        maintenanceview.setBackground(new java.awt.Color(42, 39, 39));
        maintenanceview.setPreferredSize(new java.awt.Dimension(1300, 900));

        jButton26.setBackground(new java.awt.Color(42, 39, 39));
        jButton26.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton26.setForeground(new java.awt.Color(244, 253, 255));
        jButton26.setText("View");
        jButton26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jPanel21.setBackground(new java.awt.Color(69, 63, 61));

        jLabel65.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(244, 253, 255));
        jLabel65.setText("View Maintenance Companies");

        jButton127.setBackground(new java.awt.Color(69, 63, 61));
        jButton127.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton127.setToolTipText("");
        jButton127.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton127ActionPerformed(evt);
            }
        });

        jLabel171.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel171.setForeground(new java.awt.Color(244, 253, 255));
        jLabel171.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/maintenance.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel171.setToolTipText("");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton127)
                .addGap(337, 337, 337)
                .addComponent(jLabel65)
                .addGap(316, 316, 316)
                .addComponent(jLabel171)
                .addGap(46, 46, 46))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(jButton127)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addGap(22, 22, 22))))
            .addComponent(jLabel171, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTable4.setBackground(new java.awt.Color(69, 63, 61));
        jTable4.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jTable4.setForeground(new java.awt.Color(244, 253, 255));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Maintenance Company Name", "Phone Number", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(jTable4);

        javax.swing.GroupLayout maintenanceviewLayout = new javax.swing.GroupLayout(maintenanceview);
        maintenanceview.setLayout(maintenanceviewLayout);
        maintenanceviewLayout.setHorizontalGroup(
            maintenanceviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maintenanceviewLayout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(maintenanceviewLayout.createSequentialGroup()
                .addGap(577, 577, 577)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maintenanceviewLayout.createSequentialGroup()
                .addComponent(jScrollPane11)
                .addContainerGap())
        );
        maintenanceviewLayout.setVerticalGroup(
            maintenanceviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maintenanceviewLayout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );

        getContentPane().add(maintenanceview, "card12");

        FeedBack.setBackground(new java.awt.Color(42, 39, 39));
        FeedBack.setPreferredSize(new java.awt.Dimension(1300, 900));

        jTextArea5.setBackground(new java.awt.Color(69, 63, 61));
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(244, 253, 255));
        jTextArea5.setRows(5);
        jTextArea5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(87, 80, 77), 2, true));
        jScrollPane5.setViewportView(jTextArea5);

        jButton28.setBackground(new java.awt.Color(42, 39, 39));
        jButton28.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Send");
        jButton28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(244, 253, 255));
        jLabel50.setText("Email:");

        jLabel51.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(244, 253, 255));
        jLabel51.setText("Write your feedback message here:");

        jLabel52.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(244, 253, 255));
        jLabel52.setText("For More ways to Communicate:");

        jLabel53.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(244, 253, 255));
        jLabel53.setText("VehicleKeeper87@gmail.com");

        jLabel54.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(244, 253, 255));
        jLabel54.setText("Phone Number:");

        jLabel55.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(244, 253, 255));
        jLabel55.setText("+970566520089");

        jPanel22.setBackground(new java.awt.Color(69, 63, 61));

        jLabel9.setBackground(new java.awt.Color(69, 63, 61));
        jLabel9.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/3669434_feedback_ic_icon.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jButton128.setBackground(new java.awt.Color(69, 63, 61));
        jButton128.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton128.setToolTipText("");
        jButton128.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton128ActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("FeedBack");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton128)
                .addGap(503, 503, 503)
                .addComponent(jLabel66)
                .addGap(483, 483, 483)
                .addComponent(jLabel9)
                .addGap(39, 39, 39))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton128))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel66)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FeedBackLayout = new javax.swing.GroupLayout(FeedBack);
        FeedBack.setLayout(FeedBackLayout);
        FeedBackLayout.setHorizontalGroup(
            FeedBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedBackLayout.createSequentialGroup()
                .addGroup(FeedBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FeedBackLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(FeedBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(FeedBackLayout.createSequentialGroup()
                                .addGroup(FeedBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FeedBackLayout.createSequentialGroup()
                                        .addComponent(jLabel54)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel55))
                                    .addGroup(FeedBackLayout.createSequentialGroup()
                                        .addComponent(jLabel50)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel53)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(FeedBackLayout.createSequentialGroup()
                        .addGroup(FeedBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FeedBackLayout.createSequentialGroup()
                                .addGap(425, 425, 425)
                                .addGroup(FeedBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel51)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(FeedBackLayout.createSequentialGroup()
                                .addGap(580, 580, 580)
                                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 93, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FeedBackLayout.setVerticalGroup(
            FeedBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedBackLayout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FeedBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FeedBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55))
                .addContainerGap(207, Short.MAX_VALUE))
        );

        getContentPane().add(FeedBack, "card13");

        Settings.setBackground(new java.awt.Color(42, 39, 39));
        Settings.setPreferredSize(new java.awt.Dimension(1300, 900));

        jPanel23.setBackground(new java.awt.Color(69, 63, 61));
        jPanel23.setPreferredSize(new java.awt.Dimension(1300, 80));

        jLabel56.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/settings.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jButton129.setBackground(new java.awt.Color(69, 63, 61));
        jButton129.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton129.setToolTipText("");
        jButton129.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton129ActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(244, 253, 255));
        jLabel67.setText("Settings");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton129)
                .addGap(514, 514, 514)
                .addComponent(jLabel67)
                .addGap(494, 494, 494)
                .addComponent(jLabel56)
                .addGap(57, 57, 57))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton129))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel67)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel68.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(244, 253, 255));
        jLabel68.setText("Region:");

        jButton30.setBackground(new java.awt.Color(42, 39, 39));
        jButton30.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton30.setForeground(new java.awt.Color(244, 253, 255));
        jButton30.setText("Change");
        jButton30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(244, 253, 255));
        jLabel69.setText("New Region:");

        jTextField26.setBackground(new java.awt.Color(69, 63, 61));
        jTextField26.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField26.setForeground(new java.awt.Color(244, 253, 255));
        jTextField26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(244, 253, 255));
        jLabel70.setText("Nablus");

        jButton31.setBackground(new java.awt.Color(42, 39, 39));
        jButton31.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton31.setForeground(new java.awt.Color(244, 253, 255));
        jButton31.setText("Save");
        jButton31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jLabel203.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel203.setForeground(new java.awt.Color(244, 253, 255));
        jLabel203.setText("Password");

        jButton33.setBackground(new java.awt.Color(42, 39, 39));
        jButton33.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton33.setForeground(new java.awt.Color(244, 253, 255));
        jButton33.setText("Change");
        jButton33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton45.setBackground(new java.awt.Color(42, 39, 39));
        jButton45.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton45.setForeground(new java.awt.Color(244, 253, 255));
        jButton45.setText("Save");
        jButton45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jLabel204.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel204.setForeground(new java.awt.Color(244, 253, 255));
        jLabel204.setText("Re enter password ");

        jTextField55.setBackground(new java.awt.Color(69, 63, 61));
        jTextField55.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField55.setForeground(new java.awt.Color(244, 253, 255));
        jTextField55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jTextField55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField55ActionPerformed(evt);
            }
        });

        jTextField59.setBackground(new java.awt.Color(69, 63, 61));
        jTextField59.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField59.setForeground(new java.awt.Color(244, 253, 255));
        jTextField59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jTextField59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField59ActionPerformed(evt);
            }
        });

        jLabel205.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel205.setForeground(new java.awt.Color(244, 253, 255));
        jLabel205.setText("New Password");

        javax.swing.GroupLayout SettingsLayout = new javax.swing.GroupLayout(Settings);
        Settings.setLayout(SettingsLayout);
        SettingsLayout.setHorizontalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SettingsLayout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel70))
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel203))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel69)
                    .addGroup(SettingsLayout.createSequentialGroup()
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SettingsLayout.createSequentialGroup()
                        .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel205))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel204)
                            .addGroup(SettingsLayout.createSequentialGroup()
                                .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(585, 585, 585))
            .addGroup(SettingsLayout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SettingsLayout.setVerticalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsLayout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SettingsLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SettingsLayout.createSequentialGroup()
                        .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(jLabel70)
                            .addComponent(jLabel69))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel204)
                    .addComponent(jLabel205)
                    .addComponent(jLabel203))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(582, Short.MAX_VALUE))
        );

        getContentPane().add(Settings, "card14");

        forgotpassword.setBackground(new java.awt.Color(42, 39, 39));
        forgotpassword.setPreferredSize(new java.awt.Dimension(1300, 900));

        jTextField27.setBackground(new java.awt.Color(69, 63, 61));
        jTextField27.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField27.setForeground(new java.awt.Color(244, 253, 255));
        jTextField27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField28.setBackground(new java.awt.Color(69, 63, 61));
        jTextField28.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField28.setForeground(new java.awt.Color(244, 253, 255));
        jTextField28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField29.setBackground(new java.awt.Color(69, 63, 61));
        jTextField29.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField29.setForeground(new java.awt.Color(244, 253, 255));
        jTextField29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(244, 253, 255));
        jLabel72.setText("PassCode");

        jLabel75.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(244, 253, 255));
        jLabel75.setText("New Password");

        jLabel76.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(244, 253, 255));
        jLabel76.setText("New Password Again");

        jButton32.setBackground(new java.awt.Color(42, 39, 39));
        jButton32.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton32.setForeground(new java.awt.Color(244, 253, 255));
        jButton32.setText("Save");
        jButton32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jPanel24.setBackground(new java.awt.Color(69, 63, 61));

        jButton130.setBackground(new java.awt.Color(69, 63, 61));
        jButton130.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton130.setToolTipText("");
        jButton130.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton130ActionPerformed(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(244, 253, 255));
        jLabel73.setText("I forgot my password");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton130)
                .addGap(409, 409, 409)
                .addComponent(jLabel73)
                .addGap(483, 483, 483))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton130))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel73)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel74.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(87, 80, 77));
        jLabel74.setText("Passwords are not a match!");

        jLabel77.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(87, 80, 77));
        jLabel77.setText("Current Password is Wrong, Please try again.");

        javax.swing.GroupLayout forgotpasswordLayout = new javax.swing.GroupLayout(forgotpassword);
        forgotpassword.setLayout(forgotpasswordLayout);
        forgotpasswordLayout.setHorizontalGroup(
            forgotpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(forgotpasswordLayout.createSequentialGroup()
                .addGroup(forgotpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(forgotpasswordLayout.createSequentialGroup()
                        .addGap(535, 535, 535)
                        .addGroup(forgotpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel76)
                            .addComponent(jLabel75)
                            .addComponent(jLabel72)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(forgotpasswordLayout.createSequentialGroup()
                                .addGroup(forgotpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(forgotpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel74)
                                    .addComponent(jLabel77)))))
                    .addGroup(forgotpasswordLayout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        forgotpasswordLayout.setVerticalGroup(
            forgotpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forgotpasswordLayout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(forgotpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77))
                .addGap(18, 18, 18)
                .addComponent(jLabel75)
                .addGap(7, 7, 7)
                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(forgotpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74))
                .addGap(18, 18, 18)
                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(478, Short.MAX_VALUE))
        );

        getContentPane().add(forgotpassword, "card15");

        Taxiadd.setBackground(new java.awt.Color(42, 39, 39));
        Taxiadd.setMinimumSize(new java.awt.Dimension(1000, 800));
        Taxiadd.setPreferredSize(new java.awt.Dimension(1300, 900));

        jPanel26.setBackground(new java.awt.Color(69, 63, 61));
        jPanel26.setPreferredSize(new java.awt.Dimension(1300, 80));

        jButton131.setBackground(new java.awt.Color(69, 63, 61));
        jButton131.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton131.setToolTipText("");
        jButton131.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton131ActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(244, 253, 255));
        jLabel88.setText("Adding a Taxi Bureau");

        jLabel172.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/taxi-sign.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton131)
                .addGap(405, 405, 405)
                .addComponent(jLabel88)
                .addGap(384, 384, 384)
                .addComponent(jLabel172)
                .addGap(68, 68, 68))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jButton131)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel88)
                        .addGap(22, 22, 22))))
            .addComponent(jLabel172, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTextField39.setBackground(new java.awt.Color(69, 63, 61));
        jTextField39.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField39.setForeground(new java.awt.Color(244, 253, 255));
        jTextField39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel90.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(244, 253, 255));
        jLabel90.setText("Bureau's Name");

        jTextField40.setBackground(new java.awt.Color(69, 63, 61));
        jTextField40.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField40.setForeground(new java.awt.Color(244, 253, 255));
        jTextField40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jTextField40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField40ActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(244, 253, 255));
        jLabel91.setText("Phone Number");

        jTextField41.setBackground(new java.awt.Color(69, 63, 61));
        jTextField41.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField41.setForeground(new java.awt.Color(244, 253, 255));
        jTextField41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel92.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(244, 253, 255));
        jLabel92.setText("Address");

        jTextField42.setBackground(new java.awt.Color(69, 63, 61));
        jTextField42.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField42.setForeground(new java.awt.Color(244, 253, 255));
        jTextField42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel93.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(244, 253, 255));
        jLabel93.setText("Price");

        jButton44.setBackground(new java.awt.Color(42, 39, 39));
        jButton44.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton44.setForeground(new java.awt.Color(244, 253, 255));
        jButton44.setText("Save");
        jButton44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jLabel173.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel173.setForeground(new java.awt.Color(87, 80, 77));
        jLabel173.setText("Please use ONLY English as a language for the date ");

        javax.swing.GroupLayout TaxiaddLayout = new javax.swing.GroupLayout(Taxiadd);
        Taxiadd.setLayout(TaxiaddLayout);
        TaxiaddLayout.setHorizontalGroup(
            TaxiaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(TaxiaddLayout.createSequentialGroup()
                .addGap(505, 505, 505)
                .addGroup(TaxiaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93)))
            .addGroup(TaxiaddLayout.createSequentialGroup()
                .addGap(463, 463, 463)
                .addGroup(TaxiaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TaxiaddLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel173)))
        );
        TaxiaddLayout.setVerticalGroup(
            TaxiaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaxiaddLayout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel173)
                .addGap(222, 222, 222))
        );

        getContentPane().add(Taxiadd, "card16");

        Taxiview.setBackground(new java.awt.Color(42, 39, 39));
        Taxiview.setPreferredSize(new java.awt.Dimension(1300, 900));

        jPanel28.setBackground(new java.awt.Color(69, 63, 61));
        jPanel28.setForeground(new java.awt.Color(244, 253, 255));

        jLabel174.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/taxi-sign.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jButton132.setBackground(new java.awt.Color(69, 63, 61));
        jButton132.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton132.setToolTipText("");
        jButton132.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton132ActionPerformed(evt);
            }
        });

        jLabel94.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(244, 253, 255));
        jLabel94.setText("View Taxi Bureaus");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton132)
                .addGap(429, 429, 429)
                .addComponent(jLabel94)
                .addGap(408, 408, 408)
                .addComponent(jLabel174)
                .addGap(63, 63, 63))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton132))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel94)))
                .addGap(12, 12, 12))
        );

        jButton40.setBackground(new java.awt.Color(42, 39, 39));
        jButton40.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton40.setForeground(new java.awt.Color(244, 253, 255));
        jButton40.setText("View");
        jButton40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jTable5.setBackground(new java.awt.Color(69, 63, 61));
        jTable5.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jTable5.setForeground(new java.awt.Color(244, 253, 255));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Taxi Bureau's Name", "Phone Number", "Address", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(jTable5);

        javax.swing.GroupLayout TaxiviewLayout = new javax.swing.GroupLayout(Taxiview);
        Taxiview.setLayout(TaxiviewLayout);
        TaxiviewLayout.setHorizontalGroup(
            TaxiviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaxiviewLayout.createSequentialGroup()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(TaxiviewLayout.createSequentialGroup()
                .addGap(575, 575, 575)
                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TaxiviewLayout.createSequentialGroup()
                .addComponent(jScrollPane12)
                .addContainerGap())
        );
        TaxiviewLayout.setVerticalGroup(
            TaxiviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaxiviewLayout.createSequentialGroup()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );

        getContentPane().add(Taxiview, "card17");

        Gasadd.setBackground(new java.awt.Color(42, 39, 39));
        Gasadd.setMinimumSize(new java.awt.Dimension(1000, 800));
        Gasadd.setPreferredSize(new java.awt.Dimension(1300, 900));

        jPanel30.setBackground(new java.awt.Color(69, 63, 61));
        jPanel30.setPreferredSize(new java.awt.Dimension(1300, 80));

        jButton133.setBackground(new java.awt.Color(69, 63, 61));
        jButton133.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton133.setToolTipText("");
        jButton133.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton133ActionPerformed(evt);
            }
        });

        jLabel178.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/icons8-gas-station-48.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jLabel96.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(244, 253, 255));
        jLabel96.setText("Adding a Gas Station");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton133)
                .addGap(414, 414, 414)
                .addComponent(jLabel96)
                .addGap(392, 392, 392)
                .addComponent(jLabel178)
                .addGap(25, 25, 25))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton133)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel178, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTextField43.setBackground(new java.awt.Color(69, 63, 61));
        jTextField43.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField43.setForeground(new java.awt.Color(244, 253, 255));
        jTextField43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel97.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(244, 253, 255));
        jLabel97.setText("Gas Station Name");

        jTextField44.setBackground(new java.awt.Color(69, 63, 61));
        jTextField44.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField44.setForeground(new java.awt.Color(244, 253, 255));
        jTextField44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel98.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(244, 253, 255));
        jLabel98.setText("Phone Number");

        jTextField45.setBackground(new java.awt.Color(69, 63, 61));
        jTextField45.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField45.setForeground(new java.awt.Color(244, 253, 255));
        jTextField45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField46.setBackground(new java.awt.Color(69, 63, 61));
        jTextField46.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField46.setForeground(new java.awt.Color(244, 253, 255));
        jTextField46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel100.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(244, 253, 255));
        jLabel100.setText("Locaion");

        jButton50.setBackground(new java.awt.Color(42, 39, 39));
        jButton50.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton50.setForeground(new java.awt.Color(244, 253, 255));
        jButton50.setText("Save");
        jButton50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jLabel101.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(244, 253, 255));
        jLabel101.setText("Price");

        jButton52.setBackground(new java.awt.Color(42, 39, 39));
        jButton52.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton52.setForeground(new java.awt.Color(244, 253, 255));
        jButton52.setText("Insert");
        jButton52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton43.setBackground(new java.awt.Color(42, 39, 39));
        jButton43.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton43.setForeground(new java.awt.Color(244, 253, 255));
        jButton43.setText("Info");
        jButton43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jLabel176.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(87, 80, 77));
        jLabel176.setText("Please use ONLY English as a language for the data");

        jLabel177.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel177.setForeground(new java.awt.Color(87, 80, 77));
        jLabel177.setText("Make sure the company name was entered");

        javax.swing.GroupLayout GasaddLayout = new javax.swing.GroupLayout(Gasadd);
        Gasadd.setLayout(GasaddLayout);
        GasaddLayout.setHorizontalGroup(
            GasaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GasaddLayout.createSequentialGroup()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(GasaddLayout.createSequentialGroup()
                .addGap(505, 505, 505)
                .addGroup(GasaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GasaddLayout.createSequentialGroup()
                        .addComponent(jLabel100)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(GasaddLayout.createSequentialGroup()
                        .addGroup(GasaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel97)
                            .addComponent(jLabel98)
                            .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel101)
                            .addGroup(GasaddLayout.createSequentialGroup()
                                .addGroup(GasaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(GasaddLayout.createSequentialGroup()
                                        .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel177)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GasaddLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(580, 580, 580))))
            .addGroup(GasaddLayout.createSequentialGroup()
                .addGap(446, 446, 446)
                .addComponent(jLabel176)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GasaddLayout.setVerticalGroup(
            GasaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GasaddLayout.createSequentialGroup()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GasaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel177))
                .addGap(18, 18, 18)
                .addGroup(GasaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel176)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        getContentPane().add(Gasadd, "card16");

        Gasview.setBackground(new java.awt.Color(42, 39, 39));
        Gasview.setPreferredSize(new java.awt.Dimension(1300, 900));

        jButton54.setBackground(new java.awt.Color(42, 39, 39));
        jButton54.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton54.setForeground(new java.awt.Color(244, 253, 255));
        jButton54.setText("View");
        jButton54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jPanel25.setBackground(new java.awt.Color(69, 63, 61));

        jLabel179.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/icons8-gas-station-48.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jButton134.setBackground(new java.awt.Color(69, 63, 61));
        jButton134.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton134.setToolTipText("");
        jButton134.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton134ActionPerformed(evt);
            }
        });

        jLabel99.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(244, 253, 255));
        jLabel99.setText("View Gas Stations");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton134)
                .addGap(436, 436, 436)
                .addComponent(jLabel99)
                .addGap(416, 416, 416)
                .addComponent(jLabel179)
                .addGap(41, 41, 41))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel179, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jButton134)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel99)
                        .addGap(22, 22, 22))))
        );

        jTable6.setBackground(new java.awt.Color(69, 63, 61));
        jTable6.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jTable6.setForeground(new java.awt.Color(244, 253, 255));
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Gas Station's Name", "Phone Number", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(jTable6);

        javax.swing.GroupLayout GasviewLayout = new javax.swing.GroupLayout(Gasview);
        Gasview.setLayout(GasviewLayout);
        GasviewLayout.setHorizontalGroup(
            GasviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GasviewLayout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 97, Short.MAX_VALUE))
            .addGroup(GasviewLayout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GasviewLayout.createSequentialGroup()
                .addComponent(jScrollPane13)
                .addContainerGap())
        );
        GasviewLayout.setVerticalGroup(
            GasviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GasviewLayout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );

        getContentPane().add(Gasview, "card12");

        empedit.setBackground(new java.awt.Color(42, 39, 39));
        empedit.setPreferredSize(new java.awt.Dimension(1300, 900));

        jTextField49.setBackground(new java.awt.Color(69, 63, 61));
        jTextField49.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField49.setForeground(new java.awt.Color(244, 253, 255));
        jTextField49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel105.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(244, 253, 255));
        jLabel105.setText("SSN");

        jPanel31.setBackground(new java.awt.Color(69, 63, 61));
        jPanel31.setPreferredSize(new java.awt.Dimension(1300, 80));

        jLabel111.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(244, 253, 255));
        jLabel111.setText("Editing an Employee");

        jLabel180.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/employees.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jButton135.setBackground(new java.awt.Color(69, 63, 61));
        jButton135.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton135.setToolTipText("");
        jButton135.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton135ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton135)
                .addGap(416, 416, 416)
                .addComponent(jLabel111)
                .addGap(396, 396, 396)
                .addComponent(jLabel180)
                .addGap(25, 25, 25))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton135)
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                            .addComponent(jLabel111)
                            .addGap(22, 22, 22))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                            .addComponent(jLabel180, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)))))
        );

        jButton57.setBackground(new java.awt.Color(42, 39, 39));
        jButton57.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton57.setForeground(new java.awt.Color(244, 253, 255));
        jButton57.setText("Delete");
        jButton57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        jTextField48.setBackground(new java.awt.Color(69, 63, 61));
        jTextField48.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField48.setForeground(new java.awt.Color(244, 253, 255));
        jTextField48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel107.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(244, 253, 255));
        jLabel107.setText("First Name");

        jLabel108.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(244, 253, 255));
        jLabel108.setText("Last Name");

        jTextField50.setBackground(new java.awt.Color(69, 63, 61));
        jTextField50.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField50.setForeground(new java.awt.Color(244, 253, 255));
        jTextField50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel110.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(244, 253, 255));
        jLabel110.setText("Mid Name");

        jTextField54.setBackground(new java.awt.Color(69, 63, 61));
        jTextField54.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField54.setForeground(new java.awt.Color(244, 253, 255));
        jTextField54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel114.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(244, 253, 255));
        jLabel114.setText("Phone Number");

        jLabel118.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(244, 253, 255));
        jLabel118.setText("Birth Date");

        jLabel119.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(244, 253, 255));
        jLabel119.setText("Gender");

        jTextField60.setBackground(new java.awt.Color(69, 63, 61));
        jTextField60.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField60.setForeground(new java.awt.Color(244, 253, 255));
        jTextField60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel121.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(244, 253, 255));
        jLabel121.setText("Salary");

        jTextField61.setBackground(new java.awt.Color(69, 63, 61));
        jTextField61.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField61.setForeground(new java.awt.Color(244, 253, 255));
        jTextField61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jButton82.setBackground(new java.awt.Color(42, 39, 39));
        jButton82.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton82.setForeground(new java.awt.Color(244, 253, 255));
        jButton82.setText("Search");
        jButton82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });

        jButton83.setBackground(new java.awt.Color(42, 39, 39));
        jButton83.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton83.setForeground(new java.awt.Color(244, 253, 255));
        jButton83.setText("Update");
        jButton83.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });

        jButton86.setBackground(new java.awt.Color(42, 39, 39));
        jButton86.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton86.setForeground(new java.awt.Color(244, 253, 255));
        jButton86.setText("Info");
        jButton86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });

        jLabel181.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(87, 80, 77));
        jLabel181.setText("Please use ONLY English as a language for the data");

        jRadioButton7.setBackground(new java.awt.Color(42, 39, 39));
        jRadioButton7.setForeground(new java.awt.Color(244, 253, 255));
        jRadioButton7.setText("Male");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton8.setBackground(new java.awt.Color(42, 39, 39));
        jRadioButton8.setForeground(new java.awt.Color(244, 253, 255));
        jRadioButton8.setText("Female");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jTextField85.setBackground(new java.awt.Color(69, 63, 61));
        jTextField85.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField85.setForeground(new java.awt.Color(244, 253, 255));
        jTextField85.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jComboBox1.setBackground(new java.awt.Color(42, 39, 39));
        jComboBox1.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(244, 253, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FullTime", "PartTime" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField86.setBackground(new java.awt.Color(69, 63, 61));
        jTextField86.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField86.setForeground(new java.awt.Color(244, 253, 255));
        jTextField86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel200.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel200.setForeground(new java.awt.Color(244, 253, 255));
        jLabel200.setText("Address");

        jTextField87.setBackground(new java.awt.Color(69, 63, 61));
        jTextField87.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField87.setForeground(new java.awt.Color(244, 253, 255));
        jTextField87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField88.setBackground(new java.awt.Color(69, 63, 61));
        jTextField88.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField88.setForeground(new java.awt.Color(244, 253, 255));
        jTextField88.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel201.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel201.setForeground(new java.awt.Color(244, 253, 255));
        jLabel201.setText("Wage/Hour");

        jLabel202.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel202.setForeground(new java.awt.Color(244, 253, 255));
        jLabel202.setText("Hours Worked");

        javax.swing.GroupLayout empeditLayout = new javax.swing.GroupLayout(empedit);
        empedit.setLayout(empeditLayout);
        empeditLayout.setHorizontalGroup(
            empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empeditLayout.createSequentialGroup()
                .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(empeditLayout.createSequentialGroup()
                        .addGap(468, 468, 468)
                        .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel105)
                            .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(empeditLayout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(empeditLayout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(jLabel181)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(empeditLayout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empeditLayout.createSequentialGroup()
                        .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel114)
                            .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton7)
                            .addComponent(jLabel119)
                            .addComponent(jRadioButton8))
                        .addGap(18, 18, 18)
                        .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(empeditLayout.createSequentialGroup()
                                .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel200)
                                    .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel118)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(empeditLayout.createSequentialGroup()
                                .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel121)
                                    .addComponent(jTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel201)
                                    .addComponent(jLabel202)))))
                    .addGroup(empeditLayout.createSequentialGroup()
                        .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel107))
                        .addGap(18, 18, 18)
                        .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel110))
                        .addGap(18, 18, 18)
                        .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel108))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        empeditLayout.setVerticalGroup(
            empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empeditLayout.createSequentialGroup()
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel105)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(empeditLayout.createSequentialGroup()
                            .addComponent(jLabel107)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empeditLayout.createSequentialGroup()
                            .addComponent(jLabel108)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(empeditLayout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(jLabel118)
                    .addComponent(jLabel200))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel119)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(empeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton8)
                    .addGroup(empeditLayout.createSequentialGroup()
                        .addComponent(jLabel121)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(empeditLayout.createSequentialGroup()
                        .addComponent(jLabel202)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel201)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel181)
                .addGap(97, 97, 97))
        );

        getContentPane().add(empedit, "card5");

        insuranceedit.setBackground(new java.awt.Color(42, 39, 39));
        insuranceedit.setPreferredSize(new java.awt.Dimension(1300, 900));

        jTextField63.setBackground(new java.awt.Color(69, 63, 61));
        jTextField63.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField63.setForeground(new java.awt.Color(244, 253, 255));
        jTextField63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel120.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(244, 253, 255));
        jLabel120.setText("Insur. Company Name");

        jPanel32.setBackground(new java.awt.Color(69, 63, 61));
        jPanel32.setPreferredSize(new java.awt.Dimension(1300, 80));

        jLabel182.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(244, 253, 255));
        jLabel182.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/insurance-company.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jButton136.setBackground(new java.awt.Color(69, 63, 61));
        jButton136.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton136.setToolTipText("");
        jButton136.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton136ActionPerformed(evt);
            }
        });

        jLabel125.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(244, 253, 255));
        jLabel125.setText("Editing an Insurance Company");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton136)
                .addGap(333, 333, 333)
                .addComponent(jLabel125)
                .addGap(313, 313, 313)
                .addComponent(jLabel182)
                .addGap(25, 25, 25))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel182, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton136))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel125)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButton60.setBackground(new java.awt.Color(42, 39, 39));
        jButton60.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton60.setForeground(new java.awt.Color(244, 253, 255));
        jButton60.setText("Delete");
        jButton60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        jButton59.setBackground(new java.awt.Color(42, 39, 39));
        jButton59.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton59.setForeground(new java.awt.Color(244, 253, 255));
        jButton59.setText("Info");
        jButton59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        jTextField47.setBackground(new java.awt.Color(69, 63, 61));
        jTextField47.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField47.setForeground(new java.awt.Color(244, 253, 255));
        jTextField47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField51.setBackground(new java.awt.Color(69, 63, 61));
        jTextField51.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField51.setForeground(new java.awt.Color(244, 253, 255));
        jTextField51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField53.setBackground(new java.awt.Color(69, 63, 61));
        jTextField53.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField53.setForeground(new java.awt.Color(244, 253, 255));
        jTextField53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel106.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(244, 253, 255));
        jLabel106.setText("Price");

        jLabel109.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(244, 253, 255));
        jLabel109.setText("Address");

        jLabel113.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(244, 253, 255));
        jLabel113.setText("Phone Number");

        jButton84.setBackground(new java.awt.Color(42, 39, 39));
        jButton84.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton84.setForeground(new java.awt.Color(244, 253, 255));
        jButton84.setText("Update");
        jButton84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });

        jButton85.setBackground(new java.awt.Color(42, 39, 39));
        jButton85.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton85.setForeground(new java.awt.Color(244, 253, 255));
        jButton85.setText("Search");
        jButton85.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });

        jLabel187.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel187.setForeground(new java.awt.Color(87, 80, 77));
        jLabel187.setText("Please use ONLY English as a language for the date");

        javax.swing.GroupLayout insuranceeditLayout = new javax.swing.GroupLayout(insuranceedit);
        insuranceedit.setLayout(insuranceeditLayout);
        insuranceeditLayout.setHorizontalGroup(
            insuranceeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insuranceeditLayout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insuranceeditLayout.createSequentialGroup()
                .addGap(505, 505, 505)
                .addGroup(insuranceeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel109)
                    .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel113)
                    .addComponent(jLabel120)
                    .addComponent(jLabel106)
                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(insuranceeditLayout.createSequentialGroup()
                        .addGroup(insuranceeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(insuranceeditLayout.createSequentialGroup()
                                .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(410, 410, 410))
            .addGroup(insuranceeditLayout.createSequentialGroup()
                .addGroup(insuranceeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insuranceeditLayout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(jLabel187))
                    .addGroup(insuranceeditLayout.createSequentialGroup()
                        .addGap(583, 583, 583)
                        .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(462, 462, 462))
        );
        insuranceeditLayout.setVerticalGroup(
            insuranceeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insuranceeditLayout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel120)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(insuranceeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insuranceeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel187)
                .addGap(222, 222, 222))
        );

        getContentPane().add(insuranceedit, "card5");

        maintenanceedit.setBackground(new java.awt.Color(42, 39, 39));
        maintenanceedit.setPreferredSize(new java.awt.Dimension(1300, 900));

        jTextField75.setBackground(new java.awt.Color(69, 63, 61));
        jTextField75.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField75.setForeground(new java.awt.Color(244, 253, 255));
        jTextField75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel132.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(244, 253, 255));
        jLabel132.setText("Mainten.Company Name");

        jPanel33.setBackground(new java.awt.Color(69, 63, 61));
        jPanel33.setPreferredSize(new java.awt.Dimension(1300, 80));

        jLabel133.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(244, 253, 255));
        jLabel133.setText("Editing a Maintenance Company");

        jButton137.setBackground(new java.awt.Color(69, 63, 61));
        jButton137.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton137.setToolTipText("");
        jButton137.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton137ActionPerformed(evt);
            }
        });

        jLabel183.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel183.setForeground(new java.awt.Color(244, 253, 255));
        jLabel183.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/maintenance.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel183.setToolTipText("");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton137)
                .addGap(319, 319, 319)
                .addComponent(jLabel133)
                .addGap(298, 298, 298)
                .addComponent(jLabel183)
                .addGap(25, 25, 25))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel183, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                        .addComponent(jButton137)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel133)
                        .addGap(22, 22, 22))))
        );

        jButton62.setBackground(new java.awt.Color(42, 39, 39));
        jButton62.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton62.setForeground(new java.awt.Color(244, 253, 255));
        jButton62.setText("Delete");
        jButton62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        jButton56.setBackground(new java.awt.Color(42, 39, 39));
        jButton56.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton56.setForeground(new java.awt.Color(244, 253, 255));
        jButton56.setText("Info");
        jButton56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });

        jLabel112.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(244, 253, 255));
        jLabel112.setText("Phone Number");

        jLabel116.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(244, 253, 255));
        jLabel116.setText("Periodically Check Price");

        jButton87.setBackground(new java.awt.Color(42, 39, 39));
        jButton87.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton87.setForeground(new java.awt.Color(244, 253, 255));
        jButton87.setText("Update");
        jButton87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });

        jTextField57.setBackground(new java.awt.Color(69, 63, 61));
        jTextField57.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField57.setForeground(new java.awt.Color(244, 253, 255));
        jTextField57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField58.setBackground(new java.awt.Color(69, 63, 61));
        jTextField58.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField58.setForeground(new java.awt.Color(244, 253, 255));
        jTextField58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jButton89.setBackground(new java.awt.Color(42, 39, 39));
        jButton89.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton89.setForeground(new java.awt.Color(244, 253, 255));
        jButton89.setText("Search");
        jButton89.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });

        jLabel186.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel186.setForeground(new java.awt.Color(87, 80, 77));
        jLabel186.setText("Please use ONLY English as a language for the date");

        javax.swing.GroupLayout maintenanceeditLayout = new javax.swing.GroupLayout(maintenanceedit);
        maintenanceedit.setLayout(maintenanceeditLayout);
        maintenanceeditLayout.setHorizontalGroup(
            maintenanceeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maintenanceeditLayout.createSequentialGroup()
                .addGap(463, 463, 463)
                .addComponent(jLabel186)
                .addGap(462, 462, 462))
            .addGroup(maintenanceeditLayout.createSequentialGroup()
                .addGroup(maintenanceeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(maintenanceeditLayout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addGroup(maintenanceeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel132)
                            .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel112)
                            .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel116)
                            .addGroup(maintenanceeditLayout.createSequentialGroup()
                                .addGroup(maintenanceeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(maintenanceeditLayout.createSequentialGroup()
                                        .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(maintenanceeditLayout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        maintenanceeditLayout.setVerticalGroup(
            maintenanceeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maintenanceeditLayout.createSequentialGroup()
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel132)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(maintenanceeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(maintenanceeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel116)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel186)
                .addGap(222, 222, 222))
        );

        getContentPane().add(maintenanceedit, "card5");

        caredit.setBackground(new java.awt.Color(42, 39, 39));
        caredit.setPreferredSize(new java.awt.Dimension(1300, 900));

        jTextField76.setBackground(new java.awt.Color(69, 63, 61));
        jTextField76.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField76.setForeground(new java.awt.Color(244, 253, 255));
        jTextField76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel134.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(244, 253, 255));
        jLabel134.setText("Plate Number");

        jPanel34.setBackground(new java.awt.Color(69, 63, 61));
        jPanel34.setPreferredSize(new java.awt.Dimension(1300, 80));

        jLabel135.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(255, 255, 255));
        jLabel135.setText("Editing a Car");

        jButton138.setBackground(new java.awt.Color(69, 63, 61));
        jButton138.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton138.setToolTipText("");
        jButton138.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton138ActionPerformed(evt);
            }
        });

        jLabel185.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/car.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton138)
                .addGap(474, 474, 474)
                .addComponent(jLabel135)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel185)
                .addGap(25, 25, 25))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel135))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel185, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton138))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton64.setBackground(new java.awt.Color(42, 39, 39));
        jButton64.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton64.setForeground(new java.awt.Color(255, 255, 255));
        jButton64.setText("Delete");
        jButton64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jButton65.setBackground(new java.awt.Color(42, 39, 39));
        jButton65.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton65.setForeground(new java.awt.Color(255, 255, 255));
        jButton65.setText("Info");
        jButton65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        jLabel115.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(244, 253, 255));
        jLabel115.setText("Insur. expiration Date");

        jTextField52.setBackground(new java.awt.Color(69, 63, 61));
        jTextField52.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField52.setForeground(new java.awt.Color(244, 253, 255));
        jTextField52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel117.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(244, 253, 255));
        jLabel117.setText("Insur. Company Name");

        jTextField56.setBackground(new java.awt.Color(69, 63, 61));
        jTextField56.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField56.setForeground(new java.awt.Color(244, 253, 255));
        jTextField56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel122.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(244, 253, 255));
        jLabel122.setText("Brand");

        jTextField62.setBackground(new java.awt.Color(69, 63, 61));
        jTextField62.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField62.setForeground(new java.awt.Color(244, 253, 255));
        jTextField62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel123.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(244, 253, 255));
        jLabel123.setText("Color");

        jTextField65.setBackground(new java.awt.Color(69, 63, 61));
        jTextField65.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField65.setForeground(new java.awt.Color(244, 253, 255));
        jTextField65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField66.setBackground(new java.awt.Color(69, 63, 61));
        jTextField66.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField66.setForeground(new java.awt.Color(244, 253, 255));
        jTextField66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField67.setBackground(new java.awt.Color(69, 63, 61));
        jTextField67.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField67.setForeground(new java.awt.Color(244, 253, 255));
        jTextField67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField68.setBackground(new java.awt.Color(69, 63, 61));
        jTextField68.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField68.setForeground(new java.awt.Color(244, 253, 255));
        jTextField68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel126.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(244, 253, 255));
        jLabel126.setText("State of the Car");

        jLabel127.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(244, 253, 255));
        jLabel127.setText("Mainte. Company Name");

        jLabel128.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(244, 253, 255));
        jLabel128.setText("Clearence Date");

        jLabel129.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(244, 253, 255));
        jLabel129.setText("Last mainte.Date");

        jTextField69.setBackground(new java.awt.Color(69, 63, 61));
        jTextField69.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField69.setForeground(new java.awt.Color(244, 253, 255));
        jTextField69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jButton88.setBackground(new java.awt.Color(42, 39, 39));
        jButton88.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton88.setForeground(new java.awt.Color(255, 255, 255));
        jButton88.setText("Search");
        jButton88.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });

        jButton90.setBackground(new java.awt.Color(42, 39, 39));
        jButton90.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton90.setForeground(new java.awt.Color(244, 253, 255));
        jButton90.setText("Update");
        jButton90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });

        jLabel184.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel184.setForeground(new java.awt.Color(87, 80, 77));
        jLabel184.setText("Please use ONLY English as a language for the date");

        javax.swing.GroupLayout careditLayout = new javax.swing.GroupLayout(caredit);
        caredit.setLayout(careditLayout);
        careditLayout.setHorizontalGroup(
            careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1393, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, careditLayout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, careditLayout.createSequentialGroup()
                        .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(careditLayout.createSequentialGroup()
                                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel129))
                                .addGap(34, 34, 34)
                                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel115)))
                            .addGroup(careditLayout.createSequentialGroup()
                                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel127))
                                .addGap(34, 34, 34)
                                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel117)
                                    .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(342, 342, 342))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, careditLayout.createSequentialGroup()
                        .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(580, 580, 580))))
            .addGroup(careditLayout.createSequentialGroup()
                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(careditLayout.createSequentialGroup()
                        .addGap(468, 468, 468)
                        .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel134)
                            .addGroup(careditLayout.createSequentialGroup()
                                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField76, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(jButton88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(careditLayout.createSequentialGroup()
                                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel122))
                                .addGap(34, 34, 34)
                                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel123)))
                            .addGroup(careditLayout.createSequentialGroup()
                                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel126))
                                .addGap(34, 34, 34)
                                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel128)
                                    .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(careditLayout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(jLabel184)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        careditLayout.setVerticalGroup(
            careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(careditLayout.createSequentialGroup()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel134)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(careditLayout.createSequentialGroup()
                        .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(careditLayout.createSequentialGroup()
                        .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(careditLayout.createSequentialGroup()
                        .addComponent(jLabel122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(careditLayout.createSequentialGroup()
                        .addComponent(jLabel123)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(careditLayout.createSequentialGroup()
                        .addComponent(jLabel126)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(careditLayout.createSequentialGroup()
                        .addComponent(jLabel128)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel127)
                    .addComponent(jLabel117))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(careditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(careditLayout.createSequentialGroup()
                        .addComponent(jLabel129)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(careditLayout.createSequentialGroup()
                        .addComponent(jLabel115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel184)
                .addGap(45, 45, 45))
        );

        getContentPane().add(caredit, "card5");

        gasstationedit.setBackground(new java.awt.Color(42, 39, 39));
        gasstationedit.setPreferredSize(new java.awt.Dimension(1300, 900));

        jTextField77.setBackground(new java.awt.Color(69, 63, 61));
        jTextField77.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField77.setForeground(new java.awt.Color(244, 253, 255));
        jTextField77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel136.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(244, 253, 255));
        jLabel136.setText("Insert Gas Station's Name");

        jPanel35.setBackground(new java.awt.Color(69, 63, 61));
        jPanel35.setPreferredSize(new java.awt.Dimension(1300, 80));

        jLabel137.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(244, 253, 255));
        jLabel137.setText("Editing a Gas Station");

        jLabel188.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/icons8-gas-station-48.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jButton139.setBackground(new java.awt.Color(69, 63, 61));
        jButton139.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton139.setToolTipText("");
        jButton139.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton139ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton139)
                .addGap(413, 413, 413)
                .addComponent(jLabel137)
                .addGap(393, 393, 393)
                .addComponent(jLabel188)
                .addGap(25, 25, 25))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel188, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton139))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel137)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton67.setBackground(new java.awt.Color(42, 39, 39));
        jButton67.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton67.setForeground(new java.awt.Color(244, 253, 255));
        jButton67.setText("Delete");
        jButton67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });

        jButton68.setBackground(new java.awt.Color(42, 39, 39));
        jButton68.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton68.setForeground(new java.awt.Color(244, 253, 255));
        jButton68.setText("Info");
        jButton68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });

        jLabel124.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(244, 253, 255));
        jLabel124.setText("Price");

        jTextField70.setBackground(new java.awt.Color(69, 63, 61));
        jTextField70.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField70.setForeground(new java.awt.Color(244, 253, 255));
        jTextField70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel131.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(244, 253, 255));
        jLabel131.setText("Phone Number");

        jTextField71.setBackground(new java.awt.Color(69, 63, 61));
        jTextField71.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField71.setForeground(new java.awt.Color(244, 253, 255));
        jTextField71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jButton91.setBackground(new java.awt.Color(42, 39, 39));
        jButton91.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton91.setForeground(new java.awt.Color(244, 253, 255));
        jButton91.setText("Update");
        jButton91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });

        jButton92.setBackground(new java.awt.Color(42, 39, 39));
        jButton92.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton92.setForeground(new java.awt.Color(244, 253, 255));
        jButton92.setText("Search");
        jButton92.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });

        jLabel189.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel189.setForeground(new java.awt.Color(87, 80, 77));
        jLabel189.setText("Please use ONLY English as a language for the date");

        javax.swing.GroupLayout gasstationeditLayout = new javax.swing.GroupLayout(gasstationedit);
        gasstationedit.setLayout(gasstationeditLayout);
        gasstationeditLayout.setHorizontalGroup(
            gasstationeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gasstationeditLayout.createSequentialGroup()
                .addGap(463, 463, 463)
                .addComponent(jLabel189)
                .addGap(462, 462, 462))
            .addGroup(gasstationeditLayout.createSequentialGroup()
                .addGroup(gasstationeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gasstationeditLayout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addGroup(gasstationeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel136)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gasstationeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(gasstationeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel131)
                                    .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel124))
                                .addGroup(gasstationeditLayout.createSequentialGroup()
                                    .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gasstationeditLayout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gasstationeditLayout.setVerticalGroup(
            gasstationeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gasstationeditLayout.createSequentialGroup()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel136)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gasstationeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gasstationeditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel131)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel124)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel189)
                .addGap(222, 222, 222))
        );

        getContentPane().add(gasstationedit, "card5");

        Taxiedit.setBackground(new java.awt.Color(42, 39, 39));
        Taxiedit.setPreferredSize(new java.awt.Dimension(1300, 900));

        jTextField78.setBackground(new java.awt.Color(69, 63, 61));
        jTextField78.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField78.setForeground(new java.awt.Color(244, 253, 255));
        jTextField78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel138.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(244, 253, 255));
        jLabel138.setText("Taxi bureau Name");

        jPanel36.setBackground(new java.awt.Color(69, 63, 61));
        jPanel36.setPreferredSize(new java.awt.Dimension(1300, 80));

        jLabel139.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(244, 253, 255));
        jLabel139.setText("Editing a Taxi Bureau");

        jLabel190.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/taxi-sign.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jButton140.setBackground(new java.awt.Color(69, 63, 61));
        jButton140.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton140.setToolTipText("");
        jButton140.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton140ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton140)
                .addGap(406, 406, 406)
                .addComponent(jLabel139)
                .addGap(385, 385, 385)
                .addComponent(jLabel190)
                .addGap(25, 25, 25))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel190, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                        .addComponent(jButton140)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel139)
                        .addGap(22, 22, 22))))
        );

        jButton70.setBackground(new java.awt.Color(42, 39, 39));
        jButton70.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton70.setForeground(new java.awt.Color(244, 253, 255));
        jButton70.setText("Delete");
        jButton70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });

        jButton71.setBackground(new java.awt.Color(42, 39, 39));
        jButton71.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton71.setForeground(new java.awt.Color(244, 253, 255));
        jButton71.setText("Info");
        jButton71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });

        jLabel130.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(244, 253, 255));
        jLabel130.setText("Price");

        jButton93.setBackground(new java.awt.Color(42, 39, 39));
        jButton93.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton93.setForeground(new java.awt.Color(244, 253, 255));
        jButton93.setText("Update");
        jButton93.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });

        jTextField72.setBackground(new java.awt.Color(69, 63, 61));
        jTextField72.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField72.setForeground(new java.awt.Color(244, 253, 255));
        jTextField72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jTextField73.setBackground(new java.awt.Color(69, 63, 61));
        jTextField73.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField73.setForeground(new java.awt.Color(244, 253, 255));
        jTextField73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel147.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(244, 253, 255));
        jLabel147.setText("Phone Number");

        jTextField74.setBackground(new java.awt.Color(69, 63, 61));
        jTextField74.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField74.setForeground(new java.awt.Color(244, 253, 255));
        jTextField74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel148.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(244, 253, 255));
        jLabel148.setText("Address");

        jButton94.setBackground(new java.awt.Color(42, 39, 39));
        jButton94.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton94.setForeground(new java.awt.Color(244, 253, 255));
        jButton94.setText("Search");
        jButton94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });

        jLabel191.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel191.setForeground(new java.awt.Color(87, 80, 77));
        jLabel191.setText("Please use ONLY English as a language for the date");

        javax.swing.GroupLayout TaxieditLayout = new javax.swing.GroupLayout(Taxiedit);
        Taxiedit.setLayout(TaxieditLayout);
        TaxieditLayout.setHorizontalGroup(
            TaxieditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TaxieditLayout.createSequentialGroup()
                .addGap(505, 505, 505)
                .addGroup(TaxieditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel130)
                    .addGroup(TaxieditLayout.createSequentialGroup()
                        .addGroup(TaxieditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(TaxieditLayout.createSequentialGroup()
                                .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel138)
                    .addComponent(jLabel148)
                    .addComponent(jLabel147)
                    .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(460, 460, 460))
            .addGroup(TaxieditLayout.createSequentialGroup()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(TaxieditLayout.createSequentialGroup()
                .addGroup(TaxieditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TaxieditLayout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(jLabel191))
                    .addGroup(TaxieditLayout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(462, 462, 462))
        );
        TaxieditLayout.setVerticalGroup(
            TaxieditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaxieditLayout.createSequentialGroup()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel138)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TaxieditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TaxieditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel147)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel148)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel130)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel191)
                .addGap(222, 222, 222))
        );

        getContentPane().add(Taxiedit, "card5");

        Reserveacar.setBackground(new java.awt.Color(42, 39, 39));
        Reserveacar.setPreferredSize(new java.awt.Dimension(1300, 900));

        jTextField79.setBackground(new java.awt.Color(69, 63, 61));
        jTextField79.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField79.setForeground(new java.awt.Color(244, 253, 255));
        jTextField79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel140.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(244, 253, 255));
        jLabel140.setText("SSN");

        jPanel38.setBackground(new java.awt.Color(69, 63, 61));
        jPanel38.setForeground(new java.awt.Color(244, 253, 255));
        jPanel38.setPreferredSize(new java.awt.Dimension(1300, 80));

        jButton141.setBackground(new java.awt.Color(69, 63, 61));
        jButton141.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton141.setToolTipText("");
        jButton141.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton141ActionPerformed(evt);
            }
        });

        jLabel192.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/car.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jLabel141.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(244, 253, 255));
        jLabel141.setText("Reserve a Car");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton141)
                .addGap(473, 473, 473)
                .addComponent(jLabel141)
                .addGap(452, 452, 452)
                .addComponent(jLabel192)
                .addGap(25, 25, 25))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton141)))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel141)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButton74.setBackground(new java.awt.Color(42, 39, 39));
        jButton74.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton74.setForeground(new java.awt.Color(244, 253, 255));
        jButton74.setText("Reserve");
        jButton74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });

        jButton75.setBackground(new java.awt.Color(42, 39, 39));
        jButton75.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton75.setForeground(new java.awt.Color(244, 253, 255));
        jButton75.setText("Info");
        jButton75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });

        jTextField80.setBackground(new java.awt.Color(69, 63, 61));
        jTextField80.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField80.setForeground(new java.awt.Color(244, 253, 255));
        jTextField80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel142.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(244, 253, 255));
        jLabel142.setText("Plate Number");

        jButton81.setBackground(new java.awt.Color(42, 39, 39));
        jButton81.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton81.setForeground(new java.awt.Color(244, 253, 255));
        jButton81.setText("Delete");
        jButton81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });

        jLabel193.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel193.setForeground(new java.awt.Color(87, 80, 77));
        jLabel193.setText("Please use ONLY English as a language for the date");

        javax.swing.GroupLayout ReserveacarLayout = new javax.swing.GroupLayout(Reserveacar);
        Reserveacar.setLayout(ReserveacarLayout);
        ReserveacarLayout.setHorizontalGroup(
            ReserveacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReserveacarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ReserveacarLayout.createSequentialGroup()
                .addGroup(ReserveacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReserveacarLayout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addGroup(ReserveacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel142)
                            .addComponent(jLabel140)
                            .addGroup(ReserveacarLayout.createSequentialGroup()
                                .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ReserveacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(ReserveacarLayout.createSequentialGroup()
                                    .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextField79, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ReserveacarLayout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(jLabel193)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ReserveacarLayout.setVerticalGroup(
            ReserveacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReserveacarLayout.createSequentialGroup()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel142)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReserveacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel140)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ReserveacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel193)
                .addContainerGap(531, Short.MAX_VALUE))
        );

        getContentPane().add(Reserveacar, "card5");

        Reserveataxi.setBackground(new java.awt.Color(42, 39, 39));
        Reserveataxi.setPreferredSize(new java.awt.Dimension(1300, 900));

        jTextField81.setBackground(new java.awt.Color(69, 63, 61));
        jTextField81.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField81.setForeground(new java.awt.Color(244, 253, 255));
        jTextField81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel143.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(244, 253, 255));
        jLabel143.setText("SSN");

        jPanel40.setBackground(new java.awt.Color(69, 63, 61));

        jLabel144.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(244, 253, 255));
        jLabel144.setText("Reserve a Taxi");

        jButton142.setBackground(new java.awt.Color(69, 63, 61));
        jButton142.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton142.setToolTipText("");
        jButton142.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton142ActionPerformed(evt);
            }
        });

        jLabel195.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/taxi-sign.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton142)
                .addGap(463, 463, 463)
                .addComponent(jLabel144)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel195)
                .addGap(25, 25, 25))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton142))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel144)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(jLabel195, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton78.setBackground(new java.awt.Color(42, 39, 39));
        jButton78.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton78.setForeground(new java.awt.Color(244, 253, 255));
        jButton78.setText("Reserve");
        jButton78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });

        jButton79.setBackground(new java.awt.Color(42, 39, 39));
        jButton79.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton79.setForeground(new java.awt.Color(244, 253, 255));
        jButton79.setText("Info");
        jButton79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });

        jTextField82.setBackground(new java.awt.Color(69, 63, 61));
        jTextField82.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField82.setForeground(new java.awt.Color(244, 253, 255));
        jTextField82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel145.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(244, 253, 255));
        jLabel145.setText("Taxi Bureau Name");

        jButton80.setBackground(new java.awt.Color(42, 39, 39));
        jButton80.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton80.setForeground(new java.awt.Color(244, 253, 255));
        jButton80.setText("Delete");
        jButton80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });

        jLabel194.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel194.setForeground(new java.awt.Color(87, 80, 77));
        jLabel194.setText("Please use ONLY English as a language for the date");

        javax.swing.GroupLayout ReserveataxiLayout = new javax.swing.GroupLayout(Reserveataxi);
        Reserveataxi.setLayout(ReserveataxiLayout);
        ReserveataxiLayout.setHorizontalGroup(
            ReserveataxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReserveataxiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ReserveataxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel143)
                    .addGroup(ReserveataxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReserveataxiLayout.createSequentialGroup()
                            .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextField81, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReserveataxiLayout.createSequentialGroup()
                        .addGroup(ReserveataxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel145)
                            .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(367, 367, 367))
            .addGroup(ReserveataxiLayout.createSequentialGroup()
                .addGap(463, 463, 463)
                .addComponent(jLabel194)
                .addContainerGap(435, Short.MAX_VALUE))
            .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReserveataxiLayout.setVerticalGroup(
            ReserveataxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReserveataxiLayout.createSequentialGroup()
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel145)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReserveataxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel143)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ReserveataxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel194)
                .addContainerGap(531, Short.MAX_VALUE))
        );

        getContentPane().add(Reserveataxi, "card5");

        Couponadd.setBackground(new java.awt.Color(42, 39, 39));
        Couponadd.setMinimumSize(new java.awt.Dimension(1000, 800));
        Couponadd.setPreferredSize(new java.awt.Dimension(1300, 900));

        jPanel43.setBackground(new java.awt.Color(69, 63, 61));

        jLabel149.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(255, 255, 255));
        jLabel149.setText("Add Coupon");

        jButton143.setBackground(new java.awt.Color(69, 63, 61));
        jButton143.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton143.setToolTipText("");
        jButton143.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton143ActionPerformed(evt);
            }
        });

        jLabel196.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/icons8-gas-station-48.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton143)
                .addGap(478, 478, 478)
                .addComponent(jLabel149)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel196)
                .addGap(25, 25, 25))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton143))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel149)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTextField64.setBackground(new java.awt.Color(69, 63, 61));
        jTextField64.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField64.setForeground(new java.awt.Color(244, 253, 255));
        jTextField64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jTextField64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField64ActionPerformed(evt);
            }
        });

        jLabel150.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(244, 253, 255));
        jLabel150.setText("Gas Station's Name");

        jTextField83.setBackground(new java.awt.Color(69, 63, 61));
        jTextField83.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField83.setForeground(new java.awt.Color(244, 253, 255));
        jTextField83.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel151.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(244, 253, 255));
        jLabel151.setText("Plate Number");

        jTextField84.setBackground(new java.awt.Color(69, 63, 61));
        jTextField84.setFont(new java.awt.Font("Footlight MT Light", 0, 22)); // NOI18N
        jTextField84.setForeground(new java.awt.Color(244, 253, 255));
        jTextField84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));

        jLabel152.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(244, 253, 255));
        jLabel152.setText("Coupon");

        jButton97.setBackground(new java.awt.Color(42, 39, 39));
        jButton97.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton97.setForeground(new java.awt.Color(244, 253, 255));
        jButton97.setText("Save");
        jButton97.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });

        jButton98.setBackground(new java.awt.Color(42, 39, 39));
        jButton98.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton98.setForeground(new java.awt.Color(244, 253, 255));
        jButton98.setText("Delete");
        jButton98.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton98ActionPerformed(evt);
            }
        });

        jButton99.setBackground(new java.awt.Color(42, 39, 39));
        jButton99.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton99.setForeground(new java.awt.Color(244, 253, 255));
        jButton99.setText("Info");
        jButton99.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton99ActionPerformed(evt);
            }
        });

        jLabel197.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        jLabel197.setForeground(new java.awt.Color(87, 80, 77));
        jLabel197.setText("Please use ONLY English as a language for the date");

        javax.swing.GroupLayout CouponaddLayout = new javax.swing.GroupLayout(Couponadd);
        Couponadd.setLayout(CouponaddLayout);
        CouponaddLayout.setHorizontalGroup(
            CouponaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CouponaddLayout.createSequentialGroup()
                .addGroup(CouponaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CouponaddLayout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addGroup(CouponaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel150)
                            .addGroup(CouponaddLayout.createSequentialGroup()
                                .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel151)
                            .addComponent(jLabel152)
                            .addGroup(CouponaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(CouponaddLayout.createSequentialGroup()
                                    .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextField84, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CouponaddLayout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(jLabel197)))
                .addContainerGap(367, Short.MAX_VALUE))
        );
        CouponaddLayout.setVerticalGroup(
            CouponaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CouponaddLayout.createSequentialGroup()
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel150)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CouponaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel151)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel152)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(CouponaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel197)
                .addContainerGap(441, Short.MAX_VALUE))
        );

        getContentPane().add(Couponadd, "card16");

        Reports.setBackground(new java.awt.Color(42, 39, 39));
        Reports.setPreferredSize(new java.awt.Dimension(1300, 900));

        jPanel44.setBackground(new java.awt.Color(69, 63, 61));
        jPanel44.setPreferredSize(new java.awt.Dimension(1300, 80));

        jButton144.setBackground(new java.awt.Color(69, 63, 61));
        jButton144.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/back.png%20")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton144.setToolTipText("");
        jButton144.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 80, 77)));
        jButton144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton144ActionPerformed(evt);
            }
        });

        jLabel198.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/ramin/Documents/NetBeansProjects/DataBaseProject (1)/icons8-reports-48.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jLabel160.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel160.setForeground(new java.awt.Color(244, 253, 255));
        jLabel160.setText("Reports");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton144)
                .addGap(517, 517, 517)
                .addComponent(jLabel160)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 506, Short.MAX_VALUE)
                .addComponent(jLabel198)
                .addGap(35, 35, 35))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel198, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton144))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel160)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel198.getAccessibleContext().setAccessibleName("");

        jButton101.setBackground(new java.awt.Color(42, 39, 39));
        jButton101.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton101.setForeground(new java.awt.Color(244, 253, 255));
        jButton101.setText("Show");
        jButton101.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton101ActionPerformed(evt);
            }
        });

        jLabel153.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(244, 253, 255));
        jLabel153.setText("Full Time Employee's Salaries");

        jButton102.setBackground(new java.awt.Color(42, 39, 39));
        jButton102.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton102.setForeground(new java.awt.Color(244, 253, 255));
        jButton102.setText("Show");
        jButton102.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton102ActionPerformed(evt);
            }
        });

        jLabel154.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(244, 253, 255));
        jLabel154.setText("Part Time Employee's Salaries");

        jButton103.setBackground(new java.awt.Color(42, 39, 39));
        jButton103.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton103.setForeground(new java.awt.Color(244, 253, 255));
        jButton103.setText("Show");
        jButton103.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton103ActionPerformed(evt);
            }
        });

        jLabel155.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(244, 253, 255));
        jLabel155.setText("Taxi Reservation");

        jButton104.setBackground(new java.awt.Color(42, 39, 39));
        jButton104.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton104.setForeground(new java.awt.Color(244, 253, 255));
        jButton104.setText("Show");
        jButton104.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton104ActionPerformed(evt);
            }
        });

        jLabel156.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel156.setForeground(new java.awt.Color(244, 253, 255));
        jLabel156.setText("Car Reservation");

        jButton105.setBackground(new java.awt.Color(42, 39, 39));
        jButton105.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton105.setForeground(new java.awt.Color(244, 253, 255));
        jButton105.setText("Show");
        jButton105.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton105ActionPerformed(evt);
            }
        });

        jLabel157.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(244, 253, 255));
        jLabel157.setText("Coupons List");

        jButton106.setBackground(new java.awt.Color(42, 39, 39));
        jButton106.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton106.setForeground(new java.awt.Color(244, 253, 255));
        jButton106.setText("Show");
        jButton106.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton106ActionPerformed(evt);
            }
        });

        jLabel158.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel158.setForeground(new java.awt.Color(244, 253, 255));
        jLabel158.setText("Electric Cars");

        jButton107.setBackground(new java.awt.Color(42, 39, 39));
        jButton107.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton107.setForeground(new java.awt.Color(244, 253, 255));
        jButton107.setText("Show");
        jButton107.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton107ActionPerformed(evt);
            }
        });

        jLabel159.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(244, 253, 255));
        jLabel159.setText("Fueled Cars");

        jLabel161.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(244, 253, 255));
        jLabel161.setText("Managers");

        jButton108.setBackground(new java.awt.Color(42, 39, 39));
        jButton108.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton108.setForeground(new java.awt.Color(244, 253, 255));
        jButton108.setText("Show");
        jButton108.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton108ActionPerformed(evt);
            }
        });

        jLabel162.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(244, 253, 255));
        jLabel162.setText("Staff");

        jButton109.setBackground(new java.awt.Color(42, 39, 39));
        jButton109.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton109.setForeground(new java.awt.Color(244, 253, 255));
        jButton109.setText("Show");
        jButton109.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton109ActionPerformed(evt);
            }
        });

        jButton110.setBackground(new java.awt.Color(42, 39, 39));
        jButton110.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton110.setForeground(new java.awt.Color(244, 253, 255));
        jButton110.setText("Show");
        jButton110.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton110ActionPerformed(evt);
            }
        });

        jLabel163.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel163.setForeground(new java.awt.Color(244, 253, 255));
        jLabel163.setText("Maintenace Company's Locations");

        jButton111.setBackground(new java.awt.Color(42, 39, 39));
        jButton111.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton111.setForeground(new java.awt.Color(244, 253, 255));
        jButton111.setText("Show");
        jButton111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 63, 61)));
        jButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton111ActionPerformed(evt);
            }
        });

        jLabel164.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(244, 253, 255));
        jLabel164.setText("Gas Station's Locations");

        javax.swing.GroupLayout ReportsLayout = new javax.swing.GroupLayout(Reports);
        Reports.setLayout(ReportsLayout);
        ReportsLayout.setHorizontalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportsLayout.createSequentialGroup()
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ReportsLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel154)
                    .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel153)
                    .addComponent(jLabel163)
                    .addComponent(jButton110, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel164))
                .addGap(411, 411, 411)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel162)
                    .addComponent(jButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel161)
                    .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel158)
                    .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel159)
                    .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportsLayout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel155)
                    .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel157)
                    .addComponent(jButton105, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel156))
                .addGap(343, 343, 343))
        );
        ReportsLayout.setVerticalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportsLayout.createSequentialGroup()
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportsLayout.createSequentialGroup()
                        .addComponent(jLabel161)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel162)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReportsLayout.createSequentialGroup()
                        .addComponent(jLabel153)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel154)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportsLayout.createSequentialGroup()
                        .addComponent(jLabel163)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton110, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel164)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReportsLayout.createSequentialGroup()
                        .addComponent(jLabel158)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel159)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportsLayout.createSequentialGroup()
                        .addComponent(jLabel155)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(ReportsLayout.createSequentialGroup()
                            .addComponent(jLabel156)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ReportsLayout.createSequentialGroup()
                            .addComponent(jLabel157)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton105, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        getContentPane().add(Reports, "card13");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         String Username = jTextField1.getText();
         String Password= new String (jPasswordField1.getPassword()); // because the getPasswords gives an array of chars, we needed to use the constructer
        
        if(Username.equalsIgnoreCase(username) && Password.equalsIgnoreCase(password))
        {
            LoginPanel.setVisible(false);
            HomePanel.setVisible(true);
         
            
        }
        else
        {
            this.jLabel10.setVisible(true);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tab4.setVisible(false);
        empadd.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry=null;
            if(Male)
            {
             qry="insert into vt.employee values('"+this.jTextField2.getText()+"','"+jTextField3.getText()+"','"+jTextField4.getText()+"','"+jTextField5.getText()+"','"+jTextField6.getText()+"','"+jDateChooser1.getDate()+"','"+M+"','"+jTextField9.getText()+"')";

            }
            else if(Female){
             qry="insert into vt.employee values('"+this.jTextField2.getText()+"','"+jTextField3.getText()+"','"+jTextField4.getText()+"','"+jTextField5.getText()+"','"+jTextField6.getText()+"','"+jDateChooser1.getDate()+"','"+F+"','"+jTextField9.getText()+"')";
            }
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            
            

        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured during adding new Employee into the DataBase","Error",JOptionPane.ERROR_MESSAGE);
        }
        
          if(Fulltime)
            {
                                    try {
                         DriverManager.registerDriver(new org.postgresql.Driver());
                         String connInfo = "jdbc:postgresql://localhost:5432/postgres";
                         Connection con=DriverManager.getConnection(connInfo,"hadi","123");
                         con.setAutoCommit(false);
                         String qry="insert into vt.fulltimeemployee values('"+this.jTextField5.getText()+"',"+jTextField30.getText()+")";
                         Statement stmt=(Statement) con.createStatement();
                         stmt.executeUpdate(qry);
                         con.commit();
                         con.close();



                         JOptionPane.showMessageDialog(this,"An Employee has been Successfully Added to the DataBase :)","Success",JOptionPane.INFORMATION_MESSAGE);
                     } catch (Exception ex) {
                         //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                         JOptionPane.showMessageDialog(this,"Error occured during adding new Employee into the DataBase","Error",JOptionPane.ERROR_MESSAGE);
                     } 
            }
                    
           if(Parttime)
            {
                                                   try {
                         DriverManager.registerDriver(new org.postgresql.Driver());
                         String connInfo = "jdbc:postgresql://localhost:5432/postgres";
                         Connection con=DriverManager.getConnection(connInfo,"hadi","123");
                         con.setAutoCommit(false);
                         String qry="insert into vt.parttimeemployee values('"+this.jTextField5.getText()+"',"+jTextField31.getText()+","+jTextField32.getText()+")";
                         Statement stmt=(Statement) con.createStatement();
                         stmt.executeUpdate(qry);
                         con.commit();
                         con.close();



                         JOptionPane.showMessageDialog(this,"An Employee has been Successfully Added to the DataBase :)","Success",JOptionPane.INFORMATION_MESSAGE);
                     } catch (Exception ex) {
                         //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                         JOptionPane.showMessageDialog(this,"Error occured during adding new Employee into the DataBase","Error",JOptionPane.ERROR_MESSAGE);
                     }              
            }
           
           if(Staff)
           {
                                                                  try {
                         DriverManager.registerDriver(new org.postgresql.Driver());
                         String connInfo = "jdbc:postgresql://localhost:5432/postgres";
                         Connection con=DriverManager.getConnection(connInfo,"hadi","123");
                         con.setAutoCommit(false);
                         String qry="insert into vt.staff values('"+this.jTextField5.getText()+"','"+jTextField33.getText()+"')";
                         Statement stmt=(Statement) con.createStatement();
                         stmt.executeUpdate(qry);
                         con.commit();
                         con.close();



                         JOptionPane.showMessageDialog(this,"An Employee has been Successfully Added to the DataBase :)","Success",JOptionPane.INFORMATION_MESSAGE);
                     } catch (Exception ex) {
                         //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                         JOptionPane.showMessageDialog(this,"Error occured during adding new Employee into the DataBase","Error",JOptionPane.ERROR_MESSAGE);
                     }  
           }
           
           if(Manager)
           {
                                                                  try {
                         DriverManager.registerDriver(new org.postgresql.Driver());
                         String connInfo = "jdbc:postgresql://localhost:5432/postgres";
                         Connection con=DriverManager.getConnection(connInfo,"hadi","123");
                         con.setAutoCommit(false);
                         String qry="insert into vt.manager values('"+this.jTextField5.getText()+"','"+jTextField34.getText()+"','"+jTextField35.getText()+"')";
                         Statement stmt=(Statement) con.createStatement();
                         stmt.executeUpdate(qry);
                         con.commit();
                         con.close();



                         JOptionPane.showMessageDialog(this,"An Employee has been Successfully Added to the DataBase :)","Success",JOptionPane.INFORMATION_MESSAGE);
                     } catch (Exception ex) {
                         //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                         JOptionPane.showMessageDialog(this,"Error occured during adding new Employee into the DataBase","Error",JOptionPane.ERROR_MESSAGE);
                     }  
           }
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        this.jTextField4.setText("");
        this.jTextField5.setText("");
        this.jTextField6.setText("");

        this.jTextField9.setText("");
        this.jTextField30.setText("");
        this.jTextField31.setText("");
        this.jTextField32.setText("");
        this.jTextField33.setText("");
        this.jTextField34.setText("");
        this.jTextField35.setText("");
        Fulltime=false;
        Parttime=false;
        Staff=false;
        Manager=false;
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        tab4.setVisible(false);
        empview.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
            
        DefaultTableModel modle =(DefaultTableModel) jTable1.getModel();
        modle.setRowCount(0); 
                
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="select * from vt.employee";
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            int i =1;
            while(rs.next())
            {
                
                String fname = rs.getString(1);
                String mname = rs.getString(2);
                String lname = rs.getString(3);
                String ssn= rs.getString(4);
                String phoneno= rs.getString(5);
                String bdate= rs.getString(6);
                String gender= rs.getString(7);
                String address= rs.getString(8);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                Object[] row = {i,fname,mname,lname,ssn,phoneno,bdate,gender,address};
                model.addRow(row);
                i++;
            }
            con.close();
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured during Viewing Employees","Error",JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        caradd.setVisible(true);
        tab4.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        carview.setVisible(true);
        this.tab4.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        DefaultTableModel modle =(DefaultTableModel) jTable2.getModel();
        modle.setRowCount(0);              
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="select * from vt.car";
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            int i =1;
            while(rs.next())
            {
                
                String brand = rs.getString(1);
                String color = rs.getString(2);
                String plateno = rs.getString(3);
                String state= rs.getString(4);
                String cdate= rs.getString(5);
                String mname= rs.getString(6);
                String mdate= rs.getString(7);
                String iname= rs.getString(8);
                String idate = rs.getString(9);
                 DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                Object[] row = {i,brand,color,plateno,state,cdate,mname,mdate,iname,idate};
                model.addRow(row);
                i++;
            }
            con.close();
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured during Viewing Cars","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
                try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="insert into vt.car values('"+this.jTextField10.getText()+"','"+jTextField11.getText()+"','"+jTextField12.getText()+"','"+jTextField13.getText()+"','"+jTextField14.getText()+"','"+jTextField15.getText()+"','"+jTextField16.getText()+"','"+jTextField17.getText()+"','"+jTextField18.getText()+"')";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured during adding a new Car into the DataBase","Error",JOptionPane.ERROR_MESSAGE);
        }
                
          if(Electric)
          {
                        try {
                          DriverManager.registerDriver(new org.postgresql.Driver());
                          String connInfo = "jdbc:postgresql://localhost:5432/postgres";
                          Connection con=DriverManager.getConnection(connInfo,"hadi","123");
                          con.setAutoCommit(false);
                          String qry="insert into vt.electriccars values('"+this.jTextField12.getText()+"',"+jTextField37.getText()+")";
                          Statement stmt=(Statement) con.createStatement();
                          stmt.executeUpdate(qry);
                          con.commit();
                          con.close();
                          JOptionPane.showMessageDialog(this,"A Car has been Successfully Added to the DataBase :)","Success",JOptionPane.INFORMATION_MESSAGE);
                      } catch (Exception ex) {
                          //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                          JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
                      }
          }
          
          if(Fueled)
          {
                                                          try {
                          DriverManager.registerDriver(new org.postgresql.Driver());
                          String connInfo = "jdbc:postgresql://localhost:5432/postgres";
                          Connection con=DriverManager.getConnection(connInfo,"hadi","123");
                          con.setAutoCommit(false);
                          String qry="insert into vt.fueledcars values('"+this.jTextField12.getText()+"','"+jTextField36.getText()+"')";
                          Statement stmt=(Statement) con.createStatement();
                          stmt.executeUpdate(qry);
                          con.commit();
                          con.close();
                          JOptionPane.showMessageDialog(this,"A Car has been Successfully Added to the DataBase :)","Success",JOptionPane.INFORMATION_MESSAGE);
                      } catch (Exception ex) {
                          //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                          JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
                      }
          }
          Fueled=false;
          Electric=false;
                  this.jTextField10.setText("");
        this.jTextField11.setText("");
        this.jTextField12.setText("");
        this.jTextField13.setText("");
        this.jTextField14.setText("");
        this.jTextField15.setText("");
        this.jTextField16.setText("");
        this.jTextField17.setText("");
        this.jTextField18.setText("");
        this.jTextField36.setText("");
        this.jTextField37.setText("");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        insuranceadd.setVisible(true);
        tab4.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
                    try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="insert into vt.insurancecompany values("+this.jTextField19.getText()+",'"+jTextField20.getText()+"','"+jTextField21.getText()+"','"+jTextField22.getText()+"')";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"An Insurance Company has been Successfully Added to the DataBase :)","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
        this.jTextField19.setText("");
        this.jTextField20.setText("");
        this.jTextField21.setText("");
        this.jTextField22.setText("");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.insuranceview.setVisible(true);
        this.tab4.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        DefaultTableModel modle =(DefaultTableModel) jTable3.getModel();
        modle.setRowCount(0);                     
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="select * from vt.insurancecompany";
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            int i =1;
            while(rs.next())
            {
                
                int price = rs.getInt(1);
                String address = rs.getString(2);
                String iname = rs.getString(3);
                String phoneno= rs.getString(4);
                DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
                Object[] row = {i,price,address,iname,phoneno};
                model.addRow(row);
                i++;
            }
            con.close();
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this,"Error occured during Viewing Insuring Companies","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.maintenanceadd.setVisible(true);
        this.tab4.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
    try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="insert into vt.maintenancecompany values('"+this.jTextField23.getText()+"','"+jTextField24.getText()+"',"+jTextField25.getText()+")";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"An Maintenance Company has been Successfully Added to the DataBase :)","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        this.jTextField24.setText("");
        this.jTextField25.setText("");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.maintenanceview.setVisible(true);
        this.tab4.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        DefaultTableModel modle =(DefaultTableModel) jTable4.getModel();
        modle.setRowCount(0);
          try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="select * from vt.maintenancecompany";
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            int i =1;
            while(rs.next())
            {
                
                
                String mname = rs.getString(1);
                String phoneno = rs.getString(2);
                int price= rs.getInt(3);
                 DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
                Object[] row = {i,mname,phoneno,price};
                model.addRow(row);
                i++;
            }
            con.close();
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this,"Error occured during Viewing Mainenance Companies","Error",JOptionPane.ERROR_MESSAGE);
        } 
        
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        if(this.jTextArea5.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please Type your message then press the send button, an empty message couldn't be sent","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else {
            this.jTextArea5.setText("");
            JOptionPane.showMessageDialog(this,"Your Message Has been sent Successfully!","Meesage Sent",JOptionPane.INFORMATION_MESSAGE);

   }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        this.jLabel69.setVisible(true);
        this.jTextField26.setVisible(true);
        this.jButton31.setVisible(true);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        if(this.jTextField26.getText().length()>0)
        {
        this.jLabel70.setText(this.jTextField26.getText());
        this.jLabel69.setVisible(false);
        this.jTextField26.setVisible(false);
        this.jButton31.setVisible(false);
        this.jTextField26.setText("");
        }
        else JOptionPane.showMessageDialog(this,"Region Field is left Empty, Pelase insert you True Region","Error Occured",JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_jButton31ActionPerformed

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
        this.LoginPanel.setVisible(false);
        this.forgotpassword.setVisible(true);
    }//GEN-LAST:event_jLabel71MouseClicked

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
       String oldpass = this.jTextField27.getText();
        if(oldpass.equals(passcode))
        {
            String pass =this.jTextField28.getText();
            String pass1=this.jTextField29.getText();
            if(pass.equals(pass1))
            {
                password = pass;
                JOptionPane.showMessageDialog(this,"Yours password has been changed successfully!","Password Changed",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                this.jLabel74.setVisible(true);
            }
        }
        else 
        {
            this.jLabel77.setVisible(true);
        }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        this.Taxiadd.setVisible(true);
        this.tab4.setVisible(false);
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        this.Taxiview.setVisible(true);
        this.tab4.setVisible(false);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField32ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
      Fulltime = true;
      Parttime= false;
      this.jTextField30.setVisible(true);
      this.jLabel80.setVisible(true);
      this.jCheckBox2.setSelected(false);
      
            this.jLabel81.setVisible(false);
      this.jLabel16.setVisible(false);
      this.jTextField31.setVisible(false);
      this.jTextField32.setVisible(false);
      this.jTextField31.setText("");
      this.jTextField32.setText("");
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
      Parttime = true;
      Fulltime = false;
      this.jTextField30.setVisible(false);
      this.jLabel80.setVisible(false);
      this.jCheckBox1.setSelected(false);
      
      this.jLabel81.setVisible(true);
      this.jLabel16.setVisible(true);
      this.jTextField31.setVisible(true);
      this.jTextField32.setVisible(true);
      this.jTextField30.setText("");
      
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        Staff=true;
        Manager=false;
        this.jCheckBox4.setSelected(false);
        this.jTextField33.setVisible(true);
        this.jLabel82.setVisible(true);
        
        this.jLabel83.setVisible(false);
        this.jLabel84.setVisible(false);
        this.jTextField34.setVisible(false);
        this.jTextField35.setVisible(false);
        this.jTextField34.setText("");
        this.jTextField35.setText("");
        
        
        
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        Staff=false;
        Manager=true;
        this.jCheckBox3.setSelected(false);
        this.jTextField33.setVisible(false);
        this.jLabel82.setVisible(false);
        
        this.jLabel83.setVisible(true);
        this.jLabel84.setVisible(true);
        this.jTextField34.setVisible(true);
        this.jTextField35.setVisible(true);
        this.jTextField33.setText("");
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        this.jCheckBox6.setSelected(false);
        Fueled= true;
        Electric=false;
        this.jLabel85.setVisible(true);
        this.jTextField36.setVisible(true);
        this.jLabel86.setVisible(false);
        this.jTextField37.setVisible(false);
        this.jTextField37.setText("");
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        Fueled= false;
        Electric=true;
        this.jCheckBox5.setSelected(false);
        this.jLabel86.setVisible(true);
        this.jTextField37.setVisible(true);
        this.jLabel85.setVisible(false);
        this.jTextField36.setVisible(false);
        this.jTextField36.setText("");
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
            try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="insert into vt.maintenancelocations values('"+this.jTextField23.getText()+"','"+jTextField38.getText()+"')";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"An Location for a Maintenance Company has been Successfully Added to the DataBase :)","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured during adding a new Location into the DataBase","Error",JOptionPane.ERROR_MESSAGE);
        }
        this.jTextField38.setText("");
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        JOptionPane.showMessageDialog(this,"You can insert Multiple Locations when only inserting the Name of the company and the location","Information",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        this.tab4.setVisible(false);
        this.Gasadd.setVisible(true);
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        this.tab4.setVisible(false);
        this.Gasview.setVisible(true);
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
           try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="insert into vt.taxibereau values('"+this.jTextField39.getText()+"','"+jTextField40.getText()+"','"+jTextField41.getText()+"',"+jTextField42.getText()+")";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"An Taxi bureau has been Successfully Added to the DataBase :)","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
        this.jTextField39.setText("");
        this.jTextField40.setText("");
        this.jTextField41.setText("");
        this.jTextField42.setText("");
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        DefaultTableModel modle =(DefaultTableModel) jTable5.getModel();
        modle.setRowCount(0);
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="select * from vt.taxibereau";
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            int i =1;
            while(rs.next())
            {
                String mname = rs.getString(1);
                String phoneno = rs.getString(2);
                String address = rs.getString(3);
                int price= rs.getInt(4);
                DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
                Object[] row = {i,mname,phoneno,address,price};
                model.addRow(row);
                i++;
            }
            con.close();
        }
        catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
            try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="insert into vt.gasstation values('"+this.jTextField43.getText()+"','"+jTextField44.getText()+"',"+jTextField46.getText()+")";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"An Gas Station has been Successfully Added to the DataBase :)","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
            
            this.jTextField44.setText("");
            this.jTextField46.setText("");
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
                    try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="insert into vt.gasstationlocations values('"+this.jTextField43.getText()+"','"+jTextField45.getText()+"')";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"An Location for a Gas Station has been Successfully Added to the DataBase :)","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured during adding a new Location into the DataBase","Error",JOptionPane.ERROR_MESSAGE);
        }
       
         
         
          jTextField45.setText("");
            ;           
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        DefaultTableModel modle =(DefaultTableModel) jTable6.getModel();
        modle.setRowCount(0);                                     
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="select * from vt.gasstation";
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            int i =1;
            while(rs.next())
            {
                
                
                String mname = rs.getString(1);
                String phoneno = rs.getString(2);
                int price= rs.getInt(3);
                DefaultTableModel model = (DefaultTableModel) jTable6.getModel();
                Object[] row = {i,mname,phoneno,price};
                model.addRow(row);
                i++;
            }
            con.close();
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed

        
                try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="delete from vt.employee where ssn='"+this.jTextField49.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"Employee has been deleted","Information",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
                        jTextField48.setText("");
        jTextField49.setText("");
         jTextField50.setText("");
          jTextField54.setText("");
            jTextField60.setText("");
        jTextField61.setText("");
         jTextField85.setText("");
          jTextField86.setText("");
          jTextField87.setText("");
          jTextField88.setText("");
           jRadioButton7.setSelected(false);
          jRadioButton8.setSelected(false);
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        this.empedit.setVisible(true);
        this.tab4.setVisible(false);
        
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
            try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="delete from vt.insurancecompany where i_name='"+this.jTextField63.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"Insurance Company has been deleted","Information",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured during Deletion","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
              jTextField51.setText("");
        jTextField53.setText("");
         jTextField47.setText("");
          jTextField63.setText("");
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        this.insuranceedit.setVisible(true);
        this.tab4.setVisible(false);
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed

        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="delete from vt.maintenancecompany where m_name='"+this.jTextField75.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"maintenance company has been deleted","Information",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured during Deletion","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        jTextField57.setText("");
        jTextField58.setText("");
         jTextField75.setText("");
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        this.tab4.setVisible(false);
        this.maintenanceedit.setVisible(true);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        JOptionPane.showMessageDialog(this,"You can Edit or delete the Maintenance company that has been added already to the system","Information",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        JOptionPane.showMessageDialog(this,"Just by Inserting the name of the maintenance company, it will be deleted","Deletion info",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
               try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="delete from vt.car where platenumber='"+this.jTextField76.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"a car has been deleted","Information",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured during Deletion","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
                jTextField65.setText("");
        jTextField66.setText("");
         jTextField67.setText("");
         jTextField68.setText("");
        jTextField69.setText("");
         jTextField52.setText("");
         jTextField62.setText("");
        jTextField56.setText("");
         jTextField76.setText("");
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
    JOptionPane.showMessageDialog(this,"You can delete any Car has been added to the data base previously","Information",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        this.tab4.setVisible(false);
        this.caredit.setVisible(true);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
                       try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="delete from vt.gasstation where g_name='"+this.jTextField77.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"a Gas station has been deleted","Information",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured during Deletion","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
                       jTextField70.setText("");
        jTextField71.setText("");
         jTextField77.setText("");
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
    JOptionPane.showMessageDialog(this,"You can delete any Gas station has been added to the data base previously","Information",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        this.tab4.setVisible(false);
        this.gasstationedit.setVisible(true);
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
             try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="delete from vt.taxibereau where t_name='"+this.jTextField78.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"a Taxi Bureau has been deleted","Information",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured during Deletion","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
             jTextField72.setText("");
        jTextField73.setText("");
         jTextField74.setText("");
        jTextField78.setText("");
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
    JOptionPane.showMessageDialog(this,"You can delete any Taxi Bureau has been added to the data base previously.","Information",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        this.tab4.setVisible(false);
        this.Taxiedit.setVisible(true);
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        this.tab4.setVisible(false);
        this.Reserveacar.setVisible(true);
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
                try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
             
            String qry="insert into vt.drives values("+incrementVar +",'"+this.jTextField80.getText()+"','"+jTextField79.getText()+"')";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            incrementVar++;
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"A Reservation has been Made!","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured during making a Reservation","Error",JOptionPane.ERROR_MESSAGE);
        }
                 jTextField79.setText("");
        jTextField80.setText("");
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        JOptionPane.showMessageDialog(this,"You can Reserve a car to a certain employee to use for work purposes by inserting the already existed Plate Number for the car and the SSN for the Employee."+"\n and you Can delete the reservation when its done or canceled.","Make a Reservation",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
                this.tab4.setVisible(false);
        this.Reserveataxi.setVisible(true);
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
                        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
             
            String qry="insert into vt.calls values("+incrementVar1 +",'"+this.jTextField82.getText()+"','"+jTextField81.getText()+"')";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            incrementVar1++;
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"A Reservation has been Made!","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured during making a Reservation","Error",JOptionPane.ERROR_MESSAGE);
        }
                         jTextField81.setText("");
        jTextField82.setText("");
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        JOptionPane.showMessageDialog(this,"You can Reserve a Taxi to a certain employee to use for work purposes by inserting the already existed Bureau's Name and the SSN."+"\n and you can Delete a reservation when its done or canceled.","Make a Reservation",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
                try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="delete from vt.calls where t_name='"+this.jTextField82.getText()+"' and essn='"+this.jTextField81.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"A Taxi Reservation has been deleted.","Information",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured during Deletion","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
                 jTextField81.setText("");
        jTextField82.setText("");
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
                        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="delete from vt.drives where platenumber='"+this.jTextField80.getText()+"' and essn='"+this.jTextField79.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"A Car Reservation has been deleted.","Information",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured during Deletion","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
                         jTextField79.setText("");
        jTextField80.setText("");
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
                String fname;
                String mname;
                String lname;
                String ssn;
                String phoneno;
                String bdate;
                String gender;
                String address;        
        
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="select * from vt.employee where ssn='"+this.jTextField49.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            while(rs.next())
            {
                
                fname = rs.getString(1);
                mname = rs.getString(2);
                lname = rs.getString(3);
                ssn= rs.getString(4); // this is the variable we need to fint the count of full/part time employees
                phoneno= rs.getString(5);
                bdate= rs.getString(6);
                gender= rs.getString(7);
                address= rs.getString(8);
                if(gender.equals(M));
                {
                    Male=true;
                    Female=false;
                    this.jRadioButton7.setSelected(true);
                    this.jRadioButton8.setSelected(false);
                }
                if(gender.equals(F))
                {
                    Male=false;
                    Female=true;
                    this.jRadioButton7.setSelected(false);
                    this.jRadioButton8.setSelected(true);
                    
                }
                this.jTextField61.setText(fname);
                this.jTextField48.setText(mname);
                this.jTextField50.setText(lname);
                this.jTextField54.setText(phoneno);
                //this.jTextFild59.setText(gender);
                this.jTextField60.setText(bdate);
                this.jTextField86.setText(address);
            }
            con.close();
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
                try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="select count(*) from vt.fulltimeemployee where essn='"+this.jTextField49.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            while(rs.next())
            {
                FulltimeCount=rs.getInt(1);
            }
            con.close();
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        if(FulltimeCount==1)
        {
           //Fulltime=true;
            this.jComboBox1.setSelectedIndex(0);
                  try {
                      
                      int Salary=0;
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="select * from vt.fulltimeemployee where essn='"+this.jTextField49.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            while(rs.next())
            {
              Salary=rs.getInt(2);
            }
            this.jTextField88.setText(""+Salary);
            con.close();
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
        
           try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="select count(*) from vt.parttimeemployee where essn='"+this.jTextField49.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            while(rs.next())
            {
                ParttimeCount=rs.getInt(1);
            }
            con.close();
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
           if(ParttimeCount==1)
           {
              //Parttime=true;
               this.jComboBox1.setSelectedIndex(1);
                                 try {
                      
                      int HoursWorked=0;
                      int Wageperhour=0;
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="select * from vt.parttimeemployee where essn='"+this.jTextField49.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            while(rs.next())
            {
              HoursWorked=rs.getInt(2);
              Wageperhour=rs.getInt(3);
            }
            this.jTextField85.setText(""+HoursWorked);
            this.jTextField87.setText(""+Wageperhour);
            con.close();
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
           }
                    
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
                         try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry=null;
            if(Male)
            {
             qry="update vt.employee set fname='"+this.jTextField61.getText()+"', mname='"+this.jTextField48.getText()+"',lname='"+this.jTextField50.getText()+"',phonenumber='"+this.jTextField54.getText()+"',birthdate='"+this.jTextField60.getText()+"',gender='"+M+"',address='"+this.jTextField60.getText()+"' where ssn='"+this.jTextField49.getText()+"'";

            }
            else
             qry="update vt.employee set fname='"+this.jTextField61.getText()+"', mname='"+this.jTextField48.getText()+"',lname='"+this.jTextField50.getText()+"',phonenumber='"+this.jTextField54.getText()+"',birthdate='"+this.jTextField60.getText()+"',gender='"+F+"',address='"+this.jTextField60.getText()+"' where ssn='"+this.jTextField49.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            


        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
                         if(Fulltime)
                         {
                                try {
                               DriverManager.registerDriver(new org.postgresql.Driver());
                               String connInfo = "jdbc:postgresql://localhost:5432/postgres";
                               Connection con=DriverManager.getConnection(connInfo,"hadi","123");
                               con.setAutoCommit(false);
                              String qry="update vt.fulltimeemployee set salary="+this.jTextField88.getText()+" where essn='"+this.jTextField49.getText()+"'";
                               Statement stmt=(Statement) con.createStatement();
                               stmt.executeUpdate(qry);
                               con.commit();
                               con.close();

                               JOptionPane.showMessageDialog(this,"Edit has been confirmed!","Success",JOptionPane.INFORMATION_MESSAGE);


                                } catch (Exception ex) {
                                    System.out.println("FullTime Error");
                                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                                    JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
                                } 
                         }
                         if(Parttime)
                         {
                                try {
                               DriverManager.registerDriver(new org.postgresql.Driver());
                               String connInfo = "jdbc:postgresql://localhost:5432/postgres";
                               Connection con=DriverManager.getConnection(connInfo,"hadi","123");
                               con.setAutoCommit(false);
                              String qry="update vt.parttimeemployee set hoursworked="+this.jTextField85.getText()+",wageperhour="+this.jTextField87.getText()+" where essn='"+this.jTextField49.getText()+"'";
                               Statement stmt=(Statement) con.createStatement();
                               stmt.executeUpdate(qry);
                               con.commit();
                               con.close();

                               JOptionPane.showMessageDialog(this,"Edit has been confirmed!","Success",JOptionPane.INFORMATION_MESSAGE);


                                } catch (Exception ex) {
                                    System.out.println("PartTime Error");
                                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                                    JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
                                } 
                         }
                         Fulltime=false;
                         Parttime=false;
                         
                         jTextField48.setText("");
        jTextField49.setText("");
         jTextField50.setText("");
          jTextField54.setText("");
            jTextField60.setText("");
        jTextField61.setText("");
         jTextField85.setText("");
          jTextField86.setText("");
          jTextField87.setText("");
          jTextField88.setText("");
           jRadioButton7.setSelected(false);
          jRadioButton8.setSelected(false);
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
                                 try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="update vt.insurancecompany set price="+this.jTextField47.getText()+", address='"+this.jTextField51.getText()+"',phonenumber='"+this.jTextField53.getText()+"' where i_name='"+this.jTextField63.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            
            JOptionPane.showMessageDialog(this,"Edit has been confirmed!","Success",JOptionPane.INFORMATION_MESSAGE);


        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
                                   jTextField51.setText("");
        jTextField53.setText("");
         jTextField47.setText("");
          jTextField63.setText("");
    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
                
                String price;
                String address;
                String name;
                String phoneno;

                       
        
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="select * from vt.insurancecompany where i_name='"+this.jTextField63.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            while(rs.next())
            {
                
                price = rs.getString(1);
                address = rs.getString(2);
                name = rs.getString(3);
                phoneno= rs.getString(4);
               
                this.jTextField47.setText(price);
                this.jTextField51.setText(address);
                this.jTextField53.setText(phoneno);

            }
            con.close();
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
            JOptionPane.showMessageDialog(this,"This Frame is to help you editing the already existed data or delete it from the database if needed.","Information",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
          try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="update vt.maintenancecompany set phonenumber='"+this.jTextField57.getText()+"', price="+this.jTextField58.getText()+" where m_name='"+this.jTextField75.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            
            JOptionPane.showMessageDialog(this,"Edit has been confirmed!","Success",JOptionPane.INFORMATION_MESSAGE);


        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
          jTextField57.setText("");
        jTextField58.setText("");
         jTextField75.setText("");
    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
                String name;
                String phoneno;
                String price;
                

                       
        
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="select * from vt.maintenancecompany where m_name='"+this.jTextField75.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            while(rs.next())
            {
                
                name = rs.getString(1);
                phoneno = rs.getString(2);
                price = rs.getString(3);

                this.jTextField57.setText(phoneno);
                this.jTextField58.setText(price);

            }
            con.close();
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
                String brand;
                String color;
                String plateno;
                String state;
                String cdate;
                String mname;
                String mdate;
                String iname; 
                String idate;
        
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="select * from vt.car where platenumber='"+this.jTextField76.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            while(rs.next())
            {
                
                brand = rs.getString(1);
                color = rs.getString(2);
                plateno = rs.getString(3);
                state= rs.getString(4);
                cdate= rs.getString(5);
                mname =rs.getString(6);
                mdate= rs.getString(7);
                iname= rs.getString(8);
                idate= rs.getString(9);
                this.jTextField56.setText(brand);
                this.jTextField62.setText(color);
                this.jTextField65.setText(state);
                this.jTextField66.setText(cdate);
                this.jTextField67.setText(mname);
                this.jTextField68.setText(mdate);
                this.jTextField69.setText(iname);
                this.jTextField52.setText(idate);
            }
            con.close();
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
           
    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
                                try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="update vt.car set brand='"+this.jTextField56.getText()+"', color='"+this.jTextField62.getText()+"',stateofcar='"+this.jTextField65.getText()+"',clearencedate='"+this.jTextField66.getText()+"',maintenanceconame='"+this.jTextField67.getText()+"',maintenancedate='"+this.jTextField68.getText()+"',insuranceconame='"+this.jTextField69.getText()+"',insurancedate='"+this.jTextField52.getText()+"' where platenumber='"+this.jTextField76.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            
            JOptionPane.showMessageDialog(this,"Edit has been confirmed!","Success",JOptionPane.INFORMATION_MESSAGE);


        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
        jTextField65.setText("");
        jTextField66.setText("");
         jTextField67.setText("");
         jTextField68.setText("");
        jTextField69.setText("");
         jTextField52.setText("");
         jTextField62.setText("");
        jTextField56.setText("");
         jTextField76.setText("");
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
          try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="update vt.gasstation set phonenumber='"+this.jTextField70.getText()+"', price="+this.jTextField71.getText()+" where g_name='"+this.jTextField77.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            
            JOptionPane.showMessageDialog(this,"Edit has been confirmed!","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
          jTextField70.setText("");
        jTextField71.setText("");
         jTextField77.setText("");
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
    String gname;
    String phonenumber;
    String price;

        
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="select * from vt.gasstation where g_name='"+this.jTextField77.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            while(rs.next())
            { 
                gname = rs.getString(1);
                phonenumber = rs.getString(2);
                price = rs.getString(3);
                this.jTextField70.setText(phonenumber);
                this.jTextField71.setText(price);
            }
            con.close();
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton92ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
                  try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="update vt.taxibereau set phonenumber='"+this.jTextField72.getText()+"',address='"+this.jTextField73.getText()+"', price="+this.jTextField74.getText()+" where t_name='"+this.jTextField78.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            
            JOptionPane.showMessageDialog(this,"Edit has been confirmed!","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
                  jTextField72.setText("");
        jTextField73.setText("");
         jTextField74.setText("");
        jTextField78.setText("");
    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
    String tname;
    String phonenumber;
    String address;
    String price;

        
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="select * from vt.taxibereau where t_name='"+this.jTextField78.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            while(rs.next())
            { 
                tname = rs.getString(1);
                phonenumber = rs.getString(2);
                address = rs.getString(3);
                price = rs.getString(4);
                this.jTextField72.setText(phonenumber);
                this.jTextField73.setText(address);
                this.jTextField74.setText(price);
            }
            con.close();
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton95ActionPerformed
        this.tab4.setVisible(false);
        this.Couponadd.setVisible(true);
    }//GEN-LAST:event_jButton95ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
                    try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="insert into vt.supplies values("+incrementVar2+",'"+this.jTextField64.getText()+"','"+jTextField83.getText()+"','"+jTextField84.getText()+"')";
            Statement stmt=(Statement) con.createStatement();
            incrementVar2++;
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"A Coupon has been Successfully Added to the System :)","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
                     jTextField64.setText("");
        jTextField80.setText("");
         jTextField83.setText("");
    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
                        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="delete from vt.supplies where g_name='"+this.jTextField64.getText()+"' and platenumber='"+this.jTextField83.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(this,"A Coupon has been deleted","Information",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
          jTextField64.setText("");
        jTextField80.setText("");
         jTextField83.setText("");  
    }//GEN-LAST:event_jButton98ActionPerformed

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton99ActionPerformed
            JOptionPane.showMessageDialog(this,"You can delete a Coupon by inserting the Gas Station and the plate number of the car.","Information",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton99ActionPerformed

    private void jButton101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton101ActionPerformed
        Connection con;
        InputStream input;
        JasperDesign jd;
        JasperReport jr=null;
        JasperPrint jp;
        OutputStream output;
        try
        {
            DriverManager.deregisterDriver(new org.postgresql.Driver());
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","hadi","123");
            if(Dark)
            {
                            input = new FileInputStream(new File("FulltimeDark.jrxml"));

            }
            else
            input = new FileInputStream(new File("FulltimeLight.jrxml"));
            
            jd=JRXmlLoader.load(input);
            jr=JasperCompileManager.compileReport(jd);
            jp=JasperFillManager.fillReport(jr,null,con);
            JFrame frame = new JFrame("FullTime Employees Salaries");
            frame.getContentPane().add(new JRViewer(jp));
            frame.pack();
            frame.setVisible(true);
            frame.setSize(1000,900);
            input.close();
            con.close();
        }
        catch(Exception ex)
        {      
            JOptionPane.showMessageDialog(this,"Error Occured during opening the report","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton101ActionPerformed

    private void jButton102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton102ActionPerformed
        Connection con;
        InputStream input;
        JasperDesign jd;
        JasperReport jr=null;
        JasperPrint jp;
        OutputStream output;
        try
        {
            DriverManager.deregisterDriver(new org.postgresql.Driver());
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","hadi","123");
            if(Dark){
            input = new FileInputStream(new File("ParttimeDark.jrxml"));
            }
            else input = new FileInputStream(new File("ParttimeLight.jrxml"));
            jd=JRXmlLoader.load(input);
            jr=JasperCompileManager.compileReport(jd);
            jp=JasperFillManager.fillReport(jr,null,con);
            JFrame frame = new JFrame("PartTime Employees Salaries");
            frame.getContentPane().add(new JRViewer(jp));
            frame.pack();
            frame.setSize(1000,900);
            frame.setVisible(true);
            
            input.close();
            con.close();
        }
        catch(Exception ex)
        {      
            JOptionPane.showMessageDialog(this,"Error Occured during opening the report","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton102ActionPerformed

    private void jButton103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton103ActionPerformed
        Connection con;
        InputStream input;
        JasperDesign jd;
        JasperReport jr=null;
        JasperPrint jp;
        OutputStream output;
        try
        {
            DriverManager.deregisterDriver(new org.postgresql.Driver());
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","hadi","123");
            if(Dark)
            {
                input = new FileInputStream(new File("ReservedTaxiDark.jrxml"));
            }
            else input = new FileInputStream(new File("ReservedTaxiLight.jrxml"));
            jd=JRXmlLoader.load(input);
            jr=JasperCompileManager.compileReport(jd);
            jp=JasperFillManager.fillReport(jr,null,con);
            JFrame frame = new JFrame("Taxi Reservations");
            frame.getContentPane().add(new JRViewer(jp));
            frame.pack();
            frame.setVisible(true);
            frame.setSize(1000,900);
            input.close();
            con.close();
        }
        catch(Exception ex)
        {      
            JOptionPane.showMessageDialog(this,"Error Occured during opening the report","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton103ActionPerformed

    private void jButton104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton104ActionPerformed
         Connection con;
        InputStream input;
        JasperDesign jd;
        JasperReport jr=null;
        JasperPrint jp;
        OutputStream output;
        try
        {
            DriverManager.deregisterDriver(new org.postgresql.Driver());
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","hadi","123");
            if(Dark)
            {
                input = new FileInputStream(new File("ReservedCarsDark.jrxml"));
            }
            else input = new FileInputStream(new File("ReservedCarsLight.jrxml"));
            
            jd=JRXmlLoader.load(input);
            jr=JasperCompileManager.compileReport(jd);
            jp=JasperFillManager.fillReport(jr,null,con);
            JFrame frame = new JFrame("Car Reservations");
            frame.getContentPane().add(new JRViewer(jp));
            frame.pack();
            frame.setVisible(true);
            frame.setSize(1000,900);
            input.close();
            con.close();
        }
        catch(Exception ex)
        {      
            JOptionPane.showMessageDialog(this,"Error Occured during opening the report","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton104ActionPerformed

    private void jButton105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton105ActionPerformed
        Connection con;
        InputStream input;
        JasperDesign jd;
        JasperReport jr=null;
        JasperPrint jp;
        OutputStream output;
        try
        {
            DriverManager.deregisterDriver(new org.postgresql.Driver());
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","hadi","123");
            if(Dark)
            {
                input = new FileInputStream(new File("CouponDark.jrxml"));
            }
            else input = new FileInputStream(new File("CouponLight.jrxml"));
            
            jd=JRXmlLoader.load(input);
            jr=JasperCompileManager.compileReport(jd);
            jp=JasperFillManager.fillReport(jr,null,con);
            JFrame frame = new JFrame("Coupons List");
            frame.getContentPane().add(new JRViewer(jp));
            frame.pack();
            frame.setSize(1000,900);
            frame.setVisible(true);
            
            input.close();
            con.close();
        }
        catch(Exception ex)
        {      
            JOptionPane.showMessageDialog(this,"Error Occured during opening the report","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton105ActionPerformed

    private void jButton106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton106ActionPerformed
        Connection con;
        InputStream input;
        JasperDesign jd;
        JasperReport jr=null;
        JasperPrint jp;
        OutputStream output;
        try
        {
            DriverManager.deregisterDriver(new org.postgresql.Driver());
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","hadi","123");
            if(Dark)
            {
                input = new FileInputStream(new File("ElectricDark.jrxml"));
            }
            else input = new FileInputStream(new File("ElectricLight.jrxml"));
            
            jd=JRXmlLoader.load(input);
            jr=JasperCompileManager.compileReport(jd);
            jp=JasperFillManager.fillReport(jr,null,con);
            JFrame frame = new JFrame("Electric Cars");
            frame.getContentPane().add(new JRViewer(jp));
            frame.pack();
            frame.setSize(1000,900);
            frame.setVisible(true);
            
            input.close();
            con.close();
        }
        catch(Exception ex)
        {      
            JOptionPane.showMessageDialog(this,"Error Occured during opening the report","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton106ActionPerformed

    private void jButton107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton107ActionPerformed
        Connection con;
        InputStream input;
        JasperDesign jd;
        JasperReport jr=null;
        JasperPrint jp;
        OutputStream output;
        try
        {
            DriverManager.deregisterDriver(new org.postgresql.Driver());
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","hadi","123");
            if(Dark)
            {
                input = new FileInputStream(new File("FueledDrak.jrxml"));
            }
            else input = new FileInputStream(new File("FueledLight.jrxml"));
            
            jd=JRXmlLoader.load(input);
            jr=JasperCompileManager.compileReport(jd);
            jp=JasperFillManager.fillReport(jr,null,con);
            JFrame frame = new JFrame("Fueled Cars");
            frame.getContentPane().add(new JRViewer(jp));
            frame.pack();
            frame.setSize(1000,900);
            frame.setVisible(true);
            
            input.close();
            con.close();
        }
        catch(Exception ex)
        {      
            JOptionPane.showMessageDialog(this,"Error Occured during opening the report","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton107ActionPerformed

    private void jButton108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton108ActionPerformed
                Connection con;
        InputStream input;
        JasperDesign jd;
        JasperReport jr=null;
        JasperPrint jp;
        OutputStream output;
        try
        {
            DriverManager.deregisterDriver(new org.postgresql.Driver());
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","hadi","123");
            if(Dark)
            {
            input = new FileInputStream(new File("ManagerDrak.jrxml"));
            }
            else input = new FileInputStream(new File("ManagerLight.jrxml"));
            jd=JRXmlLoader.load(input);
            jr=JasperCompileManager.compileReport(jd);
            jp=JasperFillManager.fillReport(jr,null,con);
            JFrame frame = new JFrame("Managers");
            frame.getContentPane().add(new JRViewer(jp));
            frame.pack();
            frame.setVisible(true);
            frame.setSize(1000,900);
            input.close();
            con.close();
        }
        catch(Exception ex)
        {      
            JOptionPane.showMessageDialog(this,"Error Occured during opening the report","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton108ActionPerformed

    private void jButton109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton109ActionPerformed
        
        Connection con;
        InputStream input;
        JasperDesign jd;
        JasperReport jr=null;
        JasperPrint jp;
        OutputStream output;
        try
        {
            DriverManager.deregisterDriver(new org.postgresql.Driver());
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","hadi","123");
            if(Dark)
            {
            input = new FileInputStream(new File("StaffDark.jrxml"));
            }
            else input = new FileInputStream(new File("StaffLight.jrxml"));
            jd=JRXmlLoader.load(input);
            jr=JasperCompileManager.compileReport(jd);
            jp=JasperFillManager.fillReport(jr,null,con);
            JFrame frame = new JFrame("Staff Members");
            frame.getContentPane().add(new JRViewer(jp));
            frame.pack();
            frame.setSize(1000,900);
            frame.setVisible(true);
            
            input.close();
            con.close();
        }
        catch(Exception ex)
        {      
            JOptionPane.showMessageDialog(this,"Error Occured during opening the report","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton109ActionPerformed

    private void jButton110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton110ActionPerformed
        
                Connection con;
        InputStream input;
        JasperDesign jd;
        JasperReport jr=null;
        JasperPrint jp;
        OutputStream output;
        try
        {
            DriverManager.deregisterDriver(new org.postgresql.Driver());
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","hadi","123");
            if(Dark)
            {
            input = new FileInputStream(new File("MainDark.jrxml"));
            }
            else input = new FileInputStream(new File("MainLight.jrxml"));

            jd=JRXmlLoader.load(input);
            jr=JasperCompileManager.compileReport(jd);
            jp=JasperFillManager.fillReport(jr,null,con);
            JFrame frame = new JFrame("Maintenance Locations");
            frame.getContentPane().add(new JRViewer(jp));
            frame.pack();
            frame.setSize(1000,900);
            frame.setVisible(true);
            
            input.close();
            con.close();
        }
        catch(Exception ex)
        {      
            JOptionPane.showMessageDialog(this,"Error Occured during opening the report","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton110ActionPerformed

    private void jButton111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton111ActionPerformed
        // glocations.jrxml
                        Connection con;
        InputStream input;
        JasperDesign jd;
        JasperReport jr=null;
        JasperPrint jp;
        OutputStream output;
        try
        {
            DriverManager.deregisterDriver(new org.postgresql.Driver());
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","hadi","123");
            if(Dark)
            {
            input = new FileInputStream(new File("GasDrak.jrxml"));
            }
            else input = new FileInputStream(new File("GasLight.jrxml"));
            jd=JRXmlLoader.load(input);
            jr=JasperCompileManager.compileReport(jd);
            jp=JasperFillManager.fillReport(jr,null,con);
            JFrame frame = new JFrame("Gas Station's Locations");
            frame.getContentPane().add(new JRViewer(jp));
            frame.pack();
            frame.setSize(1000,900);
            frame.setVisible(true);
            
            input.close();
            con.close();
        }
        catch(Exception ex)
        {      
            JOptionPane.showMessageDialog(this,"Error Occured during opening the report","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton111ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        Male=true;
        Female=false;
        this.jRadioButton6.setSelected(false);
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        Male=false;
        Female=true;
        this.jRadioButton5.setSelected(false);
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if(Light){ if (jTextField1.getText().equals("Enter Username")){
        jTextField1.setText("");
        jTextField1.setForeground(new Color(79,112,156));
        }}
        else if(Dark){
                if(jTextField1.getText().equals("Enter Username")){
        jTextField1.setText("");
        jTextField1.setForeground(new Color(244,253,255));
        }}
    }//GEN-LAST:event_jTextField1FocusGained

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
           if (Dark){//dark
          jButton1.setBackground(new Color( 24,23,22));//enter dark blue
         jButton1.setForeground(new Color(244,253,255));//white (dark)
         jButton1.setBorder(new LineBorder(new Color (215,215,215)));//gray border
     }
     else if(Light){//light
         jButton1.setBackground(new Color(239,239,239));//enter white
         jButton1.setForeground(new Color(79,112,156));//blue
         jButton1.setBorder(new LineBorder(new Color (0,0,0))); //black border
     }
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton112MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton112MouseEntered

        if (Dark){//dark
            jButton112.setBackground(new Color( 87,80,77));//enter orange
            jButton112.setForeground(new Color(244,253,255));//white (dark)
            jButton112.setBorder(new LineBorder(new Color (87,80,77)));//orange border
        }
        else if(Light){//light
            jButton112.setBackground(new Color(79,139,177));//enter blue
            jButton112.setForeground(new Color(248,246,240));//white
            jButton112.setBorder(new LineBorder(new Color (79,135,164)));//blue border
        }

    }//GEN-LAST:event_jButton112MouseEntered

    private void jButton112MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton112MouseExited

        if (Dark){//dark
            jButton112.setBackground(new Color( 69,63,61));//exit orange
            jButton112.setForeground(new Color(244,253,255));//white (dark)
            jButton112.setBorder(new LineBorder(new Color (87,80,77)));//orange border
        }
        else if(Light){//light
            jButton112.setBackground(new Color(79,112,156));//exit blue
            jButton112.setForeground(new Color(248,246,240));//white
            jButton112.setBorder(new LineBorder(new Color (79,135,164)));//blue border
        }
    }//GEN-LAST:event_jButton112MouseExited

    private void jButton112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton112ActionPerformed
        
        Dark=true;
        Light=false;

        Color thegray = new Color(69,63,61);
        Color thebrown = new Color(42,39,39);
        Color grayBorder = new Color(87,80,77);
        Color brownBorder = new Color(69,63,61);
        Color Fontwhite = new Color(244,253,255);
        Color noteBrown = new Color(87,80,77);
    
        //login page
        LoginPanel.setBackground(thegray);//blue
        jButton112.setBackground(thegray);//blue
        jButton112.setBorder(new LineBorder(grayBorder));//blue border
        jButton113.setBackground(thegray);//blue
        jButton113.setBorder(new LineBorder(grayBorder));//blue border
        jLabel69.setBackground(thegray);
        jButton1.setBackground(thebrown);//white
        jButton1.setForeground(Fontwhite);//theBlue font
        jButton1.setBorder(new LineBorder(brownBorder));//gray border
        ImageIcon icon1 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\icons8-username-48.png"); // Replace with the actual path to your icon
        jLabel166.setIcon(icon1);
        ImageIcon icon2 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\icons8-password-48.png"); // Replace with the actual path to your icon
        jLabel167.setIcon(icon2);
        jLabel165.setForeground(Fontwhite);
        jPanel45.setBackground(thebrown);//white
        jPasswordField1.setBackground(thebrown);//white
        jPasswordField1.setForeground(Fontwhite);//theBlue
        jTextField1.setForeground(Fontwhite);//theBlue
        jTextField1.setBackground(thebrown);//white
        jLabel71.setForeground(noteBrown);//theBlue
        jLabel10.setForeground(noteBrown);
        
        
        ////the first page
        jPanel2.setBackground(thegray);//blue
        ImageIcon icon3 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\t7seen.png"); // Replace with the actual path to your icon
        jLabel199.setIcon(icon3);
        jButton114.setBackground(thegray);//white
        jButton115.setBackground(thegray);//white
        jButton116.setBackground(thegray);//white
        jButton117.setBackground(thegray);//white
        jButton118.setBackground(thegray);//white
        
        
        //home page
        ImageIcon icon5 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\view.png"); // not fucking working for some fucknig reason
        ImageIcon icon6 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\plus.png"); // not fucking working for some fucknig reason
        ImageIcon icon7 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\edit.png"); // not fucking working for some fucknig reason
        
       this.jPanel14.setBackground(thegray);
       this.jButton119.setBackground(thegray);
       jButton119.setBorder(new LineBorder(grayBorder));
       this.tab4.setBackground(thebrown);
       
       this.jButton7.setBackground(thebrown);
       this.jButton7.setForeground(Fontwhite);
       jButton7.setBorder(new LineBorder(brownBorder));
       jButton7.setIcon(icon5);
       this.jButton6.setBackground(thebrown);
       this.jButton6.setForeground(Fontwhite);
       jButton6.setBorder(new LineBorder(brownBorder));
       jButton6.setIcon(icon6);
        this.jButton35.setBackground(thebrown);
        this.jButton35.setForeground(Fontwhite);
       jButton35.setBorder(new LineBorder(brownBorder));
       jButton35.setIcon(icon7);
       this.jButton73.setBackground(thebrown);
       this.jButton73.setForeground(Fontwhite);
       jButton73.setBorder(new LineBorder(brownBorder));
       
       this.jButton47.setBackground(thebrown);
       this.jButton47.setForeground(Fontwhite);
       jButton47.setBorder(new LineBorder(brownBorder));
       jButton47.setIcon(icon5);
        this.jButton46.setBackground(thebrown);
       this.jButton46.setForeground(Fontwhite);
       jButton46.setBorder(new LineBorder(brownBorder));
       jButton46.setIcon(icon6);
       this.jButton48.setBackground(thebrown);
       this.jButton48.setForeground(Fontwhite);
       jButton48.setBorder(new LineBorder(brownBorder));
       jButton48.setIcon(icon7);
       this.jButton95.setBackground(thebrown);
       this.jButton95.setForeground(Fontwhite);
       jButton95.setBorder(new LineBorder(brownBorder));
       
        this.jButton39.setBackground(thebrown);
        this.jButton39.setForeground(Fontwhite);
        jButton39.setIcon(icon5);
       jButton39.setBorder(new LineBorder(brownBorder));
       this.jButton38.setBackground(thebrown);
       this.jButton38.setForeground(Fontwhite);
       jButton38.setIcon(icon6);
       jButton38.setBorder(new LineBorder(brownBorder));
       this.jButton51.setBackground(thebrown);
       this.jButton51.setForeground(Fontwhite);
       jButton51.setIcon(icon7);
       jButton51.setBorder(new LineBorder(brownBorder));
       this.jButton76.setBackground(thebrown);
       this.jButton76.setForeground(Fontwhite);
       jButton76.setBorder(new LineBorder(brownBorder));
       
       this.jButton4.setBackground(thebrown);
       this.jButton4.setForeground(Fontwhite);
       jButton4.setIcon(icon5);
       jButton4.setBorder(new LineBorder(brownBorder));
       this.jButton3.setBackground(thebrown);
       this.jButton3.setForeground(Fontwhite);
       jButton3.setIcon(icon6);
       jButton3.setBorder(new LineBorder(brownBorder));
       this.jButton34.setBackground(thebrown);
       this.jButton34.setForeground(Fontwhite);
       jButton34.setIcon(icon7);
       jButton34.setBorder(new LineBorder(brownBorder));
       
       this.jButton12.setBackground(thebrown);
       this.jButton12.setForeground(Fontwhite);
       jButton12.setIcon(icon5);
       jButton12.setBorder(new LineBorder(brownBorder));
       this.jButton11.setBackground(thebrown);
       this.jButton11.setForeground(Fontwhite);
       jButton11.setIcon(icon6);
       jButton11.setBorder(new LineBorder(brownBorder));
        this.jButton37.setBackground(thebrown);
        this.jButton37.setForeground(Fontwhite);
        jButton37.setIcon(icon7);
       jButton37.setBorder(new LineBorder(brownBorder));
       
       this.jButton10.setBackground(thebrown);
       this.jButton10.setForeground(Fontwhite);
       jButton10.setIcon(icon5);
       jButton10.setBorder(new LineBorder(brownBorder));
        this.jButton9.setBackground(thebrown);
        this.jButton9.setForeground(Fontwhite);
        jButton9.setIcon(icon6);
       jButton9.setBorder(new LineBorder(brownBorder));
       this.jButton36.setBackground(thebrown);
       this.jButton36.setForeground(Fontwhite);
       jButton36.setIcon(icon7);
       jButton36.setBorder(new LineBorder(brownBorder));
       
       ImageIcon icon4 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\Car.png"); // not fucking working for some fucknig reason
       jLabel13.setIcon(icon4);
       jLabel13.setForeground(Fontwhite);
       ImageIcon icon8 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\icons8-gas-station-48.png"); // not fucking working for some fucknig reason
       jLabel89.setIcon(icon8);
       jLabel89.setForeground(Fontwhite);
       ImageIcon icon9 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\taxi-sign.png"); // not fucking working for some fucknig reason
       jLabel78.setIcon(icon9);
       jLabel78.setForeground(Fontwhite);
       ImageIcon icon10 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\employees.png"); // not fucking working for some fucknig reason
       jLabel12.setIcon(icon10);
       jLabel12.setForeground(Fontwhite);
       ImageIcon icon11 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\insurance-company.png"); // not fucking working for some fucknig reason
       jLabel14.setIcon(icon11);
       jLabel14.setForeground(Fontwhite);
       ImageIcon icon12 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\maintenance.png"); // not fucking working for some fucknig reason
       jLabel15.setIcon(icon12);
       jLabel15.setForeground(Fontwhite);
       
       
       //for get password page
       this.forgotpassword.setBackground(thebrown);
       this.jPanel24.setBackground(thegray);
       this.jButton130.setBackground(thegray);
       jButton130.setBorder(new LineBorder(grayBorder));
       this.jLabel72.setForeground(Fontwhite);
       this.jLabel75.setForeground(Fontwhite);
       this.jLabel76.setForeground(Fontwhite);
       this.jLabel74.setForeground(noteBrown);
       this.jLabel77.setForeground(noteBrown);
       this.jButton32.setBackground(thebrown);
       this.jButton32.setForeground(Fontwhite);
       jButton32.setBorder(new LineBorder(brownBorder));
       jTextField27.setForeground(Fontwhite);//theBlue
       jTextField27.setBackground(thegray);//white
       jTextField27.setBorder(new LineBorder(grayBorder));
       jTextField28.setForeground(Fontwhite);//theBlue
       jTextField28.setBackground(thegray);//white
       jTextField28.setBorder(new LineBorder(grayBorder));
       jTextField29.setForeground(Fontwhite);//theBlue
       jTextField29.setBackground(thegray);//white
       jTextField29.setBorder(new LineBorder(grayBorder));
       
       
       //setting page
       this.Settings.setBackground(thebrown);
       this.jPanel23.setBackground(thegray); 
       this.jLabel68.setForeground(Fontwhite);
       this.jLabel70.setForeground(Fontwhite);
       this.jLabel69.setForeground(Fontwhite);
       this.jLabel203.setForeground(Fontwhite);
       this.jLabel204.setForeground(Fontwhite);
       this.jLabel205.setForeground(Fontwhite);
       this.jButton31.setBackground(thebrown);
       this.jButton31.setForeground(Fontwhite);
       jButton31.setBorder(new LineBorder(brownBorder));
       this.jButton30.setBackground(thebrown);
       this.jButton30.setForeground(Fontwhite);
       jButton30.setBorder(new LineBorder(brownBorder));
       this.jButton33.setBackground(thebrown);
       this.jButton33.setForeground(Fontwhite);
       jButton33.setBorder(new LineBorder(brownBorder));
       this.jButton45.setBackground(thebrown);
       this.jButton45.setForeground(Fontwhite);
       jButton45.setBorder(new LineBorder(brownBorder));
       this.jButton129.setBackground(thegray);
       jButton129.setBorder(new LineBorder(grayBorder));
       jTextField26.setForeground(Fontwhite);//theBlue
       jTextField26.setBackground(thegray);//white
       jTextField26.setBorder(new LineBorder(grayBorder));
       jTextField55.setForeground(Fontwhite);//theBlue
       jTextField55.setBackground(thegray);//white
       jTextField55.setBorder(new LineBorder(grayBorder));
       jTextField59.setForeground(Fontwhite);//theBlue
       jTextField59.setBackground(thegray);//white
       jTextField59.setBorder(new LineBorder(grayBorder));
       
       
       //feed back page
       this.FeedBack.setBackground(thebrown);
       this.jPanel22.setBackground(thegray);
       this.jButton128.setBackground(thegray);
       jButton128.setBorder(new LineBorder(grayBorder));
       this.jLabel50.setForeground(Fontwhite);
       this.jLabel51.setForeground(Fontwhite);
       this.jLabel52.setForeground(Fontwhite);
       this.jLabel53.setForeground(Fontwhite);
       this.jLabel54.setForeground(Fontwhite);
       this.jLabel55.setForeground(Fontwhite);
       this.jButton28.setBackground(thebrown);
       this.jButton28.setForeground(Fontwhite);
       jButton28.setBorder(new LineBorder(brownBorder));
       this.jTextArea5.setBackground(thebrown);
       this.jTextArea5.setForeground(Fontwhite);
       this.jTextArea5.setBorder(new LineBorder(grayBorder));
       
       
       //reprorts page
       this.Reports.setBackground(thebrown);
       this.jPanel44.setBackground(thegray);
       this.jButton144.setBackground(thegray);
       jButton144.setBorder(new LineBorder(grayBorder));
       
       this.jLabel153.setForeground(Fontwhite);
       this.jLabel154.setForeground(Fontwhite);
       this.jLabel155.setForeground(Fontwhite);
       this.jLabel156.setForeground(Fontwhite);
       this.jLabel157.setForeground(Fontwhite);
       this.jLabel158.setForeground(Fontwhite);
       this.jLabel159.setForeground(Fontwhite);
       this.jLabel161.setForeground(Fontwhite);
       this.jLabel162.setForeground(Fontwhite);
       this.jLabel163.setForeground(Fontwhite);
       this.jLabel164.setForeground(Fontwhite);
       
              this.jButton101.setBackground(thebrown);
              this.jButton101.setForeground(Fontwhite);
       jButton101.setBorder(new LineBorder(brownBorder));
       
              this.jButton102.setBackground(thebrown);
              this.jButton102.setForeground(Fontwhite);
       jButton102.setBorder(new LineBorder(brownBorder));
       
              this.jButton103.setBackground(thebrown);
              this.jButton103.setForeground(Fontwhite);
       jButton103.setBorder(new LineBorder(brownBorder));
       
              this.jButton104.setBackground(thebrown);
              this.jButton104.setForeground(Fontwhite);
       jButton104.setBorder(new LineBorder(brownBorder));
       
              this.jButton105.setBackground(thebrown);
              this.jButton105.setForeground(Fontwhite);
       jButton105.setBorder(new LineBorder(brownBorder));
       
              this.jButton106.setBackground(thebrown);
              this.jButton106.setForeground(Fontwhite);
       jButton106.setBorder(new LineBorder(brownBorder));
       
              this.jButton107.setBackground(thebrown);
              this.jButton107.setForeground(Fontwhite);
       jButton107.setBorder(new LineBorder(brownBorder));
       
              this.jButton108.setBackground(thebrown);
              this.jButton108.setForeground(Fontwhite);
       jButton108.setBorder(new LineBorder(brownBorder));
       
              this.jButton109.setBackground(thebrown);
              this.jButton109.setForeground(Fontwhite);
       jButton109.setBorder(new LineBorder(brownBorder));
       
              this.jButton110.setBackground(thebrown);
              this.jButton110.setForeground(Fontwhite);
       jButton110.setBorder(new LineBorder(brownBorder));
       
              this.jButton111.setBackground(thebrown);
              this.jButton111.setForeground(Fontwhite);
       jButton111.setBorder(new LineBorder(brownBorder));
       
       
       //employees view
       empview.setBackground(thebrown);
       jPanel15.setBackground(thegray);
       this.jButton121.setBackground(thegray);
       jButton121.setBorder(new LineBorder(grayBorder));
       this.jTable1.setBackground(thegray);
       this.jTable1.setForeground(Fontwhite);
       jButton15.setBackground(thebrown);//white
       jButton15.setForeground(Fontwhite);//theBlue 
       jButton15.setBorder(new LineBorder(brownBorder));
       
       
       //car view
       carview.setBackground(thebrown);
       jPanel17.setBackground(thegray);
       this.jButton123.setBackground(thegray);
       jButton123.setBorder(new LineBorder(grayBorder));
       this.jTable2.setBackground(thegray);
       this.jTable2.setForeground(Fontwhite);
       jButton17.setBackground(thebrown);//white
       jButton17.setForeground(Fontwhite);//theBlue 
       jButton17.setBorder(new LineBorder(brownBorder));
       this.jLabel24.setForeground(noteBrown);
       this.jLabel25.setForeground(noteBrown);
       this.jLabel26.setForeground(noteBrown);
       this.jLabel27.setForeground(noteBrown);
       
       
       //inshurance view
       insuranceview.setBackground(thebrown);
       jPanel19.setBackground(thegray);
       this.jButton125.setBackground(thegray);
       jButton125.setBorder(new LineBorder(grayBorder));
       this.jTable3.setBackground(thegray);
       this.jTable3.setForeground(Fontwhite);
       this.jButton22.setBackground(thebrown);
       jButton22.setForeground(Fontwhite);//theBlue 
       jButton22.setBorder(new LineBorder(brownBorder));
       
       
       //maitenance view
        maintenanceview.setBackground(thebrown);
       jPanel21.setBackground(thegray);
       this.jButton127.setBackground(thegray);
       jButton127.setBorder(new LineBorder(grayBorder));
       this.jTable4.setBackground(thegray);
        this.jTable4.setForeground(Fontwhite);
       this.jButton26.setBackground(thebrown);
       jButton26.setForeground(Fontwhite);//theBlue 
       jButton26.setBorder(new LineBorder(brownBorder));
       
       
       //taxi view
       Taxiview.setBackground(thebrown);
       jPanel28.setBackground(thegray);
       this.jButton132.setBackground(thegray);
       jButton132.setBorder(new LineBorder(grayBorder));
       this.jTable5.setBackground(thegray);
       this.jTable5.setForeground(Fontwhite);
       this.jButton40.setBackground(thebrown);
       jButton40.setForeground(Fontwhite);//theBlue 
       jButton40.setBorder(new LineBorder(brownBorder));
       
       
       //gas station view
       Gasview.setBackground(thebrown);
       jPanel25.setBackground(thegray);
       this.jButton134.setBackground(thegray);
       jButton134.setBorder(new LineBorder(grayBorder));
       this.jTable6.setBackground(thegray);
       this.jTable6.setForeground(Fontwhite);
       this.jButton54.setBackground(thebrown);
       jButton54.setForeground(Fontwhite);//theBlue 
       jButton54.setBorder(new LineBorder(brownBorder));
       
       
       //coupon page
       this.Couponadd.setBackground(thebrown);
       this.jPanel43.setBackground(thegray);
       this.jButton143.setBackground(thegray);
       jButton143.setBorder(new LineBorder(grayBorder));
       
       this.jButton97.setBackground(thebrown);
       jButton97.setForeground(Fontwhite);//theBlue 
       jButton97.setBorder(new LineBorder(brownBorder));
       this.jButton98.setBackground(thebrown);
       jButton98.setForeground(Fontwhite);//theBlue 
       jButton98.setBorder(new LineBorder(brownBorder));
       this.jButton99.setBackground(thebrown);
       jButton99.setForeground(Fontwhite);//theBlue 
       jButton99.setBorder(new LineBorder(brownBorder));
       this.jLabel150.setForeground(Fontwhite);
       this.jLabel151.setForeground(Fontwhite);
       this.jLabel152.setForeground(Fontwhite);
       this.jLabel197.setForeground(noteBrown);
       jTextField64.setForeground(Fontwhite);//theBlue
       jTextField64.setBackground(thegray);//white
       jTextField64.setBorder(new LineBorder(grayBorder));
       jTextField83.setForeground(Fontwhite);//theBlue
       jTextField83.setBackground(thegray);//white
       jTextField83.setBorder(new LineBorder(grayBorder));
       jTextField84.setForeground(Fontwhite);//theBlue
       jTextField84.setBackground(thegray);//white
       jTextField84.setBorder(new LineBorder(grayBorder));
       
       
       //reserve taxi page
       this.Reserveataxi.setBackground(thebrown);
       this.jPanel40.setBackground(thegray);
       this.jButton142.setBackground(thegray);
       jButton142.setBorder(new LineBorder(grayBorder));
       
       this.jButton78.setBackground(thebrown);
       jButton78.setForeground(Fontwhite);//theBlue 
       jButton78.setBorder(new LineBorder(brownBorder));
       this.jButton79.setBackground(thebrown);
       jButton79.setForeground(Fontwhite);//theBlue 
       jButton79.setBorder(new LineBorder(brownBorder));
       this.jButton80.setBackground(thebrown);
       jButton80.setForeground(Fontwhite);//theBlue 
       jButton80.setBorder(new LineBorder(brownBorder));
       this.jLabel143.setForeground(Fontwhite);
       this.jLabel145.setForeground(Fontwhite);
       this.jLabel194.setForeground(noteBrown);
       jTextField81.setForeground(Fontwhite);//theBlue
       jTextField81.setBackground(thegray);//white
       jTextField81.setBorder(new LineBorder(grayBorder));
       jTextField82.setForeground(Fontwhite);//theBlue
       jTextField82.setBackground(thegray);//white
       jTextField82.setBorder(new LineBorder(grayBorder));
       
       
       //reserve a car page
       this.Reserveacar.setBackground(thebrown);
       this.jPanel38.setBackground(thegray);
       this.jButton141.setBackground(thegray);
       jButton141.setBorder(new LineBorder(grayBorder));
       this.jButton74.setBackground(thebrown);
       jButton74.setForeground(Fontwhite);//theBlue 
       jButton74.setBorder(new LineBorder(brownBorder));
       this.jButton75.setBackground(thebrown);
       jButton75.setForeground(Fontwhite);//theBlue 
       jButton75.setBorder(new LineBorder(brownBorder));
       this.jButton81.setBackground(thebrown);
       jButton81.setForeground(Fontwhite);//theBlue 
       jButton81.setBorder(new LineBorder(brownBorder));
       this.jLabel140.setForeground(Fontwhite);
       this.jLabel142.setForeground(Fontwhite);
       this.jLabel193.setForeground(noteBrown);
       jTextField79.setForeground(Fontwhite);//theBlue
       jTextField79.setBackground(thegray);//white
       jTextField79.setBorder(new LineBorder(grayBorder));
       jTextField80.setForeground(Fontwhite);//theBlue
       jTextField80.setBackground(thegray);//white
       jTextField80.setBorder(new LineBorder(grayBorder));
       
       
       //taxi edit page
       this.Taxiedit.setBackground(thebrown);
       this.jPanel36.setBackground(thegray);
       this.jButton140.setBackground(thegray);
       jButton140.setBorder(new LineBorder(grayBorder));
       this.jButton70.setBackground(thebrown);
       jButton70.setForeground(Fontwhite);//theBlue 
       jButton70.setBorder(new LineBorder(brownBorder));
       this.jButton71.setBackground(thebrown);
       jButton71.setForeground(Fontwhite);//theBlue 
       jButton71.setBorder(new LineBorder(brownBorder));
       this.jButton93.setBackground(thebrown);
       jButton93.setForeground(Fontwhite);//theBlue 
       jButton93.setBorder(new LineBorder(brownBorder));
       this.jButton94.setBackground(thebrown);
       jButton94.setForeground(Fontwhite);//theBlue 
       jButton94.setBorder(new LineBorder(brownBorder));
       this.jLabel130.setForeground(Fontwhite);
       this.jLabel138.setForeground(Fontwhite);
       this.jLabel148.setForeground(Fontwhite);
       this.jLabel147.setForeground(Fontwhite);
       this.jLabel191.setForeground(noteBrown);
       jTextField72.setForeground(Fontwhite);//theBlue
       jTextField72.setBackground(thegray);//white
       jTextField72.setBorder(new LineBorder(grayBorder));
       jTextField73.setForeground(Fontwhite);//theBlue
       jTextField73.setBackground(thegray);//white
       jTextField73.setBorder(new LineBorder(grayBorder));
       jTextField74.setForeground(Fontwhite);//theBlue
       jTextField74.setBackground(thegray);//white
       jTextField74.setBorder(new LineBorder(grayBorder));
       jTextField78.setForeground(Fontwhite);//theBlue
       jTextField78.setBackground(thegray);//white
       jTextField78.setBorder(new LineBorder(grayBorder));
       
       
       //gas station edit page
       this.gasstationedit.setBackground(thebrown);
       this.jPanel35.setBackground(thegray);
       this.jButton139.setBackground(thegray);
       jButton139.setBorder(new LineBorder(grayBorder));
       jButton67.setBackground(thebrown);
       jButton67.setForeground(Fontwhite);//theBlue 
       jButton67.setBorder(new LineBorder(brownBorder));
       jButton68.setBackground(thebrown);
       jButton68.setForeground(Fontwhite);//theBlue 
       jButton68.setBorder(new LineBorder(brownBorder));
       jButton92.setBackground(thebrown);
       jButton92.setForeground(Fontwhite);//theBlue 
       jButton92.setBorder(new LineBorder(brownBorder));
       jButton91.setBackground(thebrown);
       jButton91.setForeground(Fontwhite);//theBlue 
       jButton91.setBorder(new LineBorder(brownBorder));
       this.jLabel131.setForeground(Fontwhite);
       this.jLabel124.setForeground(Fontwhite);
       this.jLabel136.setForeground(Fontwhite);
       this.jLabel189.setForeground(noteBrown);
       jTextField77.setForeground(Fontwhite);//theBlue
       jTextField77.setBackground(thegray);//white
       jTextField77.setBorder(new LineBorder(grayBorder));
       jTextField70.setForeground(Fontwhite);//theBlue
       jTextField70.setBackground(thegray);//white
       jTextField70.setBorder(new LineBorder(grayBorder));
       jTextField71.setForeground(Fontwhite);//theBlue
       jTextField71.setBackground(thegray);//white
       jTextField71.setBorder(new LineBorder(grayBorder));
       
       
       //car edit page
       this.caredit.setBackground(thebrown);
       this.jPanel34.setBackground(thegray);
       this.jButton138.setBackground(thegray);
       jButton138.setBorder(new LineBorder(grayBorder));
       jButton65.setBackground(thebrown);
       jButton65.setForeground(Fontwhite);//theBlue 
       jButton65.setBorder(new LineBorder(brownBorder));
       jButton64.setBackground(thebrown);
       jButton64.setForeground(Fontwhite);//theBlue 
       jButton64.setBorder(new LineBorder(brownBorder));
       jButton88.setBackground(thebrown);
       jButton88.setForeground(Fontwhite);//theBlue 
       jButton88.setBorder(new LineBorder(brownBorder));
       jButton90.setBackground(thebrown);
       jButton90.setForeground(Fontwhite);//theBlue 
       jButton90.setBorder(new LineBorder(brownBorder));
       this.jLabel134.setForeground(Fontwhite);
       this.jLabel122.setForeground(Fontwhite);
       this.jLabel123.setForeground(Fontwhite);
       this.jLabel126.setForeground(Fontwhite);
       this.jLabel127.setForeground(Fontwhite);
       this.jLabel128.setForeground(Fontwhite);
       this.jLabel129.setForeground(Fontwhite);
       this.jLabel184.setForeground(Fontwhite);
       this.jLabel115.setForeground(Fontwhite);
       this.jLabel117.setForeground(Fontwhite);
       this.jLabel184.setForeground(noteBrown);
       jTextField76.setForeground(Fontwhite);//theBlue
       jTextField76.setBackground(thegray);//white
       jTextField76.setBorder(new LineBorder(grayBorder));
       jTextField56.setForeground(Fontwhite);//theBlue
       jTextField56.setBackground(thegray);//white
       jTextField56.setBorder(new LineBorder(grayBorder));
       jTextField62.setForeground(Fontwhite);//theBlue
       jTextField62.setBackground(thegray);//white
       jTextField62.setBorder(new LineBorder(grayBorder));
       jTextField65.setForeground(Fontwhite);//theBlue
       jTextField65.setBackground(thegray);//white
       jTextField65.setBorder(new LineBorder(grayBorder));
       jTextField70.setForeground(Fontwhite);//theBlue
       jTextField70.setBackground(thegray);//white
       jTextField70.setBorder(new LineBorder(grayBorder));
       jTextField66.setForeground(Fontwhite);//theBlue
       jTextField66.setBackground(thegray);//white
       jTextField66.setBorder(new LineBorder(grayBorder));
       jTextField67.setForeground(Fontwhite);//theBlue
       jTextField67.setBackground(thegray);//white
       jTextField67.setBorder(new LineBorder(grayBorder));
       jTextField68.setForeground(Fontwhite);//theBlue
       jTextField68.setBackground(thegray);//white
       jTextField68.setBorder(new LineBorder(grayBorder));
       jTextField69.setForeground(Fontwhite);//theBlue
       jTextField69.setBackground(thegray);//white
       jTextField69.setBorder(new LineBorder(grayBorder));
       jTextField52.setForeground(Fontwhite);//theBlue
       jTextField52.setBackground(thegray);//white
       jTextField52.setBorder(new LineBorder(grayBorder));
       
       
       //maintaince edit page
       this.maintenanceedit.setBackground(thebrown);
       this.jPanel33.setBackground(thegray);
       this.jButton137.setBackground(thegray);
       jButton137.setBorder(new LineBorder(grayBorder));
       this.jLabel132.setForeground(Fontwhite);
       this.jLabel112.setForeground(Fontwhite);
       this.jLabel116.setForeground(Fontwhite);
       this.jLabel186.setForeground(noteBrown);
       jButton56.setBackground(thebrown);
       jButton56.setForeground(Fontwhite);//theBlue 
       jButton56.setBorder(new LineBorder(brownBorder));
       jButton62.setBackground(thebrown);
       jButton62.setForeground(Fontwhite);//theBlue 
       jButton62.setBorder(new LineBorder(brownBorder));
       jButton87.setBackground(thebrown);
       jButton87.setForeground(Fontwhite);//theBlue 
       jButton87.setBorder(new LineBorder(brownBorder));
       jButton89.setBackground(thebrown);
       jButton89.setForeground(Fontwhite);//theBlue 
       jButton89.setBorder(new LineBorder(brownBorder));
       jTextField57.setForeground(Fontwhite);//theBlue
       jTextField57.setBackground(thegray);//white
       jTextField57.setBorder(new LineBorder(grayBorder));
       jTextField58.setForeground(Fontwhite);//theBlue
       jTextField58.setBackground(thegray);//white
       jTextField58.setBorder(new LineBorder(grayBorder));
       jTextField75.setForeground(Fontwhite);//theBlue
       jTextField75.setBackground(thegray);//white
       jTextField75.setBorder(new LineBorder(grayBorder));
       
       
       //insurance edit page
       this.insuranceedit.setBackground(thebrown);
       this.jPanel32.setBackground(thegray);
       this.jButton136.setBackground(thegray);
       jButton136.setBorder(new LineBorder(grayBorder));
       jButton59.setBackground(thebrown);
       jButton59.setForeground(Fontwhite);//theBlue 
       jButton59.setBorder(new LineBorder(brownBorder));
       jButton60.setBackground(thebrown);
       jButton60.setForeground(Fontwhite);//theBlue 
       jButton60.setBorder(new LineBorder(brownBorder));
       jButton84.setBackground(thebrown);
       jButton84.setForeground(Fontwhite);//theBlue 
       jButton84.setBorder(new LineBorder(brownBorder));
       jButton85.setBackground(thebrown);
       jButton85.setForeground(Fontwhite);//theBlue 
       jButton85.setBorder(new LineBorder(brownBorder));
       this.jLabel120.setForeground(Fontwhite);
       this.jLabel113.setForeground(Fontwhite);
       this.jLabel109.setForeground(Fontwhite);
       this.jLabel106.setForeground(Fontwhite);
       this.jLabel187.setForeground(noteBrown);
       jTextField63.setForeground(Fontwhite);//theBlue
       jTextField63.setBackground(thegray);//white
       jTextField63.setBorder(new LineBorder(grayBorder));
       jTextField53.setForeground(Fontwhite);//theBlue
       jTextField53.setBackground(thegray);//white
       jTextField53.setBorder(new LineBorder(grayBorder));
       jTextField51.setForeground(Fontwhite);//theBlue
       jTextField51.setBackground(thegray);//white
       jTextField51.setBorder(new LineBorder(grayBorder));
       jTextField47.setForeground(Fontwhite);//theBlue
       jTextField47.setBackground(thegray);//white
       jTextField47.setBorder(new LineBorder(grayBorder));
       
      
       //emplooye edit page
       this.empedit.setBackground(thebrown);
       this.jPanel31.setBackground(thegray);
       this.jButton135.setBackground(thegray);
       jButton135.setBorder(new LineBorder(grayBorder));
       jButton86.setBackground(thebrown);
       jButton86.setForeground(Fontwhite);//theBlue 
       jButton86.setBorder(new LineBorder(brownBorder));
       jButton57.setBackground(thebrown);
       jButton57.setForeground(Fontwhite);//theBlue 
       jButton57.setBorder(new LineBorder(brownBorder));
       jButton82.setBackground(thebrown);
       jButton82.setForeground(Fontwhite);//theBlue 
       jButton82.setBorder(new LineBorder(brownBorder));
       jButton83.setBackground(thebrown);
       jButton83.setForeground(Fontwhite);//theBlue 
       jButton83.setBorder(new LineBorder(brownBorder));
       jComboBox1.setBackground(thebrown);
       jComboBox1.setForeground(Fontwhite);
       jRadioButton7.setForeground(Fontwhite);
       jRadioButton8.setForeground(Fontwhite);
       jRadioButton7.setBackground(thebrown);
       jRadioButton8.setBackground(thebrown);
       this.jLabel105.setForeground(Fontwhite);
       this.jLabel107.setForeground(Fontwhite);
       this.jLabel108.setForeground(Fontwhite);
       this.jLabel110.setForeground(Fontwhite);
       this.jLabel114.setForeground(Fontwhite);
       this.jLabel118.setForeground(Fontwhite);
       this.jLabel119.setForeground(Fontwhite);
       this.jLabel200.setForeground(Fontwhite);
       this.jLabel121.setForeground(Fontwhite);
       this.jLabel201.setForeground(Fontwhite);
       this.jLabel202.setForeground(Fontwhite);
       this.jLabel181.setForeground(noteBrown);
       jTextField49.setForeground(Fontwhite);//theBlue
       jTextField49.setBackground(thegray);//white
       jTextField49.setBorder(new LineBorder(grayBorder));
       jTextField61.setForeground(Fontwhite);//theBlue
       jTextField61.setBackground(thegray);//white
       jTextField61.setBorder(new LineBorder(grayBorder));
       jTextField48.setForeground(Fontwhite);//theBlue
       jTextField48.setBackground(thegray);//white
       jTextField48.setBorder(new LineBorder(grayBorder));
       jTextField50.setForeground(Fontwhite);//theBlue
       jTextField50.setBackground(thegray);//white
       jTextField50.setBorder(new LineBorder(grayBorder));
       jTextField54.setForeground(Fontwhite);//theBlue
       jTextField54.setBackground(thegray);//white
       jTextField54.setBorder(new LineBorder(grayBorder));
       jTextField60.setForeground(Fontwhite);//theBlue
       jTextField60.setBackground(thegray);//white
       jTextField60.setBorder(new LineBorder(grayBorder));
       jTextField86.setForeground(Fontwhite);//theBlue
       jTextField86.setBackground(thegray);//white
       jTextField86.setBorder(new LineBorder(grayBorder));
       jTextField88.setForeground(Fontwhite);//theBlue
       jTextField88.setBackground(thegray);//white
       jTextField88.setBorder(new LineBorder(grayBorder));
       jTextField85.setForeground(Fontwhite);//theBlue
       jTextField85.setBackground(thegray);//white
       jTextField85.setBorder(new LineBorder(grayBorder));
       jTextField87.setForeground(Fontwhite);//theBlue
       jTextField87.setBackground(thegray);//white
       jTextField87.setBorder(new LineBorder(grayBorder));
       
       
       //gas station add page
       this.Gasadd.setBackground(thebrown);
       this.jPanel30.setBackground(thegray);
       this.jButton133.setBackground(thegray);
       jButton133.setBorder(new LineBorder(grayBorder));
       jButton50.setBackground(thebrown);
       jButton50.setForeground(Fontwhite);//theBlue 
       jButton50.setBorder(new LineBorder(brownBorder));
       jButton52.setBackground(thebrown);
       jButton52.setForeground(Fontwhite);//theBlue 
       jButton52.setBorder(new LineBorder(brownBorder));
       jButton43.setBackground(thebrown);
       jButton43.setForeground(Fontwhite);//theBlue 
       jButton43.setBorder(new LineBorder(brownBorder));
       this.jLabel97.setForeground(Fontwhite);
       this.jLabel98.setForeground(Fontwhite);
       this.jLabel100.setForeground(Fontwhite);
       this.jLabel101.setForeground(Fontwhite);
       this.jLabel176.setForeground(noteBrown);
       this.jLabel177.setForeground(noteBrown);
       jTextField43.setForeground(Fontwhite);//theBlue
       jTextField43.setBackground(thegray);//white
       jTextField43.setBorder(new LineBorder(grayBorder));
       jTextField44.setForeground(Fontwhite);//theBlue
       jTextField44.setBackground(thegray);//white
       jTextField44.setBorder(new LineBorder(grayBorder));
       jTextField45.setForeground(Fontwhite);//theBlue
       jTextField45.setBackground(thegray);//white
       jTextField45.setBorder(new LineBorder(grayBorder));
       jTextField46.setForeground(Fontwhite);//theBlue
       jTextField46.setBackground(thegray);//white
       jTextField46.setBorder(new LineBorder(grayBorder));
       
       
       //taxi add page
       this.Taxiadd.setBackground(thebrown);
       this.jPanel26.setBackground(thegray);
       this.jButton131.setBackground(thegray);
       jButton131.setBorder(new LineBorder(grayBorder));
       this.jButton44.setBackground(thebrown);
       jButton44.setForeground(Fontwhite);//theBlue 
       jButton44.setBorder(new LineBorder(brownBorder));
       this.jLabel91.setForeground(Fontwhite);
       this.jLabel92.setForeground(Fontwhite);
       this.jLabel93.setForeground(Fontwhite);
       this.jLabel90.setForeground(Fontwhite);
       this.jLabel173.setForeground(noteBrown);
       jTextField39.setForeground(Fontwhite);//theBlue
       jTextField39.setBackground(thegray);//white
       jTextField39.setBorder(new LineBorder(grayBorder));
       jTextField40.setForeground(Fontwhite);//theBlue
       jTextField40.setBackground(thegray);//white
       jTextField40.setBorder(new LineBorder(grayBorder));
       jTextField41.setForeground(Fontwhite);//theBlue
       jTextField41.setBackground(thegray);//white
       jTextField41.setBorder(new LineBorder(grayBorder));
       jTextField42.setForeground(Fontwhite);//theBlue
       jTextField42.setBackground(thegray);//white
       jTextField42.setBorder(new LineBorder(grayBorder));
       
       
       //maintaince add page
       this.maintenanceadd.setBackground(thebrown);
       this.jPanel20.setBackground(thegray);
       this.jButton126.setBackground(thegray);
       jButton126.setBorder(new LineBorder(grayBorder));
       this.jButton24.setBackground(thebrown);
       jButton24.setForeground(Fontwhite);//theBlue 
       jButton24.setBorder(new LineBorder(brownBorder));
       this.jButton42.setBackground(thebrown);
       jButton42.setForeground(Fontwhite);//theBlue 
       jButton42.setBorder(new LineBorder(brownBorder));
       this.jButton41.setBackground(thebrown);
       jButton41.setForeground(Fontwhite);//theBlue 
       jButton41.setBorder(new LineBorder(brownBorder));
       this.jLabel45.setForeground(Fontwhite);
       this.jLabel46.setForeground(Fontwhite);
       this.jLabel47.setForeground(Fontwhite);
       this.jLabel87.setForeground(Fontwhite);
       this.jLabel175.setForeground(noteBrown);
       this.jLabel49.setForeground(noteBrown);
       jTextField23.setForeground(Fontwhite);//theBlue
       jTextField23.setBackground(thegray);//white
       jTextField23.setBorder(new LineBorder(grayBorder));
       jTextField24.setForeground(Fontwhite);//theBlue
       jTextField24.setBackground(thegray);//white
       jTextField24.setBorder(new LineBorder(grayBorder));
       jTextField25.setForeground(Fontwhite);//theBlue
       jTextField25.setBackground(thegray);//white
       jTextField25.setBorder(new LineBorder(grayBorder));
       jTextField38.setForeground(Fontwhite);//theBlue
       jTextField38.setBackground(thegray);//white
       jTextField38.setBorder(new LineBorder(grayBorder));
       
       
       //inshurance add page
       this.insuranceadd.setBackground(thebrown);
       this.jPanel18.setBackground(thegray);
       this.jButton124.setBackground(thegray);
       jButton124.setBorder(new LineBorder(grayBorder));
       this.jButton20.setBackground(thebrown);
       jButton20.setForeground(Fontwhite);//theBlue 
       jButton20.setBorder(new LineBorder(brownBorder));
       this.jLabel41.setForeground(Fontwhite);
       this.jLabel42.setForeground(Fontwhite);
       this.jLabel43.setForeground(Fontwhite);
       this.jLabel44.setForeground(Fontwhite);
       this.jLabel48.setForeground(noteBrown);
       jTextField19.setForeground(Fontwhite);//theBlue
       jTextField19.setBackground(thegray);//white
       jTextField19.setBorder(new LineBorder(grayBorder));
       jTextField20.setForeground(Fontwhite);//theBlue
       jTextField20.setBackground(thegray);//white
       jTextField20.setBorder(new LineBorder(grayBorder));
       jTextField21.setForeground(Fontwhite);//theBlue
       jTextField21.setBackground(thegray);//white
       jTextField21.setBorder(new LineBorder(grayBorder));
       jTextField22.setForeground(Fontwhite);//theBlue
       jTextField22.setBackground(thegray);//white
       jTextField22.setBorder(new LineBorder(grayBorder));
       
       
       //car add page
       this.caradd.setBackground(thebrown);
       this.jPanel16.setBackground(thegray);
       this.jButton122.setBackground(thegray);
       jButton122.setBorder(new LineBorder(grayBorder));
       jButton18.setBackground(thebrown);
       jButton18.setForeground(Fontwhite);//theBlue 
       jButton18.setBorder(new LineBorder(brownBorder));
       this.jLabel28.setForeground(Fontwhite);
       this.jLabel29.setForeground(Fontwhite);
       this.jLabel30.setForeground(Fontwhite);
       this.jLabel31.setForeground(Fontwhite);
       this.jLabel32.setForeground(Fontwhite);
       this.jLabel33.setForeground(Fontwhite);
       this.jLabel34.setForeground(Fontwhite);
       this.jLabel35.setForeground(Fontwhite);
       this.jLabel36.setForeground(Fontwhite);
       this.jLabel40.setForeground(noteBrown);
       this.jLabel85.setForeground(Fontwhite);
       this.jLabel86.setForeground(Fontwhite);
       this. jCheckBox6.setForeground(Fontwhite);
       jCheckBox6.setBackground(thebrown);
       this. jCheckBox5.setForeground(Fontwhite);
       jCheckBox5.setBackground(thebrown);
       jTextField10.setForeground(Fontwhite);//theBlue
       jTextField10.setBackground(thegray);//white
       jTextField10.setBorder(new LineBorder(brownBorder));
       jTextField11.setForeground(Fontwhite);//theBlue
       jTextField11.setBackground(thegray);//white
       jTextField11.setBorder(new LineBorder(brownBorder));
       jTextField12.setForeground(Fontwhite);//theBlue
       jTextField12.setBackground(thegray);//white
       jTextField12.setBorder(new LineBorder(brownBorder));
       jTextField13.setForeground(Fontwhite);//theBlue
       jTextField13.setBackground(thegray);//white
       jTextField13.setBorder(new LineBorder(brownBorder));
       jTextField14.setForeground(Fontwhite);//theBlue
       jTextField14.setBackground(thegray);//white
       jTextField14.setBorder(new LineBorder(brownBorder));
       jTextField15.setForeground(Fontwhite);//theBlue
       jTextField15.setBackground(thegray);//white
       jTextField15.setBorder(new LineBorder(brownBorder));
       jTextField16.setForeground(Fontwhite);//theBlue
       jTextField16.setBackground(thegray);//white
       jTextField16.setBorder(new LineBorder(brownBorder));
       jTextField17.setForeground(Fontwhite);//theBlue
       jTextField17.setBackground(thegray);//white
       jTextField17.setBorder(new LineBorder(brownBorder));
       jTextField18.setForeground(Fontwhite);//theBlue
       jTextField18.setBackground(thegray);//white
       jTextField18.setBorder(new LineBorder(brownBorder));
       jTextField36.setForeground(Fontwhite);//theBlue
       jTextField36.setBackground(thegray);//white
       jTextField36.setBorder(new LineBorder(brownBorder));
       jTextField37.setForeground(Fontwhite);//theBlue
       jTextField37.setBackground(thegray);//white
       jTextField37.setBorder(new LineBorder(brownBorder));
       
       
       //employee add page
       this.empadd.setBackground(thebrown);
       this.jPanel13.setBackground(thegray);
       this.jPanel1.setBackground(thebrown);
       this.jPanel3.setBackground(thebrown);
       this.jButton120.setBackground(thegray);
       jButton120.setBorder(new LineBorder(grayBorder));
       jButton14.setBackground(thebrown);
       jButton14.setForeground(Fontwhite);//theBlue 
       jButton14.setBorder(new LineBorder(brownBorder));
       this.jLabel16.setForeground(Fontwhite);
       this.jLabel17.setForeground(Fontwhite);
       this.jLabel18.setForeground(Fontwhite);
       this.jLabel19.setForeground(Fontwhite);
       this.jLabel20.setForeground(Fontwhite);
       this.jLabel21.setForeground(Fontwhite);
       this.jLabel22.setForeground(Fontwhite);
       this.jLabel6.setForeground(noteBrown);
       this.jLabel79.setForeground(Fontwhite);
       this.jLabel80.setForeground(Fontwhite);
       this.jLabel81.setForeground(Fontwhite);
       this.jLabel82.setForeground(Fontwhite);
       this.jLabel83.setForeground(Fontwhite);
       this.jLabel84.setForeground(Fontwhite);
       this. jRadioButton5.setForeground(Fontwhite);
       jRadioButton5.setBackground(thebrown);
       this. jRadioButton6.setForeground(Fontwhite);
       jRadioButton6.setBackground(thebrown);
       this. jCheckBox1.setForeground(Fontwhite);
       jCheckBox1.setBackground(thebrown);
       this. jCheckBox2.setForeground(Fontwhite);
       jCheckBox2.setBackground(thebrown);
       this. jCheckBox3.setForeground(Fontwhite);
       jCheckBox3.setBackground(thebrown);
       this. jCheckBox4.setForeground(Fontwhite);
       jCheckBox4.setBackground(thebrown);
       jTextField3.setForeground(Fontwhite);//theBlue
       jTextField3.setBackground(thegray);//white
       jTextField3.setBorder(new LineBorder(grayBorder));
       jTextField4.setForeground(Fontwhite);//theBlue
       jTextField4.setBackground(thegray);//white
       jTextField4.setBorder(new LineBorder(grayBorder));
       jTextField5.setForeground(Fontwhite);//theBlue
       jTextField5.setBackground(thegray);//white
       jTextField5.setBorder(new LineBorder(grayBorder));
       jTextField6.setForeground(Fontwhite);//theBlue
       jTextField6.setBackground(thegray);//white
       jTextField6.setBorder(new LineBorder(grayBorder));
       jTextField9.setForeground(Fontwhite);//theBlue
       jTextField9.setBackground(thegray);//white
       jTextField9.setBorder(new LineBorder(grayBorder));
       jTextField2.setForeground(Fontwhite);//theBlue
       jTextField2.setBackground(thegray);//white
       jTextField2.setBorder(new LineBorder(grayBorder));
       jTextField30.setForeground(Fontwhite);//theBlue
       jTextField30.setBackground(thegray);//white
       jTextField30.setBorder(new LineBorder(grayBorder));
       jTextField31.setForeground(Fontwhite);//theBlue
       jTextField31.setBackground(thegray);//white
       jTextField31.setBorder(new LineBorder(grayBorder));
       jTextField32.setForeground(Fontwhite);//theBlue
       jTextField32.setBackground(thegray);//white
       jTextField32.setBorder(new LineBorder(grayBorder));
       jTextField33.setForeground(Fontwhite);//theBlue
       jTextField33.setBackground(thegray);//white
       jTextField33.setBorder(new LineBorder(grayBorder));
       jTextField34.setForeground(Fontwhite);//theBlue
       jTextField34.setBackground(thegray);//white
       jTextField34.setBorder(new LineBorder(grayBorder));
       jTextField35.setForeground(Fontwhite);//theBlue
       jTextField35.setBackground(thegray);//white
       jTextField35.setBorder(new LineBorder(grayBorder));
       jDateChooser1.setForeground(Fontwhite);//theBlue
       jDateChooser1.setBackground(thegray);//white
       jDateChooser1.setBorder(new LineBorder(grayBorder));
    }//GEN-LAST:event_jButton112ActionPerformed

    private void jButton113MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton113MouseEntered
        if (Dark){//dark
            jButton113.setBackground(new Color( 87,80,77));//enter orange
            jButton113.setForeground(new Color(244,253,255));//white (dark)
            jButton113.setBorder(new LineBorder(new Color (87,80,77)));//orange border
        }
        else if(Light){//light
            jButton113.setBackground(new Color(79,139,177));//enter blue
            jButton113.setForeground(new Color(248,246,240));//white
            jButton113.setBorder(new LineBorder(new Color (79,135,164)));//blue border
        }
    }//GEN-LAST:event_jButton113MouseEntered

    private void jButton113MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton113MouseExited
        if (Dark){//dark
            jButton113.setBackground(new Color( 69,63,61));//exit orange
            jButton113.setForeground(new Color(244,253,255));//white (dark)
            jButton113.setBorder(new LineBorder(new Color (87,80,77)));//orange border
        }
        else if(Light){//light
            jButton113.setBackground(new Color(79,112,156));//exit blue
            jButton113.setForeground(new Color(248,246,240));//white
            jButton113.setBorder(new LineBorder(new Color (79,135,164)));//blue border
        }
    }//GEN-LAST:event_jButton113MouseExited

    private void jButton113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton113ActionPerformed
       
        Light =true;
        Dark=false;
        
        Color theBlue = new Color(79,112,156);
        Color theWhite = new Color(244,253,255);
        Color blueBorder = new Color(79,135,164);
        Color whiteBorder = new Color(189, 213, 231);
        Color theBlack = new Color(0,0,0);
    
        //login page
        LoginPanel.setBackground(theBlue);//blue
        jButton112.setBackground(theBlue);//blue
        jButton112.setBorder(new LineBorder(blueBorder));//blue border
        jButton113.setBackground(theBlue);//blue
        jButton113.setBorder(new LineBorder(blueBorder));//blue border
        jLabel69.setBackground(theWhite);//white
        jButton1.setBackground(theWhite);//white
        jButton1.setForeground(theBlue);//theBlue font
        jButton1.setBorder(new LineBorder(whiteBorder));//gray border
        ImageIcon icon1 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\icons8-username-48-1.png"); // Replace with the actual path to your icon
        jLabel166.setIcon(icon1);
        ImageIcon icon2 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\icons8-password-48-1.png"); // Replace with the actual path to your icon
        jLabel167.setIcon(icon2);
        jTextField1.setBackground(theWhite);//white
        jLabel165.setForeground(theBlue);//theBlue font
        jPanel45.setBackground(theWhite);//white
        jPasswordField1.setBackground(theWhite);//white
        jPasswordField1.setForeground(theBlue);//theBlue
        jTextField1.setForeground(theBlue);//theBlue
        jTextField1.setBackground(theWhite);//white
        jLabel71.setForeground(theBlue);//theBlue
        
        jPanel2.setBackground(theBlue);//blue
        ImageIcon icon3 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\t7seen-1.png"); // Replace with the actual path to your icon
        jLabel199.setIcon(icon3);
        jButton114.setBackground(theBlue);//white
        jButton115.setBackground(theBlue);//white
        jButton116.setBackground(theBlue);//white
        jButton117.setBackground(theBlue);//white
        jButton118.setBackground(theBlue);//white
        
        
        //home page
        ImageIcon icon5 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\view-1.png"); // not fucking working for some fucknig reason
        ImageIcon icon6 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\plus-1.png"); // not fucking working for some fucknig reason
        ImageIcon icon7 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\edit-1.png"); // not fucking working for some fucknig reason
        
       this.jPanel14.setBackground(theBlue);
       this.jButton119.setBackground(theBlue);
       jButton119.setBorder(new LineBorder(blueBorder));
       this.tab4.setBackground(theWhite);
       
       this.jButton7.setBackground(theWhite);
       this.jButton7.setForeground(theBlue);
       jButton7.setBorder(new LineBorder(whiteBorder));
       jButton7.setIcon(icon5);
       this.jButton6.setBackground(theWhite);
       this.jButton6.setForeground(theBlue);
       jButton6.setBorder(new LineBorder(whiteBorder));
       jButton6.setIcon(icon6);
        this.jButton35.setBackground(theWhite);
        this.jButton35.setForeground(theBlue);
       jButton35.setBorder(new LineBorder(whiteBorder));
       jButton35.setIcon(icon7);
       this.jButton73.setBackground(theWhite);
       this.jButton73.setForeground(theBlue);
       jButton73.setBorder(new LineBorder(whiteBorder));
       
       this.jButton47.setBackground(theWhite);
       this.jButton47.setForeground(theBlue);
       jButton47.setBorder(new LineBorder(whiteBorder));
       jButton47.setIcon(icon5);
        this.jButton46.setBackground(theWhite);
       this.jButton46.setForeground(theBlue);
       jButton46.setBorder(new LineBorder(whiteBorder));
       jButton46.setIcon(icon6);
       this.jButton48.setBackground(theWhite);
       this.jButton48.setForeground(theBlue);
       jButton48.setBorder(new LineBorder(whiteBorder));
       jButton48.setIcon(icon7);
       this.jButton95.setBackground(theWhite);
       this.jButton95.setForeground(theBlue);
       jButton95.setBorder(new LineBorder(whiteBorder));
       
        this.jButton39.setBackground(theWhite);
        this.jButton39.setForeground(theBlue);
        jButton39.setIcon(icon5);
       jButton39.setBorder(new LineBorder(whiteBorder));
       this.jButton38.setBackground(theWhite);
       this.jButton38.setForeground(theBlue);
       jButton38.setIcon(icon6);
       jButton38.setBorder(new LineBorder(whiteBorder));
       this.jButton51.setBackground(theWhite);
       this.jButton51.setForeground(theBlue);
       jButton51.setIcon(icon7);
       jButton51.setBorder(new LineBorder(whiteBorder));
       this.jButton76.setBackground(theWhite);
       this.jButton76.setForeground(theBlue);
       jButton76.setBorder(new LineBorder(whiteBorder));
       
       this.jButton4.setBackground(theWhite);
       this.jButton4.setForeground(theBlue);
       jButton4.setIcon(icon5);
       jButton4.setBorder(new LineBorder(whiteBorder));
       this.jButton3.setBackground(theWhite);
       this.jButton3.setForeground(theBlue);
       jButton3.setIcon(icon6);
       jButton3.setBorder(new LineBorder(whiteBorder));
       this.jButton34.setBackground(theWhite);
       this.jButton34.setForeground(theBlue);
       jButton34.setIcon(icon7);
       jButton34.setBorder(new LineBorder(whiteBorder));
       
       this.jButton12.setBackground(theWhite);
       this.jButton12.setForeground(theBlue);
       jButton12.setIcon(icon5);
       jButton12.setBorder(new LineBorder(whiteBorder));
       this.jButton11.setBackground(theWhite);
       this.jButton11.setForeground(theBlue);
       jButton11.setIcon(icon6);
       jButton11.setBorder(new LineBorder(whiteBorder));
        this.jButton37.setBackground(theWhite);
        this.jButton37.setForeground(theBlue);
        jButton37.setIcon(icon7);
       jButton37.setBorder(new LineBorder(whiteBorder));
       
       this.jButton10.setBackground(theWhite);
       this.jButton10.setForeground(theBlue);
       jButton10.setIcon(icon5);
       jButton10.setBorder(new LineBorder(whiteBorder));
        this.jButton9.setBackground(theWhite);
        this.jButton9.setForeground(theBlue);
        jButton9.setIcon(icon6);
       jButton9.setBorder(new LineBorder(whiteBorder));
       this.jButton36.setBackground(theWhite);
       this.jButton36.setForeground(theBlue);
       jButton36.setIcon(icon7);
       jButton36.setBorder(new LineBorder(whiteBorder));
       
       ImageIcon icon4 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\Car-1.png"); // not fucking working for some fucknig reason
       jLabel13.setIcon(icon4);
       jLabel13.setForeground(theBlue);
       ImageIcon icon8 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\icons8-gas-station-48-1.png"); // not fucking working for some fucknig reason
       jLabel89.setIcon(icon8);
       jLabel89.setForeground(theBlue);
       ImageIcon icon9 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\taxi-sign-1.png"); // not fucking working for some fucknig reason
       jLabel78.setIcon(icon9);
       jLabel78.setForeground(theBlue);
       ImageIcon icon10 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\employees-1.png"); // not fucking working for some fucknig reason
       jLabel12.setIcon(icon10);
       jLabel12.setForeground(theBlue);
       ImageIcon icon11 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\insurance-company-1.png"); // not fucking working for some fucknig reason
       jLabel14.setIcon(icon11);
       jLabel14.setForeground(theBlue);
       ImageIcon icon12 = new ImageIcon("C:\\Users\\ramin\\Documents\\NetBeansProjects\\DataBaseProject (1)\\maintenance-1.png"); // not fucking working for some fucknig reason
       jLabel15.setIcon(icon12);
       jLabel15.setForeground(theBlue);
       
       
       //forget password page
       this.forgotpassword.setBackground(theWhite);
       this.jPanel24.setBackground(theBlue);
       this.jButton130.setBackground(theBlue);
       jButton130.setBorder(new LineBorder(blueBorder));
       this.jLabel72.setForeground(theBlue);
       this.jLabel75.setForeground(theBlue);
       this.jLabel76.setForeground(theBlue);
       this.jLabel74.setForeground(theBlue);
       this.jLabel77.setForeground(theBlue);
       this.jButton32.setBackground(theWhite);
       this.jButton32.setForeground(theBlue);
       jButton32.setBorder(new LineBorder(whiteBorder));
       jTextField27.setForeground(theBlue);//theBlue
       jTextField27.setBackground(theWhite);//white
       jTextField27.setBorder(new LineBorder(whiteBorder));
       jTextField28.setForeground(theBlue);//theBlue
       jTextField28.setBackground(theWhite);//white
       jTextField28.setBorder(new LineBorder(whiteBorder));
       jTextField29.setForeground(theBlue);//theBlue
       jTextField29.setBackground(theWhite);//white
       jTextField29.setBorder(new LineBorder(whiteBorder));
       
       
       //setting page
       this.Settings.setBackground(theWhite);
       this.jPanel23.setBackground(theBlue);
       this.jLabel68.setForeground(theBlue);
       this.jLabel70.setForeground(theBlue);
       this.jLabel69.setForeground(theBlue);
       this.jLabel203.setForeground(theBlue);
       this.jLabel204.setForeground(theBlue);
       this.jLabel205.setForeground(theBlue);
       this.jButton31.setBackground(theWhite);
       this.jButton31.setForeground(theBlue);
       jButton31.setBorder(new LineBorder(whiteBorder));
       this.jButton30.setBackground(theWhite);
       this.jButton30.setForeground(theBlue);
       jButton30.setBorder(new LineBorder(whiteBorder));
       this.jButton33.setBackground(theWhite);
       this.jButton33.setForeground(theBlue);
       jButton33.setBorder(new LineBorder(whiteBorder));
       this.jButton45.setBackground(theWhite);
       this.jButton45.setForeground(theBlue);
       jButton45.setBorder(new LineBorder(whiteBorder));
       this.jButton129.setBackground(theBlue);
       jButton129.setBorder(new LineBorder(blueBorder));
       jTextField26.setForeground(theBlue);//theBlue
       jTextField26.setBackground(theWhite);//white
       jTextField26.setBorder(new LineBorder(whiteBorder));
       jTextField55.setForeground(theBlue);//theBlue
       jTextField55.setBackground(theWhite);//white
       jTextField55.setBorder(new LineBorder(whiteBorder));
       jTextField59.setForeground(theBlue);//theBlue
       jTextField59.setBackground(theWhite);//white
       jTextField59.setBorder(new LineBorder(whiteBorder));
       
       //feed back page
       this.FeedBack.setBackground(theWhite);
       this.jPanel22.setBackground(theBlue);
       this.jButton128.setBackground(theBlue);
       jButton128.setBorder(new LineBorder(blueBorder));
       
       this.jLabel50.setForeground(theBlue);
       this.jLabel51.setForeground(theBlue);
       this.jLabel52.setForeground(theBlue);
       this.jLabel53.setForeground(theBlue);
       this.jLabel54.setForeground(theBlue);
       this.jLabel55.setForeground(theBlue);
       
       this.jButton28.setBackground(theWhite);
       this.jButton28.setForeground(theBlue);
       jButton28.setBorder(new LineBorder(whiteBorder));
       
       this.jTextArea5.setBackground(theWhite);
       this.jTextArea5.setForeground(theBlue);
       this.jTextArea5.setBorder(new LineBorder(whiteBorder));
       
       
       //reprorts page
       this.Reports.setBackground(theWhite);
       this.jPanel44.setBackground(theBlue);
       this.jButton144.setBackground(theBlue);
       jButton144.setBorder(new LineBorder(blueBorder));
       
       this.jLabel153.setForeground(theBlue);
       this.jLabel154.setForeground(theBlue);
       this.jLabel155.setForeground(theBlue);
       this.jLabel156.setForeground(theBlue);
       this.jLabel157.setForeground(theBlue);
       this.jLabel158.setForeground(theBlue);
       this.jLabel159.setForeground(theBlue);
       this.jLabel161.setForeground(theBlue);
       this.jLabel162.setForeground(theBlue);
       this.jLabel163.setForeground(theBlue);
       this.jLabel164.setForeground(theBlue);
       
              this.jButton101.setBackground(theWhite);
              this.jButton101.setForeground(theBlue);
       jButton101.setBorder(new LineBorder(whiteBorder));
       
              this.jButton102.setBackground(theWhite);
              this.jButton102.setForeground(theBlue);
       jButton102.setBorder(new LineBorder(whiteBorder));
       
              this.jButton103.setBackground(theWhite);
              this.jButton103.setForeground(theBlue);
       jButton103.setBorder(new LineBorder(whiteBorder));
       
              this.jButton104.setBackground(theWhite);
              this.jButton104.setForeground(theBlue);
       jButton104.setBorder(new LineBorder(whiteBorder));
       
              this.jButton105.setBackground(theWhite);
              this.jButton105.setForeground(theBlue);
       jButton105.setBorder(new LineBorder(whiteBorder));
       
              this.jButton106.setBackground(theWhite);
              this.jButton106.setForeground(theBlue);
       jButton106.setBorder(new LineBorder(whiteBorder));
       
              this.jButton107.setBackground(theWhite);
              this.jButton107.setForeground(theBlue);
       jButton107.setBorder(new LineBorder(whiteBorder));
       
              this.jButton108.setBackground(theWhite);
              this.jButton108.setForeground(theBlue);
       jButton108.setBorder(new LineBorder(whiteBorder));
       
              this.jButton109.setBackground(theWhite);
              this.jButton109.setForeground(theBlue);
       jButton109.setBorder(new LineBorder(whiteBorder));
       
              this.jButton110.setBackground(theWhite);
              this.jButton110.setForeground(theBlue);
       jButton110.setBorder(new LineBorder(whiteBorder));
       
              this.jButton111.setBackground(theWhite);
              this.jButton111.setForeground(theBlue);
       jButton111.setBorder(new LineBorder(whiteBorder));
       
       
       //employees view
       empview.setBackground(theWhite);
       jPanel15.setBackground(theBlue);
       this.jButton121.setBackground(theBlue);
       jButton121.setBorder(new LineBorder(blueBorder));
       this.jTable1.setBackground(theWhite);
       this.jTable1.setForeground(theBlue);
       jButton15.setBackground(theWhite);//white
       jButton15.setForeground(theBlue);//theBlue 
       jButton15.setBorder(new LineBorder(whiteBorder));
       
       
       //car view
       carview.setBackground(theWhite);
       jPanel17.setBackground(theBlue);
       this.jButton123.setBackground(theBlue);
       jButton123.setBorder(new LineBorder(blueBorder));
       this.jTable2.setBackground(theWhite);
       this.jTable2.setForeground(theBlue);
       jButton17.setBackground(theWhite);//white
       jButton17.setForeground(theBlue);//theBlue 
       jButton17.setBorder(new LineBorder(whiteBorder));
       this.jLabel24.setForeground(theBlue);
       this.jLabel25.setForeground(theBlue);
       this.jLabel26.setForeground(theBlue);
       this.jLabel27.setForeground(theBlue);
       
       //inshurance view
       insuranceview.setBackground(theWhite);
       jPanel19.setBackground(theBlue);
       this.jButton125.setBackground(theBlue);
       jButton125.setBorder(new LineBorder(blueBorder));
       this.jTable3.setBackground(theWhite);
       this.jTable3.setForeground(theBlue);
       this.jButton22.setBackground(theWhite);
       jButton22.setForeground(theBlue);//theBlue 
       jButton22.setBorder(new LineBorder(whiteBorder));
       
       
       //maitenance view
        maintenanceview.setBackground(theWhite);
       jPanel21.setBackground(theBlue);
       this.jButton127.setBackground(theBlue);
       jButton127.setBorder(new LineBorder(blueBorder));
       this.jTable4.setBackground(theWhite);
        this.jTable4.setForeground(theBlue);
       this.jButton26.setBackground(theWhite);
       jButton26.setForeground(theBlue);//theBlue 
       jButton26.setBorder(new LineBorder(whiteBorder));
       
       
       //taxi view
       Taxiview.setBackground(theWhite);
       jPanel28.setBackground(theBlue);
       this.jButton132.setBackground(theBlue);
       jButton132.setBorder(new LineBorder(blueBorder));
       this.jTable5.setBackground(theWhite);
       this.jTable5.setForeground(theBlue);
       this.jButton40.setBackground(theWhite);
       jButton40.setForeground(theBlue);//theBlue 
       jButton40.setBorder(new LineBorder(whiteBorder));
       
       
       //gas station view
       Gasview.setBackground(theWhite);
       jPanel25.setBackground(theBlue);
       this.jButton134.setBackground(theBlue);
       jButton134.setBorder(new LineBorder(blueBorder));
       this.jTable6.setBackground(theWhite);
       this.jTable6.setForeground(theBlue);
       this.jButton54.setBackground(theWhite);
       jButton54.setForeground(theBlue);//theBlue 
       jButton54.setBorder(new LineBorder(whiteBorder));
       
       
       //coupon page
       this.Couponadd.setBackground(theWhite);
       this.jPanel43.setBackground(theBlue);
       this.jButton143.setBackground(theBlue);
       jButton143.setBorder(new LineBorder(blueBorder));
       this.jButton97.setBackground(theWhite);
       jButton97.setForeground(theBlue);//theBlue 
       jButton97.setBorder(new LineBorder(whiteBorder));
       this.jButton98.setBackground(theWhite);
       jButton98.setForeground(theBlue);//theBlue 
       jButton98.setBorder(new LineBorder(whiteBorder));
       this.jButton99.setBackground(theWhite);
       jButton99.setForeground(theBlue);//theBlue 
       jButton99.setBorder(new LineBorder(whiteBorder));
       this.jLabel150.setForeground(theBlue);
       this.jLabel151.setForeground(theBlue);
       this.jLabel152.setForeground(theBlue);
       this.jLabel197.setForeground(theBlue);
       jTextField64.setForeground(theBlue);//theBlue
       jTextField64.setBackground(theWhite);//white
       jTextField64.setBorder(new LineBorder(whiteBorder));
       jTextField83.setForeground(theBlue);//theBlue
       jTextField83.setBackground(theWhite);//white
       jTextField83.setBorder(new LineBorder(whiteBorder));
       jTextField84.setForeground(theBlue);//theBlue
       jTextField84.setBackground(theWhite);//white
       jTextField84.setBorder(new LineBorder(whiteBorder));
       
       
       //reserve taxi page
       this.Reserveataxi.setBackground(theWhite);
       this.jPanel40.setBackground(theBlue);
       this.jButton142.setBackground(theBlue);
       jButton142.setBorder(new LineBorder(blueBorder));
       this.jButton78.setBackground(theWhite);
       jButton78.setForeground(theBlue);//theBlue 
       jButton78.setBorder(new LineBorder(whiteBorder));
       this.jButton79.setBackground(theWhite);
       jButton79.setForeground(theBlue);//theBlue 
       jButton79.setBorder(new LineBorder(whiteBorder));
       this.jButton80.setBackground(theWhite);
       jButton80.setForeground(theBlue);//theBlue 
       jButton80.setBorder(new LineBorder(whiteBorder));
       this.jLabel143.setForeground(theBlue);
       this.jLabel145.setForeground(theBlue);
       this.jLabel194.setForeground(theBlue);
       jTextField81.setForeground(theBlue);//theBlue
       jTextField81.setBackground(theWhite);//white
       jTextField81.setBorder(new LineBorder(whiteBorder));
       jTextField82.setForeground(theBlue);//theBlue
       jTextField82.setBackground(theWhite);//white
       jTextField82.setBorder(new LineBorder(whiteBorder));
       
       
       //reserve a car page
       this.Reserveacar.setBackground(theWhite);
       this.jPanel38.setBackground(theBlue);
       this.jButton141.setBackground(theBlue);
       jButton141.setBorder(new LineBorder(blueBorder));
       this.jButton74.setBackground(theWhite);
       jButton74.setForeground(theBlue);//theBlue 
       jButton74.setBorder(new LineBorder(whiteBorder));
       this.jButton75.setBackground(theWhite);
       jButton75.setForeground(theBlue);//theBlue 
       jButton75.setBorder(new LineBorder(whiteBorder));
       this.jButton81.setBackground(theWhite);
       jButton81.setForeground(theBlue);//theBlue 
       jButton81.setBorder(new LineBorder(whiteBorder));
       this.jLabel140.setForeground(theBlue);
       this.jLabel142.setForeground(theBlue);
       this.jLabel193.setForeground(theBlue);
       jTextField79.setForeground(theBlue);//theBlue
       jTextField79.setBackground(theWhite);//white
       jTextField79.setBorder(new LineBorder(whiteBorder));
       jTextField80.setForeground(theBlue);//theBlue
       jTextField80.setBackground(theWhite);//white
       jTextField80.setBorder(new LineBorder(whiteBorder));
       
       
       //taxi edit page
       this.Taxiedit.setBackground(theWhite);
       this.jPanel36.setBackground(theBlue);
       this.jButton140.setBackground(theBlue);
       jButton140.setBorder(new LineBorder(blueBorder));
       this.jButton70.setBackground(theWhite);
       jButton70.setForeground(theBlue);//theBlue 
       jButton70.setBorder(new LineBorder(whiteBorder));
       this.jButton71.setBackground(theWhite);
       jButton71.setForeground(theBlue);//theBlue 
       jButton71.setBorder(new LineBorder(whiteBorder));
       this.jButton93.setBackground(theWhite);
       jButton93.setForeground(theBlue);//theBlue 
       jButton93.setBorder(new LineBorder(whiteBorder));
       this.jButton94.setBackground(theWhite);
       jButton94.setForeground(theBlue);//theBlue 
       jButton94.setBorder(new LineBorder(whiteBorder));
       this.jLabel130.setForeground(theBlue);
       this.jLabel138.setForeground(theBlue);
       this.jLabel148.setForeground(theBlue);
       this.jLabel147.setForeground(theBlue);
       this.jLabel191.setForeground(theBlue);
       jTextField72.setForeground(theBlue);//theBlue
       jTextField72.setBackground(theWhite);//white
       jTextField72.setBorder(new LineBorder(whiteBorder));
       jTextField73.setForeground(theBlue);//theBlue
       jTextField73.setBackground(theWhite);//white
       jTextField73.setBorder(new LineBorder(whiteBorder));
       jTextField74.setForeground(theBlue);//theBlue
       jTextField74.setBackground(theWhite);//white
       jTextField74.setBorder(new LineBorder(whiteBorder));
       jTextField78.setForeground(theBlue);//theBlue
       jTextField78.setBackground(theWhite);//white
       jTextField78.setBorder(new LineBorder(whiteBorder));
       
       
       //gas station edit page
       this.gasstationedit.setBackground(theWhite);
       this.jPanel35.setBackground(theBlue);
       this.jButton139.setBackground(theBlue);
       jButton139.setBorder(new LineBorder(blueBorder));
       jButton67.setBackground(theWhite);
       jButton67.setForeground(theBlue);//theBlue 
       jButton67.setBorder(new LineBorder(whiteBorder));
       jButton68.setBackground(theWhite);
       jButton68.setForeground(theBlue);//theBlue 
       jButton68.setBorder(new LineBorder(whiteBorder));
       jButton92.setBackground(theWhite);
       jButton92.setForeground(theBlue);//theBlue 
       jButton92.setBorder(new LineBorder(whiteBorder));
       jButton91.setBackground(theWhite);
       jButton91.setForeground(theBlue);//theBlue 
       jButton91.setBorder(new LineBorder(whiteBorder));
       this.jLabel131.setForeground(theBlue);
       this.jLabel124.setForeground(theBlue);
       this.jLabel136.setForeground(theBlue);
       this.jLabel189.setForeground(theBlue);
       jTextField77.setForeground(theBlue);//theBlue
       jTextField77.setBackground(theWhite);//white
       jTextField77.setBorder(new LineBorder(whiteBorder));
       jTextField70.setForeground(theBlue);//theBlue
       jTextField70.setBackground(theWhite);//white
       jTextField70.setBorder(new LineBorder(whiteBorder));
       jTextField71.setForeground(theBlue);//theBlue
       jTextField71.setBackground(theWhite);//white
       jTextField71.setBorder(new LineBorder(whiteBorder));
       
       
       //car edit page
       this.caredit.setBackground(theWhite);
       this.jPanel34.setBackground(theBlue);
       this.jButton138.setBackground(theBlue);
       jButton138.setBorder(new LineBorder(blueBorder));
       jButton65.setBackground(theWhite);
       jButton65.setForeground(theBlue);//theBlue 
       jButton65.setBorder(new LineBorder(whiteBorder));
       jButton64.setBackground(theWhite);
       jButton64.setForeground(theBlue);//theBlue 
       jButton64.setBorder(new LineBorder(whiteBorder));
       jButton88.setBackground(theWhite);
       jButton88.setForeground(theBlue);//theBlue 
       jButton88.setBorder(new LineBorder(whiteBorder));
       jButton90.setBackground(theWhite);
       jButton90.setForeground(theBlue);//theBlue 
       jButton90.setBorder(new LineBorder(whiteBorder));
       this.jLabel134.setForeground(theBlue);
       this.jLabel122.setForeground(theBlue);
       this.jLabel123.setForeground(theBlue);
       this.jLabel126.setForeground(theBlue);
       this.jLabel127.setForeground(theBlue);
       this.jLabel128.setForeground(theBlue);
       this.jLabel129.setForeground(theBlue);
       this.jLabel184.setForeground(theBlue);
       this.jLabel115.setForeground(theBlue);
       this.jLabel117.setForeground(theBlue);
       this.jLabel184.setForeground(theBlue);
       jTextField76.setForeground(theBlue);//theBlue
       jTextField76.setBackground(theWhite);//white
       jTextField76.setBorder(new LineBorder(whiteBorder));
       jTextField56.setForeground(theBlue);//theBlue
       jTextField56.setBackground(theWhite);//white
       jTextField56.setBorder(new LineBorder(whiteBorder));
       jTextField62.setForeground(theBlue);//theBlue
       jTextField62.setBackground(theWhite);//white
       jTextField62.setBorder(new LineBorder(whiteBorder));
       jTextField65.setForeground(theBlue);//theBlue
       jTextField65.setBackground(theWhite);//white
       jTextField65.setBorder(new LineBorder(whiteBorder));
       jTextField70.setForeground(theBlue);//theBlue
       jTextField70.setBackground(theWhite);//white
       jTextField70.setBorder(new LineBorder(whiteBorder));
       jTextField66.setForeground(theBlue);//theBlue
       jTextField66.setBackground(theWhite);//white
       jTextField66.setBorder(new LineBorder(whiteBorder));
       jTextField67.setForeground(theBlue);//theBlue
       jTextField67.setBackground(theWhite);//white
       jTextField67.setBorder(new LineBorder(whiteBorder));
       jTextField68.setForeground(theBlue);//theBlue
       jTextField68.setBackground(theWhite);//white
       jTextField68.setBorder(new LineBorder(whiteBorder));
       jTextField69.setForeground(theBlue);//theBlue
       jTextField69.setBackground(theWhite);//white
       jTextField69.setBorder(new LineBorder(whiteBorder));
       jTextField52.setForeground(theBlue);//theBlue
       jTextField52.setBackground(theWhite);//white
       jTextField52.setBorder(new LineBorder(whiteBorder));
       
       
       //maintaince edit page
       this.maintenanceedit.setBackground(theWhite);
       this.jPanel33.setBackground(theBlue);
       this.jButton137.setBackground(theBlue);
       jButton137.setBorder(new LineBorder(blueBorder));
       this.jLabel132.setForeground(theBlue);
       this.jLabel112.setForeground(theBlue);
       this.jLabel116.setForeground(theBlue);
       this.jLabel186.setForeground(theBlue);
       jButton56.setBackground(theWhite);
       jButton56.setForeground(theBlue);//theBlue 
       jButton56.setBorder(new LineBorder(whiteBorder));
       jButton62.setBackground(theWhite);
       jButton62.setForeground(theBlue);//theBlue 
       jButton62.setBorder(new LineBorder(whiteBorder));
       jButton87.setBackground(theWhite);
       jButton87.setForeground(theBlue);//theBlue 
       jButton87.setBorder(new LineBorder(whiteBorder));
       jButton89.setBackground(theWhite);
       jButton89.setForeground(theBlue);//theBlue 
       jButton89.setBorder(new LineBorder(whiteBorder));
       jTextField57.setForeground(theBlue);//theBlue
       jTextField57.setBackground(theWhite);//white
       jTextField57.setBorder(new LineBorder(whiteBorder));
       jTextField58.setForeground(theBlue);//theBlue
       jTextField58.setBackground(theWhite);//white
       jTextField58.setBorder(new LineBorder(whiteBorder));
       jTextField75.setForeground(theBlue);//theBlue
       jTextField75.setBackground(theWhite);//white
       jTextField75.setBorder(new LineBorder(whiteBorder));
       
       
       //insurance edit page
       this.insuranceedit.setBackground(theWhite);
       this.jPanel32.setBackground(theBlue);
       this.jButton136.setBackground(theBlue);
       jButton136.setBorder(new LineBorder(blueBorder));
       jButton59.setBackground(theWhite);
       jButton59.setForeground(theBlue);//theBlue 
       jButton59.setBorder(new LineBorder(whiteBorder));
       jButton60.setBackground(theWhite);
       jButton60.setForeground(theBlue);//theBlue 
       jButton60.setBorder(new LineBorder(whiteBorder));
       jButton84.setBackground(theWhite);
       jButton84.setForeground(theBlue);//theBlue 
       jButton84.setBorder(new LineBorder(whiteBorder));
       jButton85.setBackground(theWhite);
       jButton85.setForeground(theBlue);//theBlue 
       jButton85.setBorder(new LineBorder(whiteBorder));
       this.jLabel120.setForeground(theBlue);
       this.jLabel113.setForeground(theBlue);
       this.jLabel109.setForeground(theBlue);
       this.jLabel106.setForeground(theBlue);
       this.jLabel187.setForeground(theBlue);
       jTextField63.setForeground(theBlue);//theBlue
       jTextField63.setBackground(theWhite);//white
       jTextField63.setBorder(new LineBorder(whiteBorder));
       jTextField53.setForeground(theBlue);//theBlue
       jTextField53.setBackground(theWhite);//white
       jTextField53.setBorder(new LineBorder(whiteBorder));
       jTextField51.setForeground(theBlue);//theBlue
       jTextField51.setBackground(theWhite);//white
       jTextField51.setBorder(new LineBorder(whiteBorder));
       jTextField47.setForeground(theBlue);//theBlue
       jTextField47.setBackground(theWhite);//white
       jTextField47.setBorder(new LineBorder(whiteBorder));
       
      
       //emplooye edit page
       this.empedit.setBackground(theWhite);
       this.jPanel31.setBackground(theBlue);
       this.jButton135.setBackground(theBlue);
       jButton135.setBorder(new LineBorder(blueBorder));
       jButton86.setBackground(theWhite);
       jButton86.setForeground(theBlue);//theBlue 
       jButton86.setBorder(new LineBorder(whiteBorder));
       jButton57.setBackground(theWhite);
       jButton57.setForeground(theBlue);//theBlue 
       jButton57.setBorder(new LineBorder(whiteBorder));
       jButton82.setBackground(theWhite);
       jButton82.setForeground(theBlue);//theBlue 
       jButton82.setBorder(new LineBorder(whiteBorder));
       jButton83.setBackground(theWhite);
       jButton83.setForeground(theBlue);//theBlue 
       jButton83.setBorder(new LineBorder(whiteBorder));
       jComboBox1.setBackground(theWhite);
       jComboBox1.setForeground(theBlue);
       jRadioButton7.setForeground(theBlue);
       jRadioButton8.setForeground(theBlue);
       jRadioButton7.setBackground(theWhite);
       jRadioButton8.setBackground(theWhite);
       this.jLabel105.setForeground(theBlue);
       this.jLabel107.setForeground(theBlue);
       this.jLabel108.setForeground(theBlue);
       this.jLabel110.setForeground(theBlue);
       this.jLabel114.setForeground(theBlue);
       this.jLabel118.setForeground(theBlue);
       this.jLabel119.setForeground(theBlue);
       this.jLabel121.setForeground(theBlue);
       this.jLabel201.setForeground(theBlue);
       this.jLabel202.setForeground(theBlue);
       this.jLabel181.setForeground(theBlue);
       jTextField49.setForeground(theBlue);//theBlue
       jTextField49.setBackground(theWhite);//white
       jTextField49.setBorder(new LineBorder(whiteBorder));
       jTextField61.setForeground(theBlue);//theBlue
       jTextField61.setBackground(theWhite);//white
       jTextField61.setBorder(new LineBorder(whiteBorder));
       jTextField48.setForeground(theBlue);//theBlue
       jTextField48.setBackground(theWhite);//white
       jTextField48.setBorder(new LineBorder(whiteBorder));
       jTextField50.setForeground(theBlue);//theBlue
       jTextField50.setBackground(theWhite);//white
       jTextField50.setBorder(new LineBorder(whiteBorder));
       jTextField54.setForeground(theBlue);//theBlue
       jTextField54.setBackground(theWhite);//white
       jTextField54.setBorder(new LineBorder(whiteBorder));
       jTextField60.setForeground(theBlue);//theBlue
       jTextField60.setBackground(theWhite);//white
       jTextField60.setBorder(new LineBorder(whiteBorder));
       jTextField86.setForeground(theBlue);//theBlue
       jTextField86.setBackground(theWhite);//white
       jTextField86.setBorder(new LineBorder(whiteBorder));
       jTextField88.setForeground(theBlue);//theBlue
       jTextField88.setBackground(theWhite);//white
       jTextField88.setBorder(new LineBorder(whiteBorder));
       jTextField85.setForeground(theBlue);//theBlue
       jTextField85.setBackground(theWhite);//white
       jTextField85.setBorder(new LineBorder(whiteBorder));
       jTextField87.setForeground(theBlue);//theBlue
       jTextField87.setBackground(theWhite);//white
       jTextField87.setBorder(new LineBorder(whiteBorder));
       
       
       //gas station add page
       this.Gasadd.setBackground(theWhite);
       this.jPanel30.setBackground(theBlue);
       this.jButton133.setBackground(theBlue);
       jButton133.setBorder(new LineBorder(blueBorder));
       jButton50.setBackground(theWhite);
       jButton50.setForeground(theBlue);//theBlue 
       jButton50.setBorder(new LineBorder(whiteBorder));
       jButton52.setBackground(theWhite);
       jButton52.setForeground(theBlue);//theBlue 
       jButton52.setBorder(new LineBorder(whiteBorder));
       jButton43.setBackground(theWhite);
       jButton43.setForeground(theBlue);//theBlue 
       jButton43.setBorder(new LineBorder(whiteBorder));
       this.jLabel97.setForeground(theBlue);
       this.jLabel98.setForeground(theBlue);
       this.jLabel100.setForeground(theBlue);
       this.jLabel101.setForeground(theBlue);
       this.jLabel176.setForeground(theBlue);
       this.jLabel177.setForeground(theBlue);
       jTextField43.setForeground(theBlue);//theBlue
       jTextField43.setBackground(theWhite);//white
       jTextField43.setBorder(new LineBorder(whiteBorder));
       jTextField44.setForeground(theBlue);//theBlue
       jTextField44.setBackground(theWhite);//white
       jTextField44.setBorder(new LineBorder(whiteBorder));
       jTextField45.setForeground(theBlue);//theBlue
       jTextField45.setBackground(theWhite);//white
       jTextField45.setBorder(new LineBorder(whiteBorder));
       jTextField46.setForeground(theBlue);//theBlue
       jTextField46.setBackground(theWhite);//white
       jTextField46.setBorder(new LineBorder(whiteBorder));
       
       
       //taxi add page
       this.Taxiadd.setBackground(theWhite);
       this.jPanel26.setBackground(theBlue);
       this.jButton131.setBackground(theBlue);
       jButton131.setBorder(new LineBorder(blueBorder));
       this.jButton44.setBackground(theWhite);
       jButton44.setForeground(theBlue);//theBlue 
       jButton44.setBorder(new LineBorder(whiteBorder));
       this.jLabel91.setForeground(theBlue);
       this.jLabel92.setForeground(theBlue);
       this.jLabel93.setForeground(theBlue);
       this.jLabel90.setForeground(theBlue);
       this.jLabel173.setForeground(theBlue);
       jTextField39.setForeground(theBlue);//theBlue
       jTextField39.setBackground(theWhite);//white
       jTextField39.setBorder(new LineBorder(whiteBorder));
       jTextField40.setForeground(theBlue);//theBlue
       jTextField40.setBackground(theWhite);//white
       jTextField40.setBorder(new LineBorder(whiteBorder));
       jTextField41.setForeground(theBlue);//theBlue
       jTextField41.setBackground(theWhite);//white
       jTextField41.setBorder(new LineBorder(whiteBorder));
       jTextField42.setForeground(theBlue);//theBlue
       jTextField42.setBackground(theWhite);//white
       jTextField42.setBorder(new LineBorder(whiteBorder));
       
       
       //maintaince add page
       this.maintenanceadd.setBackground(theWhite);
       this.jPanel20.setBackground(theBlue);
       this.jButton126.setBackground(theBlue);
       jButton126.setBorder(new LineBorder(blueBorder));
       this.jButton24.setBackground(theWhite);
       jButton24.setForeground(theBlue);//theBlue 
       jButton24.setBorder(new LineBorder(whiteBorder));
       this.jButton42.setBackground(theWhite);
       jButton42.setForeground(theBlue);//theBlue 
       jButton42.setBorder(new LineBorder(whiteBorder));
       this.jButton41.setBackground(theWhite);
       jButton41.setForeground(theBlue);//theBlue 
       jButton41.setBorder(new LineBorder(whiteBorder));
       this.jLabel45.setForeground(theBlue);
       this.jLabel46.setForeground(theBlue);
       this.jLabel47.setForeground(theBlue);
       this.jLabel87.setForeground(theBlue);
       this.jLabel175.setForeground(theBlue);
       this.jLabel49.setForeground(theBlue);
       jTextField23.setForeground(theBlue);//theBlue
       jTextField23.setBackground(theWhite);//white
       jTextField23.setBorder(new LineBorder(whiteBorder));
       jTextField24.setForeground(theBlue);//theBlue
       jTextField24.setBackground(theWhite);//white
       jTextField24.setBorder(new LineBorder(whiteBorder));
       jTextField25.setForeground(theBlue);//theBlue
       jTextField25.setBackground(theWhite);//white
       jTextField25.setBorder(new LineBorder(whiteBorder));
       jTextField38.setForeground(theBlue);//theBlue
       jTextField38.setBackground(theWhite);//white
       jTextField38.setBorder(new LineBorder(whiteBorder));
       
       
       //inshurance add page
       this.insuranceadd.setBackground(theWhite);
       this.jPanel18.setBackground(theBlue);
       this.jButton124.setBackground(theBlue);
       jButton124.setBorder(new LineBorder(blueBorder));
       this.jButton20.setBackground(theWhite);
       jButton20.setForeground(theBlue);//theBlue 
       jButton20.setBorder(new LineBorder(whiteBorder));
       this.jLabel41.setForeground(theBlue);
       this.jLabel42.setForeground(theBlue);
       this.jLabel43.setForeground(theBlue);
       this.jLabel44.setForeground(theBlue);
       this.jLabel48.setForeground(theBlue);
       jTextField19.setForeground(theBlue);//theBlue
       jTextField19.setBackground(theWhite);//white
       jTextField19.setBorder(new LineBorder(whiteBorder));
       jTextField20.setForeground(theBlue);//theBlue
       jTextField20.setBackground(theWhite);//white
       jTextField20.setBorder(new LineBorder(whiteBorder));
       jTextField21.setForeground(theBlue);//theBlue
       jTextField21.setBackground(theWhite);//white
       jTextField21.setBorder(new LineBorder(whiteBorder));
       jTextField22.setForeground(theBlue);//theBlue
       jTextField22.setBackground(theWhite);//white
       jTextField22.setBorder(new LineBorder(whiteBorder));
       
       
       //car add page
       this.caradd.setBackground(theWhite);
       this.jPanel16.setBackground(theBlue);
       this.jButton122.setBackground(theBlue);
       jButton122.setBorder(new LineBorder(blueBorder));
       jButton18.setBackground(theWhite);
       jButton18.setForeground(theBlue);//theBlue 
       jButton18.setBorder(new LineBorder(whiteBorder));
       this.jLabel28.setForeground(theBlue);
       this.jLabel29.setForeground(theBlue);
       this.jLabel30.setForeground(theBlue);
       this.jLabel31.setForeground(theBlue);
       this.jLabel32.setForeground(theBlue);
       this.jLabel33.setForeground(theBlue);
       this.jLabel34.setForeground(theBlue);
       this.jLabel35.setForeground(theBlue);
       this.jLabel36.setForeground(theBlue);
       this.jLabel40.setForeground(theBlue);
       this.jLabel85.setForeground(theBlue);
       this.jLabel86.setForeground(theBlue);
       this. jCheckBox6.setForeground(theBlue);
       jCheckBox6.setBackground(theWhite);
       this. jCheckBox5.setForeground(theBlue);
       jCheckBox5.setBackground(theWhite);
       jTextField10.setForeground(theBlue);//theBlue
       jTextField10.setBackground(theWhite);//white
       jTextField10.setBorder(new LineBorder(whiteBorder));
       jTextField11.setForeground(theBlue);//theBlue
       jTextField11.setBackground(theWhite);//white
       jTextField11.setBorder(new LineBorder(whiteBorder));
       jTextField12.setForeground(theBlue);//theBlue
       jTextField12.setBackground(theWhite);//white
       jTextField12.setBorder(new LineBorder(whiteBorder));
       jTextField13.setForeground(theBlue);//theBlue
       jTextField13.setBackground(theWhite);//white
       jTextField13.setBorder(new LineBorder(whiteBorder));
       jTextField14.setForeground(theBlue);//theBlue
       jTextField14.setBackground(theWhite);//white
       jTextField14.setBorder(new LineBorder(whiteBorder));
       jTextField15.setForeground(theBlue);//theBlue
       jTextField15.setBackground(theWhite);//white
       jTextField15.setBorder(new LineBorder(whiteBorder));
       jTextField16.setForeground(theBlue);//theBlue
       jTextField16.setBackground(theWhite);//white
       jTextField16.setBorder(new LineBorder(whiteBorder));
       jTextField17.setForeground(theBlue);//theBlue
       jTextField17.setBackground(theWhite);//white
       jTextField17.setBorder(new LineBorder(whiteBorder));
       jTextField18.setForeground(theBlue);//theBlue
       jTextField18.setBackground(theWhite);//white
       jTextField18.setBorder(new LineBorder(whiteBorder));
       jTextField36.setForeground(theBlue);//theBlue
       jTextField36.setBackground(theWhite);//white
       jTextField36.setBorder(new LineBorder(whiteBorder));
       jTextField37.setForeground(theBlue);//theBlue
       jTextField37.setBackground(theWhite);//white
       jTextField37.setBorder(new LineBorder(whiteBorder));
       
       
       //employee add page
       this.empadd.setBackground(theWhite);
       this.jPanel13.setBackground(theBlue);
       this.jPanel1.setBackground(theWhite);
       this.jPanel3.setBackground(theWhite);
       this.jButton120.setBackground(theBlue);
       jButton120.setBorder(new LineBorder(blueBorder));
       jButton14.setBackground(theWhite);
       jButton14.setForeground(theBlue);//theBlue 
       jButton14.setBorder(new LineBorder(whiteBorder));
       this.jLabel16.setForeground(theBlue);
       this.jLabel17.setForeground(theBlue);
       this.jLabel18.setForeground(theBlue);
       this.jLabel19.setForeground(theBlue);
       this.jLabel20.setForeground(theBlue);
       this.jLabel21.setForeground(theBlue);
       this.jLabel22.setForeground(theBlue);
       this.jLabel23.setForeground(theBlue);
       this.jLabel6.setForeground(theBlue);
       this.jLabel79.setForeground(theBlue);
       this.jLabel80.setForeground(theBlue);
       this.jLabel81.setForeground(theBlue);
       this.jLabel82.setForeground(theBlue);
       this.jLabel83.setForeground(theBlue);
       this.jLabel84.setForeground(theBlue);
       this. jRadioButton5.setForeground(theBlue);
       jRadioButton5.setBackground(theWhite);
       this. jRadioButton6.setForeground(theBlue);
       jRadioButton6.setBackground(theWhite);
       this. jCheckBox1.setForeground(theBlue);
       jCheckBox1.setBackground(theWhite);
       this. jCheckBox2.setForeground(theBlue);
       jCheckBox2.setBackground(theWhite);
       this. jCheckBox3.setForeground(theBlue);
       jCheckBox3.setBackground(theWhite);
       this. jCheckBox4.setForeground(theBlue);
       jCheckBox4.setBackground(theWhite);
       jTextField3.setForeground(theBlue);//theBlue
       jTextField3.setBackground(theWhite);//white
       jTextField3.setBorder(new LineBorder(whiteBorder));
       jTextField4.setForeground(theBlue);//theBlue
       jTextField4.setBackground(theWhite);//white
       jTextField4.setBorder(new LineBorder(whiteBorder));
       jTextField5.setForeground(theBlue);//theBlue
       jTextField5.setBackground(theWhite);//white
       jTextField5.setBorder(new LineBorder(whiteBorder));
       jTextField6.setForeground(theBlue);//theBlue
       jTextField6.setBackground(theWhite);//white
       jTextField6.setBorder(new LineBorder(whiteBorder));
       jTextField9.setForeground(theBlue);//theBlue
       jTextField9.setBackground(theWhite);//white
       jTextField9.setBorder(new LineBorder(whiteBorder));
       jTextField2.setForeground(theBlue);//theBlue
       jTextField2.setBackground(theWhite);//white
       jTextField2.setBorder(new LineBorder(whiteBorder));
       jTextField30.setForeground(theBlue);//theBlue
       jTextField30.setBackground(theWhite);//white
       jTextField30.setBorder(new LineBorder(whiteBorder));
       jTextField31.setForeground(theBlue);//theBlue
       jTextField31.setBackground(theWhite);//white
       jTextField31.setBorder(new LineBorder(whiteBorder));
       jTextField32.setForeground(theBlue);//theBlue
       jTextField32.setBackground(theWhite);//white
       jTextField32.setBorder(new LineBorder(whiteBorder));
       jTextField33.setForeground(theBlue);//theBlue
       jTextField33.setBackground(theWhite);//white
       jTextField33.setBorder(new LineBorder(whiteBorder));
       jTextField34.setForeground(theBlue);//theBlue
       jTextField34.setBackground(theWhite);//white
       jTextField34.setBorder(new LineBorder(whiteBorder));
       jTextField35.setForeground(theBlue);//theBlue
       jTextField35.setBackground(theWhite);//white
       jTextField35.setBorder(new LineBorder(whiteBorder));
       jDateChooser1.setForeground(theBlue);//theBlue
       jDateChooser1.setBackground(theWhite);//white
       jDateChooser1.setBorder(new LineBorder(whiteBorder));
       
       
       //settings, the change password things
       jTextField55.setForeground(theBlue);//theBlue
       jTextField55.setBackground(theWhite);//white
       jTextField55.setBorder(new LineBorder(whiteBorder));
       
       jTextField59.setForeground(theBlue);//theBlue
       jTextField59.setBackground(theWhite);//white
       jTextField59.setBorder(new LineBorder(whiteBorder));
       this.jLabel204.setForeground(theBlue);
       this.jLabel205.setForeground(theBlue);
       this.jLabel203.setForeground(theBlue);
       this.jLabel10.setForeground(theBlue);
       jButton45.setBackground(theWhite);
       jButton45.setForeground(theBlue);//theBlue 
       jButton45.setBorder(new LineBorder(whiteBorder));
       
       jButton33.setBackground(theWhite);
       jButton33.setForeground(theBlue);//theBlue 
       jButton33.setBorder(new LineBorder(whiteBorder));
    }//GEN-LAST:event_jButton113ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
           if(Light){if (jTextField1.getText().equals("")){
        jTextField1.setText("Enter Username");
        jTextField1.setForeground(new Color(79,112,156));
        }}
          else if(Dark){if(jTextField1.getText().equals("")){
        jTextField1.setText("Enter Username");
        jTextField1.setForeground(new Color(244,253,255));
        }}
    }//GEN-LAST:event_jTextField1FocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
      if(Light){ if (jPasswordField1.getText().equals("Enter Username")){
        jPasswordField1.setText("");
        jPasswordField1.setForeground(new Color(79,112,156));
        }}
        else if(Dark){
                if(jPasswordField1.getText().equals("Enter Username")){
        jPasswordField1.setText("");
        jPasswordField1.setForeground(new Color(244,253,255));
        }}
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
           if(Light){if (jPasswordField1.getText().equals("")){
        jPasswordField1.setText("Enter Username");
        jPasswordField1.setForeground(new Color(79,112,156));
        }}
          else if(Dark){if(jPasswordField1.getText().equals("")){
        jPasswordField1.setText("Enter Username");
        jPasswordField1.setForeground(new Color(244,253,255));
        }}
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
      if (Dark){//dark
         jButton1.setBackground(new Color( 42,39,39));//exit dark blue
         jButton1.setForeground(new Color(244,253,255));//white (dark)
         jButton1.setBorder(new LineBorder(new Color (69,63,61)));//gray border
     }
     else if(Light){//light
         jButton1.setBackground(new Color(244,253,255));//exit white
         jButton1.setForeground(new Color(79,112,156));//blue
         jButton1.setBorder(new LineBorder(new Color (189, 213, 231))); //black border
     }
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton114ActionPerformed
        tab4.setVisible(true);
        HomePanel.setVisible(false);
    }//GEN-LAST:event_jButton114ActionPerformed

    private void jButton115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton115ActionPerformed
       this.Settings.setVisible(true);
        this.HomePanel.setVisible(false);
    }//GEN-LAST:event_jButton115ActionPerformed

    private void jButton116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton116ActionPerformed
        this.FeedBack.setVisible(true);
        this.HomePanel.setVisible(false);
    }//GEN-LAST:event_jButton116ActionPerformed

    private void jButton117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton117ActionPerformed
       this.HomePanel.setVisible(false);
        this.Reports.setVisible(true);
    }//GEN-LAST:event_jButton117ActionPerformed

    private void jButton118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton118ActionPerformed
        HomePanel.setVisible(false);
        this.jLabel10.setVisible(false);
        tab4.setVisible(false);
        empadd.setVisible(false);
        empview.setVisible(false);
        caradd.setVisible(false);
        carview.setVisible(false);
        insuranceadd.setVisible(false);
        insuranceview.setVisible(false);
        maintenanceadd.setVisible(false);
        maintenanceview.setVisible(false);
        FeedBack.setVisible(false);
        LoginPanel.setVisible(true);
        setLocationRelativeTo(null);
        
        if(Light){
        jTextField1.setText("Enter Username");
        jTextField1.setForeground(new Color(79,112,156));
        }
        else if(Dark){
        jTextField1.setText("Enter Username");
        jTextField1.setForeground(new Color(244,253,255));
        }  
        
        if(Light){
        jPasswordField1.setText("Enter Username");
        jPasswordField1.setForeground(new Color(79,112,156));
        }
        else if(Dark){
        jPasswordField1.setText("Enter Username");
        jPasswordField1.setForeground(new Color(244,253,255));
        }  

    }//GEN-LAST:event_jButton118ActionPerformed

    private void jButton119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton119ActionPerformed
        HomePanel.setVisible(true);
        tab4.setVisible(false);
    }//GEN-LAST:event_jButton119ActionPerformed

    private void jButton120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton120ActionPerformed
         tab4.setVisible(true);
        empadd.setVisible(false);
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        this.jTextField4.setText("");
        this.jTextField5.setText("");
        this.jTextField6.setText("");
        this.jTextField9.setText("");
        this.jCheckBox1.setSelected(false);
        this.jCheckBox2.setSelected(false);
        this.jCheckBox3.setSelected(false);
        this.jCheckBox4.setSelected(false);
        this.jTextField30.setText("");
        this.jTextField31.setText("");
        this.jTextField32.setText("");
        this.jTextField33.setText("");
        this.jTextField34.setText("");
        this.jTextField35.setText("");
        this.jTextField30.setVisible(false);
        this.jTextField31.setVisible(false);
        this.jTextField32.setVisible(false);
        this.jTextField33.setVisible(false);
        this.jTextField34.setVisible(false);
        this.jTextField35.setVisible(false);
        this.jLabel81.setVisible(false);
        this.jLabel80.setVisible(false);
        this.jLabel16.setVisible(false);
        this.jLabel82.setVisible(false);
        this.jLabel83.setVisible(false);
        this.jLabel84.setVisible(false);
    }//GEN-LAST:event_jButton120ActionPerformed

    private void jButton121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton121ActionPerformed
        tab4.setVisible(true);
        empview.setVisible(false);
        DefaultTableModel modle =(DefaultTableModel) jTable1.getModel();
        modle.setRowCount(0);    }//GEN-LAST:event_jButton121ActionPerformed

    private void jButton122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton122ActionPerformed
       this.tab4.setVisible(true);
        this.caradd.setVisible(false);
        this.jTextField10.setText("");
        this.jTextField11.setText("");
        this.jTextField12.setText("");
        this.jTextField13.setText("");
        this.jTextField14.setText("");
        this.jTextField15.setText("");
        this.jTextField16.setText("");
        this.jTextField17.setText("");
        this.jTextField18.setText("");
        this.jLabel85.setVisible(false);
        this.jLabel86.setVisible(false);
        this.jTextField36.setVisible(false);
        this.jTextField37.setVisible(false);
        this.jTextField36.setText("");
        this.jTextField37.setText("");
        this.jCheckBox5.setSelected(false);
        this.jCheckBox6.setSelected(false);
    }//GEN-LAST:event_jButton122ActionPerformed

    private void jButton123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton123ActionPerformed
       this.carview.setVisible(false);
        this.tab4.setVisible(true);
        DefaultTableModel modle =(DefaultTableModel) jTable2.getModel();
        modle.setRowCount(0);
    }//GEN-LAST:event_jButton123ActionPerformed

    private void jButton124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton124ActionPerformed
         insuranceadd.setVisible(false);
        tab4.setVisible(true);
        this.jTextField19.setText("");
        this.jTextField20.setText("");
        this.jTextField21.setText("");
        this.jTextField22.setText("");
    }//GEN-LAST:event_jButton124ActionPerformed

    private void jButton125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton125ActionPerformed
        this.insuranceview.setVisible(false);
        this.tab4.setVisible(true);
        DefaultTableModel modle =(DefaultTableModel) jTable3.getModel();
        modle.setRowCount(0);
    }//GEN-LAST:event_jButton125ActionPerformed

    private void jButton126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton126ActionPerformed
 this.maintenanceadd.setVisible(false);
        this.tab4.setVisible(true);
        this.jTextField23.setText("");
        this.jTextField24.setText("");
        this.jTextField25.setText("");
        this.jTextField38.setText("");    }//GEN-LAST:event_jButton126ActionPerformed

    private void jButton127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton127ActionPerformed
        this.maintenanceview.setVisible(false);
        this.tab4.setVisible(true);
        DefaultTableModel modle =(DefaultTableModel) jTable4.getModel();
        modle.setRowCount(0);
    }//GEN-LAST:event_jButton127ActionPerformed

    private void jButton128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton128ActionPerformed
         this.FeedBack.setVisible(false);
        this.HomePanel.setVisible(true);
    }//GEN-LAST:event_jButton128ActionPerformed

    private void jButton129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton129ActionPerformed
        this.Settings.setVisible(false);
        this.HomePanel.setVisible(true);
        this.jTextField26.setText("");
        this.jTextField26.setVisible(false);
        this.jLabel6.setVisible(false);
        this.jLabel69.setVisible(false);
        this.jButton31.setVisible(false);
        this.jLabel205.setVisible(false);
        this.jLabel204.setVisible(false);
        this.jTextField55.setVisible(false);
        this.jTextField59.setVisible(false);
        this.jButton45.setVisible(false);
        this.jTextField55.setText("");
        this.jTextField59.setText("");
    }//GEN-LAST:event_jButton129ActionPerformed

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField29ActionPerformed

    private void jButton130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton130ActionPerformed
       this.LoginPanel.setVisible(true);
        this.forgotpassword.setVisible(false);
        this.jTextField27.setText("");
        this.jTextField28.setText("");
        this.jTextField29.setText("");
        this.jLabel74.setVisible(false);
        this.jLabel77.setVisible(false);
    }//GEN-LAST:event_jButton130ActionPerformed

    private void jButton131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton131ActionPerformed
      this.Taxiadd.setVisible(false);
        this.tab4.setVisible(true);
        this.jTextField39.setText("");
        this.jTextField40.setText("");
        this.jTextField41.setText("");
        this.jTextField42.setText("");
    }//GEN-LAST:event_jButton131ActionPerformed

    private void jTextField40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField40ActionPerformed

    private void jButton132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton132ActionPerformed
         this.tab4.setVisible(true);
        this.Taxiview.setVisible(false);
                DefaultTableModel modle =(DefaultTableModel) jTable5.getModel();
        modle.setRowCount(0);
    }//GEN-LAST:event_jButton132ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        JOptionPane.showMessageDialog(this,"You can insert Multiple Locations when only inserting the Name of the company and the location","Information",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton133ActionPerformed
       this.tab4.setVisible(true);
        this.Gasadd.setVisible(false);
        jTextField43.setText("");
         jTextField44.setText("");
          jTextField45.setText("");
            jTextField46.setText("");
        
    }//GEN-LAST:event_jButton133ActionPerformed

    private void jButton134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton134ActionPerformed
       this.tab4.setVisible(true);
        this.Gasview.setVisible(false);
        DefaultTableModel modle =(DefaultTableModel) jTable6.getModel();
        modle.setRowCount(0);
    }//GEN-LAST:event_jButton134ActionPerformed

    private void jButton135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton135ActionPerformed
       this.empedit.setVisible(false);
        this.tab4.setVisible(true);
        
          jTextField48.setText("");
        jTextField49.setText("");
         jTextField50.setText("");
          jTextField54.setText("");
            jTextField60.setText("");
        jTextField61.setText("");
         jTextField85.setText("");
          jTextField86.setText("");
          jTextField87.setText("");
          jTextField88.setText("");
           jRadioButton7.setSelected(false);
          jRadioButton8.setSelected(false);
         
         this.jTextField85.setVisible(false);
         this.jTextField87.setVisible(false);
         this.jTextField88.setVisible(false);
         this.jLabel121.setVisible(false);
         this.jLabel202.setVisible(false);
         this.jLabel201.setVisible(false);
         
          
    }//GEN-LAST:event_jButton135ActionPerformed

    private void jButton136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton136ActionPerformed

         jTextField51.setText("");
        jTextField53.setText("");
         jTextField47.setText("");
          jTextField63.setText("");
        
        
        this.tab4.setVisible(true);
        this.insuranceedit.setVisible(false);    }//GEN-LAST:event_jButton136ActionPerformed

    private void jButton137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton137ActionPerformed
        this.tab4.setVisible(true);
        this.maintenanceedit.setVisible(false);
         jTextField57.setText("");
        jTextField58.setText("");
         jTextField75.setText("");
         
    }//GEN-LAST:event_jButton137ActionPerformed

    private void jButton138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton138ActionPerformed

        jTextField65.setText("");
        jTextField66.setText("");
         jTextField67.setText("");
         jTextField68.setText("");
        jTextField69.setText("");
         jTextField52.setText("");
         jTextField62.setText("");
        jTextField56.setText("");
         jTextField76.setText("");
        
        this.tab4.setVisible(true);
        this.caredit.setVisible(false);    }//GEN-LAST:event_jButton138ActionPerformed

    private void jButton139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton139ActionPerformed
       this.tab4.setVisible(true);
        this.gasstationedit.setVisible(false);
        jTextField70.setText("");
        jTextField71.setText("");
         jTextField77.setText("");
       
    }//GEN-LAST:event_jButton139ActionPerformed

    private void jButton140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton140ActionPerformed
 jTextField72.setText("");
        jTextField73.setText("");
         jTextField74.setText("");
        jTextField78.setText("");
        
        this.tab4.setVisible(true);
        this.Taxiedit.setVisible(false);    }//GEN-LAST:event_jButton140ActionPerformed

    private void jButton141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton141ActionPerformed
       this.tab4.setVisible(true);
        this.Reserveacar.setVisible(false);
         jTextField79.setText("");
        jTextField80.setText("");
    }//GEN-LAST:event_jButton141ActionPerformed

    private void jButton142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton142ActionPerformed
          this.tab4.setVisible(true);
        this.Reserveataxi.setVisible(false);
         jTextField81.setText("");
        jTextField82.setText("");
    }//GEN-LAST:event_jButton142ActionPerformed

    private void jButton143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton143ActionPerformed
        this.tab4.setVisible(true);
        this.Couponadd.setVisible(false);
         jTextField64.setText("");
        jTextField80.setText("");
         jTextField83.setText("");
       
    }//GEN-LAST:event_jButton143ActionPerformed

    private void jTextField64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField64ActionPerformed

    private void jButton144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton144ActionPerformed
          this.HomePanel.setVisible(true);
        this.Reports.setVisible(false);
    }//GEN-LAST:event_jButton144ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        Male= true;
        Female=false;
        this.jRadioButton8.setSelected(false);
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        Male= false;
        Female=true;
        this.jRadioButton7.setSelected(false);
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String SelectedItem= (String)jComboBox1.getSelectedItem();
        if(SelectedItem.equals("FullTime"))
        {
        jLabel121.setVisible(true);
        jTextField88.setVisible(true);
        
                jLabel201.setVisible(false);
        jLabel202.setVisible(false);
        jTextField85.setVisible(false);
        jTextField87.setVisible(false);
        Fulltime=true;
        Parttime=false;
        }
        else if(SelectedItem.equals("PartTime"))
        {
        jLabel201.setVisible(true);
        jLabel202.setVisible(true);
        jTextField85.setVisible(true);
        jTextField87.setVisible(true);
        
        jLabel121.setVisible(false);
        jTextField88.setVisible(false);
        Parttime=true;
        Fulltime=false;
        }
        else 
            System.out.println("Its Null Alright, but you will choose something evantually.");
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed

        this.jLabel205.setVisible(true );
        this.jLabel204.setVisible(true);
        this.jTextField55.setVisible(true);
        this.jTextField59.setVisible(true);
        this.jButton45.setVisible(true);
        

    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
if(this.jTextField55.getText().length()>0 && jTextField59.getText().length()>0)
{
        if(this.jTextField55.getText().equals(this.jTextField59.getText()))
{

          try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            String connInfo = "jdbc:postgresql://localhost:5432/postgres";
            Connection con=DriverManager.getConnection(connInfo,"hadi","123");
            con.setAutoCommit(false);
            String qry="update vt.userpassword set passcode='"+jTextField55.getText()+"'";
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(qry);
            con.commit();
            con.close();
            
            JOptionPane.showMessageDialog(this,"Password Has Been Changed Successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
            password=jTextField55.getText();

        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
          
        this.jLabel205.setVisible(false);
        this.jLabel204.setVisible(false);
        this.jTextField55.setVisible(false);
        this.jTextField59.setVisible(false);
        this.jButton45.setVisible(false);
        this.jTextField55.setText("");
        this.jTextField59.setText("");
}
else JOptionPane.showMessageDialog(this,"Passwords don't Match","Error Occured",JOptionPane.ERROR_MESSAGE);
}
else JOptionPane.showMessageDialog(this,"Password Fields are left empty, please Write your new Password in","Error Occured",JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_jButton45ActionPerformed

    private void jTextField55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField55ActionPerformed

    private void jTextField59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField59ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Couponadd;
    private javax.swing.JPanel FeedBack;
    private javax.swing.JPanel Gasadd;
    private javax.swing.JPanel Gasview;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel Reports;
    private javax.swing.JPanel Reserveacar;
    private javax.swing.JPanel Reserveataxi;
    private javax.swing.JPanel Settings;
    private javax.swing.JPanel Taxiadd;
    private javax.swing.JPanel Taxiedit;
    private javax.swing.JPanel Taxiview;
    private javax.swing.JPanel caradd;
    private javax.swing.JPanel caredit;
    private javax.swing.JPanel carview;
    private javax.swing.JPanel empadd;
    private javax.swing.JPanel empedit;
    private javax.swing.JPanel empview;
    private javax.swing.JPanel forgotpassword;
    private javax.swing.JPanel gasstationedit;
    private javax.swing.JPanel insuranceadd;
    private javax.swing.JPanel insuranceedit;
    private javax.swing.JPanel insuranceview;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton104;
    private javax.swing.JButton jButton105;
    private javax.swing.JButton jButton106;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton108;
    private javax.swing.JButton jButton109;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton110;
    private javax.swing.JButton jButton111;
    private javax.swing.JButton jButton112;
    private javax.swing.JButton jButton113;
    private javax.swing.JButton jButton114;
    private javax.swing.JButton jButton115;
    private javax.swing.JButton jButton116;
    private javax.swing.JButton jButton117;
    private javax.swing.JButton jButton118;
    private javax.swing.JButton jButton119;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton120;
    private javax.swing.JButton jButton121;
    private javax.swing.JButton jButton122;
    private javax.swing.JButton jButton123;
    private javax.swing.JButton jButton124;
    private javax.swing.JButton jButton125;
    private javax.swing.JButton jButton126;
    private javax.swing.JButton jButton127;
    private javax.swing.JButton jButton128;
    private javax.swing.JButton jButton129;
    private javax.swing.JButton jButton130;
    private javax.swing.JButton jButton131;
    private javax.swing.JButton jButton132;
    private javax.swing.JButton jButton133;
    private javax.swing.JButton jButton134;
    private javax.swing.JButton jButton135;
    private javax.swing.JButton jButton136;
    private javax.swing.JButton jButton137;
    private javax.swing.JButton jButton138;
    private javax.swing.JButton jButton139;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton140;
    private javax.swing.JButton jButton141;
    private javax.swing.JButton jButton142;
    private javax.swing.JButton jButton143;
    private javax.swing.JButton jButton144;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField82;
    private javax.swing.JTextField jTextField83;
    private javax.swing.JTextField jTextField84;
    private javax.swing.JTextField jTextField85;
    private javax.swing.JTextField jTextField86;
    private javax.swing.JTextField jTextField87;
    private javax.swing.JTextField jTextField88;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel maintenanceadd;
    private javax.swing.JPanel maintenanceedit;
    private javax.swing.JPanel maintenanceview;
    private javax.swing.JPanel tab4;
    // End of variables declaration//GEN-END:variables

    

}
