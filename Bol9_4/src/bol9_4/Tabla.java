/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_4;

import java.util.Scanner;

/**
 *
 * @author xdeantabelisario
 */
public class Tabla {
    private int num;
    private Scanner sc;
    
    public Tabla(){
        num=1;
        sc=new Scanner(System.in);
    }
    
    public void mostrarTabla(){
        System.out.println("Introduzca un numero:");
        num=sc.nextInt();
        while(num!=0){
            /*System.out.println("Introduzca un numero:");
            num=sc.nextInt();*/
            System.out.println("Tabla de multiplicacion del " + num);
            for(int i=1;i<=10;i++){
                System.out.println(num + " * " + i + " = " + num*i);
            }
            System.out.println("Introduzca un numero:");
            num=sc.nextInt();
        }
    }
}
