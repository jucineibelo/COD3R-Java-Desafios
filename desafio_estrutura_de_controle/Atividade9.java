/*9. Crie um programa que recebe 10 valores e ao final imprima o maior número.*/

package desafio_estrutura_de_controle;

import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int maior = 0;
		int menor = 9999999;

		for (int i = 0; i <= 10; i++) {
			System.out.println("Insira um número: ");
			int num = scan.nextInt();
			if (num > maior) {
				maior = num;
			}
			if (num < menor) {
				menor = num;
			}
		}
		System.out.println("O maior número digitado foi: " + maior + "\nO menor número digitado foi: " + menor);

	}

}
