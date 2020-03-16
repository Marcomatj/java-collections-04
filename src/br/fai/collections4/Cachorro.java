package br.fai.collections4;

import br.fai.collections4.Animal;

public class Cachorro extends Animal{

		public Cachorro(String nome) {
			setNome(nome);
		}
		
		@Override
		public void som() {
			System.out.println("Eu gosto de latir");
		}
		
		public void oQueGostoDeFazer() {
			System.out.println("Gosto de morder os carteiros");
		}
}
