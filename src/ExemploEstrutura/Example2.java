package ExemploEstrutura;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("HashMap: (Aceita Null): ");
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(null, "Pernambuco");
		map.put(2, "Paraíba");
		map.put(143, "Ceará");

		map.forEach((key, valor) -> {
			System.out.println("");
			System.out.println("Posição no Ranking: " + key);
			System.out.println("Nome: " + valor);
		});

		System.out.println("");
		System.out.println("Método 1 (I terator): ");
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println("Key: " + entry.getKey() + " Nome : " + entry.getValue());
		}

		System.out.println("");
		System.out.println("Método 2: ");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " == " + entry.getValue());
		}

		System.out.println("");
		System.out.println("Método 3: ");
		map.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey() + " == " + entry.getValue());
		});

		System.out.println("");
		System.out.println("Hashtable // Definindo variável");
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		// Adcionar
		table.put(300, "Pernambuco");
		table.put(1, "Paraíba");
		table.put(2, "Ceará");

		// 1
		System.out.println("");
		System.out.println("Método 1 (I Enumeration): ");
		Enumeration<Integer> keys = table.keys();
		while (keys.hasMoreElements()) {
			int key = keys.nextElement();
			String value = table.get(key);
			System.out.println(key + " = " + value);
		}
		
		// 2
		System.out.println("");
		System.out.println("Método 2: ");
		for (Map.Entry<Integer, String> entry : table.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		// 3
		System.out.println("");
		System.out.println("Método 3"
				+ ": ");
		table.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		});
		
		System.out.println("");
		System.out.println("LinkedHashMap");
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<String, Integer>();
		// Adcionar
		map2.put("Um", 1);
		map2.put("Dois", 2);
		map2.put("Três", 3);
		
		System.out.println("");
		System.out.println("TreeMap");
		TreeMap<String, Integer> map3 = new TreeMap<>();
		// Adcionar
		map3.put("Um", 1);
		map3.put("Dois", 2);
		map3.put("Três", 3);
	}

}
