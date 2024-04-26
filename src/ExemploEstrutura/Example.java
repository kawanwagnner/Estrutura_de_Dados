package ExemploEstrutura;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import Model.GestaoEstudantes;
import Model.MenuHandler;

public class Example {

	public static void main(String[] args) {
		System.out.println("Exemplos práticos...");
		System.out.println("");
		System.out.println("Comparação de Objetos do tipo String:");
		System.out.println(new String("Pedro") == new String("Pedro")); // Imprime falso
		System.out.println(new String("Pedro").equals(new String("Pedro"))); // Imprime true

		GestaoEstudantes gs = new GestaoEstudantes();
		GestaoEstudantes menu = new MenuHandler(gs);
		
		System.out.println("");
		System.out.println("Hash Code:");
		System.out.println(gs.hashCode());
		System.out.println(menu.hashCode());

		HashSet<Integer> set = new HashSet<>();
		set.add(143);
		set.add(1);
		set.add(356);
		set.add(4);
		set.add(55);
		set.add(10);
		set.add(30);
		set.add(8);
		set.add(9);
		
		System.out.println("");
		System.out.println("Elementos no HashSet: ");
		for (Integer veiculo : set) {
			System.out.println("Nº: " + veiculo);
		}
		
		System.out.println("");
		Iterator<Integer> iterator = set.iterator();
		
		LinkedHashSet<String> lkHash = new LinkedHashSet<String>();
		Iterator<String> IteratorLkHash = lkHash.iterator();
		
		Set<String> setMap= new TreeSet<String>();
		Iterator<String> setMapIterator = setMap.iterator();
		
		System.out.println("Listando elementos com Iterator: ");
		while (iterator.hasNext()) {
			Integer item = iterator.next();
			System.out.println("Nº: " + item);
		}
		
		System.out.println("");
		LinkedHashSet<Integer> LinkSet = new LinkedHashSet<>();
		LinkSet.add(143);
		LinkSet.add(1);
		LinkSet.add(356);
		LinkSet.add(4);
		LinkSet.add(55);
		LinkSet.add(10);
		LinkSet.add(30);
		LinkSet.add(8);
		LinkSet.add(9);
		
		System.out.println("Listando elementos com LinkedHashSet: ");
		for (Integer num : LinkSet) {
			System.out.println("Nº: " + num);
		}
		
		System.out.println("");
		Set treeSet = new TreeSet<Integer>(set);
	}

}
