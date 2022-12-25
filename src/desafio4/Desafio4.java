package desafio4;

public class Desafio4 {

	public static void main(String[] args) {
		String[] entrada = {"5", "I ENIL SIHTHSIREBBIG S", "LEVELKAYAK", "H YPPAHSYADILO", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE"};
		
		decifraVirus(entrada);
	}

	private static void decifraVirus(String[] entrada) {
		String metade1 = "", metade2 = "", frase = "";
		
		
		for (int i = 1; i < entrada.length; i++) {
			for (int j = entrada[i].length()/2 - 1; j >= 0; j--) {
				metade1 = metade1 + entrada[i].charAt(j);
			}
			
			for (int j = entrada[i].length() - 1; j > entrada[i].length()/2 - 1; j--) {
				metade2 = metade2 + entrada[i].charAt(j);
			}
			frase = metade1 + metade2;
			System.out.println(frase);
			metade1 = "";
			metade2 = "";
			frase = "";
		}
	}

}
