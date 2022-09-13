 /*6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. 
O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de 
 tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado. */

package desafio_estrutura_de_controle;

import java.util.Random;
import java.util.Scanner;

public class Atividade6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeroSorteado;
		int tentativa;

		Random numeroAleatorio = new Random();
		numeroSorteado = numeroAleatorio.nextInt(101);
		System.out.println("Sorteando numero entre 0 e 100...\n");

		for (int i = 0; i <= 10; i++) {
			System.out.println("Tente adivinhar o número: ");
			tentativa = scan.nextInt();
			if (tentativa == numeroSorteado) {
				System.out.println("Você acertou: " + tentativa + " é seu número da sorte!");
				break;
			} else {
				System.out.println("Você errou!");
			}
		}

	}

}
