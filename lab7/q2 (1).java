/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author acer
 */
import java.util.*;
class Circle{
    double radius;
    double area(){
        return (3.14*radius*radius);
    }
    void set_width(){
        
    }
    void perimeter(){
        System.out.println("Perimeter "+2*3.14*radius);
    }
    void circumference(){
        System.out.println("Circumference "+2*3.14*radius);
    }
}
class Cylinder extends Circle{
    double height;
    void volume(){
        double A= super.area();
        System.out.println("Volume "+A*height);
    }
    
}


public class q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Cylinder obj1=new Cylinder();
        System.out.println("Enter Radius:");
        obj1.radius=sc.nextDouble();  
        System.out.println("Enter Height");
        obj1.height=sc.nextDouble();
        obj1.volume();
        System.out.println("Area : "+obj1.area());
        
    }
}
