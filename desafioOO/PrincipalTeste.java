package desafioOO;

public class PrincipalTeste {

	public static void main(String[] args) {
		
		
		Compra c1 = new Compra();
		c1.adicionarItem("Caderno", 11.90, 3);
		c1.adicionarItem(new Produto ("Notebook", 2980),1);
		
		Compra c2 = new Compra();
		c2.adicionarItem("Caneta", 2, 5);
		c2.adicionarItem(new Produto ("Pc gamer", 4980),1);
		
		
		Cliente cliente = new Cliente("Jucinei");
		cliente.adicionarCompra(c1);
		cliente.adicionarCompra(c2);
		
		System.out.println(cliente.obterValorTotal());
		
		
		
	}

}
