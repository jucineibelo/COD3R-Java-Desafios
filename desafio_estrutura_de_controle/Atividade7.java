/* 7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, 
caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while. */

package desafio_estrutura_de_controle;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int contador = 0;
		int num = 0;
		int soma = 0;

		while (num >= 0) {
			System.out.println("Insira um número: ");
			num = scan.nextInt();
			if (num > 0) {
				soma = soma + num;
				contador++;
			} else {
				System.out.println("Você encerrou o programa!");
			}
		}
		System.out.println("A soma dos números totalizou: " + soma);
	}

}
