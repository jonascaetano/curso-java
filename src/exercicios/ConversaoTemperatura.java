package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		// Vari�veis
		double c, f;
		// Objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		// Entrada
		System.out.println("Convers�o de temperatura");
		System.out.println("Digite a temperatura em fahrenheit: ");
		f = teclado.nextDouble();
		// Processamento
		c = (5 * (f - 32)) / 9;
		// Sa�da
		System.out.println("Temperatura em Celsius: " + formatador.format(c) + "�c");
		teclado.close();

	}

}
