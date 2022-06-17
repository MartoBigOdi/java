package ar.edu.ort.a2019.c2.tp1.p2.clases;

public class ProductoEstandar extends Producto implements Mostrable{
	
	private static final String ETIQUETA = "Producto Estandar";

	public ProductoEstandar(String codigo, String nombre, String descripcion) {
		super(codigo, nombre, descripcion);
	}

	
	/*
	 * No se implmento en la clase padre, se implementa en la clase hija. 
	 * Como sabemos como hacerlo, porque vemos la salida del Main. 
	 * Tipo: ProductoEstandarProducto [Codigo: Estandar2, Nombre: Silla, Descripcion: Silla ergonómica, Etiqueta: Producto Estandar]
	 */
	@Override
	public void mostrar() {
		System.out.println("Tipo: " + getClass().getSimpleName() + toString());
	}

	
	//Utilizamos el toString() de la clase padre por eso es super.toString()
	@Override
	public String toString() {
		return super.toString();
	}

	
	//Utilizamos el setEtiqueta() que tenemos en la clase padre por eso el super.toString()
	@Override
	public void etiquetar() {
		// TODO Auto-generated method stub
		super.setEtiqueta(ETIQUETA);
	}
	
	
	
}
