package com.sandro.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com dois números inteiros: ");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O primeiro número é maior que o segundo número");
		} else if (numero1 < numero2){
			System.out.println("O segundo número é maior que o primeiro número");
		} else {
			System.out.println("Os números são iguais");
		}
	}

}
