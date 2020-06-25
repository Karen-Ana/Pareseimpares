/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pareseimpares;

import java.util.Arrays;
/**
 *
 * @author Ana Karen
 */
public class Pareseimpares {

    static int[] Pareseimpares(int[] lista){
        int[] nuevo=new int[lista.length];
        int i, posicionNuevoIzq=0, posicionNuevoDer=lista.length-1;
       
        for (i=0;i < lista.length;i++){
            if (lista[i]%2==0){
                nuevo[posicionNuevoIzq]=lista[i];
                posicionNuevoIzq++;
            } else {
                nuevo[posicionNuevoDer]=lista[i];
                posicionNuevoDer--;
            }                
        }
        return nuevo;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] elementos=new int[10];
        int i;
        
        for (i=0;i < elementos.length;i++){
            elementos[i]=(int)(Math.random()*100+1);
        }
        System.out.println("Array antes de ordenar pares e impares: "+Arrays.toString(elementos));
        elementos=Pareseimpares(elementos);
        System.out.println("Array después de ordenar pares e impares: "+Arrays.toString(elementos));        
    }
}