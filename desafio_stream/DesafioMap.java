package desafio_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

	
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString(); // Inverter a string ..."110" => "011"
		
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);   //Converter de volta para inteiro => "011" => 3
		
		
		nums.stream()
		.map(Integer::toBinaryString)    	// número para string binaria... 6 => 110
		.map(inverter)                      // Inverter a string ..."110" = "011"
		.map(binarioParaInt)				//Converter de volta para inteiro => "011" => 3
		.forEach(System.out::println);

		
		



	}

}
