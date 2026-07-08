package com.loiane.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {

		int idade = 20;
		String nome = "Loiane";
		String nomeDoMeuCachorro = "Totó";
		
		// Unicode
		char o = 111;
		char i = 105;
		char interrogacao = 0x003F;
		
		System.out.println("Idade: " + idade);
		System.out.println("Nome: " +  nome);
		System.out.println("Nome do meu cachorro: " + nomeDoMeuCachorro);
		
		//System.out.println("" + o + i + "\u003F");
		System.out.println("" + o + i + interrogacao);
	}

}
