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
public class MyStringBuilder {

   String str;
   
    MyStringBuilder(String str)
    {
        this.str=str;
    }
    public MyStringBuilder addFloat(float st1)
    {
        str += st1;
        return this;
    }
    public MyStringBuilder addString(String st2)
    {
        str += st2;
        return this;
    }
    public MyStringBuilder addBool(boolean st3)
    {
        str += st3;
        return this;
    }

    @Override
    public String toString()
    {
        return "MyStringBuilder{" + "str=" + str + '}';
    }
    MyStringBuilder build()
    {
        return this;
    }

}
