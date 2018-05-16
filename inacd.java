/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inacd;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author M-Five
 */
public class inacd extends javax.swing.JFrame {
public String DBMS;
public String Host;
public String Port;
public String Usr;
public String PassWord;
public String DB;
public Connection conn;

ArrayList name = new ArrayList();

        
    /**
     * Creates new form inacd
     */

    /**
     * Creates new form inacd
     * @return db connection
     * @throws java.lang.ClassNotFoundException
     */
    public Connection PGconn() throws ClassNotFoundException{
        DBMS = TDBMS.getText();
        Host = THOST.getText();
        Port = TPORT.getText();
        DB = TDB.getText();
        Usr = TUSER.getText();
        PassWord = TPASS.getText();
        String url = "jdbc:"+DBMS+"://"+Host+":"+Port+"/"+DB+"?user="+Usr+"&password="+PassWord;; //":"+Port+ /// +"?user="+root+"&password="+rootpassword;
        System.out.println(url);
        try {      
            Class.forName("com.mysql.jdbc.Driver");
        conn = (Connection) DriverManager.getConnection(url);//(url,Usr,PassWord) ///,Usr.trim(),PassWord.trim()
        return conn;
        } catch (SQLException ex) {
        Logger.getLogger(inacd.class.getName()).log(Level.SEVERE, null, ex);    }
        return null;
     }
    //table data load
    public void TabDataLoad() throws SQLException {
            DefaultTableModel dftable = (DefaultTableModel) tableT.getModel();
            dftable.setRowCount(0);
            String LoadDataSql = "SELECT * FROM `mfive`";
            PreparedStatement ld = conn.prepareStatement(LoadDataSql);
            ResultSet rst = ld.executeQuery();

            while(rst.next()) {
            String c0 = rst.getString("ID");    
            String c1 = rst.getString("0_Name");
            name.add(c1);
            String c1_1 = rst.getString("Haupt_Branchen");
            String c2 = rst.getString("1_Verarbeitendes_Gewerbe");
            String c3 = rst.getString("11_Automobilbauer_OME");
            String c4 = rst.getString("111_pkw");
            String c5 = rst.getString("1111_Premium");
            String c6 = rst.getString("1112_Volumen");
            String c7 = rst.getString("112_NFZ");
            String c8 = rst.getString("1121_Leichte_NFZ");
            String c9 = rst.getString("1122_Schwere_NFZ");
            String c10 = rst.getString("1123_Omnibusse");
            String c11 = rst.getString("1124_Sonstige_Kraftwagen");
            String c12 = rst.getString("12_Zulieferer");
            String c13 = rst.getString("121_Komponenten_für_Verbrennungsmotoren");
            String c14 = rst.getString("122_Alternative_Antriebe");
            String c15 = rst.getString("1221_E-Motor");
            String c16 = rst.getString("1222_Batterie");
            String c17 = rst.getString("12221_Zellen");
            String c18 = rst.getString("12222_Bateriemanagement");
            String c19 = rst.getString("12223_Sonstige");
            String c20 = rst.getString("1223_Brennstoffzelle");
            String c21 = rst.getString("1224_H2_Tank");
            String c22 = rst.getString("123_Exterieur");
            String c23 = rst.getString("124_Interieur");
            String c24 = rst.getString("125_Antriebsstrang");
            String c25 = rst.getString("126_Karosserie");
            String c26 = rst.getString("127_Fahrwerk");
            String c27 = rst.getString("128_Elektrik_Elektronik");
            String c28 = rst.getString("13_Werkzeuge_und_Maschinen");
            String c29 = rst.getString("14_Sonstige_Metallverarbeitung");
            String c30 = rst.getString("15_Electrotechnik");
            String c31 = rst.getString("151_Sensoren");
            String c32 = rst.getString("152_Robotik");
            String c33 = rst.getString("16_Schienenfahrzeugbau");
            String c34 = rst.getString("17_Sonstige_Industrie");
            String c35 = rst.getString("2_Dienstleistung");
            String c36 = rst.getString("21_Mobilitätsdienstleistung");
            String c37 = rst.getString("211_ÖPV");
            String c38 = rst.getString("2111_Fernverkehr");
            String c39 = rst.getString("21111_Staße");
            String c40 = rst.getString("21112_Schiene");
            String c41 = rst.getString("2112_Nahverkehr");
            String c42 = rst.getString("21121_Staße");
            String c43 = rst.getString("21122_Schiene");
            String c44 = rst.getString("2113_Taxi_AST");
            String c45 = rst.getString("212_Mietwagen");
            String c46 = rst.getString("2121Car_Sharing");
            String c47 = rst.getString("21211_free-floating");
            String c48 = rst.getString("21212_stationsbasiert");
            String c49 = rst.getString("2122_Konvertioneller_Meitwagen");
            String c50 = rst.getString("213_Ride-Sharing_Mitfahrgelegenheit");
            String c51 = rst.getString("214_Ride_Hailing");
            String c52 = rst.getString("22_Güterverkehr_Transport");
            String c53 = rst.getString("221_Güterbeförderung_im_Eisenbahnverkehr");
            String c54 = rst.getString("222_Güterbeförderung_Straßenverkehr");
            String c55 = rst.getString("223_Güterbeförderung_in_der_Binnenschifffahrt");
            String c56 = rst.getString("224_Güterbeförderung_in_der_See_und_Küsterschifffahrt");
            String c57 = rst.getString("225_Güterbeförderung_in_der_Luftfahrt");
            String c58 = rst.getString("23_Verkehrsnahe_Dienstleistungen_Lagerei");
            String c59 = rst.getString("231_Lagerei");
            String c60 = rst.getString("232_Frachtumschlag");
            String c61 = rst.getString("233_Umzugstransporte");
            String c62 = rst.getString("234_Spedition");
            String c63 = rst.getString("235_Post-_Kurier-_und_Expressdienste");
            String c64 = rst.getString("24_Finanzdienstleistung_Bankwesen");
            String c65 = rst.getString("25_IT");
            String c66 = rst.getString("251_Datenverarbeitung");
            String c67 = rst.getString("252_Softwareprogrammierung");
            String c68 = rst.getString("253_Sensoren");
            String c69 = rst.getString("26_F&E");
            String c70 = rst.getString("261_Fhrzeugbau");
            String c71 = rst.getString("262_Energie_Kraftstoffe");
            String c72 = rst.getString("263_Verfahrenstechnik");
            String c73 = rst.getString("27_Consulting");
            String c74 = rst.getString("28_Sonstige_Dienstleistung");
            String c75 = rst.getString("29_Subsidiaries_ACTOR");
            String c76 = rst.getString("291_Actor1");
            String c77 = rst.getString("292_Actor2");
            String c78 = rst.getString("293_Actor3");
            String c79 = rst.getString("294_Actor4");
            String c80 = rst.getString("295_Actor5");
            String c81 = rst.getString("30_Part_of_Cluster");
            String c82 = rst.getString("301_Name_of_Cluster");
            //String c83 = rst.getString("302_kind_of_Cluster");
            //String c84 = rst.getString("303_New_cluster_ifNone");
            String c85 = rst.getString("4_Original_Name_Companies");
            String c86 = rst.getString("41_Investor");
            int c87 = rst.getInt("42_Sales_euro");
            int c88 = rst.getInt("43_grüdungsjahr");
            String c89 = rst.getString("44_Legal_Form");
            String c90 = rst.getString("45_Standorte");
            String c91 = rst.getString("46_Märkte");
            String c92 = rst.getString("Datum");
            String c76_1 = rst.getString("Beschreibung1");
            String c77_1 = rst.getString("Beschreibung2");
            String c78_1 = rst.getString("Beschreibung3");
            String c79_1 = rst.getString("Beschreibung4");
            String c80_1 = rst.getString("Beschreibung5");
            String c90_1 = rst.getString("WeiterStandorte1");
            String c90_2 = rst.getString("WeiterStandorte2");
            String c90_3 = rst.getString("WeiterStandorte3");
            //4data is not displaying but in the main table
            //c84,c83 removed
            Object[] obj = {c0,c1,c1_1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41,c42,c43,c44,c45,c46,c47,c48,c49,c50,c51,c52,c53,c54,c55,c56,c57,c58,c59,c60,c61,c62,c63,c64,c65,c66,c67,c68,c69,c70,c71,c72,c73,c74,c75,c76,c76_1,c77,c77_1,c78,c78_1,c79,c79_1,c80,c80_1,c81,c82,c85,c86,c87,c88,c89,c90,c90_1,c90_2,c90_3,c91,c92};
            dftable.addRow(obj);
            }   
    }
//Update Method UPDATE Customers SET ContactName='Alfred Schmidt', City='Frankfurt';
    public void upDate(){
                String delSQL= "UPDATE inacd.mfive SET txt=? , txt2=?";        
   try { 
            try (PreparedStatement updata = conn.prepareStatement(delSQL)) {
                updata.setString(1, IDtx.getText());
                //updata.setBoolean(2, val1t.isSelected());
                //updata.setInt(3,val2t.getSelectedIndex());
               // updata.setString(2, txt2.getText());
                updata.execute();
                updata.close();
            }
        } catch (SQLException ex) {
        Logger.getLogger(inacd.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
//delete method
    public void DelSelRow(){
        String delSQL= "DELETE FROM inacd.mfive WHERE ID=?";        
   try { 
            try (PreparedStatement deldata = conn.prepareStatement(delSQL)) {
                deldata.setString(1, IDtx.getText());
                deldata.execute();
                deldata.close();
            }
        } catch (SQLException ex) {
        Logger.getLogger(inacd.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    public inacd() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        logo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        title = new javax.swing.JLabel();
        L_dbms = new javax.swing.JLabel();
        host = new javax.swing.JLabel();
        port = new javax.swing.JLabel();
        usr = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        db = new javax.swing.JLabel();
        THOST = new javax.swing.JTextField();
        TPORT = new javax.swing.JTextField();
        TDBMS = new javax.swing.JTextField();
        TUSER = new javax.swing.JTextField();
        TDB = new javax.swing.JTextField();
        Bconn = new javax.swing.JButton();
        stat = new javax.swing.JLabel();
        connection = new javax.swing.JLabel();
        TPASS = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableT = new javax.swing.JTable();
        exit = new javax.swing.JButton();
        refr = new javax.swing.JButton();
        update = new javax.swing.JButton();
        del = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        Msg = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Id = new javax.swing.JLabel();
        IDtx = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ft0 = new javax.swing.JTextField();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        f1 = new javax.swing.JRadioButton();
        f10 = new javax.swing.JRadioButton();
        f32 = new javax.swing.JRadioButton();
        f31 = new javax.swing.JRadioButton();
        f28 = new javax.swing.JRadioButton();
        f27 = new javax.swing.JRadioButton();
        f26 = new javax.swing.JRadioButton();
        f2 = new javax.swing.JRadioButton();
        f3 = new javax.swing.JRadioButton();
        f4 = new javax.swing.JRadioButton();
        f5 = new javax.swing.JRadioButton();
        f6 = new javax.swing.JRadioButton();
        f7 = new javax.swing.JRadioButton();
        f8 = new javax.swing.JRadioButton();
        f9 = new javax.swing.JRadioButton();
        f11 = new javax.swing.JRadioButton();
        f12 = new javax.swing.JRadioButton();
        f13 = new javax.swing.JRadioButton();
        f14 = new javax.swing.JRadioButton();
        f15 = new javax.swing.JRadioButton();
        f16 = new javax.swing.JRadioButton();
        f17 = new javax.swing.JRadioButton();
        f18 = new javax.swing.JRadioButton();
        f19 = new javax.swing.JRadioButton();
        f20 = new javax.swing.JRadioButton();
        f21 = new javax.swing.JRadioButton();
        f22 = new javax.swing.JRadioButton();
        f23 = new javax.swing.JRadioButton();
        f24 = new javax.swing.JRadioButton();
        f25 = new javax.swing.JRadioButton();
        ft17 = new javax.swing.JTextField();
        ft27 = new javax.swing.JTextField();
        f29 = new javax.swing.JRadioButton();
        f30 = new javax.swing.JRadioButton();
        ft32 = new javax.swing.JTextField();
        f00 = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        f34 = new javax.swing.JRadioButton();
        f71 = new javax.swing.JRadioButton();
        f70 = new javax.swing.JRadioButton();
        f66 = new javax.swing.JRadioButton();
        f61 = new javax.swing.JRadioButton();
        f62 = new javax.swing.JRadioButton();
        f55 = new javax.swing.JRadioButton();
        f49 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        f35 = new javax.swing.JRadioButton();
        f36 = new javax.swing.JRadioButton();
        f37 = new javax.swing.JRadioButton();
        f38 = new javax.swing.JRadioButton();
        f39 = new javax.swing.JRadioButton();
        f40 = new javax.swing.JRadioButton();
        f41 = new javax.swing.JRadioButton();
        f42 = new javax.swing.JRadioButton();
        f43 = new javax.swing.JRadioButton();
        f44 = new javax.swing.JRadioButton();
        f45 = new javax.swing.JRadioButton();
        f46 = new javax.swing.JRadioButton();
        f47 = new javax.swing.JRadioButton();
        f48 = new javax.swing.JRadioButton();
        f50 = new javax.swing.JRadioButton();
        f51 = new javax.swing.JRadioButton();
        f52 = new javax.swing.JRadioButton();
        f53 = new javax.swing.JRadioButton();
        f54 = new javax.swing.JRadioButton();
        f56 = new javax.swing.JRadioButton();
        f57 = new javax.swing.JRadioButton();
        f58 = new javax.swing.JRadioButton();
        f59 = new javax.swing.JRadioButton();
        f60 = new javax.swing.JRadioButton();
        f63 = new javax.swing.JRadioButton();
        f64 = new javax.swing.JRadioButton();
        f65 = new javax.swing.JRadioButton();
        f67 = new javax.swing.JRadioButton();
        f68 = new javax.swing.JRadioButton();
        f69 = new javax.swing.JRadioButton();
        ft71 = new javax.swing.JTextField();
        f33 = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        s0 = new javax.swing.JRadioButton();
        s1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        st7 = new javax.swing.JTextField();
        scb1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        hb1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");
        jRadioButtonMenuItem1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("M-Five - INCAD");
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\bf\\Documents\\NetBeansProjects\\inacd\\src\\inacd\\m-five_logo.png")); // NOI18N

        title.setFont(new java.awt.Font("Vrinda", 3, 14)); // NOI18N
        title.setText("INACD :");

        L_dbms.setText("DBMS Name :");

        host.setText("Host Name :");

        port.setText("Port :");

        usr.setText("User Name :");

        pass.setText("Password :");

        db.setText("DB Name :");

        THOST.setText("192.168.2.10");
        THOST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                THOSTMouseClicked(evt);
            }
        });

        TPORT.setText("3307");
        TPORT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TPORTMouseClicked(evt);
            }
        });

