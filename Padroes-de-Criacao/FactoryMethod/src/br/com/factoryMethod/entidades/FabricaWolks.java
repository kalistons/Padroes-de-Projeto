package br.com.factoryMethod.entidades;

import br.com.factoryMethod.interfaces.ICarro;
import br.com.factoryMethod.interfaces.IFabricaDeCarros;

public class FabricaWolks implements IFabricaDeCarros {

	@Override
	public ICarro criarCarro() {
		
		return new Gol();
	}

}
