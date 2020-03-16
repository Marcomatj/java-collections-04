package br.fai.collections4;

import br.fai.collections4.Animal;

public class Gato extends Animal {

	public Gato() {
		setCor("branco");
	}
	
	public Gato(String cor) {
		setCor(cor);
	}
	
	@Override
	public void som() {
		super.som();
		System.out.println("Eu gosto de miar");
	}
	
	public void oQueFacoDuranteANoite() {
		System.out.println("Gosto de pular a cerca toda noite");
	}
	
}