        TDBMS.setText("mysql");
        TDBMS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TDBMSMouseClicked(evt);
            }
        });

        TUSER.setText("root");
        TUSER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TUSERMouseClicked(evt);
            }
        });
        TUSER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TUSERActionPerformed(evt);
            }
        });

        TDB.setText("inacd");
        TDB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TDBMouseClicked(evt);
            }
        });

        Bconn.setText("Connect");
        Bconn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BconnActionPerformed(evt);
            }
        });

        stat.setText("Status :");

        connection.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        connection.setText(" ...  ...");

        TPASS.setText("bf_TEMP_55");
        TPASS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TPASSMouseClicked(evt);
            }
        });

        tableT.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tableT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Haupt-Branche", "Verarbeitendes Gewerbe", "Automobilbauer(OME)", "pkw", "Premium", "Volumen", "NFZ", "Leichte NFZ", "Schwere NFZ", "Omnibusse", "Sonstige Kraftwagen", "Zuliferer", "Komponenten für Ver", "Alternative Antriebe", "E-Motor", "Batterie", "Zellen", "Batteriemanagement", "Sonstige Text", "Brennstoffzelle", "H2-Tank", "Exterieur", "Interieur", "Antriebsstrang", "Karosserie", "Fahrwerk", "Elecktrik/Elektrinik", "Werkzeuge Und Maschinen", "Sonstige Metallverarbeitung", "Elektrotechnik", "Sensoren", "Robotik", "Schienennfahrzeugbau", "Sonstige Industie Txt", "Dienstleistung", "Mobilitätsdienstleistung", "ÖPV", "Fernverkehr", "Straße", "Schiene", "Nahverkehr", "Straße", "Schiene", "Taxi /AST", "Mietwagen", "Car-Sharing", "Free-Floating", "Stationsbasiert", "Konventioneller Mierwagen", "Ride-Sharing", "Ride-Hailing", "Güterverkehr_Transport", "Güterbeförderung_im_Eisenbahnverkehr", "Güterbeförderung_Straßenverkehr", "Güterbeförderung_in_der_Binnenschifffahrt", "Güterbeförderung_in_der_See_und_Küsterschifffahrt", "Güterbeförderung_in_der_Luftfahrt", "Verkehrsnahe_Dienstleistungen_Lagerei", "Lagerei", "Frachtumschlag", "Umzugstransporte", "Spedition", "Post-_Kurier-_und_Expressdienste", "Finanzdienstleistung_Bankwesen", "IT", "Datenverarbeitung", "Softwareprogrammierung", "Sensoren", "F&E", "Fhrzeugbau", "Energie_Kraftstoffe", "Verfahrenstechnik", "Consulting", "Sonstige_Dienstleistung", "ubsidiaries_ACTOR", "Actor1", "Description1", "Actor2", "Description2", "Actor3", "Description3", "Actor4", "Description4", "Actor5", "Description5", "Part_of_Cluster", "Name_of_Cluster", "Original_Name_Companies", "Investor", "Sales_euro", "grüdungsjahr", "Legal_Form", "Standorte", "WeiterStandorte1", "WeiterStandorte2", "WeiterStandorte3", "Märkte", "Datum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, true, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableT.setAlignmentX(0.1F);
        tableT.setAlignmentY(0.1F);
        tableT.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableT.setColumnSelectionAllowed(true);
        tableT.setName("inacd");
        tableT.getTableHeader().setReorderingAllowed(false);
        tableT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableT);
        tableT.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        refr.setText("Refresh");
        refr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        Msg.setFont(new java.awt.Font("Vrinda", 3, 12)); // NOI18N
        Msg.setForeground(new java.awt.Color(204, 0, 0));
        Msg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MsgMouseMoved(evt);
            }
        });
        Msg.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                MsgVetoableChange(evt);
            }
        });

        Id.setText("ID:");

        IDtx.setText("ID");

        jLabel1.setText("NAME des Unternehmens[ACTOR] :");

        ft0.setText("Name");
        ft0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ft0MouseClicked(evt);
            }
        });
        ft0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ft0KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ft0KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ft0KeyTyped(evt);
            }
        });

        jTabbedPane5.setAutoscrolls(true);
        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        f1.setText("Automobilbauer (OEM)");
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });

        f10.setText("Zulieferer");

        f32.setText("Sonstige Industrie");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, ft32, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), f32, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        f32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f32ActionPerformed(evt);
            }
        });

        f31.setText("Schienenfahrzeugbau");
        f31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f31ActionPerformed(evt);
            }
        });

        f28.setText("Elektrotechnik");
        f28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f28ActionPerformed(evt);
            }
        });

        f27.setText("Sonstige Metallverarbeitung");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, ft27, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), f27, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        f27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f27ActionPerformed(evt);
            }
        });

        f26.setText("Werkzeuge und Maschinen");

        f2.setText("PKW");
        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });

        f3.setText("Premium");
        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });

        f4.setText("Volumen");
        f4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f4ActionPerformed(evt);
            }
        });

        f5.setText("NFZ");
        f5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f5ActionPerformed(evt);
            }
        });

        f6.setText("Leichte NFZ");
        f6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f6ActionPerformed(evt);
            }
        });

        f7.setText("Schwere NFZ");
        f7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f7ActionPerformed(evt);
            }
        });

        f8.setText("Omnibusse");
        f8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f8ActionPerformed(evt);
            }
        });

        f9.setText("Sonstige Kraftwagen");
        f9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f9ActionPerformed(evt);
            }
        });

        f11.setText("Komponenten für Verbrennungsmotoren");
        f11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f11ActionPerformed(evt);
            }
        });

        f12.setText("Alternative Antriebe");
        f12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f12ActionPerformed(evt);
            }
        });

        f13.setText("E-Motor");
        f13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f13ActionPerformed(evt);
            }
        });

        f14.setText("Batterie");
        f14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f14ActionPerformed(evt);
            }
        });

        f15.setText("Zellen");
        f15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f15ActionPerformed(evt);
            }
        });

        f16.setText("Batteriemanagement");
        f16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f16ActionPerformed(evt);
            }
        });

        f17.setText("Sonstige");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, ft17, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), f17, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        f17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f17ActionPerformed(evt);
            }
        });

        f18.setText("Brennstoffzelle");
        f18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f18ActionPerformed(evt);
            }
        });

        f19.setText("H2-Tank");
        f19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f19ActionPerformed(evt);
            }
        });

        f20.setText("Exterieur");
        f20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f20ActionPerformed(evt);
            }
        });

        f21.setText("Interieur");
        f21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f21ActionPerformed(evt);
            }
        });

        f22.setText("Antriebsstrang");
        f22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f22ActionPerformed(evt);
            }
        });

        f23.setText("Karosserie");
        f23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f23ActionPerformed(evt);
            }
        });

        f24.setText("Fahrwerk");
        f24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f24ActionPerformed(evt);
            }
        });

        f25.setText("Elektrik/Elektronik");
        f25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f25ActionPerformed(evt);
            }
        });

        ft17.setText("User Input");
        ft17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ft17MouseClicked(evt);
            }
        });
        ft17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ft17ActionPerformed(evt);
            }
        });

        ft27.setText("User Input - Sons. Met");
        ft27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ft27MouseClicked(evt);
            }
        });
        ft27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ft27ActionPerformed(evt);
            }
        });

        f29.setText("Sensoren");
        f29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f29ActionPerformed(evt);
            }
        });

        f30.setText("Robotik");
        f30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f30ActionPerformed(evt);
            }
        });

        ft32.setText("User Input - Sons- Ind.");
        ft32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ft32MouseClicked(evt);
            }
        });
        ft32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ft32ActionPerformed(evt);
            }
        });

        f00.setText("VG");
        f00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f00ActionPerformed(evt);
            }
        });

        jLabel29.setText("** Bitte alle auf das Unternehmen zutreffende Aktivitäten auswählen!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(f00))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f2)
                                    .addComponent(f5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(f4)
                                            .addComponent(f3)
                                            .addComponent(f6)
                                            .addComponent(f7)
                                            .addComponent(f8)
                                            .addComponent(f9))))))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f20)
                                    .addComponent(f21)
                                    .addComponent(f22)
                                    .addComponent(f23)
                                    .addComponent(f24)
                                    .addComponent(f25)
                                    .addComponent(f12)
                                    .addComponent(f11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(f14)
                                            .addComponent(f13)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(f16)
                                                    .addComponent(f15)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(f17)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ft17, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(f18)
                                            .addComponent(f19)))))
                            .addComponent(f10))
                        .addGap(47, 47, 47)
                        .addComponent(f26)
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(ft27))
                            .addComponent(f27))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f28)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f30)
                                    .addComponent(f29))))
                        .addGap(18, 18, 18)
                        .addComponent(f31)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f32)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(ft32, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(176, 176, 176))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f1)
                    .addComponent(f10)
                    .addComponent(f32)
                    .addComponent(f31)
                    .addComponent(f27)
                    .addComponent(f26)
                    .addComponent(f28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f2)
                    .addComponent(f11)
                    .addComponent(ft27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f29)
                    .addComponent(ft32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f3)
                    .addComponent(f12)
                    .addComponent(f30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f4)
                    .addComponent(f13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f5)
                    .addComponent(f14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f6)
                    .addComponent(f15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f7)
                    .addComponent(f16))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f8)
                    .addComponent(f17)
                    .addComponent(ft17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f9)
                    .addComponent(f18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f00)
                    .addComponent(jLabel29)))
        );

        jTabbedPane5.addTab("Verarbeitendes Gewerbe", jPanel1);

        f34.setText("Mobilitätsdienstleistung");

        f71.setText("Sonstige Dienstleistung");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, ft71, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), f71, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        f71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f71ActionPerformed(evt);
            }
        });

        f70.setText("Consulting");
        f70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f70ActionPerformed(evt);
            }
        });

        f66.setText("F&E");

        f61.setText("Finanzdienstleistung / Bankwesen");

        f62.setText("IT");
        f62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f62ActionPerformed(evt);
            }
        });

        f55.setText("Verkehrsnahe Dieenstleistungen / Lagerei");

        f49.setText("Güterverkehr / Transport");
        f49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f49ActionPerformed(evt);
            }
        });

        jRadioButton41.setText("ÖPV");
        jRadioButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton41ActionPerformed(evt);
            }
        });

        f35.setText("Fernverkehr");
        f35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f35ActionPerformed(evt);
            }
        });

        f36.setText("Straße");
        f36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f36ActionPerformed(evt);
            }
        });

        f37.setText("Schiene");
        f37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f37ActionPerformed(evt);
            }
        });

        f38.setText("Nahverkehr");
        f38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f38ActionPerformed(evt);
            }
        });

        f39.setText("Straße");
        f39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f39ActionPerformed(evt);
            }
        });

        f40.setText("Schiene");
        f40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f40ActionPerformed(evt);
            }
        });

        f41.setText("Taxi / AST");
        f41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f41ActionPerformed(evt);
            }
        });

        f42.setText("Mietwagen");
        f42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f42ActionPerformed(evt);
            }
        });

        f43.setText("Car-Sharing");
        f43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f43ActionPerformed(evt);
            }
        });

        f44.setText("Free-floating");
        f44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f44ActionPerformed(evt);
            }
        });

        f45.setText("Stationsbasiert");
        f45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f45ActionPerformed(evt);
            }
        });

        f46.setText("Konventioneller Mierwagen");
        f46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f46ActionPerformed(evt);
            }
        });

        f47.setText("Ride-Sharing/Mitfahrgelegenheit");
        f47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f47ActionPerformed(evt);
            }
        });

        f48.setText("Ride-Hailing");
        f48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f48ActionPerformed(evt);
            }
        });

        f50.setText("Güterbeförderung im Eisenbahnverkehr");
        f50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f50ActionPerformed(evt);
            }
        });

        f51.setText("Güterbeförderung Straßenverkehr");
        f51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f51ActionPerformed(evt);
            }
        });

        f52.setText("Güterbeförderung in der Binnenschifffahrt");
        f52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f52ActionPerformed(evt);
            }
        });

        f53.setText("Güterbeförderung in der See- und Küstenschifffahrt");
        f53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f53ActionPerformed(evt);
            }
        });

        f54.setText("Güterbeförderung in der Luftfahrt");
        f54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f54ActionPerformed(evt);
            }
        });

        f56.setText("Lagerei");
        f56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f56ActionPerformed(evt);
            }
        });

        f57.setText("Frachtumschlag");
        f57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f57ActionPerformed(evt);
            }
        });

        f58.setText("Umzugstransporte");
        f58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f58ActionPerformed(evt);
            }
        });

        f59.setText("Spedition");
        f59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f59ActionPerformed(evt);
            }
        });

        f60.setText("Post-, Kurier- und Expressdienste");
        f60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f60ActionPerformed(evt);
            }
        });

        f63.setText("Datenverarbeitung");
        f63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f63ActionPerformed(evt);
            }
        });

        f64.setText("Softwareprogrammierung");
        f64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f64ActionPerformed(evt);
            }
        });

        f65.setText("Sensoren");
        f65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f65ActionPerformed(evt);
            }
        });

        f67.setText("Fahrzeugbau");
        f67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f67ActionPerformed(evt);
            }
        });

        f68.setText("Energie/Kraftstoffe");
        f68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f68ActionPerformed(evt);
            }
        });

        f69.setText("Verfahrenstechnik");
        f69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f69ActionPerformed(evt);
            }
        });

        ft71.setText("User Input -Sons. Deinst.");
        ft71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ft71MouseClicked(evt);
            }
        });
        ft71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ft71ActionPerformed(evt);
            }
        });

        f33.setText("D");
        f33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f33ActionPerformed(evt);
            }
        });

        jLabel30.setText("** Bitte alle auf das Unternehmen zutreffende Aktivitäten auswählen!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f42)
                            .addComponent(f47)
                            .addComponent(f48)
                            .addComponent(jRadioButton41)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f35)
                                    .addComponent(f38)
                                    .addComponent(f41)
                                    .addComponent(f43)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(f39)
                                            .addComponent(f40)
                                            .addComponent(f45)
                                            .addComponent(f44)
                                            .addComponent(f36)
                                            .addComponent(f37)))
                                    .addComponent(f46)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(f34)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f51)
                            .addComponent(f50)
                            .addComponent(f52)
                            .addComponent(f53)
                            .addComponent(f54)))
                    .addComponent(f49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f55)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(f56, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f57, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f59, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f60, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f58, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(f64, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f65, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f63, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(196, 196, 196))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(f62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(f61)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(f66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(f70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f68)
                            .addComponent(f69)
                            .addComponent(f67))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f71)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(ft71, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(f33)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(f55)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f56)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f57)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f58))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(f62)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f63)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f64)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f65)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f59)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f60))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(f34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(f36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f37))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f35)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f38))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(f49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f54)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f48))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(f71)
                            .addComponent(f70))
                        .addGap(7, 7, 7)
                        .addComponent(ft71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(f66)
                            .addComponent(f61))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f69)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f33)
                    .addComponent(jLabel30))
                .addContainerGap())
        );

        jTabbedPane5.addTab("Dienstleistung", jPanel2);

        jTextField2.setText("mehrere [ACTORS]");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setText("ACTOR 1");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Subsidiaries/Tochter Firma of [ACTOR]:");

        jLabel3.setText("Strategic Alliances and Partnershipd with:");

        jLabel4.setText("Strategic Alliances and Partnershipd with:");

        jLabel5.setText("Strategic Alliances and Partnershipd with:");

        jLabel6.setText("Part of Cluster");

        s0.setSelected(true);
        s0.setText("Nein");
        s0.setName(""); // NOI18N
        s0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s0ActionPerformed(evt);
            }
        });

        s1.setText("Ja");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, st7, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), s1, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Name of Cluster:");

        jLabel8.setText("Kind of Cluster:");

        jLabel10.setText("Hauptsitz / Head Quater :");

        jLabel11.setText("Rechtsform / Legal form: ");

        jLabel12.setText("Original Name of the Company/Companies :");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel13.setText("Investors:");

        jLabel15.setText("Umsatz / Sales [Betrag] Euro: ");

        jLabel16.setText("Gründungdjahr oder Jahr der Fusion/Founding Year:");

        jTextField8.setText("ACTOR 2");
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.setText("ACTOR 3");
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.setText("Name of the Company/Companies");
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField10MouseClicked(evt);
            }
        });
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField11.setText("Rechtsform");
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField11MouseClicked(evt);
            }
        });
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField12.setText("Standorte");
        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField12MouseClicked(evt);
            }
        });
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextField13.setText("not an actor");
        jTextField13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField13MouseClicked(evt);
            }
        });
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jTextField14.setText("00");
        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField14MouseClicked(evt);
            }
        });
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextField15.setText("0000");
        jTextField15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField15MouseClicked(evt);
            }
        });
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        st7.setText("Cluster Name");
        st7.setEnabled(false);
        st7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st7MouseClicked(evt);
            }
        });

        scb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none", "Automotive", "IT", " " }));
        scb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                scb1ItemStateChanged(evt);
            }
        });

        jLabel18.setText("Strategic Alliances and Partnershipd with:");

        jTextField16.setText("ACTOR 4");
        jTextField16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField16MouseClicked(evt);
            }
        });
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jLabel19.setText("Strategic Alliances and Partnershipd with:");

        jTextField18.setText("ACTOR 5");
        jTextField18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField18MouseClicked(evt);
            }
        });
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });

        jLabel20.setText("Märkte (Regions, Countries, Continents) :");

        jTextField1.setText("Märkte");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTextField4.setText("Beschreibung 1");
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        jTextField5.setText("Beschreibung 1");
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });

        jTextField6.setText("Beschreibung 3");
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });

        jTextField7.setText("Beschreibung 4");
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
        });

        jTextField17.setText("Beschreibung 5");
        jTextField17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField17MouseClicked(evt);
            }
        });

        jLabel14.setText("Beschreibung / Description of ACTOR 1");

        jLabel17.setText("Beschreibung / Description of ACTOR 2");

        jLabel21.setText("Beschreibung / Description of ACTOR 3");

        jLabel22.setText("Beschreibung / Description of ACTOR 4");

        jLabel23.setText("Beschreibung / Description of ACTOR 5");

        jTextField19.setText("Standorte");
        jTextField19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField19MouseClicked(evt);
            }
        });
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        jTextField20.setText("Standorte");
        jTextField20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField20MouseClicked(evt);
            }
        });

        jTextField21.setText("Standorte");
        jTextField21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField21MouseClicked(evt);
            }
        });

        jTextField22.setText("Standorte");
        jTextField22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField22MouseClicked(evt);
            }
        });

        jTextField23.setText("Standorte");
        jTextField23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField23MouseClicked(evt);
            }
        });

        jLabel24.setText("Weiter Standorte 1");

        jLabel25.setText("Weiter Standorte 2");

        jLabel26.setText("Weiter Standorte 3");

        jLabel27.setText("Weiter Standorte 4");

        jLabel28.setText("Weiter Standorte 5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19))
                    .addComponent(jLabel17)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(jTextField4)
                    .addComponent(jTextField8)
                    .addComponent(jTextField5)
                    .addComponent(jTextField9)
                    .addComponent(jTextField6)
                    .addComponent(jTextField16)
                    .addComponent(jTextField7)
                    .addComponent(jTextField18)
                    .addComponent(jTextField17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s0)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scb1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel11)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField12)
                    .addComponent(jTextField19)
                    .addComponent(jTextField20)
                    .addComponent(jTextField21)
                    .addComponent(jTextField22)
                    .addComponent(jTextField23, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(114, 114, 114))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(s0)
                            .addComponent(s1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(st7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(scb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Daten zum Unternehmen", jPanel3);

        hb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automobilbauer (OEM)", "Zulieferer", "Werkzeuge und Maschinen", "Sonstige Metallverarbeitung", "Elektrotechnik", "Schienenfahrzeugbau", "Sonstige Industrie", "Mobilitätsdienstleistung", "Güterverkehr/Transport", "Verkehrsnahe Dienstleistungen/Lagerei", "Finanzdienstleistung/Bankwesen", "IT", "F&E", "Consulting", "Sonstige Dienstleistung" }));
        hb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb1ActionPerformed(evt);
            }
        });

        jLabel9.setText("HAUPT-BRANCHE :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(refr)
                .addGap(18, 18, 18)
                .addComponent(update)
                .addGap(18, 18, 18)
                .addComponent(del)
                .addGap(18, 18, 18)
                .addComponent(Msg, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(logo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(L_dbms)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(host, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(port, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(THOST)
                                        .addComponent(TPORT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TDBMS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usr, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pass, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(db, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TUSER)
                                    .addComponent(TDB)
                                    .addComponent(TPASS, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addComponent(Id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDtx, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bconn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(connection, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(submit)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(ft0, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(hb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1530, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(55, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Bconn)
                                .addComponent(stat)
                                .addComponent(connection)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(title)
                            .addGap(8, 8, 8)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TDBMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(THOST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(TPORT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Id)
                                            .addComponent(IDtx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(52, 52, 52))
                                    .addComponent(L_dbms)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(host))
                                    .addComponent(usr)
                                    .addComponent(TUSER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(pass)
                                            .addComponent(TPASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(db)
                                            .addComponent(TDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(port)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ft0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submit)
                .addGap(11, 11, 11)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exit)
                        .addComponent(refr)
                        .addComponent(update)
                        .addComponent(del))
                    .addComponent(Msg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        ft0.setFocusTraversalKeysEnabled(false);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BconnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BconnActionPerformed
    try {
        PGconn();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(inacd.class.getName()).log(Level.SEVERE, null, ex);
    }
        if(conn == null){
            connection.setText("Not Connected");
            connection.setForeground(Color.RED); 
            Msg.setText("Check all Information");
        }else if(conn!= null){
            connection.setText("Connected");
            connection.setForeground(Color.GREEN);       
        } 
    try {
        TabDataLoad();
    } catch (SQLException ex) {
        Logger.getLogger(inacd.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }//GEN-LAST:event_BconnActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
    System.exit(0);
        try {
        // TODO add your handling code here:
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(inacd.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_exitActionPerformed

    private void TDBMSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TDBMSMouseClicked
        // TODO add your handling code here:
        TDBMS.setText(null);
        //System.out.println(DB);
    }//GEN-LAST:event_TDBMSMouseClicked

    private void THOSTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_THOSTMouseClicked
        // TODO add your handling code here:
        THOST.setText(null);
    }//GEN-LAST:event_THOSTMouseClicked

    private void TPORTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPORTMouseClicked
        // TODO add your handling code here:
        TPORT.setText(null);
    }//GEN-LAST:event_TPORTMouseClicked

    private void TUSERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TUSERMouseClicked
        // TODO add your handling code here:
        TUSER.setText(null);
    }//GEN-LAST:event_TUSERMouseClicked

    private void TPASSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPASSMouseClicked
        // TODO add your handling code here:
        TPASS.setText(null);
    }//GEN-LAST:event_TPASSMouseClicked

    private void TDBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TDBMouseClicked
        // TODO add your handling code here:
        TDB.setText(null);
    }//GEN-LAST:event_TDBMouseClicked
// all work will be here for data entry
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
       String v0,v00,v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15,v16,v17,v18,v19,v20,v21,v22,v23,v24,v25,v26,v27,v28,v29,v30,v31,v32,v33,v34,v35,v36,v37,v38,v39,v40,v41,v42,v43,v44,v45,v46,v47,v48,v49,v50,v51,v52,v53,v54,v55,v56,v57,v58,v59,v60,v61,v62,v63,v64,v65,v66,v67,v68,v69,v70,v71,v72,v73,v74,v75,v75_1,v76,v76_1,v77,v77_1,v78,v78_1,v79,v79_1,v80,v81,v82,v84,v85,v88,v89,v89_1,v89_2,v89_3,v89_4,v89_5,v90;//v91;
       int v86,v87;
        v0=ft0.getText();
        v00=hb1.getSelectedItem().toString();
        if(f00.isSelected()){
            v1="1";
        }else{
            v1="0";
        }
        if(f1.isSelected()){
            v2="1";
        }else{
            v2="0";
        }
        if(f2.isSelected()){
            v3="1";
        }else{
            v3="0";
        }
        if(f3.isSelected()){
            v4="1";
        }else{
            v4="0";
        }
        if(f4.isSelected()){
            v5="1";
        }else{
            v5="0";
        }
        if(f5.isSelected()){
            v6="1";
        }else{
            v6="0";
        }
        if(f6.isSelected()){
            v7="1";
        }else{
            v7="0";
        }
        if(f7.isSelected()){
            v8="1";
        }else{
            v8="0";
        }
        if(f8.isSelected()){
            v9="1";
        }else{
            v9="0";
        }
        if(f9.isSelected()){
            v10="1";
        }else{
            v10="0";
        }
        if(f10.isSelected()){
            v11="1";
        }else{
            v11="0";
        }
        if(f11.isSelected()){
            v12="1";
        }else{
            v12="0";
        }
        if(f12.isSelected()){
            v13="1";
        }else{
            v13="0";
        }
        if(f13.isSelected()){
            v14="1";
        }else{
            v14="0";
        }
        if(f14.isSelected()){
            v15="1";
        }else{
            v15="0";
        }
        if(f15.isSelected()){
            v16="1";
        }else{
            v16="0";
        }
        if(f16.isSelected()){
            v17="1";
        }else{
            v17="0";
        }
        if(f17.isSelected()){
            v18=ft17.getText();
        }else{
            v18="0";
        }
        if(f18.isSelected()){
            v19="1";
        }else{
            v19="0";
        }
        if(f19.isSelected()){
            v20="1";
        }else{
            v20="0";
        }
        if(f20.isSelected()){
            v21="1";
        }else{
            v21="0";
        }
        if(f21.isSelected()){
            v22="1";
        }else{
            v22="0";
        }
        if(f22.isSelected()){
            v23="1";
        }else{
            v23="0";
        }
        if(f23.isSelected()){
            v24="1";
        }else{
            v24="0";
        }
        if(f24.isSelected()){
            v25="1";
        }else{
            v25="0";
        }
        if(f25.isSelected()){
            v26="1";
        }else{
            v26="0";
        }
        if(f26.isSelected()){
            v27="1";
        }else{
            v27="0";
        }
        if(f27.isSelected()){
            v28=ft27.getText();
        }else{
            v28="0";
        }
        if(f28.isSelected()){
            v29="1";
        }else{
            v29="0";
        }
        if(f29.isSelected()){
            v30="1";
        }else{
            v30="0";
        }
        if(f24.isSelected()){
            v31="1";
        }else{
            v31="0";
        }
        if(f31.isSelected()){
            v32="1";
        }else{
            v32="0";
        }
        if(f32.isSelected()){
            v33=ft32.getText();
        }else{
            v33="0";
        }
        //2nd tab
        if(f34.isSelected()){
            v35="1";
        }else{
            v35="0";
        }
        if(f35.isSelected()){
            v36="1";
        }else{
            v36="0";
        }
        if(f36.isSelected()){
            v37="1";
        }else{
            v37="0";
        }
        if(f37.isSelected()){
            v39="1";
        }else{
            v39="0";
        }
        if(f38.isSelected()){
            v40="1";
        }else{
            v40="0";
        }
        if(f39.isSelected()){
            v41="1";
        }else{
            v41="0";
        }
        if(f40.isSelected()){
            v42="1";
        }else{
            v42="0";
        }
        if(f41.isSelected()){
            v43="1";
        }else{
            v43="0";
        }
        if(f42.isSelected()){
            v44="1";
        }else{
            v44="0";
        }
        if(f43.isSelected()){
            v45="1";
        }else{
            v45="0";
        }
        if(f45.isSelected()){
            v46="1";
        }else{
            v46="0";
        }
        if(f45.isSelected()){
            v47="1";
        }else{
            v47="0";
        }
        if(f46.isSelected()){
            v48="1";
        }else{
            v48="0";
        }
        if(f47.isSelected()){
            v49="1";
        }else{
            v49="0";
        }
        if(f48.isSelected()){
            v50="1";
        }else{
            v50="0";
        }
        if(f49.isSelected()){
            v51="1";
        }else{
            v51="0";
        }
        if(f50.isSelected()){
            v52="1";
        }else{
            v52="0";
        }
        if(f51.isSelected()){
            v53="1";
        }else{
            v53="0";
        }
        if(f52.isSelected()){
            v54="1";
        }else{
            v54="0";
        }
        if(f53.isSelected()){
            v55="1";
        }else{
            v55="0";
        }
        if(f54.isSelected()){
            v56="1";
        }else{
            v56="0";
        }
        if(f55.isSelected()){
            v57="1";
        }else{
            v57="0";
        }
        if(f56.isSelected()){
            v58="1";
        }else{
            v58="0";
        }
        if(f57.isSelected()){
            v59="1";
        }else{
            v59="0";
        }
        if(f58.isSelected()){
            v60="1";
        }else{
            v60="0";
        }
        if(f59.isSelected()){
            v61="1";
        }else{
            v61="0";
        }
        if(f60.isSelected()){
            v62="1";
        }else{
            v62="0";
        }
        if(f61.isSelected()){
            v63="1";
        }else{
            v63="0";
        }
        if(f62.isSelected()){
            v64="1";
        }else{
            v64="0";
        }
        if(f63.isSelected()){
            v65="1";
        }else{
            v65="0";
        }
        if(f64.isSelected()){
            v66="1";
        }else{
            v66="0";
        }
        if(f65.isSelected()){
            v67="1";
        }else{
            v67="0";
        }
        if(f66.isSelected()){
            v68="1";
        }else{
            v68="0";
        }
        if(f67.isSelected()){
            v69="1";
        }else{
            v69="0";
        }
        if(f68.isSelected()){
            v70="1";
        }else{
            v70="0";
        }
        if(f69.isSelected()){
            v71="1";
        }else{
            v71="0";
        }
        if(f70.isSelected()){
            v72="1";
        }else{
            v72="0";
        }
        if(f71.isSelected()){
            v73=ft71.getText();
        }else{
            v73="missing";
        }
          if(f33.isSelected()){
            v34="1";
        }else{
            v34="0";}
          if(jRadioButton41.isSelected()){
            v38="1";
        }else{
            v38="0";}
        v74=jTextField2.getText();
        v75=jTextField3.getText();
        v75_1=jTextField4.getText();
        v76=jTextField8.getText();
        v76_1=jTextField5.getText();
        v77=jTextField9.getText();
        v77_1=jTextField6.getText();
        v78=jTextField16.getText();
        v78_1=jTextField7.getText();
        v79=jTextField18.getText();
        v79_1=jTextField17.getText();
        if(s0.isSelected()){
            v80="Nein";
        }else{
            v80="Ja";}
        v81=st7.getText();
        v82=(String)scb1.getSelectedItem();
        //v83=st8.getText();
        v84=jTextField10.getText();
        v85=jTextField13.getText();
        String Euro=jTextField14.getText();
        v86=Integer.parseInt(Euro);
        String jahr=jTextField15.getText();
        v87=Integer.parseInt(jahr);
        v88=jTextField11.getText();
        v89=jTextField12.getText();
        v89_1=jTextField19.getText();
        v89_2=jTextField20.getText();
        v89_3=jTextField21.getText();
        v89_4=jTextField22.getText();
        v89_5=jTextField23.getText();
        v90=jTextField1.getText();//markt
        //v91="CURRENT_TIMESTAMP";
          
        String SubSQL = "INSERT INTO inacd.mfive(`0_Name`, `Haupt_Branchen`, `1_Verarbeitendes_Gewerbe`, `11_Automobilbauer_OME`, `111_pkw`, `1111_Premium`, `1112_Volumen`, `112_NFZ`, `1121_Leichte_NFZ`, `1122_Schwere_NFZ`, `1123_Omnibusse`, `1124_Sonstige_Kraftwagen`, `12_Zulieferer`, `121_Komponenten_für_Verbrennungsmotoren`, `122_Alternative_Antriebe`, `1221_E-Motor`, `1222_Batterie`, `12221_Zellen`, `12222_Bateriemanagement`, `12223_Sonstige`, `1223_Brennstoffzelle`, `1224_H2_Tank`, `123_Exterieur`, `124_Interieur`, `125_Antriebsstrang`, `126_Karosserie`, `127_Fahrwerk`, `128_Elektrik_Elektronik`, `13_Werkzeuge_und_Maschinen`, `14_Sonstige_Metallverarbeitung`, `15_Electrotechnik`, `151_Sensoren`, `152_Robotik`, `16_Schienenfahrzeugbau`, `17_Sonstige_Industrie`, `2_Dienstleistung`, `21_Mobilitätsdienstleistung`, `211_ÖPV`, `2111_Fernverkehr`, `21111_Staße`, `21112_Schiene`, `2112_Nahverkehr`, `21121_Staße`, `21122_Schiene`, `2113_Taxi_AST`, `212_Mietwagen`, `2121Car_Sharing`, `21211_free-floating`, `21212_stationsbasiert`, `2122_Konvertioneller_Meitwagen`, `213_Ride-Sharing_Mitfahrgelegenheit`, `214_Ride_Hailing`, `22_Güterverkehr_Transport`, `221_Güterbeförderung_im_Eisenbahnverkehr`, `222_Güterbeförderung_Straßenverkehr`, `223_Güterbeförderung_in_der_Binnenschifffahrt`, `224_Güterbeförderung_in_der_See_und_Küsterschifffahrt`, `225_Güterbeförderung_in_der_Luftfahrt`, `23_Verkehrsnahe_Dienstleistungen_Lagerei`, `231_Lagerei`, `232_Frachtumschlag`, `233_Umzugstransporte`, `234_Spedition`, `235_Post-_Kurier-_und_Expressdienste`, `24_Finanzdienstleistung_Bankwesen`, `25_IT`, `251_Datenverarbeitung`, `252_Softwareprogrammierung`, `253_Sensoren`, `26_F&E`, `261_Fhrzeugbau`, `262_Energie_Kraftstoffe`, `263_Verfahrenstechnik`, `27_Consulting`, `28_Sonstige_Dienstleistung`, `29_Subsidiaries_ACTOR`, `291_Actor1`, `Beschreibung1`, `292_Actor2`, `Beschreibung2`, `293_Actor3`, `Beschreibung3`, `294_Actor4`, `Beschreibung4`, `295_Actor5`, `Beschreibung5`, `30_Part_of_Cluster`, `301_Name_of_Cluster`, `302_kind_of_Cluster`, `4_Original_Name_Companies`, `41_Investor`, `42_Sales_euro`, `43_grüdungsjahr`, `44_Legal_Form`, `45_Standorte`, `WeiterStandorte1`, `WeiterStandorte2`, `WeiterStandorte3`, `WeiterStandorte4`, `WeiterStandorte5`, `46_Märkte`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
   try { 
            try (PreparedStatement subdata = conn.prepareStatement(SubSQL)) {
               subdata.setString(1, v0);
               subdata.setString(2, v00);
               subdata.setString(3, v1);
               subdata.setString(4, v2);
               subdata.setString(5, v3);
               subdata.setString(6, v4);
               subdata.setString(7, v5);
               subdata.setString(8, v6);
               subdata.setString(9, v7);
               subdata.setString(10, v8);
               subdata.setString(11, v9);
               subdata.setString(12, v10);
               subdata.setString(13, v11);
               subdata.setString(14, v12);
               subdata.setString(15, v13);
               subdata.setString(16, v14);
               subdata.setString(17, v15);
               subdata.setString(18, v16);
               subdata.setString(19, v17);
               subdata.setString(20, v18);
               subdata.setString(21, v19);
               subdata.setString(22, v20);
               subdata.setString(23, v21);
               subdata.setString(24, v22);
               subdata.setString(25, v23);
               subdata.setString(26, v24);
               subdata.setString(27, v25);
               subdata.setString(28, v26);
               subdata.setString(29, v27);
               subdata.setString(30, v28);
               subdata.setString(31, v29);
               subdata.setString(32, v30);
               subdata.setString(33, v31);
               subdata.setString(34, v32);
               subdata.setString(35, v33);
               subdata.setString(36, v34);
               subdata.setString(37, v35);
               subdata.setString(38, v36);
               subdata.setString(39, v37);
               subdata.setString(40, v38);
               subdata.setString(41, v39);
               subdata.setString(42, v40);
               subdata.setString(43, v41);
               subdata.setString(44, v42);
               subdata.setString(45, v43);
               subdata.setString(46, v44);
               subdata.setString(47, v45);
               subdata.setString(48, v46);
               subdata.setString(49, v47);
               subdata.setString(50, v48);
               subdata.setString(51, v49);
               subdata.setString(52, v50);
               subdata.setString(53, v51);
               subdata.setString(54, v52);
               subdata.setString(55, v53);
               subdata.setString(56, v54);
               subdata.setString(57, v55);
               subdata.setString(58, v56);
               subdata.setString(59, v57);
               subdata.setString(60, v58);
               subdata.setString(61, v59);
               subdata.setString(62, v60);
               subdata.setString(63, v61);
               subdata.setString(64, v62);
               subdata.setString(65, v63);
               subdata.setString(66, v64);
               subdata.setString(67, v65);
               subdata.setString(68, v66);
               subdata.setString(69, v67);
               subdata.setString(70, v68);
               subdata.setString(71, v69);
               subdata.setString(72, v70);
               subdata.setString(73, v71);
               subdata.setString(74, v72);
               subdata.setString(75, v73);
               subdata.setString(76, v74);
               subdata.setString(77, v75);
               subdata.setString(78, v75_1);
               subdata.setString(79, v76);
               subdata.setString(80, v76_1);
               subdata.setString(81, v77);
               subdata.setString(82, v77_1);
               subdata.setString(83, v78);
               subdata.setString(84, v78_1);
               subdata.setString(85, v79);
               subdata.setString(86, v79_1);
               subdata.setString(87, v80);
               subdata.setString(88, v81);
               subdata.setString(89, v82);
               //subdata.setString(84, v83);
               subdata.setString(90, v84);
               subdata.setString(91, v85);
               subdata.setInt(92, v86);
               subdata.setInt(93, v87);
               subdata.setString(94, v88);
               subdata.setString(95, v89);
               subdata.setString(96, v89_1);
               subdata.setString(97, v89_2);
               subdata.setString(98, v89_3);
               subdata.setString(99, v89_4);
               subdata.setString(100, v89_5);
               subdata.setString(101, v90);
               
               //subdata.setString(92, v91);
                subdata.execute();
            }
        ft0.setText(null);
        ft17.setText(null);
        ft27.setText(null);
        ft32.setText(null);
        ft71.setText(null);
        f00.setSelected(false);
        f1.setSelected(false);
        f2.setSelected(false);
        f3.setSelected(false);
        f4.setSelected(false);
        f5.setSelected(false);
        f6.setSelected(false);
        f7.setSelected(false);
        f8.setSelected(false);
        f9.setSelected(false);
        f10.setSelected(false);
        f11.setSelected(false);
        f12.setSelected(false);
        f13.setSelected(false);
        f14.setSelected(false);
        f15.setSelected(false);
        f16.setSelected(false);
        f17.setSelected(false);
        f18.setSelected(false);
        f19.setSelected(false);
        f20.setSelected(false);
        f21.setSelected(false);
        f22.setSelected(false);
        f23.setSelected(false);
        f24.setSelected(false);
        f25.setSelected(false);
        f26.setSelected(false);
        f27.setSelected(false);
        f28.setSelected(false);
        f29.setSelected(false);
        f30.setSelected(false);
        f31.setSelected(false);
        f32.setSelected(false);
        f33.setSelected(false);
        f34.setSelected(false);
        f35.setSelected(false);
        f36.setSelected(false);
        f37.setSelected(false);
        f38.setSelected(false);
        f39.setSelected(false);
        f40.setSelected(false);
        f41.setSelected(false);
        f42.setSelected(false);
        f43.setSelected(false);
        f44.setSelected(false);
        f45.setSelected(false);
        f46.setSelected(false);
        f47.setSelected(false);
        f48.setSelected(false);
        f49.setSelected(false);
        f50.setSelected(false);
        f51.setSelected(false);
        f52.setSelected(false);
        f53.setSelected(false);
        f54.setSelected(false);
        f55.setSelected(false);
        f56.setSelected(false);
        f57.setSelected(false);
        f58.setSelected(false);
        f59.setSelected(false);
        f60.setSelected(false);
        f61.setSelected(false);
        f62.setSelected(false);
        f63.setSelected(false);
        f64.setSelected(false);
        f65.setSelected(false);
        f66.setSelected(false);
        f67.setSelected(false);
        f68.setSelected(false);
        f69.setSelected(false);
        f70.setSelected(false);
        f71.setSelected(false);
        jRadioButton41.setSelected(false);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField8.setText(null);
        jTextField9.setText(null);
        jTextField16.setText(null);
        jTextField18.setText(null);
        s0.setSelected(true);
        st7.setText(null);
        //st8.setText(null);
        scb1.setSelectedIndex(0);
        jTextField10.setText(null);
        jTextField13.setText(null);
        jTextField14.setText(null);
        jTextField15.setText(null);
        jTextField11.setText(null);
        jTextField12.setText(null);
        jTextField1.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
        jTextField7.setText(null);
        jTextField17.setText(null);
        jTextField19.setText(null);
        jTextField20.setText(null);
        jTextField21.setText(null);
        jTextField22.setText(null);
        jTextField23.setText(null);
        
        //date.setCurrent(null);
        
    } catch (SQLException ex) {
        Logger.getLogger(inacd.class.getName()).log(Level.SEVERE, null, ex);
    }
   try {
        TabDataLoad();
    } catch (SQLException ex) {
        Logger.getLogger(inacd.class.getName()).log(Level.SEVERE, null, ex);
    }
   Msg.setText("Data Insert Successfull");
    }//GEN-LAST:event_submitActionPerformed

    private void refrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrActionPerformed
        // TODO add your handling code here:
        try {
        TabDataLoad();
        } catch (SQLException ex) {
        Logger.getLogger(inacd.class.getName()).log(Level.SEVERE, null, ex);
        }
        Msg.setText("New Data Load in to Table");
    }//GEN-LAST:event_refrActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
        DelSelRow();
        try {
        TabDataLoad();
        } catch (SQLException ex) {
        Logger.getLogger(inacd.class.getName()).log(Level.SEVERE, null, ex);
        }
        Msg.setText("Row Deleted Successfully");
    }//GEN-LAST:event_delActionPerformed

    private void tableTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTMouseClicked
        // TODO add your handling code here:
        int i =tableT.getSelectedRow();
        System.out.println(i);
        DefaultTableModel tableM = (DefaultTableModel)tableT.getModel();
        IDtx.setText(tableM.getValueAt(i, 0).toString());
        //txt2.setText(tableM.getValueAt(i, 3).toString());    
                ///work here
        //val1t.setSelected((boolean) tableM.getValueAt(i, 1));
        //val2t.setSelectedIndex((int)tableM.getValueAt(i, 2));
    }//GEN-LAST:event_tableTMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        upDate();
        try {
        TabDataLoad();
        } catch (SQLException ex) {
        Logger.getLogger(inacd.class.getName()).log(Level.SEVERE, null, ex);
        }
        Msg.setText("Row Update Successfull");
    }//GEN-LAST:event_updateActionPerformed

    private void MsgVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_MsgVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_MsgVetoableChange

    private void MsgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MsgMouseMoved
        // TODO add your handling code here:
        Msg.setText("");
    }//GEN-LAST:event_MsgMouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        Msg.setText("");
    }//GEN-LAST:event_formMouseMoved

    private void TUSERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TUSERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TUSERActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f1ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        // TODO add your handling code here:
         if (f2.isSelected()){
            f1.setSelected(true);
        }
    }//GEN-LAST:event_f2ActionPerformed

    private void f27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f27ActionPerformed
        // TODO add your handling code here:
        ft27.setEditable(true);
    }//GEN-LAST:event_f27ActionPerformed

    private void f28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f28ActionPerformed

    private void f31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f31ActionPerformed

    private void f57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f57ActionPerformed
        // TODO add your handling code here:
        if (f57.isSelected()){
            f55.setSelected(true);}
    }//GEN-LAST:event_f57ActionPerformed

    private void ft0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ft0MouseClicked
        // TODO add your handling code here:
        ft0.setText(null);
    }//GEN-LAST:event_ft0MouseClicked

    private void ft17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ft17MouseClicked
        // TODO add your handling code here:
        ft17.setText(null);
    }//GEN-LAST:event_ft17MouseClicked

    private void ft27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ft27MouseClicked
        // TODO add your handling code here:
        ft27.setText(null);
    }//GEN-LAST:event_ft27MouseClicked

    private void ft32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ft32MouseClicked
        // TODO add your handling code here:
        ft32.setText(null);
    }//GEN-LAST:event_ft32MouseClicked

    private void ft71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ft71MouseClicked
        // TODO add your handling code here:
        ft71.setText(null);
    }//GEN-LAST:event_ft71MouseClicked

    private void f00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f00ActionPerformed
        // TODO add your handling code here:
        f00.setVisible(false);
        if (f1.isSelected()||f10.isSelected()||f26.isSelected()||f27.isSelected()||f28.isSelected()||f31.isSelected()||f32.isSelected()||f2.isSelected()||f3.isSelected()||f4.isSelected()||f5.isSelected()||f6.isSelected()||f7.isSelected()||f8.isSelected()||f9.isSelected()||f11.isSelected()||f12.isSelected()||f13.isSelected()||f14.isSelected()||f15.isSelected()||f16.isSelected()||f17.isSelected()||f18.isSelected()||f19.isSelected()||f20.isSelected()||f21.isSelected()||f22.isSelected()||f23.isSelected()||f24.isSelected()||f25.isSelected()||f29.isSelected()||f30.isSelected()){
            f00.setSelected(true);
        }
    }//GEN-LAST:event_f00ActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed
        // TODO add your handling code here:
        if (f4.isSelected()){
            f2.setSelected(true);
            f1.setSelected(true);
        }
    }//GEN-LAST:event_f4ActionPerformed

    private void f33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f33ActionPerformed
        // TODO add your handling code here:
        f33.setVisible(false);
        if(f34.isSelected()||f35.isSelected()||f36.isSelected()||f37.isSelected()||f38.isSelected()||f39.isSelected()||f40.isSelected()||f41.isSelected()||f42.isSelected()||f43.isSelected()||f44.isSelected()||f45.isSelected()||f46.isSelected()||f47.isSelected()||f48.isSelected()||f49.isSelected()||f50.isSelected()||f51.isSelected()||f52.isSelected()||f53.isSelected()||f54.isSelected()||f55.isSelected()||f56.isSelected()||f57.isSelected()||f58.isSelected()||f59.isSelected()||f60.isSelected()||f62.isSelected()||f63.isSelected()||f64.isSelected()||f65.isSelected()||f66.isSelected()||f67.isSelected()||f68.isSelected()||f69.isSelected()||f70.isSelected()||f71.isSelected()){
            f33.setSelected(true);
        }
    }//GEN-LAST:event_f33ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
        // TODO add your handling code here:
        if (f3.isSelected()){
            f2.setSelected(true);
            f1.setSelected(true);
        }
    }//GEN-LAST:event_f3ActionPerformed

    private void f6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f6ActionPerformed
        // TODO add your handling code here:
        if (f6.isSelected()){
            f5.setSelected(true);
            f1.setSelected(true);
        }
    }//GEN-LAST:event_f6ActionPerformed

    private void f7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f7ActionPerformed
        // TODO add your handling code here:
         if (f7.isSelected()){
            f5.setSelected(true);
            f1.setSelected(true);
        }
    }//GEN-LAST:event_f7ActionPerformed

    private void f8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f8ActionPerformed
        // TODO add your handling code here:
         if (f8.isSelected()){
            f5.setSelected(true);
            f1.setSelected(true);
        }
    }//GEN-LAST:event_f8ActionPerformed

    private void f9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f9ActionPerformed
        // TODO add your handling code here:
         if (f9.isSelected()){
            f5.setSelected(true);
            f1.setSelected(true);
        }
    }//GEN-LAST:event_f9ActionPerformed

    private void f5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f5ActionPerformed
        // TODO add your handling code here:
         if (f5.isSelected()){
                f1.setSelected(true);
        }
    }//GEN-LAST:event_f5ActionPerformed

    private void f11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f11ActionPerformed
        // TODO add your handling code here:
                 if (f11.isSelected()){
                f10.setSelected(true);
        }
    }//GEN-LAST:event_f11ActionPerformed

    private void f12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f12ActionPerformed
        // TODO add your handling code here:
                         if (f12.isSelected()){
                f10.setSelected(true);
        }
    }//GEN-LAST:event_f12ActionPerformed

    private void f20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f20ActionPerformed
        // TODO add your handling code here:
                         if (f20.isSelected()){
                f10.setSelected(true);
        }
    }//GEN-LAST:event_f20ActionPerformed

    private void f21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f21ActionPerformed
        // TODO add your handling code here:
                         if (f21.isSelected()){
                f10.setSelected(true);
        }
    }//GEN-LAST:event_f21ActionPerformed

    private void f22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f22ActionPerformed
        // TODO add your handling code here:
                         if (f22.isSelected()){
                f10.setSelected(true);
        }
    }//GEN-LAST:event_f22ActionPerformed

    private void f23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f23ActionPerformed
        // TODO add your handling code here:
                         if (f23.isSelected()){
                f10.setSelected(true);
        }
    }//GEN-LAST:event_f23ActionPerformed

    private void f24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f24ActionPerformed
        // TODO add your handling code here:
                         if (f24.isSelected()){
                f10.setSelected(true);
        }
    }//GEN-LAST:event_f24ActionPerformed

    private void f25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f25ActionPerformed
        // TODO add your handling code here:
                         if (f25.isSelected()){
                f10.setSelected(true);
        }
    }//GEN-LAST:event_f25ActionPerformed

    private void f13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f13ActionPerformed
        // TODO add your handling code here:
        if (f13.isSelected()){
            f12.setSelected(true);
            f10.setSelected(true);
        }
    }//GEN-LAST:event_f13ActionPerformed

    private void f14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f14ActionPerformed
        // TODO add your handling code here:
        if (f14.isSelected()){
            f12.setSelected(true);
            f10.setSelected(true);
        }
    }//GEN-LAST:event_f14ActionPerformed

    private void f18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f18ActionPerformed
        // TODO add your handling code here:
        if (f18.isSelected()){
            f12.setSelected(true);
            f10.setSelected(true);
        }
    }//GEN-LAST:event_f18ActionPerformed

    private void f19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f19ActionPerformed
        // TODO add your handling code here:
        if (f19.isSelected()){
            f12.setSelected(true);
            f10.setSelected(true);
        }
    }//GEN-LAST:event_f19ActionPerformed

    private void f15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f15ActionPerformed
        // TODO add your handling code here:
        if (f15.isSelected()){
            f14.setSelected(true);
            f12.setSelected(true);
            f10.setSelected(true);
        }
    }//GEN-LAST:event_f15ActionPerformed

    private void f16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f16ActionPerformed
        // TODO add your handling code here:
        if (f16.isSelected()){
            f14.setSelected(true);
            f12.setSelected(true);
            f10.setSelected(true);
        }
    }//GEN-LAST:event_f16ActionPerformed

    private void f17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f17ActionPerformed
        // TODO add your handling code here:
        if (f17.isSelected()){
            f14.setSelected(true);
            f12.setSelected(true);
            f10.setSelected(true);
            ft17.setEditable(true);
        }
    }//GEN-LAST:event_f17ActionPerformed

    private void f29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f29ActionPerformed
        // TODO add your handling code here:
            if (f29.isSelected()){
                f28.setSelected(true);
            }
    }//GEN-LAST:event_f29ActionPerformed

    private void f30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f30ActionPerformed
        // TODO add your handling code here:
        if (f30.isSelected()){
            f28.setSelected(true);
        }
    }//GEN-LAST:event_f30ActionPerformed

    private void f36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f36ActionPerformed
        // TODO add your handling code here:
            if (f36.isSelected()){
            f34.setSelected(true);
            f35.setSelected(true);
            jRadioButton41.setSelected(true);
        }
    }//GEN-LAST:event_f36ActionPerformed

    private void f37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f37ActionPerformed
        // TODO add your handling code here:
        if (f37.isSelected()){
            f34.setSelected(true);
            f35.setSelected(true);
            jRadioButton41.setSelected(true);
        }
    }//GEN-LAST:event_f37ActionPerformed

    private void jRadioButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton41ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton41.isSelected()){
            f34.setSelected(true);
        }
    }//GEN-LAST:event_jRadioButton41ActionPerformed

    private void f35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f35ActionPerformed
        // TODO add your handling code here:
                if (f35.isSelected()){
            f34.setSelected(true);
            jRadioButton41.setSelected(true);}
    }//GEN-LAST:event_f35ActionPerformed

    private void f70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f70ActionPerformed

    private void f38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f38ActionPerformed
        // TODO add your handling code here:
        if (f38.isSelected()){
            f34.setSelected(true);
            jRadioButton41.setSelected(true);}
    }//GEN-LAST:event_f38ActionPerformed

    private void f39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f39ActionPerformed
        // TODO add your handling code here:
        if (f39.isSelected()){
            f38.setSelected(true);
            f34.setSelected(true);
            jRadioButton41.setSelected(true);
        }
    }//GEN-LAST:event_f39ActionPerformed

    private void f40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f40ActionPerformed
        // TODO add your handling code here:
        if (f40.isSelected()){
            f38.setSelected(true);
            f34.setSelected(true);
            jRadioButton41.setSelected(true);}
    }//GEN-LAST:event_f40ActionPerformed

    private void f41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f41ActionPerformed
        // TODO add your handling code here:
        if (f41.isSelected()){
            f34.setSelected(true);
            jRadioButton41.setSelected(true);}
    }//GEN-LAST:event_f41ActionPerformed

    private void f42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f42ActionPerformed
        // TODO add your handling code here:
        if (f42.isSelected()){
            f34.setSelected(true);
        }
    }//GEN-LAST:event_f42ActionPerformed

    private void f47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f47ActionPerformed
        // TODO add your handling code here:
                if (f47.isSelected()){
            f34.setSelected(true);
        }
    }//GEN-LAST:event_f47ActionPerformed

    private void f48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f48ActionPerformed
        // TODO add your handling code here:
                if (f48.isSelected()){
            f34.setSelected(true);
        }
    }//GEN-LAST:event_f48ActionPerformed

    private void f43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f43ActionPerformed
        // TODO add your handling code here:
        if (f43.isSelected()){
            f34.setSelected(true);
            f42.setSelected(true);}
    }//GEN-LAST:event_f43ActionPerformed

    private void f46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f46ActionPerformed
        // TODO add your handling code here:
        if (f46.isSelected()){
            f34.setSelected(true);
            f42.setSelected(true);}
    }//GEN-LAST:event_f46ActionPerformed

    private void f44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f44ActionPerformed
        // TODO add your handling code here:
        if (f44.isSelected()){
            f43.setSelected(true);
            f42.setSelected(true);
            f34.setSelected(true);
        }
    }//GEN-LAST:event_f44ActionPerformed

    private void f45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f45ActionPerformed
        // TODO add your handling code here:
        if (f45.isSelected()){
            f43.setSelected(true);
            f42.setSelected(true);
            f34.setSelected(true);
        }
    }//GEN-LAST:event_f45ActionPerformed

    private void f50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f50ActionPerformed
        // TODO add your handling code here:
        if (f50.isSelected()){
            f49.setSelected(true);}
    }//GEN-LAST:event_f50ActionPerformed

    private void f51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f51ActionPerformed
        // TODO add your handling code here:
        if (f51.isSelected()){
            f49.setSelected(true);}
    }//GEN-LAST:event_f51ActionPerformed

    private void f52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f52ActionPerformed
        // TODO add your handling code here:
        if (f52.isSelected()){
            f49.setSelected(true);}
    }//GEN-LAST:event_f52ActionPerformed

    private void f53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f53ActionPerformed
        // TODO add your handling code here:
        if (f53.isSelected()){
            f49.setSelected(true);}
    }//GEN-LAST:event_f53ActionPerformed

    private void f54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f54ActionPerformed
        // TODO add your handling code here:
        if (f54.isSelected()){
            f49.setSelected(true);}
    }//GEN-LAST:event_f54ActionPerformed

    private void f56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f56ActionPerformed
        // TODO add your handling code here:
        if (f56.isSelected()){
            f55.setSelected(true);}
    }//GEN-LAST:event_f56ActionPerformed

    private void f58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f58ActionPerformed
        // TODO add your handling code here:
        if (f58.isSelected()){
            f55.setSelected(true);}
    }//GEN-LAST:event_f58ActionPerformed

    private void f59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f59ActionPerformed
        // TODO add your handling code here:
        if (f59.isSelected()){
            f55.setSelected(true);}
    }//GEN-LAST:event_f59ActionPerformed

    private void f60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f60ActionPerformed
        // TODO add your handling code here:
        if (f60.isSelected()){
            f55.setSelected(true);}
    }//GEN-LAST:event_f60ActionPerformed

    private void f63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f63ActionPerformed
        // TODO add your handling code here:
        if (f63.isSelected()){
            f62.setSelected(true);}
    }//GEN-LAST:event_f63ActionPerformed

    private void f64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f64ActionPerformed
        // TODO add your handling code here:
        if (f64.isSelected()){
            f62.setSelected(true);}
    }//GEN-LAST:event_f64ActionPerformed

    private void f65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f65ActionPerformed
        // TODO add your handling code here:
        if (f65.isSelected()){
            f62.setSelected(true);}
    }//GEN-LAST:event_f65ActionPerformed

    private void f67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f67ActionPerformed
        // TODO add your handling code here:
        if (f67.isSelected()){
            f66.setSelected(true);}
    }//GEN-LAST:event_f67ActionPerformed

    private void f68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f68ActionPerformed
        // TODO add your handling code here:
        if (f68.isSelected()){
            f66.setSelected(true);}
    }//GEN-LAST:event_f68ActionPerformed

    private void f69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f69ActionPerformed
        // TODO add your handling code here:
        if (f69.isSelected()){
            f66.setSelected(true);}
    }//GEN-LAST:event_f69ActionPerformed

    private void f71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f71ActionPerformed
        // TODO add your handling code here:
        ft71.setEditable(true);
    }//GEN-LAST:event_f71ActionPerformed

    private void f32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f32ActionPerformed
        // TODO add your handling code here:
        ft32.setEditable(true);
    }//GEN-LAST:event_f32ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
         jTextField8.setText(null);
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
         jTextField16.setText(null);
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
         jTextField18.setText(null);
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
        if(s1.isSelected()){
            s0.setSelected(false);
            st7.setEnabled(true);
            scb1.setEditable(true);
            //st8.setEnabled(true);
           // st8.setToolTipText((String)scb1.getSelectedItem());
        }
    }//GEN-LAST:event_s1ActionPerformed

    private void s0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s0ActionPerformed
        // TODO add your handling code here:
        if(s0.isSelected()){
            s1.setSelected(false);
            scb1.setEditable(false);

        };
    }//GEN-LAST:event_s0ActionPerformed

    private void ft17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ft17ActionPerformed
        // TODO add your handling code here:
        ft17.setEditable(false);
    }//GEN-LAST:event_ft17ActionPerformed

    private void ft32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ft32ActionPerformed
        // TODO add your handling code here:
        ft32.setEditable(false);
    }//GEN-LAST:event_ft32ActionPerformed

    private void ft27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ft27ActionPerformed
        // TODO add your handling code here:
        ft27.setEditable(false);
    }//GEN-LAST:event_ft27ActionPerformed

    private void ft71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ft71ActionPerformed
        // TODO add your handling code here:
        ft71.setEditable(false);
    }//GEN-LAST:event_ft71ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        jTextField2.setText(null);
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
        jTextField3.setText(null);
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
         jTextField9.setText(null);
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
         jTextField10.setText(null);
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
         jTextField13.setText(null);
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
         jTextField14.setText(null);
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
         jTextField15.setText(null);
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
         jTextField11.setText(null);
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
         jTextField12.setText(null);
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
         jTextField1.setText(null);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void f62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f62ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        // TODO add your handling code here:
        jTextField2.setText(null);
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        // TODO add your handling code here:
        jTextField3.setText(null);
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
        // TODO add your handling code here:
        jTextField8.setText(null);
    }//GEN-LAST:event_jTextField8MouseClicked

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
        // TODO add your handling code here:
        jTextField9.setText(null);
    }//GEN-LAST:event_jTextField9MouseClicked

    private void jTextField16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField16MouseClicked
        // TODO add your handling code here:
        jTextField16.setText(null);
    }//GEN-LAST:event_jTextField16MouseClicked

    private void jTextField18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField18MouseClicked
        // TODO add your handling code here:
        jTextField18.setText(null);
    }//GEN-LAST:event_jTextField18MouseClicked

    private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClicked
        // TODO add your handling code here:
        jTextField10.setText(null);
    }//GEN-LAST:event_jTextField10MouseClicked

    private void jTextField13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField13MouseClicked
        // TODO add your handling code here:
        jTextField13.setText(null);
    }//GEN-LAST:event_jTextField13MouseClicked

    private void jTextField14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseClicked
        // TODO add your handling code here:
        jTextField14.setText(null);
    }//GEN-LAST:event_jTextField14MouseClicked

    private void jTextField15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField15MouseClicked
        // TODO add your handling code here:
        jTextField15.setText(null);
    }//GEN-LAST:event_jTextField15MouseClicked

    private void jTextField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseClicked
        // TODO add your handling code here:
        jTextField11.setText(null);
    }//GEN-LAST:event_jTextField11MouseClicked

    private void jTextField12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MouseClicked
        // TODO add your handling code here:
        jTextField12.setText(null);
    }//GEN-LAST:event_jTextField12MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(null);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void scb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_scb1ItemStateChanged
        // TODO add your handling code here:
        String kC =(String) scb1.getSelectedItem();
       // System.out.println(kC);
        //st8.setText(kC);
    }//GEN-LAST:event_scb1ItemStateChanged

    private void st7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st7MouseClicked
        // TODO add your handling code here:
        st7.setText(null);
    }//GEN-LAST:event_st7MouseClicked

    private void ft0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ft0KeyTyped
        // TODO add your handling code here:     
    }//GEN-LAST:event_ft0KeyTyped

    private void ft0KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ft0KeyPressed
        // TODO add your handling code here:   
        switch (evt.getKeyCode()){
            case KeyEvent.VK_BACK_SPACE :
                break;
            case KeyEvent.VK_ENTER :
                ft0.setText(ft0.getText());
                break;
            default :
                EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                String txt = ft0.getText();
                autoComplete(txt);
                        }
        });            
        }
    }//GEN-LAST:event_ft0KeyPressed

    private void ft0KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ft0KeyReleased
        // TODO add your handling code here:      
    }//GEN-LAST:event_ft0KeyReleased

    private void f49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f49ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        // TODO add your handling code here:
        jTextField4.setText(null);
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        // TODO add your handling code here:
        jTextField5.setText(null);
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        // TODO add your handling code here:
        jTextField6.setText(null);
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
        // TODO add your handling code here:
        jTextField7.setText(null);
    }//GEN-LAST:event_jTextField7MouseClicked

    private void jTextField17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField17MouseClicked
        // TODO add your handling code here:
        jTextField17.setText(null);
    }//GEN-LAST:event_jTextField17MouseClicked

    private void jTextField19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField19MouseClicked
        // TODO add your handling code here:
        jTextField19.setText(null);
    }//GEN-LAST:event_jTextField19MouseClicked

    private void jTextField20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField20MouseClicked
        // TODO add your handling code here:
        jTextField20.setText(null);
    }//GEN-LAST:event_jTextField20MouseClicked

    private void jTextField21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField21MouseClicked
        // TODO add your handling code here:
        jTextField21.setText(null);
    }//GEN-LAST:event_jTextField21MouseClicked

    private void jTextField22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField22MouseClicked
        // TODO add your handling code here:
        jTextField22.setText(null);
    }//GEN-LAST:event_jTextField22MouseClicked

    private void jTextField23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField23MouseClicked
        // TODO add your handling code here:
        jTextField23.setText(null);
    }//GEN-LAST:event_jTextField23MouseClicked

    private void hb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hb1ActionPerformed
