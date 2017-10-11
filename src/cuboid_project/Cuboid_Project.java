/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuboid_project;

import java.lang.Number;

/**
 *
 * @author agendron
 */
public class Cuboid_Project {

    public static void main(String[] args) {
        
        Cuboid<Double> c1 = new Cuboid<>();
        c1.setLength(1.5);
        c1.setHeight(1.5);
        c1.setWidth(1.5);
        
        Cuboid<Integer> c2 = new Cuboid<>(3, 3, 3);
        
        System.out.println(c1);
        System.out.println(c1.getVolume());
        System.out.println(c2);
        System.out.println(c2.getVolume());
        
    }
}
