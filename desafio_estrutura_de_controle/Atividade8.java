/* 8. Criar um programa que receba uma palavra e imprime no console letra por letra. */

package desafio_estrutura_de_controle;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira uma palavra: ");
		String palavra = scan.next();
		
		char letras []= palavra.toCharArray();
		
		for (int i = 0; i <letras.length; i++) {
			System.out.println(letras[i]);
		}
		

	}

}
