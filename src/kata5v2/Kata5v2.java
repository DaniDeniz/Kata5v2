/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5v2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;


public class Kata5v2 {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException, SQLException  {
        ArrayList <String> mailArray = MailListReader.read();
        Histogram<String> histogram = MailHistogramBuilder.build(mailArray);
        
        new HistogramDisplay(histogram).execute();
     
    }

}