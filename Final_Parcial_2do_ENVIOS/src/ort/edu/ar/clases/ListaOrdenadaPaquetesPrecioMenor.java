package ort.edu.ar.clases;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

//Lista ordenada del menor al mas grande
public class ListaOrdenadaPaquetesPrecioMenor extends ListaOrdenadaNodos<Double, Paquete> {

	@Override
	public double compare(Paquete dato1, Paquete dato2) {
		Double precio1 = dato1.getPrecio();
		Double precio2 = dato2.getPrecio();
		return precio1.compareTo(precio2);
	}

	@Override
	public int compareByKey(Double clave, Paquete elemento) {
		return clave.compareTo(elemento.getPrecio());
	}

}
