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
abstract class Base1{
    abstract class Base2{
        abstract void display();
    }
}
class derived1 extends Base1{
    class derived2 extends Base2{
        void display(){
            System.out.println("In ineer class of derived 1 that is derived 2");
        }
    }
}
public class q5 {
    public static void main(String[] args) {
        Base1.Base2 obj=new derived1().new derived2();
        obj.display();
    }
}
