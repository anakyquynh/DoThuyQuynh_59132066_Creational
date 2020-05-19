/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author computer
 */
public class BT2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         MyStringBuilder str;
        str = new MyStringBuilder("Do")
                .addString("Thuy ")
                .addString("Quynh \n")
                .addString("MSSV")
                .addFloat(7.5f)
                .addString("Diem:")
                .addBool(true)                
                .build();
        System.out.print(str.toString());
        
    }
    
}
