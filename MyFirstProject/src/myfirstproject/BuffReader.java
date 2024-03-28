/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstproject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author LAB F
 */
public class BuffReader {
    public static void main(String[] args) throws IOException{
        BufferedReader hello = new BufferedReader(new InputStreamReader (System.in));
        String nama = " ";       
        String nim = " ";
        int tinggi;
        
        System.out.print("Silahkan Masukan Nama Anda: ");
        nama = hello.readLine();
        
        System.out.print("Silahkan Masukan NIM Anda: ");
        nim = hello.readLine();
        
        System.out.print("Silahkan Masukan Tinggi Anda: ");
        tinggi = Integer.parseInt(hello.readLine());
        
        System.out.println("Hi "+ nama + " NIm Anda Adalah " + nim + " Tinggi Anda " + tinggi);

    }
    
}
