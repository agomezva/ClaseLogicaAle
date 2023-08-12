/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author desarrollo
 */
public class ListasFrutas {
   
    public static void main (String [] args){
    
        String [] frutas = {"fresa","mango","kiwi","cereza","banano",
            "arandanos","sandia","ciruela"};
        int size = frutas.length;
        System.out.println("El tamaño de frutas es: " + size);
        
         for (int i=0; i<frutas.length; i++){
        
            System.out.println("El elemento en la posicion " + i + 
                    " es " + frutas [i]);
        }
      System.out.println("------");  
      // Redes sociales//
      
      String [] redesSocial = {"WhatsApp","instagram","Facebook"};
        
      int sizeR = redesSocial.length;
        System.out.println("El tamaño de redes sociales es: " + sizeR);
        
        for (int i=0; i<redesSocial.length; i++){
        
            System.out.println("El elemento en la posicion " + i + 
                    " es " + redesSocial [i]);
        }
        
       System.out.println("------");  
    
    
    // notas //
        
        float[] notas = { 4.5f, 3.2f, 3.5f, 3.5f, 5.0f, 4.8f };
        
        int sizeN = notas.length;
        System.out.println("El tamaño de notas es " + sizeN);
        
        for (int i=0; i<notas.length; i++){
        
            System.out.println("El elemento en la posicion " + i + 
                    " es " + notas [i]);
        }
       System.out.println("------"); 
       
       // salario minimo //
       
       double [] salMin ={ 781242, 828116, 877803, 908526, 1000000, 1160000};
       
       int sizeS = salMin.length;
        System.out.println("El tamaño de notas es " + sizeS);
        
        for (int i=0; i<salMin.length; i++){
        
            System.out.println("El elemento en la posicion " + i + 
                    " es " + salMin [i]);
        }
       System.out.println("------"); 
       
       // cantidad de equipos en el 4piso //
   } 
    
}
