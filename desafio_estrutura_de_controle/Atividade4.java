package desafio_estrutura_de_controle;

import java.util.Scanner;

public class Atividade4 {

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
			if (contador == 0) {
				System.out.println(num + " é primo!");
			} else {
				System.out.println(num+" não é primo!");
			}
		}

	}


