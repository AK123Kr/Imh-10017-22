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
class Base{
    void display(){
        System.out.println("In base display");
    }
    
    void show(){
        
    }
}
class Derived extends Base{
    void display(){
        System.out.println("In derived display");
    }
    void show(){
        System.out.println("In derived Show");
    }
}
public class q5 {
    public static void main(String[] args) {
        Base obj1=new Base();
        Base obj2=new Derived();
        obj1.display();
        obj2.display();
        obj2.show();
    }
}
