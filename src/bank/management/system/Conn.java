/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

import java.sql.*;

public class Conn {

//create connection
        Connection c;
        Statement s; 
    public Conn(){
        try {
           // Class.forName(com.mysql.cj.jdbc.Driver);
            //create connection
            
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root","W@2915djkq#");
            //create stamanet
            s=c.createStatement();
            
        } catch(Exception e){
           System.out.println(e);
        }
    }
    
}
