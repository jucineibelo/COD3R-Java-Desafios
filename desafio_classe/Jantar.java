package desafio_classe;

public class Jantar {
	public static void main(String[] args) {
		
		
		Comida c1 = new Comida("Arroz", 2);
		Comida c2 = new Comida("Julia", 3);
		
		Pessoa p = new Pessoa("Jucinei", 65);
		
		p.comer(c1);
		
		System.out.println(p.apresentar());
		
		
		
				
		
	
		
	}

}
