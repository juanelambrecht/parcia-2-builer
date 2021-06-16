package ar.unrn;

public class PicantePizzaBuilder extends PizzaBuilder {
	@Override
	public void buildMasa() {
		pizza.asignarMasa("Cocida");
	}

	@Override
	public void buildSalsa() {
		pizza.asignarSalsa("Picante");
	}

	@Override
	public void buildRelleno() {
		pizza.asignarRelleno("Pimienta y Salchicha");
	}

	@Override
	public void buildTamanio() {
		// pizza.asignarTamanio("MEDIANO");
	}
}
