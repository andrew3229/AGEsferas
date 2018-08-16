/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agesferas;

import java.util.stream.IntStream;

/**
 *
 * @author Drew
 */
public class AGEsferas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma[]= new int[5];
        int mult[]= new int[5];
        int aux=0,cont=5;
        AEvaluacion a= new AEvaluacion();      
        

    //usando Java 8
    int[] numerosAleatorios =IntStream.rangeClosed(1, 10).toArray();//  {1,2,3,4,5,6,7,8,9,10};
    numerosAleatorios=a.Random(numerosAleatorios);
    //desordenando los elementos
    
        
        suma=a.DivideSuma(suma, numerosAleatorios);
        mult=a.DivideMult(mult, numerosAleatorios);
       
        a.Mezcla(suma, mult, numerosAleatorios);
        
        
        
    
        
   
    


    }
    
}
