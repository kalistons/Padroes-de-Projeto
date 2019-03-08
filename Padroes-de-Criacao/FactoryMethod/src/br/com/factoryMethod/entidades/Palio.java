package br.com.factoryMethod.entidades;

import br.com.factoryMethod.interfaces.ICarro;

public class Palio implements ICarro{

	@Override
	public void exibirCarro() {
		System.out.println("Carro modelo Palio");
		
	}
}
