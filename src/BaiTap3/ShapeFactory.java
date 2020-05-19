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
public class ShapeFactory 
{
    public Shape createShape(ShapeType Shapetype)
    {
        if(Shapetype == null)
        {
            switch(Shapetype)
            {
                case Triangle:
                    return Triangle.newTriangle();
                case Rectangle:
                    return Rectangle.newRectangle();
                case Circle:
                    return Circle.newCircle();
                default : break;
            }
        }
        return null;
    }
}
