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
class MyWrapper_Class{
    private int i;
    MyWrapper_Class(int j){
        i=j;
    }
    public int intValue(){
        return i+10;
    }
}
public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        MyWrapper_Class obj1=new MyWrapper_Class(n);
        System.out.println("My wrapper Class Output");
        System.out.println(obj1.intValue());
        
    }
}
