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
public class CTHD 
{
    String Tensp;
    int Soluong;
    double Dongia;
    double Chietkhau;
    public  CTHD()
    {
    }
    public CTHD(String Tensp,int Soluong,double Dongia,double Chietkhau)
    {
        this.Tensp=Tensp;
        this.Chietkhau=Chietkhau;
        this.Dongia=Dongia;
        this.Soluong=Soluong;
    } 
    public String  getTensp()
    {
        return Tensp;
    }
    public void setTensp(String Tensp)
    {
       this.Tensp= Tensp;
    }
    public int  getSoluong()
    {
        return Soluong;
    }
    public void setSoluong(int Soluong)
    {
       this.Soluong= Soluong;
    }
    public double getDongia()
    {
        return Dongia;
    }
    public void setDongia(double Dongia)
    {
       this.Dongia= Dongia;
    }
    public double  getChietkhau()
    {
        return Chietkhau;
    }
    public void setChieckhau(double Chietkhau)
    {
       this.Chietkhau= Chietkhau;
    }

    @Override
    public String toString() {
        return "CTHD{" + "Tensp=" + Tensp + ", Soluong=" + Soluong + ", Dongia=" + Dongia + ", Chietkhau=" + Chietkhau + '}';
    }
    
            
}
