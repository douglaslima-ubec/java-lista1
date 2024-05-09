package edu.lista1.model;

/**
 * <p>
 * Escreva uma classe Calculadora que tenha os seguintes métodos:
 * <strong>somar</strong>, <strong>subtrair</strong>,
 * <strong>multiplicar</strong>, <strong>dividir</strong> (dois números),
 * <strong>elevar à potência<strong> n.
 * </p>
 * 
 * @author Douglas Souza de Lima
 * @since 09/05/2024
 */
public abstract class Calculadora {

	/**
	 * <p>
	 * Armazena o resultado das operações aritméticas.
	 * </p>
	 */
	private static double resultado;

	/**
	 * <p>
	 * Calcula a <strong>soma</strong> entre dois argumentos: <em>numero1</em> e
	 * <em>numero2</em>.
	 * </p>
	 * 
	 * @param numero1 Primeiro argumento da operação.
	 * @param numero2 Segundo argumento da operação.
	 * @return O resultado da operação aritmética de soma.
	 */
	public static double somar(double numero1, double numero2) {
		Calculadora.resultado = numero1 + numero2;
		return Calculadora.resultado;
	}

	/**
	 * <p>
	 * Calcula a <strong>subtração</strong> entre dois argumentos: <em>numero1</em>
	 * e <em>numero2</em>.
	 * </p>
	 * 
	 * @param numero1 Primeiro argumento da operação.
	 * @param numero2 Segundo argumento da operação.
	 * @return O resultado da operação aritmética de subtração.
	 */
	public static double subtrair(double numero1, double numero2) {
		Calculadora.resultado = numero1 - numero2;
		return Calculadora.resultado;
	}

	/**
	 * <p>
	 * Calcula a <strong>multiplicação</strong> entre dois argumentos:
	 * <em>numero1</em> e <em>numero2</em>.
	 * </p>
	 * 
	 * @param numero1 Primeiro argumento da operação.
	 * @param numero2 Segundo argumento da operação.
	 * @return O resultado da operação aritmética de multiplicação.
	 */
	public static double multiplicar(double numero1, double numero2) {
		Calculadora.resultado = numero1 * numero2;
		return Calculadora.resultado;
	}

	/**
	 * <p>
	 * Calcula a <strong>divisão</strong> do primeiro argumento pelo segundo
	 * argumento: <em>numero1</em> e <em>numero2</em>.
	 * </p>
	 * 
	 * @param numero1 Primeiro argumento da operação.
	 * @param numero2 Segundo argumento da operação.
	 * @return O resultado da operação aritmética de divisão.
	 */
	public static double dividir(double numero1, double numero2) throws ArithmeticException {
		if (numero2 == 0) {
			throw new ArithmeticException("ERRO => Não é possível dividir um número por ZERO!");
		}
		Calculadora.resultado = numero1 / numero2;
		return Calculadora.resultado;
	}

	/**
	 * <p>
	 * Calcula o valor do primeiro argumento elevado à <strong>potência</strong> do
	 * segundo argumento: <em>numero1</em> e <em>numero2</em>.
	 * </p>
	 * 
	 * @param numero   A base.
	 * @param expoente O expoente.
	 * @return O resultado da operação aritmética de potência.
	 */
	public static double potencia(double numero, double expoente) {
		Calculadora.resultado = Math.pow(numero, expoente);
		return Calculadora.resultado;
	}

	/**
	 * <p>
	 * Calcula o <strong>fatorial</strong> de um número.
	 * </p>
	 * <p>
	 * Fatorial em matemática é o produto do número e os seus antecessores maiores
	 * que 0.
	 * </p>
	 * <h1>Exemplo</h1>
	 * <p>
	 * 5! = 5 x 4 x 3 x 2 x 1 = 120
	 * </p>
	 * 
	 * @param numero O número para calcular o fatorial.
	 * @return O resultado da operação aritmética de fatorial.
	 */
	public static double fatorial(double numero) {
		Calculadora.resultado = 1;
		while (numero > 1) {
			Calculadora.resultado *= (numero);
			numero--;
		}
		return Calculadora.resultado;
	}

	/**
	 * <p>
	 * Retorna o valor do atributo estático <strong>resultado</strong>.
	 * <p>
	 */
	public static double getResultado() {
		return Calculadora.resultado;
	}
}