package atividade4java;

import java.util.Scanner;

public class VetoresEx1 {

	public static void main(String[] args) {
		/*
		 * Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
		 * construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário
		 * irá digitar um número e o programa deve exibir na tela a posição deste número
		 * no vetor. Caso o número não seja encontrado, a mensagem: “Não foi
		 * encontrado!” deve ser exibida na tela.
		 * 
		 */

		Scanner leia = new Scanner(System.in);

		// definindo os valores do vetor
		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int dado;
		int bandeira = 0;

		// pedindo ao usuario para entrar com um numero
		System.out.println("Digite aqui o número que você deseja encontrar: ");
		dado = leia.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == dado) {
				bandeira = i;				
			} 
			
		}
		
		if (bandeira != 0){
			System.out.println("O valor informado é: " + dado + " e esta na posição do vetor: "+bandeira);
		}else{
			System.out.println("O valor informado não foi encontrado!");
		}

	}

}
