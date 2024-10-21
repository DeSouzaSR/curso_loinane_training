package com.sandro.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com uma letra: ");
		String letra = scan.nextLine();
		
		System.out.println("A letra digitada foi: " + letra);
		
		if ( (letra == "a") || (letra == "e") || (letra == "i") || (letra == "o") || (letra == "u") ) {
			System.out.println("A letra digitada é uma vogal");
		} else {
			System.out.println("A letra digitada é uma consoante");
		}
	}

} 
