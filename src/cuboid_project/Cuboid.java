/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuboid_project;

/**
 *
 * @author agendron
 */
public class Cuboid <T>{
    
    private double length;
    private double height;
    private double width;
    
    
    public Cuboid() {
        
        /*public setLength(double length)
        {
            this.length = length;
        }*/
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public Double getLength()
    {
        return length;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public Double getHeight()
    {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public Double getWidth()
    {
        return width;
    }
    
    
    
    
}
