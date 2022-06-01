/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telphone;

import java.util.HashSet;

/**
 *
 * @author Юрий
 */
public class Main {
    public static void main(String[] args) {
    
    TelPhone phone = new TelPhone("981","0234567");
    TelPhone phone1 = new TelPhone("981","0234567");
    TelPhone phone2 = new TelPhone("7890","654321");
    

        HashSet<TelPhone> telephoneNumb = new HashSet<>();
        telephoneNumb.add(phone);
        telephoneNumb.add(phone1);
        telephoneNumb.add(phone2);
        
        for (TelPhone number : telephoneNumb) {
            System.out.println(number);
        }
    }
}
    
            
    

