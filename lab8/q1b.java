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
class Outer1{
    void display_Outer1(){
        System.out.println("In Outer display");
        class Inner1{
            void display_Inner1(){
                System.out.println("In Inner Meathod");
            }    
        }
        Inner1 in=new Inner1();
        in.display_Inner1();
    }
}
public class q1b {
    public static void main(String[] args) {
        Outer1 out=new Outer1();
        out.display_Outer1();
    }
}
