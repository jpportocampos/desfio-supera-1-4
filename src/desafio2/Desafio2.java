package desafio2;

public class Desafio2 {

	public static void main(String[] args) {
		double teste = 576.73;
		
		calculaNotas(teste);

	}
	
	public static void calculaNotas(double valor) {
		int nota100, nota50, nota20, nota10, nota5, nota2, 
		moeda100, moeda50, moeda25, moeda10, moeda5, moeda1;
		
		System.out.println("NOTAS: ");
		
		nota100 = (int) valor / 100;
		valor = valor % 100;
		System.out.println(nota100 + " notas de R$100.00");
		
		nota50 = (int) valor / 50;
		valor = valor % 50;
		System.out.println(nota50 + " notas de R$50.00");
		
		nota20 = (int) valor / 20;
		valor = valor % 20;
		System.out.println(nota20 + " notas de R$20.00");
		
		nota10 = (int) valor / 10;
		valor = valor % 10;
		System.out.println(nota10 + " notas de R$10.00");
		
		nota5 = (int) valor / 5;
		valor = valor % 5;
		System.out.println(nota5 + " notas de R$5.00");
		
		nota2 = (int) valor / 2;
		valor = valor % 2;
		System.out.println(nota2 + " notas de R$2.00");
		
		valor = valor * 100;
		
		System.out.println("MOEDAS: ");
		
		moeda100 = (int) valor / 100;
		valor = valor % 100;
		System.out.println(moeda100 + " moedas de R$1.00");
		
		moeda50 = (int) valor / 50;
		valor = valor % 50;
		System.out.println(moeda50 + " moedas de R$0.50");
		
		moeda25 = (int) valor / 25;
		valor = valor % 25;
		System.out.println(moeda25 + " moedas de R$0.25");
		
		moeda10 = (int) valor / 10;
		valor = valor % 10;
		System.out.println(moeda10 + " moedas de R$0.10");
		
		moeda5 = (int) valor / 5;
		valor = valor % 5;
		System.out.println(moeda5 + " moedas de R$0.05");
		
		moeda1 = (int) valor / 1;
		System.out.println(moeda1 + " moedas de R$0.01");
	}

}
