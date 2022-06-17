package ort.edu.ar.clases;

public class PaquetePeso extends Paquete {
	
	private double peso;
	private double precioPeso;

	public PaquetePeso(String destino, double peso, double precioPeso) {
		super(destino);
		this.peso = peso;
		this.precioPeso = precioPeso;
		calcularPrecio();
	}

	@Override
	public void calcularPrecio() {
		super.setPrecio(peso * precioPeso);
	}

}
