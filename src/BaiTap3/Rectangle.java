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
public class Rectangle extends Shape{
    private static Shape Rectangle;
    protected Rectangle(String Brush,String Frame,String Paper)
    {
        super (Brush,Frame,Paper);
    }
    @Override
    public String draw()
    {
        return "Rectangle:"+getBrush()+getFrame() + getPaper();
    }
    public static Shape newRectangle()
    {
        if (Rectangle == null)
        {
            Rectangle = new Rectangle("Circle Brush\t","Circle Frame\t","Circle Paper\t");
        }
        return Rectangle;
    }

}
