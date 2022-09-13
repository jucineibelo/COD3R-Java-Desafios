//2. Criar um programa informa se o ano atual é um ano bissexto;

package desafio_estrutura_de_controle;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um número para saber se ele é Bisexto: ");
		int num = scan.nextInt();
		
		if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
			System.out.println(num + " É um ano Bissexto!");
			
		} else {
			System.out.println("Não é um ano Bissexto!");
		}
		

	}

}
