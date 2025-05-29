/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ed_semana3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class SumaDeSubconjuntos {
    
    
    public void sumaSubconjuntos(){
        ArrayList<Integer> numerosElegidos = new ArrayList();
        Scanner sca = new Scanner(System.in);
        System.out.println("Indique la cantidad de elementos: ");
        int cantidad= sca.nextInt();
        if (cantidad>1 || cantidad>20 ){
            System.out.println("Indique la cantidad de elementos: ");
            cantidad= sca.nextInt();
        }
        for (int i=0;i<cantidad;i++){
            System.out.println("Indique el valor ");
            int item= sca.nextInt();
            numerosElegidos.add(item);
        }
        System.out.println("Indique la sumatoria deseada: ");
        int sumatoriaDeseada= sca.nextInt();
        
        ArrayList<Integer> numerosAceptados = new ArrayList();
        
        
        for(int i=0; i <numerosElegidos.size();i++){
            int primerNumero=numerosElegidos.get(i);
            int segundoNumero=numerosElegidos.get(i+1);
            if(primerNumero+segundoNumero==sumatoriaDeseada){
                numerosAceptados.add(primerNumero);
                numerosAceptados.add(segundoNumero);
            }
        }
        
        Collections.sort(numerosAceptados);
        
        System.out.println(numerosAceptados);
    
        
    }
}
