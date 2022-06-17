package ort.edu.ar.clases;

public class PaqueteDistancia extends Paquete {
	
	private double distancia;
	private double precioDistancia;

	public PaqueteDistancia(String destino, double distancia, double precioDistancia ) {
		super(destino);
		this.distancia = distancia;
		this.precioDistancia = precioDistancia;
		calcularPrecio();
	}

	
	//Prestar atencion como trabajar el precio
	@Override
	public void calcularPrecio() {
		super.setPrecio(distancia * precioDistancia);
	}

}