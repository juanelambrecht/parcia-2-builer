package ar.unrn;


public class Cocina {
	private PizzaBuilder builder;

	public void asignarPizzaBuilder(PizzaBuilder pizzaBuilder) {
		builder = pizzaBuilder;
	}

	public Pizza objetoPizza() {
		return builder.objetoPizza();
	}

	public void construirPizza() {
		builder.crearNuevaPizza();
		builder.buildMasa();
		builder.buildSalsa();
		builder.buildRelleno();
		builder.buildTamanio();
	}
}
