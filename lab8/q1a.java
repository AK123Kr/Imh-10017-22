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
class Outer{
    class Inner{
        void display(){
            System.out.println("Inside display Inner");
        }
    }
}
public class q1a {
    public static void main(String[] args) {
        Outer.Inner in =new Outer().new Inner();
        in.display();
    }
}
