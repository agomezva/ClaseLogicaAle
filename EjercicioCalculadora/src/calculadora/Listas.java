/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author desarrollo
 */
public class Listas {
    
    public static void main (String [] args){
        
    String [] names = { "Maria","Juan","Andres","Luisa"};
        System.out.println("El elemento en la posicion 0 es: " + names [0]);
        System.out.println("El elemento en la posicion 1 es: " + names [1]);
        System.out.println("El elemento en la posicion 2 es: " + names [2]);
        System.out.println("El elemento en la posicion 3 es: " + names [3]);
        
        int size = names.length;
        
        System.out.println("El tamaño de names es: " + size);
        
        for (int i=0; i<names.length; i++){
        
            System.out.println("El elemento en la posicion " + i + " es " + names [i]);
        }
        
    }
    
}
