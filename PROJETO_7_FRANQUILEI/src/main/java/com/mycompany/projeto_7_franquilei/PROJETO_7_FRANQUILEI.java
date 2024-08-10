/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_7_franquilei;

/**
 *
 * @author f.oliveira
 */
import java.util.Scanner;
public class PROJETO_7_FRANQUILEI {
    
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner(System.in); 
        
        System.out.println("digite seu peso:");
        float peso = teclado.nextInt(); 
        
        System.out.println("digite sua altura:");
        float altura = teclado.nextInt();
       
        float imc = peso/(altura*altura);
       System.out.println("Seu peso e:" + imc);
       
     if(imc <= 18.5){
     System.out.println("Abaixo do peso");
     }
     else if (imc >= 18.8||imc <= 24.9){
      System.out.println("peso ideal");  
     } 
     else if(imc > 25 || imc <= 29.9){
     System.out.println("execesso de peso");
     }
     else if(imc > 30 || imc <= 34.9){
     System.out.println("Obesidade classe 1");
     }
     else if(imc >= 35.5 || imc <= 39.9){
     System.out.println("Obesidade classe 2");
     }
     else if(imc >= 40){
     System.out.println("Obesidade 3");
    }
    }
}
    
