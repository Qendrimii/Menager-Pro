package GUI;

import java.awt.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;

public class Test {

    private JFrame frame;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Test window = new Test();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Test() {
        initialize();
        fetch("10.11.2019");
    }

    public void fetch(String data){
        try {
            ResultSet rs= null;
            PreparedStatement pst = null;
            String host =  "jdbc:sqlserver://DESKTOP-HK6RU47:1433;" +
                    "databaseName=UrbanCafe";
            String uName = "sa";
            String uPass = "qdemiraj";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            String q ="select * \n" +
                    "from PijetEShitura\n" +
                    "where Data = '"+data+"'";
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(0, 0,1500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1500, 500);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        table = new JTable();
        table.setBounds(1, 1, 450, 0);
        panel.add(table);
        table.setBackground(Color.WHITE);

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(524, 5, 545, 402);
        panel.add(jsp);
    }
}
