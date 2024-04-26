package ExemploEstrutura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleCollections {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Atletico Mineiro");
		arrayList.add("Mirasol");
		arrayList.add("Novo Horizontino");
		arrayList.add("Itauno Futebol Clube");
		
		// Ordenar
		Collections.sort(arrayList);

		// Desordenar
		Collections.shuffle(arrayList);

		// Imprimindo o resultado
		System.out.println(arrayList);
	}
}
