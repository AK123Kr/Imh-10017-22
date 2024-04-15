/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class q5 {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input string 1:");
        String s1=sc.next();
        List<String> arr1= new ArrayList<String>();
        for(int i=s1.length()-1;i>=0;i--){ 
            char ch1=s1.charAt(i);
            String s3=String.valueOf(ch1);
            arr1.add(s3);
        }
        System.out.println("Reverse of Array");
        for(int i=0;i<s1.length();i++){
            System.out.print(arr1.get(i));
        }
    }
}
