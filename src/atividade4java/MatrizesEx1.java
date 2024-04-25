package atividade4java;

public class MatrizesEx1 {

	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em
		 * seguida, mostre na tela: Todos os elementos da Diagonal Principal Todos os
		 * elementos da Diagonal Secundária A Soma de todos os elementos da Diagonal
		 * Principal A Soma de todos os elementos da Diagonal Secundária
		 * 
		 */

		// cada bloco de chave corresponde a uma linha - matriz 3 x 3
		int numeros[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int resultadoPri = 0, resultadoSec = 0;

		// System.out.println("O número da linha 3, coluna 2 é: " + numeros[2][1]);
		for (int indiceLinha = 0; indiceLinha < numeros.length; indiceLinha++) {

			for (int indiceColuna = 0; indiceColuna < numeros.length; indiceColuna++) {
				System.out.print("[" + numeros[indiceLinha][indiceColuna] + "] ");
			}

			System.out.println();
		}
		System.out.println("--------------------------------------");
		System.out.println("Diagonal principal:");
		System.out.print("[" + numeros[0][0] + "] ");
		System.out.print("[" + numeros[1][1] + "] ");
		System.out.print("[" + numeros[2][2] + "] ");
		System.out.println("--------------------------------------");

		System.out.println("Diagonal secundária:");
		System.out.print("[" + numeros[0][2] + "] ");
		System.out.print("[" + numeros[1][1] + "] ");
		System.out.print("[" + numeros[2][0] + "] ");
		System.out.println("---------------------------------------");

		System.out.println("\n--------------Todos os elementos da diagonal principal--------------");
		// exbindo o que tem na diagonal principal
		for (int contador = 0; contador < numeros.length; contador++) {
			int cont = 0;
			cont += numeros[contador][contador];
			System.out.print("[" + cont + "] ");
			resultadoPri += numeros[contador][contador];
		}

		System.out.println("--------------Todos os elementos da diagonal principal--------------");
		for (int contador = 0; contador < numeros.length; contador++) {
			int cont = 0;
			cont += numeros[contador][2 - contador];
			System.out.print("[" + cont + "] ");
			resultadoSec += numeros[contador][2 - contador];
		}

		System.out.println("\n-----------A Soma de todos os elementos da Diagonal Principal-----------------");
		System.out.println(resultadoPri);

		System.out.println("\n-----------A Soma de todos os elementos da Diagonal Secundaria-----------------");
		System.out.println(resultadoSec);

	}

}
