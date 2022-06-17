package ort.edu.ar.clases;

public abstract class Paquete {
	
	private double precio;
	private String destino;
	
	
	//Cramos un setPrecio() que lo utilizan los hijos 
	//con un super.setPrecio(FORMULA DE CADA CLASE HIJA)
	public Paquete(String destino) {
		this.destino = destino;
	}
	
	
	public abstract void calcularPrecio();


	public double getPrecio() {
		return precio;
	}


	public String getDestino() {
		return destino;
	}
	
	
	protected void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Destino: " + destino + " | Precio: $" + precio;
	}
	

}
