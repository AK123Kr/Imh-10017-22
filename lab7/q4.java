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
class Rectangle2{
    int length;
    int breadth;
    Rectangle2(){
        length=1;
        breadth=1;
    }
    Rectangle2(int l,int b){
        length=l;
        breadth=b;
    
    }
}  
class Cuboid1 extends Rectangle2{
    int height;
    Cuboid1(){
        super(10,20);
        height=1;
    }
    Cuboid1(int h){ 
        super(30,40);
        height=h;
    }
    int volume(){
        return this.length*this.breadth*height;
    }
}
public class q4 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cuboid1 obj1=new Cuboid1();
        System.out.println("Volume :"+obj1.volume());
        System.out.println("Enter the height :");
        int h=sc.nextInt();
        Cuboid1 obj2=new Cuboid1(h);
        System.out.println("Volume :"+obj2.volume());
        
    }
}
