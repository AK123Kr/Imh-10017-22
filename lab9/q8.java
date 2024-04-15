/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input string 1:");
        String s1=sc.next();
        System.out.println("Input string 1:");
        String s2=sc.next();
        s1.equals(s2);
        s1.equalsIgnoreCase(s2);
        s1.compareTo(s2);
    }
}
