package com.sandro.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com três números inteiros: ");
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		
		int p1;
		int p2;
		int p3;
		
		p1 = n1;
		
		if(p1 > n2) && (n3 > p1){
			p1 = n3;
		}
		
		if(n3 > p1) {
			p1 = n3;
		}
		
		
		
	}

}
