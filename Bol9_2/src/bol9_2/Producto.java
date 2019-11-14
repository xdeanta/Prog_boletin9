/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_2;

import java.util.Scanner;

/**
 *
 * @author xdeantabelisario
 */
public class Producto {
    private double prod;
    private int sum;
    //Scanner sc;
    
    public Producto(){
        prod=1;
        sum=0;
        //sc=new Scanner(System.in);
    }
    private void calcSum(){
        for(int i=10; i< 90; i++){
            sum=sum+i;
        }
    }
    private void calcProd(){
        for(int i=10; i< 90; i++){
            //System.out.println("prod:" +prod);
            prod=prod*i;
        }
    }
    public void calcular(){
        calcSum();
        calcProd();
        System.out.println("Suma: " +sum);
        System.out.println("Producto: " +prod);
    }
}
