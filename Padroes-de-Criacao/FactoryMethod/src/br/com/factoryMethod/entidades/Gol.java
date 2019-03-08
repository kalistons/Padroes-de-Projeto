package br.com.factoryMethod.entidades;

import br.com.factoryMethod.interfaces.ICarro;

public class Gol implements ICarro{

	@Override
	public void exibirCarro() {
		System.out.println("Carro modelo Gol");
		
	}
}
