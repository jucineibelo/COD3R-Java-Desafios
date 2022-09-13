//5. Refatorar o exercício 04, utilizando a estrutura switch.

package desafio_estrutura_de_controle;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um número: ");
		int num = scan.nextInt();
		int contador = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				contador++;
			}
		}
		switch (contador) {
		case 0:
			System.out.println(num + " é primo!");
			break;
		default:
			System.out.println(num + " não é primo!");
		}
	}
}
