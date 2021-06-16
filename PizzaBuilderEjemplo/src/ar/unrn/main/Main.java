package ar.unrn.main;

import ar.unrn.Cocina;
import ar.unrn.HawaiPizzaBuilder;
import ar.unrn.PicantePizzaBuilder;
import ar.unrn.Pizza;
import ar.unrn.PizzaBuilder;


public class Main {
	public static void main(String[] args) {
		Cocina cocina = new Cocina(); 

		PizzaBuilder hawaiPizzaBuilder = new HawaiPizzaBuilder();
		//PizzaBuilder picantePizzaBuilder = new PicantePizzaBuilder();

		cocina.asignarPizzaBuilder(hawaiPizzaBuilder);

		cocina.construirPizza();
		
		cocina.objetoPizza().mostrarContenido();
	
	}
}
