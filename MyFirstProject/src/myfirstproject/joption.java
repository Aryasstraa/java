/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstproject;
import javax.swing.JOptionPane;
/**
 *
 * @author LAB F
 */
public class joption {
    public static void main(String[] args){
       String nama = " ";
       String nim = "";
       int tinggi;
       
       nama = JOptionPane.showInputDialog("Silahkan Masukkan Nama Anda: ");
       nim = JOptionPane.showInputDialog("Silahkan Masukkan NIM Anda: ");
       tinggi = Integer.parseInt(JOptionPane.showInputDialog("Silahkan Masukkan Tinggi Anda: "));
       
       String msg= "hai " + nama + " " + " Nim Anda Adalah " + nim + " Tinggi anda " + tinggi ;
       JOptionPane.showMessageDialog(null,msg);
    }
}
