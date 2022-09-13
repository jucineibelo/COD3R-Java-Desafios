//1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

package desafio_estrutura_de_controle;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um número: ");
		int num = scan.nextInt();

		if (num == 0) {
			System.out.println("0 é nulo.");
		} else if (num % 2 == 0 && num >= 0 && num <= 10) {
			System.out.println(num + " É par e esta entre 0 e 10.");
		} else if (num % 2 != 0 && num >= 0 && num <= 10) {
			System.out.println(num + " Esta entre 0 e 10 mas é impar.");
		} else {
			System.out.println(num + " Não está entre 0 e 10.");
		}

	}

}