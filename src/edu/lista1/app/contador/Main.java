package edu.lista1.app.contador;

import edu.lista1.model.Contador;

public class Main {

	public static void main(String[] args) {
		Contador contador1 = new Contador();
		System.out.println("Contador: " + contador1.getContador());
		System.out.println("Incrementando o contador...");
		contador1.incrementar();
		System.out.println("Contador: " + contador1.getContador());
		System.out.println("Incrementando o contador...");
		contador1.incrementar();
		System.out.println("Incrementando o contador...");
		contador1.incrementar();
		System.out.println("Contador: " + contador1.getContador());
		System.out.println("Instanciando o contador...");
		Contador contador2 = new Contador();
		System.out.println("Contador: " + contador1.getContador());
		System.out.println("Zerando o contador...");
		contador2.zerar();
		System.out.println("Contador: " + contador1.getContador());
	}
	
	

}
