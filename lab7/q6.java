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
class Person{
    String name;
    int age;
    void display(int k,int m){  
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
class Student extends Person{
    int roll ;
    int marks;
    void display(int t,int r){
        super.display(10,40);
        marks=t; 
        roll =r;
        System.out.println("Roll : "+roll);
        System.out.println("marks : "+marks);
    }
}
class Employee extends Person{
    int salary;
    void display(int h,int k){
        super.display(10,40);
        salary=h;
        System.out.println("Salary : "+salary);
    }
}
public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Person obj1= new Student(); 
        System.out.println("Enter Student Name:");
        obj1.name=sc.next();
        System.out.println("Enter Age");
        obj1.age=sc.nextInt();
        System.out.println("Enter Marks");
        int t=sc.nextInt(); 
        System.out.println("Enter Roll");
        int r=sc.nextInt();
        obj1.display(t,r);
        Person obj2=new Employee();
        System.out.println(" Employee Name:");
        obj2.name=sc.next();
        System.out.println("Enter Age");
        obj2.age=sc.nextInt();
        System.out.println("Enter salary :");
        int h=sc.nextInt();
        obj2.display(h,40);
        
        
    }
    
}
