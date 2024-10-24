/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios_aula17;

import java.util.Scanner;

/**
 *
 * @author sandro
 */
public class Exer52 {
    
    public static void main(String[] args) {
        
        System.out.println("Cálculo do valor de H = 1 + 1/2 + 1/3 + ... + 1/N");
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor de N");
        
        int N = scan.nextInt();
        double H = 0;
  
        for (int i = 1; i <= N; i++) {
            
            H += 1.0/i;
            
        }
        
        // Saída
        System.out.println("H = " + H);
    }
    
}
