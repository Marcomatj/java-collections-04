package br.fai.collections4;

import java.util.ArrayList;
import java.util.List;

import br.fai.collections4.Cachorro;
import br.fai.collections4.Gato;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
		
	}

	private void start() {

		Cachorro primeiroCachorro = new Cachorro("Tiburssinho");
		primeiroCachorro.setCor("azul");
		Cachorro segundoCachorro = new Cachorro("Aroldo");
		
		Gato primeiroGato = new Gato();
		primeiroGato.setNome("Chupetinha");
		Gato segundoGato = new Gato("vermelho");
		
		List<Animal> listaDeAnimal = new ArrayList<Animal>();
		listaDeAnimal.add(primeiroCachorro);
		listaDeAnimal.add(segundoCachorro);
		listaDeAnimal.add(primeiroGato);
		listaDeAnimal.add(segundoGato);
		
		for(Animal animal : listaDeAnimal) {
			
			animal.dizerMeuNome();
			animal.som();
			System.out.println("Cor: "+animal.getCor());
			if(animal instanceof Gato) {
				Gato gato = (Gato) animal;
				gato.oQueFacoDuranteANoite();		
			}else {
				Cachorro cachorro = (Cachorro) animal;
				cachorro.oQueGostoDeFazer();
			}
			
			System.out.println("------");
		}
		
	}

}
