package edu.lista1.app;

import edu.lista1.model.Contador;

public class App {

	public static void main(String[] args) {
		Contador contador1 = new Contador();
		System.out.println(contador1.getContador());
		contador1.incrementar();
		contador1.incrementar();
		contador1.incrementar();
		contador1.incrementar();
		System.out.println(contador1.getContador());
		Contador contador2 = new Contador();
		System.out.println(contador2.getContador());
	}

}
