/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author acer
 */
import java.util.*;
class Shape{
      int getArea(){
          return 100;
      }
}
class Rectangle extends Shape{
    
    int length;
    int breadth;
    void getRectangle(int l,int b){
        length=l;
        breadth=b;
    }
    @Override
    int getArea(){
        return length*breadth;
    }
}
class Box extends Rectangle{
    int height;
    int l=super.length;
    int b=super.breadth;
     void getBox(int h) {
        
        height =h;
    }
    @Override
    int getArea(){
        return 2*(l*b)+2*(height*l)+2*(height*b);
    }
}    
public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l;
        int b;
        int h;
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        Shape obj1=new Shape();
      
        System.out.println("shape Area:"+obj1.getArea());
        Rectangle obj2=new Rectangle();
        obj2.getRectangle(l, b);
        System.out.println("Rectangle Area:"+obj2.getArea());
        Box obj3=new Box();
        obj3.getRectangle(l,b);
        obj3.getBox(h);
        System.out.println("Box surface  Area:"+obj3.getArea());
    }
}
