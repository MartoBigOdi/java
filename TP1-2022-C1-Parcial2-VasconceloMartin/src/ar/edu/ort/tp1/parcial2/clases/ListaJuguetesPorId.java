package ar.edu.ort.tp1.parcial2.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaJuguetesPorId extends ListaOrdenadaNodos<Integer, Juguete> {

	@Override
	public int compare(Juguete dato1, Juguete dato2) {
		
		return dato1.getId() - dato2.getId();
	}

	@Override
	public int compareByKey(Integer clave, Juguete elemento) {
		
		return clave - elemento.getId();
	}

}
