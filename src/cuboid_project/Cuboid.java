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
public class Cuboid <T extends Number>{
    
    private T length;
    private T height;
    private T width;
    private T volume;
    
    public Cuboid() {
        
    }

    Cuboid(T length, T height, T width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Double getVolume() {
        return length.doubleValue()*height.doubleValue()*width.doubleValue();
    }

    public void setLength(T length) {
        this.length = length;
    }
    
    public T getLength() {
        return length;
    }

    public void setHeight(T height) {
        this.height = height;
    }
    
    public T getHeight() {
        return height;
    }

    public void setWidth(T width) {
        this.width = width;
    }
    
    public T getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Cuboid{" + "length=" + length + ", height=" + height + ", width=" + width + '}';
    }
    
}
