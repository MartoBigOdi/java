package ar.edu.ort.a2019.c2.tp1.p2.clases;

/*
 * Esta clase es igual a Producto Estandar, trabajamos la herencia y polimorfismo en etiquetar() y mostrar()
 */

public class ProductoFragil extends Producto implements Mostrable{
	
	private static final String ETIQUETA = "Producto Frágil trátese con cuidado";
	
	
	public ProductoFragil(String codigo, String nombre, String descripcion) {
		super(codigo, nombre, descripcion);
	}


	@Override
	public void mostrar() {
		System.out.println("Tipo: " + getClass().getSimpleName() + toString());
	}

	
	@Override
	public String toString() {
		return super.toString();
	}

	
	@Override
	public void etiquetar() {
		// TODO Auto-generated method stub
		super.setEtiqueta(ETIQUETA);
	}
	
	
}
