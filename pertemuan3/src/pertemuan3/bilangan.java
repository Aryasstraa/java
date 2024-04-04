/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author LAB F
 */
import java.util.Scanner;
public class bilangan {

    public static void main(String[] args) {
//        int x = 1;
//        while (x <= 20) {
//            if (x % 3 == 0) {
//                x++;
//                System.out.println("Nilai x = " + x);
//            }
//        }
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai awal: ");
        int awal = input.nextInt();
        
        System.out.print("Masukkan nilai Akhir: ");
        int akhir = input.nextInt();
        
        int a;
        for (a = awal; a <= akhir; a++) {
            if (a % 3 == 0) {
                System.out.println(a+ " ");
            }
        }
    }
}
