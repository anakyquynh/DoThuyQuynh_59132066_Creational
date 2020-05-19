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
public class BT3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory s1= new ShapeFactory();
        Shape Circle =s1.createShape(ShapeType.Circle);
        Shape Triangle =s1.createShape(ShapeType.Triangle);
        Shape Rectangle =s1.createShape(ShapeType.Rectangle);
        
        System.out.println(Circle.draw());
        System.out.println(Triangle.draw());
        System.out.println(Rectangle.draw());
    }
    
}
