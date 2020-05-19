/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author computer
 */
public class BT1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        HoaDonHeader HDH = new HoaDonHeader
        ("HD1","20/4/2020","Do Thuy Quynh");
        CTHD C1 = new CTHD("Mồng Tơi",1,5000,0);
        CTHD C2 = new CTHD("Bí Ngô",5,17000,0.4);
        CTHD C3 = new CTHD("Diếp Cá",6,10000,0.3);
        CTHD C4 = new CTHD("Khổ Qua",10,20000,0.1);
        
        HoaDon HD = new HoaDon.Builder()
            .addHoaDonHeader(HDH)
            .addCTHD(C1)
            .addCTHD(C2)
            .addCTHD(C3)
            .addCTHD(C4)    
            .build();
        
        System.out.println(HD.toString());   
        
                
    }
    
}
