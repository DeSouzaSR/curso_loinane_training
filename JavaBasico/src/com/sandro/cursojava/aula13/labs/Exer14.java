package com.sandro.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		double multa = 4.00;
		double pesoExcedente = 0;
		double limite = 50.0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o valor do peso: ");
		double peso = scan.nextDouble();
		
		if (peso > limite) {
			pesoExcedente = peso - limite;
			multa = pesoExcedente * multa;
		} else {
			pesoExcedente = 0;
			multa = 0;
		}
		
		System.out.println("Peso excedente: " + pesoExcedente);
		System.out.println("Multa: R$" + multa);

	}

}
