package ar.edu.ort.tp1.pacial1.clases;

public abstract class Mueble implements Mostrable {
	private static final float CIEN = 100;

	private String modelo;
	private float costoBase;
	private float porcentajeGanancia;

	public Mueble(String modelo, float costoBase, float porcentajeGanancia) {
		this.modelo = modelo;
		this.costoBase = costoBase;
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public float calcularPrecioVenta() {
		float precioCosto = this.calcularPrecioCosto();
		return precioCosto + (precioCosto * this.porcentajeGanancia / CIEN);
	}

	protected float getCostoBase() {
		return costoBase;
	}

	public boolean modeloCorrecto(String modelo) {

		return this.modelo == modelo;
	}

	public abstract float calcularPrecioCosto();

	@Override
	public void mostrar() {
		
		System.out.println("Mueble tipo: " + this.getClass().getSimpleName() + " - Modelo: " + this.modelo
				+ " - Precio de venta: " + this.calcularPrecioVenta());
	}

	public void mostrar2() {

		System.out.println("Mueble tipo: " + getTipoMueble() + " - Modelo: " + this.modelo + " - Precio de venta: "
				+ this.calcularPrecioVenta());
	}

	protected abstract String getTipoMueble();

	public boolean superaGanancia(float valor) {
		return this.porcentajeGanancia >= valor;
	}

	public boolean superaCostoBase(double costoMinimo) {
		return this.costoBase > costoMinimo;
	}

}
