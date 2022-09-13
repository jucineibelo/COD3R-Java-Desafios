package desafio_classe;

public class Pessoa {

	// parametros
	String nome;
	double peso;

	// construtor

	public Pessoa(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}

	void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.pesoComida;
		}
	}

	String apresentar() {
		return "Olá me chamo " + nome + " Meu peso é: " + peso;
	}

}
