/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.recursion;

/**
 *
 * @author melih
 */
public class PalindromosRecursivos{
    public static void main(String[]args){
        String[]casosDePrueba ={
          "radar",                    
            "reconocer",                
            "java",                    
            "",                        
            "a",                       
            ", ! ",                    
            "¡Anita lava la tina!"  
        };
        for(String texto:casosDePrueba){
            boolean resultado=PalindromosRecursivos.esPalindromo(texto);
            System.out.println("\""+texto+"\" ="+resultado);
        }
    }
    public static boolean esPalindromo(String palabra){
        palabra=palabra.toLowerCase();
        return esPalindromoAuxiliar(palabra,0,palabra.length()-1);
       }
    private static boolean esPalindromoAuxiliar(String palabra,int inicio,int fin){
        //1. Caso Base: indices cruzados o iguales
        if(inicio>=fin){
            return true;
        }
        //2. Saltar no alfabeticos a la Izquierda
        if(!Character.isLetterOrDigit(palabra.charAt(inicio))){
            return esPalindromoAuxiliar(palabra,inicio+1,fin);
        }
        //3. Saltar no alfanumericos a la derecha
        if(!Character.isLetterOrDigit(palabra.charAt(fin))){
            return esPalindromoAuxiliar(palabra,inicio,fin-1);
        }
        //4. Caso Base caracteres distintos
        if(palabra.charAt(inicio)!=palabra.charAt(fin)){
            return false;
        }
        //5. Paso Recursivo hacia el centro
        return esPalindromoAuxiliar(palabra,inicio+1,fin-1);
        
        
    }
}

