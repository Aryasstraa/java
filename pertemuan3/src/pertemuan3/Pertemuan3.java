/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author LAB F
 */

import java.util.Scanner;
public class Pertemuan3 {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai mahasiswa: ");
        int nilai = input.nextInt();    
       if(nilai <= 75){
           System.out.println("ANDA TIDAK LULUS");
       } else if (nilai > 100 ){
           System.out.println("KELEBIHAN");
       }
       else {
       System.out.println("ANDA LULUS");
       }
    }
}

