/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ed_semana3;

/**
 *
 * @author Usuario
 */
public class Factorial {

    public void Recursivo(int num, int sumTotal) {
        if (num == 0) {
            System.out.println(sumTotal);
        } else {
            sumTotal = num * (num - 1) + sumTotal;
            Recursivo(num, sumTotal);
        }
        
        

    }
    
    public void Iterativo(int num){
        int total=0;
        while(num>0){
            total=num*(num-1);
            num--;
           
        }
        System.out.println(total);
            
    }
    
    
    
    

}
