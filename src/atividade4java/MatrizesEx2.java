package atividade4java;

import java.util.Scanner;

public class MatrizesEx2 {

	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo que leia as notas de uma classe com 10 participantes
		 * durante 4 bimestres de um ano. As 4 notas de cada participante serão
		 * armazenadas em uma linha de uma matriz de números reais, logo cada linha da
		 * matriz serão as notas de um participante. Em um vetor de números reais,
		 * armazene as médias de cada participante e exiba as médias de cada um na tela.
		 * 
		 */

		Scanner leia = new Scanner(System.in);

		double[][] matrizDoub = new double[10][4];
		double [] media = new double[10];
		
		double soma = 0;
		int linha = 0, coluna = 0;

		for (linha = 0; linha < 10; linha++) {
			for (coluna = 0; coluna < 4; coluna++) {
				System.out.printf("Digite a %dª nota para o %dº aluno: \n", coluna + 1, linha + 1);
				matrizDoub[linha][coluna] = leia.nextDouble();

			}
		}
		for (linha = 0; linha < 10; linha++) {
			soma = 0;
			for (coluna = 0; coluna < 4; coluna++) {
				soma += matrizDoub[linha][coluna];
			}
			media[linha] = soma / 4;
			System.out.printf("[%.1f] ",media[linha]);
		}

	}

}
