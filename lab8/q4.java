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
import java.util.*;
interface Person{
    int x=13;
    void Name();
    void Company();
}
class Employee implements Person{
    String s;
    public void Name(){
        System.out.println("Employee Name:"+s);
    } 
    public void Company(){
        System.out.println(s+ " is working in Google India");
    }
     

}
public class q4 {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        Employee obj=new Employee();
        System.out.println("Enter Employee Name");
        obj.s=sc.next();
        obj.Name();
        obj.Company();
        
        
    }
}
