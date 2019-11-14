/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_3;

import java.util.Scanner;

/**
 *
 * @author xdeantabelisario
 */
public class Area {
    private int base;
    private int alt;
    private Scanner sc;
    
    public Area(){
        base = alt = 0;
        sc=new Scanner(System.in);
    }
    
    public int calcArea(){
        do{
            System.out.println("Introduzca la base:");
            base=sc.nextInt();
            System.out.println("Introduzca la altura");
            alt=sc.nextInt();
        }while(base < 0 || alt < 0);
        return base*alt;
    }
}
