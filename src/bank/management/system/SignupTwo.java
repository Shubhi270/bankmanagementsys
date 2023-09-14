/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField pan,adhar;
    JButton next;
    JComboBox Religion,Category,Occupation,Education,Income;
    JRadioButton syes,sno,eyes,eno;
    String formno;
    SignupTwo(String formno){
        this.formno=formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM- PAGE 2");
        
        
       
        JLabel AdditionalDetails = new JLabel("Page 2: Additional Details");
        AdditionalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        AdditionalDetails.setBounds(290,80,400,30);
        add(AdditionalDetails);
       
        JLabel religion = new JLabel("Religion");
        religion.setFont(new Font("Raleway", Font.BOLD,20));
        religion.setBounds(100,140,100,30);
        add(religion);
        String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        
        Religion=new JComboBox(valReligion);
        Religion.setBounds(300,140,400,30);
        Religion.setBackground(Color.WHITE);
        add(Religion);
 
        JLabel category = new JLabel ("Category:");
        category.setFont(new Font("Raleway", Font.BOLD,20));
        category.setBounds(100,190,200,30);
        add(category);
        String valcategory[]={"General","OBC","SC","ST","Other"};
        Category=new JComboBox(valcategory);
        Category.setBounds(300,190,400,30);
        Category.setBackground(Color.WHITE);
        add(Category);
        
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD,20));
        income.setBounds(100,240,200,30);
        add(income);
       
        String incomecategory[]={"None","<1,50,000","<2,50,000","5,00,000"," upto 10,00,000"};
        Income=new JComboBox(incomecategory);
        Income.setBounds(300,240,400,30);
        Income.setBackground(Color.WHITE);
        add(Income);
      
        JLabel Educational = new JLabel("Educational");
        Educational.setFont(new Font("Raleway", Font.BOLD,20));
        Educational.setBounds(100,315,200,30);
        add(Educational);
        
        JLabel Qualification = new JLabel("Qualification:");
        Qualification.setFont(new Font("Raleway", Font.BOLD,20));
        Qualification.setBounds(100,340,200,30);
        add(Qualification);
       
        String educationValue[]={"Non Graduate","Graduate","Post graduate","Doctrate","Others"};
        Education=new JComboBox(educationValue);
        Education.setBounds(300,340,400,30);
        Education.setBackground(Color.WHITE);
        add(Education);
       
        
        
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD,20));
        occupation.setBounds(100,390,200,30);
        add(occupation);
       
        String OccupationValue[]={"Salaried","Self Employed","Bussiness","Student","Retired","Others"};
        Occupation=new JComboBox(OccupationValue);
        Occupation.setBounds(300,390,400,30);
        Occupation.setBackground(Color.WHITE);
        add(Occupation);
        
        
        JLabel panNumber = new JLabel("Pan Number:");
        panNumber.setFont(new Font("Raleway", Font.BOLD,20));
        panNumber.setBounds(100,440,200,30);
        add(panNumber);
        
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
       
        JLabel adharnumber= new JLabel("Adhar Number:");
        adharnumber.setFont(new Font("Raleway", Font.BOLD,20));
        adharnumber.setBounds(100,490,200,30);
        add(adharnumber);
        
        
        adhar = new JTextField();
        adhar.setFont(new Font("Raleway",Font.BOLD,14));
        adhar.setBounds(300,490,400,30);
        add(adhar);
        
        
        JLabel seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD,20));
        seniorCitizen.setBounds(100,540,200,30);
        add(seniorCitizen);
        
        syes= new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        sno= new JRadioButton("No");
        sno.setBounds(420,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorcitizengroup= new ButtonGroup();
        seniorcitizengroup.add(syes);
        seniorcitizengroup.add(sno);
      
        
        JLabel existingAccount = new JLabel("Existing Account:");
        existingAccount.setFont(new Font("Raleway", Font.BOLD,20));
        existingAccount.setBounds(100,590,200,30);
        add(existingAccount);
        
        eyes= new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        eno= new JRadioButton("No");
        eno.setBounds(420,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup existingaccountgroup= new ButtonGroup();
        existingaccountgroup.add(syes);
        existingaccountgroup.add(sno);
        
        
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
    
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
}
    public void actionPerformed(ActionEvent ae){
        String religion=(String)Religion.getSelectedItem();
        String category=(String)Category.getSelectedItem();
        String income=(String)Income.getSelectedItem();
        String education=(String)Education.getSelectedItem();
        String occupation=(String)Occupation.getSelectedItem();
        
        String seniorcitizen=null;
        if(syes.isSelected()){
            seniorcitizen="yes";
        }
        else if(sno.isSelected()){
            seniorcitizen="No";
        }
        String existingaccount=null;
        if(eyes.isSelected()){
            existingaccount="yes";
        }
        else if(eno.isSelected()){
            existingaccount="No";
        }
        
        String adharno=adhar.getText();
        String panno=pan.getText();
        
        try{
            if(religion.equals("")){
                JOptionPane.showMessageDialog(null, "Religion is required");
            }
            else if(category.equals("")){
                JOptionPane.showMessageDialog(null, "category is required");
            }
               else if(income.equals("")){
                JOptionPane.showMessageDialog(null, "income is required");
            }
                  else if(education.equals("")){
                JOptionPane.showMessageDialog(null, "education of birth is required");
            }
         
               else if(occupation.equals("")){
                JOptionPane.showMessageDialog(null, "occupation is required");
            }
               else if(adharno.equals("")){
                JOptionPane.showMessageDialog(null, "adharno is required");
            }
            
                else if(panno.equals("")){
                JOptionPane.showMessageDialog(null, "panno is required");
            }
             
             
                   else if(seniorcitizen==null){
                JOptionPane.showMessageDialog(null, "senior citizen Status is required");
            }
               else if(existingaccount==null){
                JOptionPane.showMessageDialog(null, "existing account Status is required");
            }
         
         
            else{
                Conn c= new Conn();
                String query="insert into signuptwo values ('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+panno+"','"+adharno+"','"+seniorcitizen+"','"+existingaccount+"')";
                c.s.executeUpdate(query);
                
                //
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
        } catch(Exception e){
            System.out.println(e);
        }
        
        
    }
   public static void main(String args[]){
       new SignupTwo("");
   }    
}
