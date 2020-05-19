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
public class HoaDonHeader 
{
     String MahoaDon;
    String Ngayban;
    String TenkhachHang;

    public HoaDonHeader() 
    {}

    public HoaDonHeader(String MahoaDon, String  Ngayban, String  TenkhachHang) 
    {
        this.MahoaDon =MahoaDon;
        this.Ngayban = Ngayban;
        this. TenkhachHang =  TenkhachHang;
    }

    public String getMahoaDon() 
    {
        return MahoaDon ;
    }

    public void setMahoaDon(String MahoaDon) 
    {
        this.MahoaDon = MahoaDon;
    }

    public String getNgayban() 
    {
        return Ngayban;
    }

    public void setNgayban(String Ngayban) 
    {
        this.Ngayban = Ngayban;
    }

    public String getTenkhachHang() 
    {
        return TenkhachHang;
    }

    public void setTenkhachHang(String TenkhachHang) 
    {
        this.TenkhachHang = TenkhachHang;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "MahoaDon=" + MahoaDon + ", Ngayban=" + Ngayban + ", TenkhachHang=" + TenkhachHang + '}';
    }

    
}
    

