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
public class coba2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        String nama;
        String nim;
        int tinggi;
        
        System.out.print("Masukan Nama Anda: ");
        nama = sc.nextLine();
        
        System.out.print("Silahkan Masukan NIM Anda: ");
        nim = sc.nextLine();
        
        System.out.print("Silahkan Masukan Tinggi Anda: ");
        tinggi = sc.nextInt();
        
        System.out.println("Hi "+ nama + " NIm Anda Adalah " + nim + " Tinggi Anda " + tinggi + " cm");
    }

}
