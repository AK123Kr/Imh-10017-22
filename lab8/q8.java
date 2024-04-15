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
interface Test{
    int x=10;
    default  void method1(){ 
        System.out.println("In test1 in meathod1");
    }
    static void method2(){
         System.out.println("In test1 in meathod2");
     } 
} 
class Test2 implements Test{
    
}

public class q8 {
    public static void main(String[] args) {
        Test.method2();
        Test2 t=new Test2();
        t.method1();
        
    }
}
