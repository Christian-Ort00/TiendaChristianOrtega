/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ed_semana3;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Lista {

    public void contarLista(List<Integer> lista, int index, int cantidad) {
        if (lista.isEmpty()) {
            System.out.println(cantidad);
        } else {
            lista.remove(index);
            contarLista(lista,index,cantidad+1);

        }
          



    }
    public void valorMax(List<Integer> lista,int index, int max){
        
        if(index>=lista.size()){
             System.out.println(max);
        }else{
            
            if( max < lista.get(index)){
                max=lista.get(index);
                //System.out.println("NuevoMAX" + nuevoMax);
               
            }
            valorMax(lista,index+1, max);
            
        }
        
        
    }
    public void sumarLista(List<Integer> lista,int total, int index){
        if (index==lista.size()){
            System.out.println(total);
        }else{
            int totalActual = total+lista.get(index);
            sumarLista(lista,totalActual,index+1);
        }
    }

}
