package desafio1;

import java.util.ArrayList;
import java.util.Arrays;

public class Desafio1 {

	public static void main(String[] args) {
		int[] teste = { 10, 4, 32, 34, 33, 871, 543, 3456, 654, 567, 87, 6789, 98 };
		OrdenaValores(teste);
	}

	public static void OrdenaValores(int[] entrada) {
		int linhas = entrada[0];
		ArrayList<Integer> pares = new ArrayList<Integer>();
		ArrayList<Integer> impares = new ArrayList<Integer>();
		int[] saida = new int[linhas];
		System.out.println(Arrays.toString(entrada));

		for (int i = 1; i <= linhas; i++) {
			if (entrada[i] % 2 == 0) {
				pares.add(entrada[i]);
			} else {
				impares.add(entrada[i]);
			}
		}

		pares = OrdenaPares(pares);
		impares = OrdenaImpares(impares);

		for (int i = 0; i < saida.length; i++) {
			if (pares.size() > 0) {
				saida[i] = pares.get(0);
				pares.remove(0);
			} else {
				saida[i] = impares.get(0);
				impares.remove(0);
			}
		}
		System.out.println(Arrays.toString(saida));
	}

	public static ArrayList<Integer> OrdenaPares(ArrayList<Integer> pares) {
		System.out.println(pares);
		for (int i = pares.size() - 1; i > 1; i--) {
			for (int j = 0; j < pares.size(); j++) {
				if (pares.get(i) < pares.get(j)) {
					if (j > i) {
						continue;
					}
					pares.add(j, pares.get(i));
					pares.remove(i + 1);
				}
			}
		}
		System.out.println(pares);
		return pares;

	}

	public static ArrayList<Integer> OrdenaImpares(ArrayList<Integer> impares) {
		System.out.println(impares);
		for (int i = 1; i < impares.size(); i++) {
			for (int j = 0; j < impares.size(); j++) {
				if (impares.get(i) > impares.get(j)) {
					if (j > i) {
						continue;
					}
					impares.add(j, impares.get(i));
					impares.remove(i + 1);
				}
			}
		}
		System.out.println(impares);
		return impares;

	}

}
