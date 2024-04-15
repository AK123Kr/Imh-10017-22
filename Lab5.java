/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author acer
 */
import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.*; 
class inventory{
    String name; 
    int rating; 
    int quantity; 
    
    void displayname(){
        System.out.println(this.name);
        System.out.println(this.rating); 
        System.out.println(this.quantity);
    }
    void addquantity(int x){
        if(this.quantity+x<=100){
         this.quantity = this.quantity + x;   
        }
        else{
            System.out.println("please reduce the amount for" +" " + this.name + " " + "and try again");
        }
    }
    void changerating(int y){
        this.rating = y; 
    }

    inventory(String name,int rating,int quantity){
        this.name = name; 
        this.rating = rating; 
        this.quantity = quantity; 
    }
}
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // dp[i] = dp[i-1] + v[i] 
     // sum(l,r) = dp[r] - dp[l-1] 
     // easy!! 
        inventory ob1 = new inventory("Dettol",7,50);
        inventory ob2 = new inventory("Ariel",9,40); 
        inventory ob3 = new inventory("Surf Excel",5,40); 
        ob1.addquantity(5); 
        ob2.addquantity(65); 
        ob3.changerating(9); 
        ob1.displayname(); 
        ob2.displayname();
        ob3.displayname(); 
    }
}
