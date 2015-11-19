/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5v2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MailListReader {
    public static ArrayList<String> read () throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
        ArrayList<String> mailList = new ArrayList<>();
        
        Class.forName("org.sqlite.JDBC");
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conect = DriverManager.getConnection("jdbc:sqlite:KATA.DB");
        //Connection conect = DriverManager.getConnection("jdbc:oracle:thin:@10.22.143.90:1521:orcl", "system", "orcl");
        Statement state = conect.createStatement();
        
        String query = "SELECT * FROM MAILS";

        ResultSet rs = state.executeQuery(query);

        while (rs.next()) {
            mailList.add(rs.getString("MAIL"));
        }
        
        return mailList;
    }
}