package desafioOO;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	// parametros

	final String nome;

	final List<Compra> compras = new ArrayList<>();

	// Construtor

	Cliente(String nome) {
		this.nome = nome;
	}

	// métodos

	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}

	double obterValorTotal() {
		double total = 0;

		for (Compra cps : compras) {
			total += cps.obterValorTotal();
		}
		return total;

	}

}
