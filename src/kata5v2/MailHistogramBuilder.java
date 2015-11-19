/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5v2;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class MailHistogramBuilder {
    public static Histogram<String> build (ArrayList<String> mailList){
        Histogram<String> histo = new Histogram<>();
        
        for (String mail : mailList) {
            histo.increment(new Mail(mail).getDominio());
        }
        return histo;
    }
    
}