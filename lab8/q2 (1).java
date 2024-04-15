/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8;

/**
 *
 * @author acer
 */
abstract class Bike{
    abstract void run();
    
    
}
class Honda extends Bike{
    
    void run(){
        System.out.println("hello I am running with Honda");
    }
}
public class q2 {
    public static void main(String[] args) {
        Bike obj=new Honda();
        obj.run();
    }
}
