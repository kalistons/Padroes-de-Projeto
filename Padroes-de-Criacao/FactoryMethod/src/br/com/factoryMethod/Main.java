package br.com.factoryMethod;

import br.com.factoryMethod.entidades.FabricaFiat;
import br.com.factoryMethod.entidades.FabricaFord;
import br.com.factoryMethod.entidades.FabricaWolks;
import br.com.factoryMethod.interfaces.ICarro;
import br.com.factoryMethod.interfaces.IFabricaDeCarros;

public class Main {

	public static void main(String[] args) {
		IFabricaDeCarros fabrica  = new FabricaFord();
		ICarro carro = fabrica.criarCarro();
		carro.exibirCarro();
		
		fabrica  = new FabricaFiat();
		carro = fabrica.criarCarro();
		carro.exibirCarro();
		
		fabrica  = new FabricaWolks();
		carro = fabrica.criarCarro();
		carro.exibirCarro();
		

	}

}
