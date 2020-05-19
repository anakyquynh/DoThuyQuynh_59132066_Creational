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
public class Triangle extends Shape{
    private static Shape Triangle;
    protected Triangle(String Brush,String Frame,String Paper)
    {
       super(Brush,Frame,Paper); 
    }
    @Override
    public String draw() {
        return "Triangle:"+getBrush()+"\t"+getFrame()+"\t"+getPaper();
    }
    public static Shape newTriangle()
    {
        if(Triangle == null)
        {
            Triangle = new Triangle("circle Brush\t", "cricle Frame\t", "circle Paper\t");
            
        }
        return Triangle;
    }

    
    

    
    
}
