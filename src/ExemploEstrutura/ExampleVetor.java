package ExemploEstrutura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ExampleVetor {

	public static void main(String[] args) {
		int[] numeros = new int[3];
		
		numeros[0] = 2;
		numeros[1] = 4;
		numeros[2] = 3;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Número presente no Array: " + numeros[i]);
		}
		
		int [][] bidimensional = new int [3][3]; // Coluna / Linha
		int [][][] terceiradimensao = new int [3][3][3]; // Coluna / Linha / Profundidade
		
		bidimensional[0][0] = 10;
		bidimensional[2][2] = 100;
		
		System.out.println("Bidimensional");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(bidimensional[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("");
		System.out.println("LinkedList: ");
		LinkedList<Integer> listaLinked = new LinkedList<Integer>();
		Iterator<Integer> IteratorLk = listaLinked.iterator();
		for (int i = 1; i <= 10; i++) {
			listaLinked.add(i);
		}

		for (Integer item : listaLinked) {
			System.out.println("Nº: " + item);
		}
		
		System.out.println("");
		System.out.println("ArrayList: ");
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 103; i <= 113; i++) {
			nums.add(i);
		}
		
		nums.forEach(item -> {
			System.out.println("Nº: " + item);
		});
		
	}
	
}
