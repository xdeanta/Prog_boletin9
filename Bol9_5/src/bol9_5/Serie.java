/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_5;

import java.util.Scanner;

/**
 *
 * @author xdeantabelisario
 */
public class Serie {
    private int elem;
    private Scanner sc;
    
    public Serie(){
        sc=new Scanner(System.in);
        elem=0;
    }
    
    public void mostrarSeries(){
        int sum=1, ant=0;
        elem=sc.nextInt();
        if(elem >= 0){
            for(int i=1; i<=elem;i++){
                System.out.print(2*i + ", ");
            }
            System.out.println("");
            for(int i=1; i<=elem;i++){
                if(i%2==0){
                    System.out.print(i+", ");
                }else{
                    System.out.print("-"+i +", ");
                }
            }
            System.out.println("");
            for(int i=1;i<=elem;i++){
                sum=sum+ant;
                ant=sum-ant;
                System.out.print(ant + ", ");
            }
            System.out.println("");
        }
    }
}
