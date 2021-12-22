package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		// Variáveis
		double total, desconto, totalDesconto, valorPago, troco;
		// Objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//  Entrada 1
		System.out.println("PDV");
		System.out.println("Valor total: ");
		total = teclado.nextDouble();
		System.out.print("Desconto(%): ");
		desconto = teclado.nextDouble();
		// Procesamento 1
		totalDesconto = total - (desconto * total) / 100;
		// Saída 1
		System.out.println("Total com desconto: R$ " + formatador.format(totalDesconto));
		// Entrada 2
		System.out.println("_________________________");
		System.out.print("Valor pago em dinheiro: ");
		valorPago = teclado.nextDouble();
		// processamento 2
		troco = valorPago - totalDesconto;
		// Saída 2
		System.out.println("Troco: R$ " + formatador.format(troco));
		
		teclado.close();
		

	}

}
