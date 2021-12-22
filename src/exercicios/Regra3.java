package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Regra3 {

	public static void main(String[] args) {
		// Váriaveis
		double x, y, valor;
		// Objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// Entrada
		System.out.println("Regra de 3");
		System.out.println("x% de y = valor");
		System.out.println("Digite o valor de x: ");
		x = teclado.nextDouble();
		System.out.println("Digite o valor de y: ");
		y = teclado.nextDouble();
		// Processamento
		valor = (x * y) / 100;
		// Saída
		System.out.println(x + "% de " + y + " = " + formatador.format(valor));

		teclado.close();

	}

}
