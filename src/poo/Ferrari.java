package poo;

public class Ferrari {

	public static void main(String[] args) {
		Carro ferrari = new Carro();
		ferrari.ano = 2012;
		ferrari.cor = "Vermelho";
		System.out.println("Carro: Ferrari");
		System.out.println("Ano: " + ferrari.ano);
		System.out.println("Ano: " + ferrari.cor);
		ferrari.ligar();
		ferrari.acelerar();

	}

}
