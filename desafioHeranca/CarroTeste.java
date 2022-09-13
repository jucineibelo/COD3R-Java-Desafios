package desafioHeranca;

public class CarroTeste {

	public static void main(String[] args) {

		Ferrari ferrari = new Ferrari();

		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.ligarTurbo();
		ferrari.acelerar();
		
	

		System.out.println(ferrari);

		
		
		Civic civic = new Civic();

		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.frear();
		civic.frear();

		System.out.println(civic);

	}

}
