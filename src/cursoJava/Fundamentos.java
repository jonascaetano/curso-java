package cursoJava;

public class Fundamentos {

	public static void main(String[] args) {
		String nome;
		int idade = 39;
		char sexo = 'M';
		double temperatura = 18.9;
		boolean arCondicionado = false;
		nome = "Jonas Arellaro Caetano";
		System.out.println("Uso de variáveis na linguagem Java:");
		System.out.println();
		System.out.println("Exemplos:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Ar Condicionado: " + arCondicionado);
		System.out.println("___________________________________");
		System.out.println();
		double i = 10;
		System.out.println("Oepradores Aritméticos e Atribuições");
		System.out.println();
		System.out.println("Exemplos: ");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println();
		System.out.println("i += 5       | i = " + (i += 5));
		System.out.println("i -= 5       | i = " + (i -= 5));
		System.out.println("i *= 5       | i = " + (i *= 5));
		System.out.println("i /= 5       | i = " + (i /= 5));
		i++;
		System.out.println("i++          | i = " + i);
		i--;
		System.out.println("i--          | i = " + i);
		System.out.println("___________________________________");
		System.out.println();
		System.out.println("ESTRUTIRAS DE CONTROLE");
		System.out.println();
		System.out.println("Estruturas de controle condicional");
		System.out.println();
		System.out.println("Exemplo 1 - Uso do 'if'");
		sexo = 'F';
		if (sexo == 'M') {
			System.out.println("Alistamento militar obrigatório.");
		}
		
	}

}
