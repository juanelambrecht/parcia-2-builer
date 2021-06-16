package ar.unrn;


public class Pizza {
	private String masa = "";
	private String salsa = "";
	private String relleno = "";
	private String tamanio = "";

	public void asignarMasa(String masa) {
		this.masa = masa;
	}

	public void asignarSalsa(String salsa) {
		this.salsa = salsa;
	}

	public void asignarRelleno(String relleno) {
		this.relleno = relleno;
	}

	public void asignarTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public void mostrarContenido() {
		System.out.println("Pizza: \n masa=" + masa + ", \n salsa=" + salsa + ", \n relleno=" + relleno
				+ ", \n tamanio=" + tamanio + "");
	}

}
