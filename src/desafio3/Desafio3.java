package desafio3;

import java.util.Random;

public class Desafio3 {

	public static void main(String[] args) {
		int tam = 5;
		int k = 1;

		paresDiferenca(tam, k);
	}

	public static void paresDiferenca(int n, int k) {
		int[] array = new int[n];
		int cont = 0;

		array = geraArray(array);

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] - array[j] == k) {
					cont++;
				}
			}
		}
		System.out.println(" ");
		System.out.println(cont);
	}

	private static int[] geraArray(int[] array) {
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
			System.out.println(array[i]);
		}
		return array;
	}

}
