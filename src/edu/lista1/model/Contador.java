package edu.lista1.model;

/**
 * <p>
 * Escreva uma classe chamada {@code Contador}, que tem um atributo
 * <em>estático</em> que é incrementado sempre que a classe for instanciada.
 * Crie métodos para <strong>zerar</strong>, <strong>incrementar</strong> e
 * <strong>retornar</strong> o valor do contador.
 * </p>
 * <p>
 * Desenvolva um programa para testar essa classe.
 * </p>
 *
 * @author Douglas Souza de Lima
 * @since 08/05/2024
 *
 */
public class Contador {
	/**
	 * <p>
	 * Armazena o valor do contador.
	 * </p>
	 */
	private static int contador = 0;

	/**
	 * <p>
	 * Cria um objeto do tipo {@code Contador} e incrementa o atributo
	 * <em>estático</em> do tipo inteiro contador.
	 * </p>
	 */
	public Contador() {
		Contador.contador++;
	}

	/**
	 * <p>
	 * Zera o valor do atributo contador.
	 * </p>
	 */
	public void zerar() {
		Contador.contador = 0;
	}

	/**
	 * <p>
	 * Incrementa o valor do atributo contador.
	 * </p>
	 */
	public void incrementar() {
		Contador.contador++;
	}

	/**
	 * <p>
	 * Retorna o valor do tipo inteiro do atributo contador.
	 * </p>
	 */
	public int getContador() {
		return Contador.contador;
	}
}
