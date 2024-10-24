/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_aula15;

import java.util.Scanner;

/**
 *
 * @author sandro
 */
public class Exer16 {
    
    public static void main(String[] args){
        
        System.out.println("Equação do segundo grau [ax^2 + bx + cx = 0]");
        System.out.println("Entre com os coeficientes a, b e c");
        Scanner scan = new Scanner(System.in);
        
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double x1;
        double x2;
        
        double delta = b*b - 4*a*c;
        
        if(delta < 0) {
            System.out.println("As raízes não são reais");
        } else {
            if(delta == 0) {
                x1 = (-b*b) / (2 * a);
                x2 = x1;
                
                System.out.println("Delta: "+ delta);
                System.out.println("x1: "+ x1);
            } else {
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
            }
            System.out.println("Delta: "+ delta);
            System.out.println("x1: "+ x1);
            System.out.println("x2: "+ x2);  
        }
        
        
        
    }
    
}
