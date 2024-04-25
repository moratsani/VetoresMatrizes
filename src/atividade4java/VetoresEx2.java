package atividade4java;

import java.util.Scanner;

public class VetoresEx2 {

	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em
		 * seguida, mostre na tela: 
		 * Todos os elementos dos índices ímpares do vetor
		 * Todos os elementos do vetor que são números pares
		 * A Soma de todos os elementos do vetor
		 * A Média de todos os elementos do vetor, armazenada em uma variável do tipo real
		 * 
		 */

		Scanner leia = new Scanner(System.in);

		int vetor[] = new int[10];
		int cont, indice;
		float soma = 0f, media = 0f;

		for (cont = 0; cont < vetor.length; cont++) {
			System.out.printf("Escreva o %dº número: ", cont + 1);
			vetor[cont] = leia.nextInt();
		}
		System.out.println("--------------------------------------------------");
		System.out.println("Elementos nos índices ímpares do vetor: ");
		for (cont = 0; cont < vetor.length; cont++) {
			indice = cont;
			if (indice % 2 != 0) {
				System.out.print("["+ vetor[cont] + "]");

			}
			
		}
		System.out.println("\n\n--------------------------------------------------");
		System.out.println("Todos os elementos do vetor que são números pares: ");
		for (cont = 0; cont < vetor.length; cont++) {
			if (vetor[cont] % 2 == 0) {
				System.out.print("["+ vetor[cont] + "] ");
			}
			
		}
		System.out.println("\n\n--------------------------------------------------");
		System.out.println("A Soma de todos os elementos do vetor: ");
		for (cont = 0; cont < vetor.length; cont++) {
			soma += vetor[cont];	
		}
		System.out.printf("[%.0f]",soma);
		
		System.out.println("\n--------------------------------------------------");
		System.out.println("A Média de todos os elementos do vetor: ");
		media = soma / vetor.length;
		System.out.printf("[%.2f]",media);

	}

}
