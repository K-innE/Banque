/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Signup2 extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b;
    String formno;
    Signup2(String formno){
       /* 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("OIP.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);
        */
     
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        l1 = new JLabel("Page 2: Personne Morale");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));

        l2 = new JLabel("Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));

        l3 = new JLabel("Employeur :");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));

        l4 = new JLabel("Registre Commerce:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));

        l6 = new JLabel("Responsable:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));

        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));

        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));

        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));

        t4 = new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 14));

        t5 = new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 14));

        t6 = new JTextField();
        t6.setFont(new Font("Raleway", Font.BOLD, 14));

        t7 = new JTextField();
        t7.setFont(new Font("Raleway", Font.BOLD, 14));

        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.addActionListener(this);

        setLayout(null);
        l1.setBounds(140, 20, 600, 40);
        add(l1);

        l2.setBounds(290, 80, 600, 30);
        add(l2);

        l3.setBounds(100, 140, 100, 30);
        add(l3);

        t1.setBounds(300, 140, 400, 30);
        add(t1);

        l4.setBounds(100, 190, 200, 30);
        add(l4);

        t2.setBounds(300, 190, 400, 30);
        add(t2);

        l6.setBounds(100, 240, 200, 30);
        add(l6);

        t3.setBounds(300, 240, 400, 30);
        add(t3);

        b.setBounds(620, 300, 80, 30);
        add(b);

        b.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(1000, 400);
        setLocation(500, 120);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
     String employeur = t1.getText();
        String registreCommerce = t2.getText();
        String responsable = t3.getText();
        
        try{
            if(t2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "INSERT INTO clients (formno, employeur, registre_commerce, responsable) VALUES ('"+ formno + "','" + employeur + "','" + registreCommerce + "','" + responsable + "')";
                c1.s.executeUpdate(q1);
                
                new Signup3(formno).setVisible(true);
                setVisible(false);
            }
                
      
            
        }catch(Exception ex){
             ex.printStackTrace();
        }
    
               
    }
    
    
    public static void main(String[] args){
        new Signup2("").setVisible(true);
    }
}