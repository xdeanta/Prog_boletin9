package bol9_1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xdeantabelisario
 */
public class Contador {
    private int neg;
    private int pos;
    private int cero;
    private Scanner sc;
    
    public Contador(){
        neg = pos = cero = 0;
        sc=new Scanner(System.in);
    }
    
    public void contar(){
        int aux;
        for(int i=0; i<10 ; i++){
            aux=sc.nextInt();
            if(aux>0){
                pos++;
            }
            if(aux<0){
                neg++;
            }
            if (aux==0){
                cero++;
            }    
        }
    }
    public void mostrar(){
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);
    }
}
