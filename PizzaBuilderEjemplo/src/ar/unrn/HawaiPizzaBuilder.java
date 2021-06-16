package ar.unrn;

public class HawaiPizzaBuilder extends PizzaBuilder {
	@Override
	public void buildMasa() {
		pizza.asignarMasa("Suave");
	}

	@Override
	public void buildSalsa() {
		pizza.asignarSalsa("Dulce");
	}

	@Override
	public void buildRelleno() {
		pizza.asignarRelleno("Chorizo + Alcachofas");
	}

	@Override
	public void buildTamanio() {
		pizza.asignarTamanio("GRANDE");
	}
}
