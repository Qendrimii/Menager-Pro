package BackEnd;

import GUI.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Metodat {
	Qarkullimi q = new Qarkullimi();
	public void qarkullimiDitor(){
		String data = JOptionPane.showInputDialog("Shtyp daten ne formen dd.mm.yyyy");
        double qark = 0;
        try {
            String host = "jdbc:sqlserver://DESKTOP-HK6RU47:1433;" +
                    "databaseName=UrbanCafe";
            String uName = "sa";
            Statement smt = null;
            String uPass = "qdemiraj";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            String query = "select sum(Vlera)\n" +
                    "from Faturat\n" +
                    "where Data = '"+data+"'";
            smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {
                qark = rs.getFloat(1);
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        q.textPane.setText("");
        q.textPane.setText(""+qark);
	}
	public void qarkullimiMujor(){
		 String data1 = JOptionPane.showInputDialog("Shtyp muajin dhe vitin, ne formen mm.yyyy");
         double qark = 0;
         try {
             String host = "jdbc:sqlserver://DESKTOP-HK6RU47:1433;" +
                     "databaseName=UrbanCafe";
             String uName = "sa";
             Statement smt = null;
             String uPass = "qdemiraj";
             Connection con = DriverManager
            		 .getConnection(host, uName, uPass);
             String query = "select sum(Vlera)\n" +
                     "from Faturat\n" +
                     "where Data LIKE '___"+data1+"'";
             smt = con.createStatement();
             ResultSet rs = smt.executeQuery(query);
             while (rs.next()) {
                 qark = rs.getFloat(1);
             }
         } catch (SQLException err) {
             System.out.println(err.getMessage());
         }
         q.textPane.setText("");
         q.textPane.setText(""+qark);
	}

}
