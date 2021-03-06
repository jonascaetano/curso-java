package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorServico {

	public static void main(String[] args) {
		// Vari?veis
		double hora, remuneracao, custo, cargaHoraria;
		// Objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// Entrada
		System.out.println("C?lculo do valor da hora de um servi?o");
		System.out.println("Remunera??o mensal pretendida: ");
		remuneracao = teclado.nextDouble();
		System.out.println("Custo operacional mensal: ");
		custo = teclado.nextDouble();
		System.out.println("Carga hor?ria mensal de trabalho: ");
		cargaHoraria = teclado.nextDouble();
		// Processamento
		hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / cargaHoraria;
		// Sa?da
		System.out.println("Valor da hora: " + formatador.format(hora));
		teclado.close();
	}

}
