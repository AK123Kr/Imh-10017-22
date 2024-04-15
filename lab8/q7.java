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
interface test1{
    int x=10;
    default void meathod1(){
        System.out.println("In Method 1 in test");
    } 
    void meathod2();
/*  void meathod 3(){
    
    }*/
    default void method4(){
        System.out.println("In Method 1 in test");
    }
} 
interface test2{
    default void meathod1(){
        System.out.println("In Method 1 in test1");
    }
} 
class Test3 implements test1,test2{
    @Override
    public void meathod2(){
        System.out.println("In method2 test 3");
    }
    public  void nethod5()
    {
        test1.super.method4();
    }
    public void meathod1(){
        System.out.println("In test 3 method1");
    }
}
public class q7 {
    public static void main(String[] args) {
        Test3 t=new Test3();
        t.meathod1();
        
    }
}