public void autoComplete (String txt){
    String complete ="";
    int start = txt.length();
    int last = txt.length();
    int a;
    for (a=0; a<name.size(); a++){
        if (name.get(a).toString().startsWith(txt)){
            complete = name.get(a).toString();
            last = complete.length();
            break;
        }
    }
    if (last>start){
        ft0.setText(complete);
        ft0.setCaretPosition(last);
        ft0.moveCaretPosition(start);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inacd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new inacd().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bconn;
    private javax.swing.JTextField IDtx;
    private javax.swing.JLabel Id;
    private javax.swing.JLabel L_dbms;
    private javax.swing.JLabel Msg;
    private javax.swing.JTextField TDB;
    private javax.swing.JTextField TDBMS;
    private javax.swing.JTextField THOST;
    private javax.swing.JPasswordField TPASS;
    private javax.swing.JTextField TPORT;
    private javax.swing.JTextField TUSER;
    private javax.swing.JLabel connection;
    private javax.swing.JLabel db;
    private javax.swing.JButton del;
    private javax.swing.JButton exit;
    private javax.swing.JRadioButton f00;
    private javax.swing.JRadioButton f1;
    private javax.swing.JRadioButton f10;
    private javax.swing.JRadioButton f11;
    private javax.swing.JRadioButton f12;
    private javax.swing.JRadioButton f13;
    private javax.swing.JRadioButton f14;
    private javax.swing.JRadioButton f15;
    private javax.swing.JRadioButton f16;
    private javax.swing.JRadioButton f17;
    private javax.swing.JRadioButton f18;
    private javax.swing.JRadioButton f19;
    private javax.swing.JRadioButton f2;
    private javax.swing.JRadioButton f20;
    private javax.swing.JRadioButton f21;
    private javax.swing.JRadioButton f22;
    private javax.swing.JRadioButton f23;
    private javax.swing.JRadioButton f24;
    private javax.swing.JRadioButton f25;
    private javax.swing.JRadioButton f26;
    private javax.swing.JRadioButton f27;
    private javax.swing.JRadioButton f28;
    private javax.swing.JRadioButton f29;
    private javax.swing.JRadioButton f3;
    private javax.swing.JRadioButton f30;
    private javax.swing.JRadioButton f31;
    private javax.swing.JRadioButton f32;
    private javax.swing.JRadioButton f33;
    private javax.swing.JRadioButton f34;
    private javax.swing.JRadioButton f35;
    private javax.swing.JRadioButton f36;
    private javax.swing.JRadioButton f37;
    private javax.swing.JRadioButton f38;
    private javax.swing.JRadioButton f39;
    private javax.swing.JRadioButton f4;
    private javax.swing.JRadioButton f40;
    private javax.swing.JRadioButton f41;
    private javax.swing.JRadioButton f42;
    private javax.swing.JRadioButton f43;
    private javax.swing.JRadioButton f44;
    private javax.swing.JRadioButton f45;
    private javax.swing.JRadioButton f46;
    private javax.swing.JRadioButton f47;
    private javax.swing.JRadioButton f48;
    private javax.swing.JRadioButton f49;
    private javax.swing.JRadioButton f5;
    private javax.swing.JRadioButton f50;
    private javax.swing.JRadioButton f51;
    private javax.swing.JRadioButton f52;
    private javax.swing.JRadioButton f53;
    private javax.swing.JRadioButton f54;
    private javax.swing.JRadioButton f55;
    private javax.swing.JRadioButton f56;
    private javax.swing.JRadioButton f57;
    private javax.swing.JRadioButton f58;
    private javax.swing.JRadioButton f59;
    private javax.swing.JRadioButton f6;
    private javax.swing.JRadioButton f60;
    private javax.swing.JRadioButton f61;
    private javax.swing.JRadioButton f62;
    private javax.swing.JRadioButton f63;
    private javax.swing.JRadioButton f64;
    private javax.swing.JRadioButton f65;
    private javax.swing.JRadioButton f66;
    private javax.swing.JRadioButton f67;
    private javax.swing.JRadioButton f68;
    private javax.swing.JRadioButton f69;
    private javax.swing.JRadioButton f7;
    private javax.swing.JRadioButton f70;
    private javax.swing.JRadioButton f71;
    private javax.swing.JRadioButton f8;
    private javax.swing.JRadioButton f9;
    private javax.swing.JTextField ft0;
    private javax.swing.JTextField ft17;
    private javax.swing.JTextField ft27;
    private javax.swing.JTextField ft32;
    private javax.swing.JTextField ft71;
    private javax.swing.JComboBox<String> hb1;
    private javax.swing.JLabel host;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane5;
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
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel port;
    private javax.swing.JButton refr;
    private javax.swing.JRadioButton s0;
    private javax.swing.JRadioButton s1;
    private javax.swing.JComboBox<String> scb1;
    private javax.swing.JTextField st7;
    private javax.swing.JLabel stat;
    private javax.swing.JButton submit;
    private javax.swing.JTable tableT;
    private javax.swing.JLabel title;
    private javax.swing.JButton update;
    private javax.swing.JLabel usr;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
