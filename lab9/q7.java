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
public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input string 1:");
        String s1=sc.next();
        System.out.println("Char not present in string");
        for(char c='a';c<='z';c++){
            int f=0;
            for(int i=0;i<s1.length();i++){
                char ch1=s1.charAt(i);
                if(ch1==c){
                    f=1;
                }
            }
            if(f==0){
                System.out.print(c+" ");
            }
        }

    }
}
