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
public abstract class Circle extends Shape
{
    private static Shape Circle;
    protected Circle (String Brush ,String Frame, String Paper)
    {
      super(Brush, Paper, Frame);
    }
     @Override
    public String draw() {
        return "Circle:"+getBrush()+"\t"+getFrame()+"\t"+getPaper();
    }
    public static Shape newCircle()
    {
        if(Circle == null)
        {
            Circle =new Circle("\"Circle Brush\t","Circle Frame\t","Cricle Paper\t") {} ;
        }
        return Circle ;
    }

   
}