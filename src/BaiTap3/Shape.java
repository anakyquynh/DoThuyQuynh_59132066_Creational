/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author computer
 */
public abstract class Shape 
{
private String Brush;
private String Frame;
private String Paper; 
protected Shape(){};
public String getBrush()
{
    return Brush;
}
public void setBrush(String Brush)
{
    this.Brush=Brush;
}
public String getFrame()
{
    return Frame;
}
public void setFrame(String Frame)
{
    this.Frame=Frame;
}
public String getPaper()
{
    return Paper;
}
public void setPaper(String Paper)
{
    this.Paper=Paper;
}
protected Shape(String Brush ,String Frame ,String Paper)
{
    this.Brush=Brush;
    this.Frame=Frame;
    this.Paper=Paper;
}
public abstract String draw();

    
}
