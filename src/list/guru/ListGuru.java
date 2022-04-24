/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list.guru;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ListGuru {
    
    public static <T> void genericDisplay(T[] elements) {
        for (T element : elements)
            System.out.printf("%s",element);
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<string> guru = new ArrayList<>();
        Scanner input = new Scanner (System.in);
        int a; {
        
            System.out.println("=== Memilih list guru ===");
            System.out.println("1. beginner");
            System.out.println("2. intermediate");
            System.out.println("3. expert");
            System.out.print("masukan angka    :");
            a = input.nextInt();
            
            if (a == 1) {
                System.out.print("yang mengajar b ing tingkat beginner adalah :   ");
                System.out.println("pak anas, pak cipto, turu");
                
            } else if (a == 2) {
                System.out.print("yang mengajar b ing tingkat intermediate adalah :   ");
                System.out.println("pak agus, pak amin, ");
            } else if (a == 3) {
                System.out.print("yang mengajar b ing tingkat expert adalah :   ");
                System.out.println("bu endang, pak asep ");
            }
        
        
        }
    }
   
}
