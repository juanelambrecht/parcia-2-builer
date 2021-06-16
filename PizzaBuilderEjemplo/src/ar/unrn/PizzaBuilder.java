package ar.unrn;


public abstract class PizzaBuilder {
	protected Pizza pizza;

	public Pizza objetoPizza() {
		return pizza;
	}

	public void crearNuevaPizza() {
		this.pizza = new Pizza();
	}

	public abstract void buildMasa();

	public abstract void buildSalsa();

	public abstract void buildRelleno();

	public abstract void buildTamanio();
}
