/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
/**
 *
 * @author Sonal
 */
public class FastCash extends JFrame implements ActionListener{
    JButton hundred, fivehundred, thousand ,fivethousand, twothousand ,tenthousand, back;
    String pinnumber;
    FastCash(String pinnumber){
        setLayout(null);
        this.pinnumber=pinnumber;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text= new JLabel("SELECT WITHDRAWL AMOUNT: ");
        text.setBounds(190,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,20));
        image.add(text);
        
        
        hundred= new JButton("Rs 100");
        hundred.setBounds(170,410,150,30);
        hundred.addActionListener(this);
        image.add(hundred);
        
        fivehundred= new JButton("Rs 500");
        fivehundred.setBounds(355,410,150,30);
        fivehundred.addActionListener(this);
        image.add(fivehundred);
        
        
        thousand= new JButton("Rs 1000");
        thousand.setBounds(170,445,150,30);
        thousand.addActionListener(this);
        image.add(thousand);
        
        
        
        twothousand= new JButton("Rs 2000");
        twothousand.setBounds(355,445,150,30);
        twothousand.addActionListener(this);
        image.add(twothousand);
        
        
        fivethousand= new JButton("Rs 5000");
        fivethousand.setBounds(170,480,150,30);
        fivethousand.addActionListener(this);
        image.add(fivethousand);
        
        
        tenthousand= new JButton("Rs 10000");
        tenthousand.setBounds(355,480,150,30);
        tenthousand.addActionListener(this);
        
        image.add(tenthousand);
        
        back= new JButton("BACK ");
        back.setBounds(270,517,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed (ActionEvent ae){
     if(ae.getSource()==back){
         setVisible(false);
         new Transaction(pinnumber).setVisible(true);
     }   
     else{
         String amount=((JButton)ae.getSource()).getText().substring(3);
         Conn c=new Conn();
         try{
             ResultSet rs=c.s.executeQuery("Select * from bank where pin='"+pinnumber+"'");
             int balance=0;
             while(rs.next()){
                 if(rs.getString("type").equals("Deposit")){
                     balance+=Integer.parseInt(rs.getString("amount"));
                 }
                 else{
                     balance-=Integer.parseInt(rs.getString("amount"));
                 }
             }
             if(ae.getSource()!=back&&balance<Integer.parseInt(amount)){
                 JOptionPane.showMessageDialog(null,"Insufficient balance");
                 return;
             }
             Date date=new Date();
             String query="insert into bank value('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
             c.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null,"Rs "+amount+" debited sucessfully. ");
             
             setVisible(false);
             new Transaction(pinnumber).setVisible(true);
         }
         catch(Exception e){
             System.out.println(e);
         }
         
     }
    }
    
    public static void main(String args[]){
        new FastCash("");
        
    }
}
