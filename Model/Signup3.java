package Model;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b;
    String formno;
    Signup3(String formno){
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");

        l2 = new JLabel("Page 3: Account Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));

        l3 = new JLabel("Numero compte:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));

        l6 = new JLabel("Type Compte:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));

        l7 = new JLabel("Pin:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));

        l8 = new JLabel();  // Initialize l8 here

        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));

        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));

        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));

        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);

        r1 = new JRadioButton("Compte Courant");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);

        r2 = new JRadioButton("Compte Cheque");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);

        r3 = new JRadioButton("Compte Epargne");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);

        ButtonGroup groupType = new ButtonGroup();
        groupType.add(r1);
        groupType.add(r2);
        groupType.add(r3);
        
        setLayout(null);
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.addActionListener(this);

        l2.setBounds(290, 80, 600, 30);
        add(l2);

        l3.setBounds(100, 140, 200, 30);
        add(l3);

        t1.setBounds(300, 140, 400, 30);
        add(t1);

        l6.setBounds(100, 190, 200, 30);
        add(l6);

        r1.setBounds(300, 190, 150, 30);
        add(r1);

        r2.setBounds(450, 190, 150, 30);
        add(r2);

        r3.setBounds(600, 190, 150, 30);
        add(r3);

        l7.setBounds(100, 240, 200, 30);
        add(l7);

        t2.setBounds(300, 240, 400, 30);
        add(t2);

        l8.setBounds(100, 290, 200, 30); 
        add(l8);

        b.setBounds(620, 300, 80, 30);
        add(b);


        b.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(500, 120);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String type_compte = null;

        if (r1.isSelected()) {
            type_compte = "Compte Courant";
        } else if (r2.isSelected()) {
            type_compte = "Compte Cheque";
        } else if (r3.isSelected()) {
            type_compte = "Compte Epargne";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String numero_compte	 = "" + Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        
       try {
        if (ae.getSource() == b) {
            if (type_compte == null) {
                JOptionPane.showMessageDialog(null, "Select an account type");
            } else {
                Conn c1 = new Conn();
                String q1 = "insert into Comptes_bancaires values('" + formno + "','" + type_compte + "')";
                String q2 = "insert into login values('" + formno + "','" + numero_compte + "','" + pin + "')";
                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);
                JOptionPane.showMessageDialog(null, "Num Carte: " + numero_compte + "\n Pin:" + pin);

                new Deposit(pin).setVisible(true);
                setVisible(false);
            }
        }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        new Signup3("").setVisible(true);
    }
    
}