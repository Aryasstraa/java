/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstproject;

import java.util.Scanner;

/**
 *
 * @author LAB F
 */
public class segitigaaacoba {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Panjang: ");
        double a = input.nextDouble();
        
        System.out.print("Masukan tinggi: ");
        double t = input.nextDouble();
        
        double keliling = hitungKeliling(a,t);
        System.out.println("Keliling Segitiga sama sisi" + a + " cm dan tinggi " + t + " cm adalah " + keliling + " cm.");
    }
    public static double hitungKeliling(double a, double t){
        double c = Math.sqrt((a * a) + (t * t));
        double keliling = 2 * c + a;
        return keliling;
    }
}
