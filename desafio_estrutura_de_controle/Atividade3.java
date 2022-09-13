/*3. Criar um programa que receba duas notas parciais, calcular a média final. 
Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".*/

package desafio_estrutura_de_controle;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a 1º nota do aluno: ");
		int nota1 = scan.nextInt();
		System.out.println("Insira a 2º nota do aluno: ");
		int nota2 = scan.nextInt();
		
		int media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.println(media+" Aprovado");
		} else if (media >= 4 && media < 7) {
			System.out.println(media+" Recuperação");
		} else {
			System.out.println(media+" Reprovado");
		}
		
		

	}

}
