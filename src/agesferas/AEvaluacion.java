/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agesferas;

import java.util.Random;

/**
 *
 * @author Drew
 */
public class AEvaluacion {
    public int sumarArreglo(int arreglo[]){
         int total = 0;
         for (int i = 0; i < arreglo.length; i++) {
            total += arreglo[i];
        }
       // System.out.println("suma: "+total);
        return total;
    }
    
     public int multiplicarArreglo(int arreglo[]){
         int total = 1;
         for (int i = 0; i < arreglo.length; i++) {
            total =total* arreglo[i];
        }
       // System.out.println("multiplicacion :"+total);
        return total;
    }
     
    public void  Presentar(int arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("El valor es "+arreglo[i]);
        }
    }
    public int [] DivideSuma(int suma[], int numerosAleatorios[]){       
         for (int i = 0; i < numerosAleatorios.length/2; i++) {
            suma[i]=numerosAleatorios[i];                             
        }
         return suma;         
    }
    
     public int [] DivideMult(int mult[], int numerosAleatorios[]){
        int cont=5;
         for (int i = 0; i < numerosAleatorios.length/2; i++) {                  
            mult[i]=numerosAleatorios[cont];
            cont++;           
        }
         return mult;
         
    }
    
    public int[] Random(int numerosAleatorios[]){
        Random r = new Random();
        for (int i = numerosAleatorios.length; i > 0; i--) {
            int posicion = r.nextInt(i);
            int tmp = numerosAleatorios[i-1];
            numerosAleatorios[i - 1] = numerosAleatorios[posicion];
            numerosAleatorios[posicion] = tmp;
         }
        return numerosAleatorios;
    }
    
    public void Mezcla(int suma[], int mult[], int arreglo[]){
        int contpar=0, contimpar=0;
        int interacciones=0;
        do{
            contpar=0;
            contimpar=0;
            if (multiplicarArreglo(mult)!=360 && sumarArreglo(suma)!=36 ) {                           
                for (int i = 0; i < suma.length; i++) {
                    if (suma[i]%2==0) {
                        contpar++;
                    }else{
                        contimpar++;
                    }                    
                }
                if((contpar==3 && contimpar==2) && (sumarArreglo(suma)==36) && (multiplicarArreglo(mult)==360)){
                        System.out.println("El valor de la suma es: ");
                        Presentar(suma);
                        System.out.println("El valor de la multipliación es");
                        Presentar(mult);                                                       
                }else{
                    arreglo=Random(arreglo);
                    suma=DivideSuma(suma, arreglo);                    
                    mult=DivideMult(mult, arreglo);  
                    interacciones++;
                    contpar=0;
                    contimpar=0;
                }
            }
            
        }while(sumarArreglo(suma)!=36 && multiplicarArreglo(mult)!=360);
       
        if ((sumarArreglo(suma)==36) && (multiplicarArreglo(mult)==360)) {
            System.out.println("Valores de la SUMA");
            Presentar(suma);
            System.out.println("Valores de la Mult");
            Presentar(mult);
            System.out.println("El numero de interacciones fue:");
            System.out.println(interacciones);
        }else{
           // Mezcla(suma, mult, arreglo);
        }
    
        
    }
}
