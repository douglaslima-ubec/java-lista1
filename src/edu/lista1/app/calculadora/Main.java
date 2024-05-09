package edu.lista1.app.calculadora;

import edu.lista1.model.Calculadora;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// define a localização para pt-BR
		Locale.setDefault(Locale.of("pt", "BR"));
		int opcao;
		// exibe o menu e faz a leitura da opção do usuário
		exibirMenu();
		opcao = Main.sc.nextInt();
		calcular(opcao);
		// fechar o Scanner
		Main.sc.close();
		System.out.println();
		System.out.println("Fim da execução.");
	}

	/**
	 * <p>
	 * Exibe o menu de ações que a aplicação executa.
	 * </p>
	 */
	public static void exibirMenu() {
		System.out.println();
		System.out.println("1. Soma");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");
		System.out.println("5. Potência");
		System.out.println("6. Fatorial");
		System.out.print("Digite a sua opção: ");
	}

	/**
	 * <p>
	 * Realiza a leitura de dois 2 argumentos do tipo <strong>double</strong>.
	 * </p>
	 * 
	 * @return Um array do tipo double contendo 2 argumentos.
	 */
	public static double[] lerArgumentos() {
		double[] numeros = new double[2];
		System.out.print("Digite o valor do primeiro número: ");
		numeros[0] = Main.sc.nextDouble();
		System.out.print("Digite o valor do segundo número: ");
		numeros[1] = Main.sc.nextDouble();
		return numeros;
	}

	/**
	 * 
	 * @param opcao Número da operação artimética.
	 */
	public static void calcular(int opcao) {
		double[] args = new double[2];
		char continuar;
		System.out.println();
		switch (opcao) {
		case 1:
			args = lerArgumentos();
			Calculadora.somar(args[0], args[1]);
			System.out.printf("%.2f + %.2f = %.2f%n", args[0], args[1], Calculadora.getResultado());
			break;
		case 2:
			args = lerArgumentos();
			Calculadora.subtrair(args[0], args[1]);
			System.out.printf("%.2f - %.2f = %.2f%n", args[0], args[1], Calculadora.getResultado());
			break;
		case 3:
			args = lerArgumentos();
			Calculadora.multiplicar(args[0], args[1]);
			System.out.printf("%.2f x %.2f = %.2f%n", args[0], args[1], Calculadora.getResultado());
			break;
		case 4:
			try {
				args = lerArgumentos();
				Calculadora.dividir(args[0], args[1]);
				System.out.printf("%.2f / %.2f = %.2f%n", args[0], args[1], Calculadora.getResultado());
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 5:
			System.out.print("Digite o valor da base: ");
			args[0] = Main.sc.nextDouble();
			System.out.print("Digite o valor do expoente: ");
			args[1] = Main.sc.nextDouble();
			Calculadora.potencia(args[0], args[1]);
			System.out.printf("%.2f ^ %.2f = %.2f%n", args[0], args[1], Calculadora.getResultado());
			break;
		case 6:
			System.out.print("Digite o valor do número: ");
			args[0] = Main.sc.nextDouble();
			Calculadora.fatorial(args[0]);
			System.out.printf("%.2f! = %.2f%n", args[0], Calculadora.getResultado());
			break;
		default:
			System.out.println("Opção inválida!");
		}
		System.out.println();
		System.out.print("Continuar? (S/N) ");
		continuar = Main.sc.next().charAt(0);
		if (continuar == 'S' || continuar == 's') {
			exibirMenu();
			opcao = Main.sc.nextInt();
			calcular(opcao);
		}
	}
}