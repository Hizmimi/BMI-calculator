package com.mycompany.bmi;

import java.util.Scanner;


public class BMI {

    
    public static void main(String[] args) {
        int berat;
        double tinggi;
        double Bmi;
        
       Scanner rop = new Scanner(System.in);
            System.out.println("masukan tinggi anda");
                tinggi=rop.nextInt();
            System.out.println("masukan berat badan anda:");
                berat=rop.nextInt();
                 tinggi/=100; 
        Bmi=berat / (tinggi*tinggi);
            System.out.println("hasil Bmi kamu adalah:" + Bmi);
        
        if(Bmi<20){
            System.out.println("berat kurang");
        }
        else if (Bmi<28){
            System.out.println("berat normal");
        }
        else if (Bmi<35){
            System.out.println("kelebihan berat badan");
        }
        
       
    }
    
}
