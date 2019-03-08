package br.com.factoryMethod.entidades;

import br.com.factoryMethod.interfaces.ICarro;
import br.com.factoryMethod.interfaces.IFabricaDeCarros;

public class FabricaFord implements IFabricaDeCarros {

	@Override
	public ICarro criarCarro() {
		
		return new Fiesta();
	}

}
