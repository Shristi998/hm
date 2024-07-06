/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.sql.*;

public class pram {
    public static void main(String[] args) {
        try {
            // Load and register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hm", "root", "");
            
              con.close();
            }
         catch (Exception e) {
            e.printStackTrace();
        }
    }
}
