/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author desarrollo
 */
public class Array {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
  
        String names[] = new String [4];
        
        names[0]= sc.nextLine();
        names[1]= sc.nextLine();
        names[2]= sc.nextLine();
        names[3]= sc.nextLine();
        
        //System.out.println("Posicion 1: " + names [1]);
        
        for (int i=0; i<names.length; i++){
            System.out.println("Posicion : " + i + " es: " + names [i]);
        }
        
      
        
    }
    
}
