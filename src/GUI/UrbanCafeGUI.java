package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.SystemColor;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;




import java.sql.*;
import java.awt.color.CMMException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JScrollBar;

import java.awt.Scrollbar;

public class UrbanCafeGUI {

    private JFrame frame;
    public static int shifra = 1;
    public double shumaTotale = 0;
    public double[] shumaEShtuar = new double[15];

    public String[] tavolinat = new String[15];
    public String[] tavolinaENdryshuar = new String[15];


    Date dNow = new Date();
    SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");


    public int[] sasia = new int[39];
    public String[] emrat={"Fructal","CocaCola","Fanta","Schweps","Sprite","Ice Tea","Laçin","Red Bull",
            "Smirnoff Ice","Uje natyral","Rademska","Limonade","Boronice","Fresh Juice",
            "Fresh Limon","Macchiato","Expresso","NessCafe","Bambi","Latte Cafee","Akullore 1/2",
            "Akullore","Mojito","Gin Tonic","Vere e kuqe","Vere e bardhe","Birra Peja","Lasko",
            "Niksicko","Heineken","Jegermeister","Smirnoff Vodka","Stock","Martini Rosgo","Bacardi","Ballantanes","Gin" ,"Birre krikell 0.5","Birre krikell 0.3"};;
    public double[] Cmimet = { 1, 1, 1, 1, 1, 1,  0.5, 2, 2,  0.5,
            0.5,  0.5,  0.5, 2,  1.5, 0.5, 0.5, 0.5,
            0.5, 0.5,  1, 1.5, 2, 2,  2,  2, 1,
            1, 1, 1.5,  2,  1.5,  1,  2,
            2,  1.5, 1.5  , 1, 1};
    public JTextField textField_1;
    public JTextField textField_2;
    public JTextField textField_3;
    public JTextField textField_4;
    public JTextField textField_5;
    public JTextField textField_6;
    public JTextField textField_7;
    public JTextField textField_8;
    public JTextField textField_9;
    public JTextField textField_10;
    public JTextField textField_11;
    public JTextField textField_12;
    public JTextField textField_13;
    public JTextField textField_14;
    public JTextField textField_15;
    public JTextField textField_16;
    public JTextField textField_17;
    public JTextField textField_18;
    public JTextField textField_19;
    public JTextField textField_20;
    public JTextField textField_21;
    public JTextField textField_22;
    public JTextField textField_23;
    public JTextField textField_24;
    public JTextField textField_25;
    public JTextField textField_26;
    public JTextField textField_27;
    public JTextField textField_28;
    public JTextField textField_29;
    public JTextField textField_30;
    public JTextField textField_31;
    public JTextField textField_32;
    public JTextField textField_33;
    public JTextField textField_34;
    public JTextField textField_35;
    public JTextField textField_36;
    public JTextField textField_37;
    public JTextField textField_39;
    public JTextField textField_40;
    public JTextField textField_41;
    public JTextField textField;



    /**
     * Launch the application.
     */

    public String paraqitNeFature() {

        String rez = "------------------Fatura--------------------"
                + "\n     	  Urban Cafe" + "\n " + ft.format(dNow)
                + "\n Fatura numer : " + shifra
                + "\n--------------------------------------------";
        for (int i = 0 ; i<sasia.length;i++){
            if (sasia[i] != 0) {
                rez = rez + "\n"+emrat[i]+"		" + sasia[i] + " x " + Cmimet[i];
            }
        }
        return rez + "\n-------------------------------------------" + "\n Totali		"
                + shumaTotale + "€" + "\n            Faleminderit" ;


    }
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            String host = "jdbc:sqlserver://DESKTOP-HK6RU47:1433;" +
                    "databaseName=UrbanCafe";
            String uName = "sa";
            Statement smt = null;
            String uPass = "qdemiraj";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            String query = "SELECT MAX(IDFatura) FROM Faturat;";
            smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {
                shifra = rs.getInt(1);
                shifra ++;
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }

        EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    UrbanCafeGUI window = new UrbanCafeGUI();
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
    public UrbanCafeGUI() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(154, 205, 50));
        frame.setBounds(0,0,1400, 800);
        frame.setUndecorated(true);
        frame.getContentPane().setLayout(null);

        JButton button = new JButton("Llogarit");
        button.setForeground(new Color(154, 205, 50));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                sasia[0] = new Integer(textField_1.getText()).intValue();
                sasia[1] = new Integer(textField_2.getText()).intValue();
                sasia[2] = new Integer(textField_3.getText()).intValue();
                sasia[3] = new Integer(textField_4.getText()).intValue();
                sasia[4] = new Integer(textField_5.getText()).intValue();
                sasia[5] = new Integer(textField_6.getText()).intValue();
                sasia[6] = new Integer(textField_7.getText()).intValue();
                sasia[7] = new Integer(textField_8.getText()).intValue();
                sasia[8] = new Integer(textField_9.getText()).intValue();
                sasia[9] = new Integer(textField_10.getText()).intValue();
                sasia[10] = new Integer(textField_11.getText()).intValue();
                sasia[11] = new Integer(textField_12.getText()).intValue();
                sasia[12] = new Integer(textField_13.getText()).intValue();
                sasia[13] = new Integer(textField_14.getText()).intValue();
                sasia[14] = new Integer(textField_15.getText()).intValue();
                sasia[15] = new Integer(textField_16.getText()).intValue();
                sasia[16] = new Integer(textField_17.getText()).intValue();
                sasia[17] = new Integer(textField_18.getText()).intValue();
                sasia[18] = new Integer(textField_19.getText()).intValue();
                sasia[19] = new Integer(textField_20.getText()).intValue();
                sasia[20] = new Integer(textField_21.getText()).intValue();
                sasia[21] = new Integer(textField_22.getText()).intValue();
                sasia[22] = new Integer(textField_23.getText()).intValue();
                sasia[23] = new Integer(textField_24.getText()).intValue();
                sasia[24] = new Integer(textField_25.getText()).intValue();
                sasia[25] = new Integer(textField_26.getText()).intValue();
                sasia[26] = new Integer(textField_27.getText()).intValue();
                sasia[27] = new Integer(textField_28.getText()).intValue();
                sasia[28] = new Integer(textField_29.getText()).intValue();
                sasia[29] = new Integer(textField_30.getText()).intValue();
                sasia[30] = new Integer(textField_31.getText()).intValue();
                sasia[31] = new Integer(textField_32.getText()).intValue();
                sasia[32] = new Integer(textField_33.getText()).intValue();
                sasia[33] = new Integer(textField_34.getText()).intValue();
                sasia[34] = new Integer(textField_35.getText()).intValue();
                sasia[35] = new Integer(textField_36.getText()).intValue();
                sasia[36] = new Integer(textField_37.getText()).intValue();
                sasia[37] = new Integer(textField_40.getText()).intValue();
                sasia[38] = new Integer(textField_41.getText()).intValue();

                int i = 0;
                shumaTotale=0;
                while (i<sasia.length){
                    if (sasia[i] != 0) {
                        shumaTotale = shumaTotale + (sasia[i]*Cmimet[i]);
                    }
                    i++;
                }

                String d = new DecimalFormat("00.0").format(shumaTotale);
                shumaTotale = new Double(d).doubleValue();

                textField_39.setText("" + shumaTotale + "€");
            }
        });
        button.setFont(new Font("Tahoma", Font.BOLD, 13));
        button.setBackground(new Color(0, 0, 0));
        button.setBounds(10, 603, 86, 47);
        frame.getContentPane().add(button);

        JTextPane textPane = new JTextPane();
        textPane.setBounds(574, 92, 233, 465);
        frame.getContentPane().add(textPane);

        JButton button_1 = new JButton("Fatura");
        button_1.setForeground(new Color(154, 205, 50));
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textPane.setText(paraqitNeFature());
                shifra++;

            }
        });
        button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        button_1.setBackground(new Color(0, 0, 0));
        button_1.setBounds(106, 603, 86, 47);
        frame.getContentPane().add(button_1);

        JButton button_3 = new JButton("Mbyll");
        button_3.setForeground(new Color(154, 205, 50));
        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String prgj = JOptionPane.showInputDialog("Deshironi ta mbyllni , po/jo ?");
                prgj.toLowerCase();
                if (prgj.equals("po")) {
                    System.exit(0);
                }else if (prgj.equals("jo")){

                }else{
                    JOptionPane.showMessageDialog(null,"Hyrje jovalide");
                }
            }
        });
        button_3.setFont(new Font("Tahoma", Font.BOLD, 13));
        button_3.setBackground(new Color(0, 0, 0));
        button_3.setBounds(364, 603, 80, 47);
        frame.getContentPane().add(button_3);

        JButton button_4 = new JButton("Fshi");
        button_4.setForeground(new Color(154, 205, 50));
        button_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("1");
                textField_1.setText("0");
                textField_2.setText("0");
                textField_3.setText("0");
                textField_4.setText("0");
                textField_5.setText("0");
                textField_6.setText("0");
                textField_7.setText("0");
                textField_8.setText("0");
                textField_9.setText("0");
                textField_10.setText("0");
                textField_11.setText("0");
                textField_12.setText("0");
                textField_13.setText("0");
                textField_14.setText("0");
                textField_15.setText("0");
                textField_16.setText("0");
                textField_17.setText("0");
                textField_18.setText("0");
                textField_19.setText("0");
                textField_20.setText("0");
                textField_21.setText("0");
                textField_22.setText("0");
                textField_23.setText("0");
                textField_24.setText("0");
                textField_25.setText("0");
                textField_26.setText("0");
                textField_27.setText("0");
                textField_28.setText("0");
                textField_29.setText("0");
                textField_30.setText("0");
                textField_31.setText("0");
                textField_32.setText("0");
                textField_33.setText("0");
                textField_34.setText("0");
                textField_35.setText("0");
                textField_36.setText("0");
                textField_37.setText("0");
                textField_39.setText("");
                textField_40.setText("0");
                textField_41.setText("0");

                shumaTotale = 0;
                textPane.setText("");
            }
        });
        button_4.setFont(new Font("Tahoma", Font.BOLD, 13));
        button_4.setBackground(new Color(0, 0, 0));
        button_4.setBounds(283, 603, 71, 47);
        frame.getContentPane().add(button_4);

        JTextPane textPane_1 = new JTextPane();
        textPane_1.setBounds(1102, 92, 233, 664);

        JScrollPane sc = new JScrollPane();
        sc.setBounds(1102,92,233,664);
        frame.getContentPane().add(sc);
        sc.setViewportView(textPane_1);


        JButton button_5 = new JButton("1");
        button_5.setForeground(new Color(154, 205, 50));
        button_5.setBackground(new Color(0, 0, 0));
        button_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = tavolinat[1];
                textPane_1.setText(text1+"\n Shuma totale :"+shumaEShtuar[1]+"€");
            }
        });
        button_5.setFont(new Font("Tahoma", Font.BOLD, 16));
        button_5.setBounds(817, 144, 71, 62);
        frame.getContentPane().add(button_5);

        JLabel label_16 = new JLabel("Tavolinat");
        label_16.setFont(new Font("Tekton Pro Cond", Font.BOLD, 29));
        label_16.setBounds(866, 92, 164, 39);
        frame.getContentPane().add(label_16);

        JButton button_6 = new JButton("2");
        button_6.setForeground(new Color(154, 205, 50));
        button_6.setBackground(new Color(0, 0, 0));
        button_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = tavolinat[2];
                textPane_1.setText(text1+"\n Shuma totale :"+shumaEShtuar[2]+"€");

            }
        });
        button_6.setFont(new Font("Tahoma", Font.BOLD, 16));
        button_6.setBounds(917, 144, 71, 62);
        frame.getContentPane().add(button_6);

        JButton button_7 = new JButton("3");
        button_7.setForeground(new Color(154, 205, 50));
        button_7.setBackground(new Color(0, 0, 0));
        button_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = tavolinat[3];
                textPane_1.setText(text1+"\n Shuma totale :"+shumaEShtuar[3]+"€");
            }
        });
        button_7.setFont(new Font("Tahoma", Font.BOLD, 16));
        button_7.setBounds(1019, 144, 71, 62);
        frame.getContentPane().add(button_7);

        JButton button_8 = new JButton("4");
        button_8.setForeground(new Color(154, 205, 50));
        button_8.setBackground(new Color(0, 0, 0));
        button_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = tavolinat[4];
                textPane_1.setText(text1+"\n Shuma totale :"+shumaEShtuar[4]+"€");
            }
        });
        button_8.setFont(new Font("Tahoma", Font.BOLD, 16));
        button_8.setBounds(817, 230, 71, 62);
        frame.getContentPane().add(button_8);

        JButton button_9 = new JButton("5");
        button_9.setForeground(new Color(154, 205, 50));
        button_9.setBackground(new Color(0, 0, 0));
        button_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = tavolinat[5];
                textPane_1.setText(text1+"\n Shuma totale :"+shumaEShtuar[5]+"€");
            }
        });
        button_9.setFont(new Font("Tahoma", Font.BOLD, 16));
        button_9.setBounds(919, 230, 71, 62);
        frame.getContentPane().add(button_9);

        JButton button_10 = new JButton("6");
        button_10.setForeground(new Color(154, 205, 50));
        button_10.setBackground(new Color(0, 0, 0));
        button_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = tavolinat[6];
                textPane_1.setText(text1+"\n Shuma totale :"+shumaEShtuar[6]+"€");}
        });
        button_10.setFont(new Font("Tahoma", Font.BOLD, 16));
        button_10.setBounds(1019, 230, 71, 62);
        frame.getContentPane().add(button_10);

        JButton button_11 = new JButton("7");
        button_11.setForeground(new Color(154, 205, 50));
        button_11.setBackground(new Color(0, 0, 0));
        button_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = tavolinat[7];
                textPane_1.setText(text1+"\n Shuma totale :"+shumaEShtuar[7]+"€");
            }
        });
        button_11.setFont(new Font("Tahoma", Font.BOLD, 16));
        button_11.setBounds(817, 319, 71, 62);
        frame.getContentPane().add(button_11);

        JButton button_12 = new JButton("8");
        button_12.setForeground(new Color(154, 205, 50));
        button_12.setBackground(new Color(0, 0, 0));
        button_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = tavolinat[8];
                textPane_1.setText(text1+"\n Shuma totale :"+shumaEShtuar[8]+"€");
            }
        });
        button_12.setFont(new Font("Tahoma", Font.BOLD, 16));
        button_12.setBounds(919, 319, 71, 62);
        frame.getContentPane().add(button_12);

        JButton button_13 = new JButton("9");
        button_13.setForeground(new Color(154, 205, 50));
        button_13.setBackground(new Color(0, 0, 0));
        button_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = tavolinat[9];
                textPane_1.setText(text1+"\n Shuma totale :"+shumaEShtuar[9]+"€");
            }
        });
        button_13.setFont(new Font("Tahoma", Font.BOLD, 16));
        button_13.setBounds(1021, 319, 71, 62);
        frame.getContentPane().add(button_13);

        JButton button_14 = new JButton("10");
        button_14.setForeground(new Color(154, 205, 50));
        button_14.setBackground(new Color(0, 0, 0));
        button_14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = tavolinat[10];
                textPane_1.setText(text1+"\n Shuma totale :"+shumaEShtuar[10]+"€");
            }
        });
        button_14.setFont(new Font("Tahoma", Font.BOLD, 16));
        button_14.setBounds(817, 410, 71, 62);
        frame.getContentPane().add(button_14);

        JButton button_15 = new JButton("11");
        button_15.setForeground(new Color(154, 205, 50));
        button_15.setBackground(new Color(0, 0, 0));
        button_15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = tavolinat[11];
                textPane_1.setText(text1+"\n Shuma totale :"+shumaEShtuar[11]+"€");
            }
        });
        button_15.setFont(new Font("Tahoma", Font.BOLD, 16));
        button_15.setBounds(917, 410, 71, 62);
        frame.getContentPane().add(button_15);

        JButton button_16 = new JButton("12");
        button_16.setForeground(new Color(154, 205, 50));
        button_16.setBackground(new Color(0, 0, 0));
        button_16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = tavolinat[12];
                textPane_1.setText(text1+"\n Shuma totale :"+shumaEShtuar[12]+"€");
            }
        });
        button_16.setFont(new Font("Tahoma", Font.BOLD, 16));
        button_16.setBounds(1019, 410, 71, 62);
        frame.getContentPane().add(button_16);

        JButton button_17 = new JButton("13");
        button_17.setForeground(new Color(154, 205, 50));
        button_17.setBackground(new Color(0, 0, 0));
        button_17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = tavolinat[13];
                textPane_1.setText(text1+"\n Shuma totale :"+shumaEShtuar[13]+"€");
            }
        });
        button_17.setFont(new Font("Tahoma", Font.BOLD, 16));
        button_17.setBounds(817, 495, 71, 62);
        frame.getContentPane().add(button_17);

        JButton button_18 = new JButton("14");
        button_18.setForeground(new Color(154, 205, 50));
        button_18.setBackground(new Color(0, 0, 0));
        button_18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = tavolinat[14];
                textPane_1.setText(text1+"\n Shuma totale :"+shumaEShtuar[14]+"€");
            }
        });
        button_18.setFont(new Font("Tahoma", Font.BOLD, 16));
        button_18.setBounds(919, 495, 71, 62);
        frame.getContentPane().add(button_18);

        JButton button_19 = new JButton("15");
        button_19.setForeground(new Color(154, 205, 50));
        button_19.setBackground(new Color(0, 0, 0));
        button_19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = tavolinat[15];
                textPane_1.setText(text1+"\n Shuma totale :"+shumaEShtuar[15]+"€");
            }
        });
        button_19.setFont(new Font("Tahoma", Font.BOLD, 16));
        button_19.setBounds(1021, 495, 71, 62);
        frame.getContentPane().add(button_19);

        JButton button_2 = new JButton("Ruaj");
        button_2.setForeground(new Color(154, 205, 50));
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = textField.getText();
                int tavolina = new Integer(txt).intValue();
                    String porosia = textPane.getText();

                    if (tavolinat[tavolina] == null) {
                        tavolinat[tavolina] = porosia;
                        shumaEShtuar[tavolina] = shumaTotale;
                        switch (tavolina) {
                            case 1:
                                button_5.setForeground(new Color(0, 0, 0));
                                button_5.setBackground(new Color(255, 255, 255));
                                break;
                            case 2:
                                button_6.setForeground(new Color(0, 0, 0));
                                button_6.setBackground(new Color(255, 255, 255));
                                break;
                            case 3:
                                button_7.setForeground(new Color(0, 0, 0));
                                button_7.setBackground(new Color(255, 255, 255));
                                break;
                            case 4:
                                button_8.setForeground(new Color(0, 0, 0));
                                button_8.setBackground(new Color(255, 255, 255));
                                break;
                            case 5:
                                button_9.setForeground(new Color(0, 0, 0));
                                button_9.setBackground(new Color(255, 255, 255));
                                break;
                            case 6:
                                button_10.setForeground(new Color(0, 0, 0));
                                button_10.setBackground(new Color(255, 255, 255));
                                break;
                            case 7:
                                button_11.setForeground(new Color(0, 0, 0));
                                button_11.setBackground(new Color(255, 255, 255));
                                break;
                            case 8:
                                button_12.setForeground(new Color(0, 0, 0));
                                button_12.setBackground(new Color(255, 255, 255));
                                break;
                            case 9:
                                button_13.setForeground(new Color(0, 0, 0));
                                button_13.setBackground(new Color(255, 255, 255));
                                break;
                            case 10:
                                button_14.setForeground(new Color(0, 0, 0));
                                button_14.setBackground(new Color(255, 255, 255));
                                break;
                            case 11:
                                button_15.setForeground(new Color(0, 0, 0));
                                button_15.setBackground(new Color(255, 255, 255));
                                break;
                            case 12:
                                button_16.setForeground(new Color(0, 0, 0));
                                button_16.setBackground(new Color(255, 255, 255));
                                break;
                            case 13:
                                button_17.setForeground(new Color(0, 0, 0));
                                button_17.setBackground(new Color(255, 255, 255));
                                break;
                            case 14:
                                button_18.setForeground(new Color(0, 0, 0));
                                button_18.setBackground(new Color(255, 255, 255));
                                break;
                            case 15:
                                button_19.setForeground(new Color(0, 0, 0));
                                button_19.setBackground(new Color(255, 255, 255));
                                break;
                        }
                    } else {
                        tavolinaENdryshuar[tavolina] = porosia;
                        tavolinat[tavolina] = tavolinat[tavolina] + "\n\n" + tavolinaENdryshuar[tavolina];
                        shumaEShtuar[tavolina] += shumaTotale;

                    }


                    try {
                        String host = "jdbc:sqlserver://DESKTOP-HK6RU47:1433;" +
                                "databaseName=UrbanCafe";
                        String uName = "sa";
                        String uPass = "qdemiraj";
                        Connection con = DriverManager.getConnection(host, uName, uPass);
                        PreparedStatement statement = (PreparedStatement) con.prepareStatement("INSERT INTO Faturat(IDFatura,Vlera,Data) VALUES (?,?,?)");
                        PreparedStatement statement1 = (PreparedStatement) con.prepareStatement("INSERT INTO PijetEShitura(Data,Fructal,CocaCola,Fanta,Schweps,Sprite,IceTea,Lacin,RedBull," +
                                " SmirnoffIce,UjeNatyral,Rademska,Limonade,Boronice,FreshJuice," +
                                " FreshLimon,Macchiato,Expresso,NessCafe,Bambi,LatteCafe,Akullore12," +
                                " Akullore,Mojito,GinTonic,VereEKuqe,VereEBardhe,BirraPeja,Lasko," +
                                " Niksicko,Heineken,Jegermeister,SmirnoffVodka,Stock,MartiniRosgo,Bacardi,Ballantanes,Gin,[Birra_krikell0.5],[Birra_krikell0.3]) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                        statement.setInt(1, shifra);
                        statement.setFloat(2, (float) shumaTotale);
                        statement.setString(3, "" + ft.format(dNow));
                        statement.executeUpdate();
                        statement.close();
                        statement1.setString(1, ft.format(dNow));
                        for (int i = 2; i < sasia.length + 2; i++) {
                            statement1.setInt(i, sasia[i - 2]);
                        }
                        statement1.executeUpdate();
                        statement1.close();
                        con.close();

                    } catch (SQLException err) {
                        System.out.println(err.getMessage());
                    }
            }
        });

        button_2.setFont(new Font("Tahoma", Font.BOLD, 13));
        button_2.setBackground(new Color(0, 0, 0));
        button_2.setBounds(202, 603, 71, 47);
        frame.getContentPane().add(button_2);

        JButton btnNewButton = new JButton("Fshi Tavolinen");
        btnNewButton.setForeground(new Color(154, 205, 50));
        btnNewButton.setBackground(new Color(0, 0, 0));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tav =JOptionPane.showInputDialog("Shtyp tavolinen:");
                int tav1 = new Integer(tav).intValue();
                tavolinat[tav1]=null;
                shumaEShtuar[tav1] = 0;
                switch (tav1){
                    case 1:
                        button_5.setForeground(new Color(154, 205, 50));
                        button_5.setBackground(new Color(0,0,0));
                        break;
                    case 2:
                        button_6.setForeground(new Color(154, 205, 50));
                        button_6.setBackground(new Color(0,0,0));
                        break;
                    case 3:
                        button_7.setForeground(new Color(154, 205, 50));
                        button_7.setBackground(new Color(0,0,0));
                        break;
                    case 4:
                        button_8.setForeground(new Color(154, 205, 50));
                        button_8.setBackground(new Color(0,0,0));
                        break;
                    case 5:
                        button_9.setForeground(new Color(154, 205, 50));
                        button_9.setBackground(new Color(0,0,0));
                        break;
                    case 6:
                        button_10.setForeground(new Color(154, 205, 50));
                        button_10.setBackground(new Color(0,0,0));
                        break;
                    case 7:
                        button_11.setForeground(new Color(154, 205, 50));
                        button_11.setBackground(new Color(0,0,0));
                        break;
                    case 8:
                        button_12.setForeground(new Color(154, 205, 50));
                        button_12.setBackground(new Color(0,0,0));
                        break;
                    case 9:
                        button_13.setForeground(new Color(154, 205, 50));
                        button_13.setBackground(new Color(0,0,0));
                        break;
                    case 10:
                        button_14.setForeground(new Color(154, 205, 50));
                        button_14.setBackground(new Color(0,0,0));
                        break;
                    case 11:
                        button_15.setForeground(new Color(154, 205, 50));
                        button_15.setBackground(new Color(0,0,0));
                        break;
                    case 12:
                        button_16.setForeground(new Color(154, 205, 50));
                        button_16.setBackground(new Color(0,0,0));
                        break;
                    case 13:
                        button_17.setForeground(new Color(154, 205, 50));
                        button_17.setBackground(new Color(0,0,0));
                        break;
                    case 14:
                        button_18.setForeground(new Color(154, 205, 50));
                        button_18.setBackground(new Color(0,0,0));
                        break;
                    case 15:
                        button_19.setForeground(new Color(154, 205, 50));
                        button_19.setBackground(new Color(0,0,0));
                        break;
                }

            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton.setBounds(917, 582, 173, 41);
        frame.getContentPane().add(btnNewButton);

        JButton btnQarkullimi = new JButton("Qarkullimi ditor");
        btnQarkullimi.setBackground(new Color(0, 0, 0));
        btnQarkullimi.setForeground(new Color(154, 205, 50));
        btnQarkullimi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
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
                JOptionPane.showMessageDialog(null,"Qarkullimi ditore eshte :"+qark+" €");
            }
        });
        btnQarkullimi.setFont(new Font("Tekton Pro Cond", Font.BOLD, 20));
        btnQarkullimi.setBounds(866, 21, 164, 39);
        frame.getContentPane().add(btnQarkullimi);

        JButton btnQarkullimiJavor = new JButton("Qarkullimi mujor");
        btnQarkullimiJavor.setBackground(new Color(0, 0, 0));
        btnQarkullimiJavor.setForeground(new Color(154, 205, 50));
        btnQarkullimiJavor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data1 = JOptionPane.showInputDialog("Shtyp muajin dhe vitin, ne formen mm.yyyy");
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
                            "where Data LIKE '___"+data1+"'";
                    smt = con.createStatement();
                    ResultSet rs = smt.executeQuery(query);
                    while (rs.next()) {
                        qark = rs.getFloat(1);
                    }
                } catch (SQLException err) {
                    System.out.println(err.getMessage());
                }
                JOptionPane.showMessageDialog(null,"Qarkullimi mujore eshte: "+qark+" €");
            }
        });
        btnQarkullimiJavor.setFont(new Font("Tekton Pro Cond", Font.BOLD, 20));
        btnQarkullimiJavor.setBounds(1040, 21, 175, 39);
        frame.getContentPane().add(btnQarkullimiJavor);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(107, 142, 35));
        panel.setBounds(0, 0, 807, 800);
        frame.getContentPane().add(panel);

        JLabel label = new JLabel("Tavolina:");
        label.setFont(new Font("Tekton Pro Cond", Font.BOLD, 21));
        label.setBounds(10, 19, 83, 19);
        panel.add(label);

        JLabel label_1 = new JLabel("Pijet");
        label_1.setForeground(Color.BLACK);
        label_1.setFont(new Font("Tekton Pro Cond", Font.BOLD, 27));
        label_1.setBackground(Color.BLACK);
        label_1.setBounds(40, 49, 83, 31);
        panel.add(label_1);

        JLabel label_2 = new JLabel("Coca cola:");
        label_2.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_2.setBounds(10, 129, 83, 19);
        panel.add(label_2);

        JLabel label_3 = new JLabel("Fanta:");
        label_3.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_3.setBounds(10, 159, 83, 19);
        panel.add(label_3);

        JLabel label_4 = new JLabel("Sprite:");
        label_4.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_4.setBounds(10, 217, 83, 19);
        panel.add(label_4);

        JLabel label_5 = new JLabel("Ice tea:");
        label_5.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_5.setBounds(10, 247, 83, 19);
        panel.add(label_5);

        JLabel label_6 = new JLabel("Fructal:");
        label_6.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_6.setBounds(10, 99, 83, 19);
        panel.add(label_6);

        JLabel label_7 = new JLabel("Birra Peja:");
        label_7.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_7.setBounds(389, 109, 83, 19);
        panel.add(label_7);

        JLabel label_8 = new JLabel("Lasko:");
        label_8.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_8.setBounds(389, 139, 83, 19);
        panel.add(label_8);

        JLabel label_9 = new JLabel("Total:");
        label_9.setFont(new Font("Tekton Pro Cond", Font.BOLD, 18));
        label_9.setBounds(40, 548, 68, 33);
        panel.add(label_9);

        JLabel label_10 = new JLabel("Kafet");
        label_10.setForeground(Color.BLACK);
        label_10.setFont(new Font("Tekton Pro Cond", Font.BOLD, 27));
        label_10.setBackground(Color.BLACK);
        label_10.setBounds(203, 57, 83, 31);
        panel.add(label_10);

        JLabel label_11 = new JLabel("Esspresso");
        label_11.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_11.setBounds(165, 129, 121, 19);
        panel.add(label_11);

        JLabel label_12 = new JLabel("Macchiato :");
        label_12.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_12.setBounds(165, 99, 122, 19);
        panel.add(label_12);

        JLabel label_13 = new JLabel("Ness:");
        label_13.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_13.setBounds(175, 159, 121, 19);
        panel.add(label_13);

        JLabel label_14 = new JLabel("Bambi:");
        label_14.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_14.setBounds(165, 188, 121, 19);
        panel.add(label_14);

        JLabel label_15 = new JLabel("Latte caffe");
        label_15.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_15.setBounds(165, 217, 121, 19);
        panel.add(label_15);

        textField_1 = new JTextField();
        textField_1.setText("0");
        textField_1.setColumns(10);
        textField_1.setBounds(91, 91, 40, 19);
        panel.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setText("0");
        textField_2.setColumns(10);
        textField_2.setBounds(90, 123, 40, 19);
        panel.add(textField_2);

        textField_3 = new JTextField();
        textField_3.setText("0");
        textField_3.setColumns(10);
        textField_3.setBounds(90, 159, 40, 19);
        panel.add(textField_3);

        textField_4 = new JTextField();
        textField_4.setText("0");
        textField_4.setColumns(10);
        textField_4.setBounds(90, 190, 40, 19);
        panel.add(textField_4);

        textField_5 = new JTextField();
        textField_5.setText("0");
        textField_5.setColumns(10);
        textField_5.setBounds(90, 216, 40, 19);
        panel.add(textField_5);

        JLabel label_17 = new JLabel("Akullore");
        label_17.setForeground(Color.BLACK);
        label_17.setFont(new Font("Tekton Pro Cond", Font.BOLD, 27));
        label_17.setBackground(Color.BLACK);
        label_17.setBounds(213, 239, 83, 31);
        panel.add(label_17);

        JLabel label_18 = new JLabel("Akullore 1/2:");
        label_18.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_18.setBounds(165, 281, 121, 19);
        panel.add(label_18);

        JLabel label_19 = new JLabel("Akullore :");
        label_19.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_19.setBounds(165, 313, 121, 19);
        panel.add(label_19);

        JLabel label_20 = new JLabel("Schweps:");
        label_20.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_20.setBounds(10, 189, 83, 19);
        panel.add(label_20);

        JLabel label_21 = new JLabel("La\u00E7in:");
        label_21.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_21.setBounds(10, 277, 83, 19);
        panel.add(label_21);

        JLabel label_22 = new JLabel("Pije Alkoolike");
        label_22.setForeground(Color.BLACK);
        label_22.setFont(new Font("Tekton Pro Cond", Font.BOLD, 27));
        label_22.setBackground(Color.BLACK);
        label_22.setBounds(386, 57, 132, 31);
        panel.add(label_22);

        JLabel label_23 = new JLabel("Red Bull:");
        label_23.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_23.setBounds(10, 305, 83, 19);
        panel.add(label_23);

        JLabel label_24 = new JLabel("SmirnofIce");
        label_24.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_24.setBounds(10, 330, 83, 31);
        panel.add(label_24);

        JLabel label_25 = new JLabel("Uje natyral:");
        label_25.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_25.setBounds(10, 365, 83, 19);
        panel.add(label_25);

        JLabel label_26 = new JLabel("Rademska:");
        label_26.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_26.setBounds(10, 394, 83, 19);
        panel.add(label_26);

        JLabel label_27 = new JLabel("Limonade:");
        label_27.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_27.setBounds(10, 424, 83, 19);
        panel.add(label_27);

        JLabel label_28 = new JLabel("Boronice:");
        label_28.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_28.setBounds(10, 454, 83, 19);
        panel.add(label_28);

        JLabel label_29 = new JLabel("FreshJuice:");
        label_29.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_29.setBounds(10, 484, 83, 19);
        panel.add(label_29);

        JLabel label_30 = new JLabel("FreshLimon:");
        label_30.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_30.setBounds(0, 514, 98, 19);
        panel.add(label_30);

        JLabel label_31 = new JLabel("Niksicko:");
        label_31.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_31.setBounds(389, 170, 83, 19);
        panel.add(label_31);

        JLabel label_32 = new JLabel("Heineken:");
        label_32.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_32.setBounds(389, 200, 83, 19);
        panel.add(label_32);

        JLabel label_33 = new JLabel("Jegermeister:");
        label_33.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_33.setBounds(389, 231, 105, 19);
        panel.add(label_33);

        JLabel label_34 = new JLabel("Smirnoff Vodka:");
        label_34.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_34.setBounds(389, 261, 105, 19);
        panel.add(label_34);

        JLabel label_35 = new JLabel("Stock:");
        label_35.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_35.setBounds(389, 292, 83, 19);
        panel.add(label_35);

        JLabel label_36 = new JLabel("Martini Rosgo:");
        label_36.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_36.setBounds(389, 322, 105, 19);
        panel.add(label_36);

        JLabel label_37 = new JLabel("Bacardi:");
        label_37.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_37.setBounds(389, 351, 83, 19);
        panel.add(label_37);

        JLabel label_38 = new JLabel("Ballantanes:");
        label_38.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_38.setBounds(389, 381, 105, 19);
        panel.add(label_38);

        JLabel label_39 = new JLabel("Gin :");
        label_39.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_39.setBounds(389, 412, 83, 19);
        panel.add(label_39);

        JLabel label_40 = new JLabel("Coctails");
        label_40.setForeground(Color.BLACK);
        label_40.setFont(new Font("Tekton Pro Cond", Font.BOLD, 27));
        label_40.setBackground(Color.BLACK);
        label_40.setBounds(213, 343, 83, 31);
        panel.add(label_40);

        JLabel label_41 = new JLabel("Mojito:");
        label_41.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_41.setBounds(165, 385, 121, 19);
        panel.add(label_41);

        JLabel label_42 = new JLabel("Gin Tonic :");
        label_42.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_42.setBounds(165, 417, 121, 19);
        panel.add(label_42);

        JLabel label_43 = new JLabel("Vererat");
        label_43.setForeground(Color.BLACK);
        label_43.setFont(new Font("Tekton Pro Cond", Font.BOLD, 27));
        label_43.setBackground(Color.BLACK);
        label_43.setBounds(213, 444, 83, 31);
        panel.add(label_43);

        JLabel label_44 = new JLabel("Vere e kuqe:");
        label_44.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_44.setBounds(165, 486, 121, 19);
        panel.add(label_44);

        JLabel label_45 = new JLabel("Vere e bardhe:");
        label_45.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        label_45.setBounds(165, 518, 121, 19);
        panel.add(label_45);

        textField_6 = new JTextField();
        textField_6.setText("0");
        textField_6.setColumns(10);
        textField_6.setBounds(92, 247, 40, 19);
        panel.add(textField_6);

        textField_7 = new JTextField();
        textField_7.setText("0");
        textField_7.setColumns(10);
        textField_7.setBounds(91, 277, 40, 19);
        panel.add(textField_7);

        textField_8 = new JTextField();
        textField_8.setText("0");
        textField_8.setColumns(10);
        textField_8.setBounds(91, 304, 40, 19);
        panel.add(textField_8);

        textField_9 = new JTextField();
        textField_9.setText("0");
        textField_9.setColumns(10);
        textField_9.setBounds(91, 335, 40, 19);
        panel.add(textField_9);

        textField_10 = new JTextField();
        textField_10.setText("0");
        textField_10.setColumns(10);
        textField_10.setBounds(91, 364, 40, 19);
        panel.add(textField_10);

        textField_11 = new JTextField();
        textField_11.setText("0");
        textField_11.setColumns(10);
        textField_11.setBounds(92, 394, 40, 19);
        panel.add(textField_11);

        textField_12 = new JTextField();
        textField_12.setText("0");
        textField_12.setColumns(10);
        textField_12.setBounds(91, 424, 40, 19);
        panel.add(textField_12);

        textField_13 = new JTextField();
        textField_13.setText("0");
        textField_13.setColumns(10);
        textField_13.setBounds(91, 454, 40, 19);
        panel.add(textField_13);

        textField_14 = new JTextField();
        textField_14.setText("0");
        textField_14.setColumns(10);
        textField_14.setBounds(91, 484, 40, 19);
        panel.add(textField_14);

        textField_15 = new JTextField();
        textField_15.setText("0");
        textField_15.setColumns(10);
        textField_15.setBounds(91, 514, 40, 19);
        panel.add(textField_15);

        textField_16 = new JTextField();
        textField_16.setText("0");
        textField_16.setColumns(10);
        textField_16.setBounds(297, 98, 40, 19);
        panel.add(textField_16);

        textField_17 = new JTextField();
        textField_17.setText("0");
        textField_17.setColumns(10);
        textField_17.setBounds(297, 123, 40, 19);
        panel.add(textField_17);

        textField_18 = new JTextField();
        textField_18.setText("0");
        textField_18.setColumns(10);
        textField_18.setBounds(297, 159, 40, 19);
        panel.add(textField_18);

        textField_19 = new JTextField();
        textField_19.setText("0");
        textField_19.setColumns(10);
        textField_19.setBounds(296, 187, 40, 19);
        panel.add(textField_19);

        textField_20 = new JTextField();
        textField_20.setText("0");
        textField_20.setColumns(10);
        textField_20.setBounds(297, 216, 40, 19);
        panel.add(textField_20);

        textField_21 = new JTextField();
        textField_21.setText("0");
        textField_21.setColumns(10);
        textField_21.setBounds(298, 277, 40, 19);
        panel.add(textField_21);

        textField_22 = new JTextField();
        textField_22.setText("0");
        textField_22.setColumns(10);
        textField_22.setBounds(298, 304, 40, 19);
        panel.add(textField_22);

        textField_23 = new JTextField();
        textField_23.setText("0");
        textField_23.setColumns(10);
        textField_23.setBounds(297, 380, 40, 19);
        panel.add(textField_23);

        textField_24 = new JTextField();
        textField_24.setText("0");
        textField_24.setColumns(10);
        textField_24.setBounds(297, 411, 40, 19);
        panel.add(textField_24);

        textField_25 = new JTextField();
        textField_25.setText("0");
        textField_25.setColumns(10);
        textField_25.setBounds(298, 484, 40, 19);
        panel.add(textField_25);

        textField_26 = new JTextField();
        textField_26.setText("0");
        textField_26.setColumns(10);
        textField_26.setBounds(298, 514, 40, 19);
        panel.add(textField_26);

        textField_27 = new JTextField();
        textField_27.setText("0");
        textField_27.setColumns(10);
        textField_27.setBounds(505, 109, 40, 19);
        panel.add(textField_27);

        textField_28 = new JTextField();
        textField_28.setText("0");
        textField_28.setColumns(10);
        textField_28.setBounds(505, 138, 40, 19);
        panel.add(textField_28);

        textField_29 = new JTextField();
        textField_29.setText("0");
        textField_29.setColumns(10);
        textField_29.setBounds(505, 169, 40, 19);
        panel.add(textField_29);

        textField_30 = new JTextField();
        textField_30.setText("0");
        textField_30.setColumns(10);
        textField_30.setBounds(505, 199, 40, 19);
        panel.add(textField_30);

        textField_31 = new JTextField();
        textField_31.setText("0");
        textField_31.setColumns(10);
        textField_31.setBounds(505, 230, 40, 19);
        panel.add(textField_31);

        textField_32 = new JTextField();
        textField_32.setText("0");
        textField_32.setColumns(10);
        textField_32.setBounds(505, 260, 40, 19);
        panel.add(textField_32);

        textField_33 = new JTextField();
        textField_33.setText("0");
        textField_33.setColumns(10);
        textField_33.setBounds(505, 291, 40, 19);
        panel.add(textField_33);

        textField_34 = new JTextField();
        textField_34.setText("0");
        textField_34.setColumns(10);
        textField_34.setBounds(505, 322, 40, 19);
        panel.add(textField_34);

        textField_35 = new JTextField();
        textField_35.setText("0");
        textField_35.setColumns(10);
        textField_35.setBounds(505, 350, 40, 19);
        panel.add(textField_35);

        textField_36 = new JTextField();
        textField_36.setText("0");
        textField_36.setColumns(10);
        textField_36.setBounds(505, 382, 40, 19);
        panel.add(textField_36);

        textField_37 = new JTextField();
        textField_37.setText("0");
        textField_37.setColumns(10);
        textField_37.setBounds(506, 412, 40, 19);
        panel.add(textField_37);

        textField = new JTextField();
        textField.setText("0");
        textField.setColumns(10);
        textField.setBounds(83, 19, 40, 19);
        panel.add(textField);


        textField_39 = new JTextField();
        textField_39.setBounds(83, 555, 83, 26);
        panel.add(textField_39);
        textField_39.setColumns(10);
        panel.add(textField_39);

        JButton btnShitjaDitore = new JButton("Shitja ditore");
        btnShitjaDitore.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = JOptionPane.showInputDialog("Shtyp daten ne formen dd.mm.yyyy:");
                try {
                    String host =  "jdbc:sqlserver://DESKTOP-HK6RU47:1433;" +
                            "databaseName=UrbanCafe";
                    String uName = "sa";
                    String uPass = "qdemiraj";
                    Connection con = DriverManager.getConnection(host, uName, uPass);
                    String query = "select sum(Fructal) ,sum(CocaCola) as CocaCola,sum(Fanta)as Fanta,sum(Schweps)as Schweps,sum(Sprite)as Sprite,sum(IceTea)as IceTea,sum(Lacin)as Lacin,sum(RedBull)as RedBull ," +
                            " sum(SmirnoffIce)as SmrinoffIce,sum(UjeNatyral)as UjeNatyral,sum(Rademska)as Rademska,sum(Limonade)as Limonade,sum(Boronice)as Boronice,sum(FreshJuice)as FreshJuice," +
                            " sum(FreshLimon)as FreshLimon,sum(Macchiato)as Macchiato,sum(Expresso)as Expresso,sum(NessCafe)as NessCafe,sum(Bambi)as Bambi,sum(LatteCafe)as LatteCafe,sum(Akullore12)as Akulllore12," +
                            " sum(Akullore)as Akullore,sum(Mojito)as Mojito,sum(GinTonic)as GinTonic,sum(VereEKuqe)as VereEKuqe,sum(VereEBardhe)as VereEBardhe,sum(BirraPeja)as BirraPeja,sum(Lasko)as Lasko," +
                            " sum(Niksicko)as Niksico,sum(Heineken)as Heineken,sum(Jegermeister)as Jegermeister,sum(SmirnoffVodka)as SmirnoffVodka,sum(Stock)as Stock,sum(MartiniRosgo)as MartiniRosgo,sum(Bacardi)as Bacardi," +
                            "sum(Ballantanes)as Ballantanes,sum(Gin)as Gin,sum([Birra_krikell0.5])as BirraKrikell_0_5 ,sum([Birra_krikell0.3])as BirraKrikell_0_3 from PijetEShitura "
                            + "where Data = '"+data+"';";

                    int[] sasiaEPijeve = new int[39];
                    Statement statement = con.createStatement();
                    ResultSet rs = statement.executeQuery(query);

                    while (rs.next()) {
                        for (int i = 0;i<39;i++){
                            sasiaEPijeve[i] = rs.getInt(i+1);
                        }
                    }


                    String rez = "";
                    for (int j = 0;j<39;j++){
                        rez = rez + "\n"+emrat[j]+": "+sasiaEPijeve[j];
                    }
                    JOptionPane.showMessageDialog(null,rez);
                }
                catch (SQLException err) {
                    System.out.println(err.getMessage());
                }
            }
        });
        btnShitjaDitore.setForeground(new Color(154, 205, 50));
        btnShitjaDitore.setFont(new Font("Tekton Pro Cond", Font.BOLD, 20));
        btnShitjaDitore.setBackground(Color.BLACK);
        btnShitjaDitore.setBounds(448, 7, 164, 39);
        panel.add(btnShitjaDitore);

        JButton btnShitjaMujore = new JButton("Shitja mujore");
        btnShitjaMujore.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = JOptionPane.showInputDialog("Shtyp daten ne formen mm.yyyy:");
                try {
                    String host =  "jdbc:sqlserver://DESKTOP-HK6RU47:1433;" +
                            "databaseName=UrbanCafe";
                    String uName = "sa";
                    String uPass = "qdemiraj";
                    Connection con = DriverManager.getConnection(host, uName, uPass);
                    String query = "select sum(Fructal) ,sum(CocaCola) as CocaCola,sum(Fanta)as Fanta,sum(Schweps)as Schweps,sum(Sprite)as Sprite,sum(IceTea)as IceTea,sum(Lacin)as Lacin,sum(RedBull)as RedBull ," +
                            " sum(SmirnoffIce)as SmrinoffIce,sum(UjeNatyral)as UjeNatyral,sum(Rademska)as Rademska,sum(Limonade)as Limonade,sum(Boronice)as Boronice,sum(FreshJuice)as FreshJuice," +
                            " sum(FreshLimon)as FreshLimon,sum(Macchiato)as Macchiato,sum(Expresso)as Expresso,sum(NessCafe)as NessCafe,sum(Bambi)as Bambi,sum(LatteCafe)as LatteCafe,sum(Akullore12)as Akulllore12," +
                            " sum(Akullore)as Akullore,sum(Mojito)as Mojito,sum(GinTonic)as GinTonic,sum(VereEKuqe)as VereEKuqe,sum(VereEBardhe)as VereEBardhe,sum(BirraPeja)as BirraPeja,sum(Lasko)as Lasko," +
                            " sum(Niksicko)as Niksico,sum(Heineken)as Heineken,sum(Jegermeister)as Jegermeister,sum(SmirnoffVodka)as SmirnoffVodka,sum(Stock)as Stock,sum(MartiniRosgo)as MartiniRosgo,sum(Bacardi)as Bacardi," +
                            "sum(Ballantanes)as Ballantanes,sum(Gin)as Gin,sum([Birra_krikell0.5])as BirraKrikell_0_5 ,sum([Birra_krikell0.3])as BirraKrikell_0_3 from PijetEShitura "
                            + "where Data like'___"+data+"';";

                    int[] sasiaEPijeve = new int[39];
                    Statement statement = con.createStatement();
                    ResultSet rs = statement.executeQuery(query);

                    while (rs.next()) {
                        for (int i = 0;i<39;i++){
                            sasiaEPijeve[i] = rs.getInt(i+1);
                        }
                    }


                    String rez = "";
                    for (int j = 0;j<39;j++){
                        rez = rez + "\n"+emrat[j]+": "+sasiaEPijeve[j];
                    }
                    JOptionPane.showMessageDialog(null,rez);
                }
                catch (SQLException err) {
                    System.out.println(err.getMessage());
                }
            }
        });
        btnShitjaMujore.setForeground(new Color(154, 205, 50));
        btnShitjaMujore.setFont(new Font("Tekton Pro Cond", Font.BOLD, 20));
        btnShitjaMujore.setBackground(Color.BLACK);
        btnShitjaMujore.setBounds(622, 9, 175, 39);
        panel.add(btnShitjaMujore);

        JLabel lblBirreKrikell = new JLabel("Birre krikell");
        lblBirreKrikell.setForeground(Color.BLACK);
        lblBirreKrikell.setFont(new Font("Tekton Pro Cond", Font.BOLD, 27));
        lblBirreKrikell.setBackground(Color.BLACK);
        lblBirreKrikell.setBounds(389, 442, 129, 31);
        panel.add(lblBirreKrikell);

        JLabel lblBirre = new JLabel("Birre 0.5 :");
        lblBirre.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        lblBirre.setBounds(372, 486, 121, 19);
        panel.add(lblBirre);

        JLabel lblBirre_1 = new JLabel("Birre 0.3 :");
        lblBirre_1.setFont(new Font("Tekton Pro", Font.BOLD, 17));
        lblBirre_1.setBounds(372, 518, 121, 19);
        panel.add(lblBirre_1);

        textField_40 = new JTextField();
        textField_40.setText("0");
        textField_40.setColumns(10);
        textField_40.setBounds(505, 484, 40, 19);
        panel.add(textField_40);

        textField_41 = new JTextField();
        textField_41.setText("0");
        textField_41.setColumns(10);
        textField_41.setBounds(505, 514, 40, 19);
        panel.add(textField_41);


        JButton btnX = new JButton("X");
        btnX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String ans = JOptionPane.showInputDialog("Deshironi ta mbyllni (po/jo)?");
                ans.toLowerCase();
                if (ans.equals("po")) {
                    System.exit(0);
                }
            }
        });
        btnX.setBackground(new Color(255, 0, 0));
        btnX.setForeground(new Color(255, 255, 255));
        btnX.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnX.setBounds(1282, 15, 52, 49);
        frame.getContentPane().add(btnX);
    }
}
