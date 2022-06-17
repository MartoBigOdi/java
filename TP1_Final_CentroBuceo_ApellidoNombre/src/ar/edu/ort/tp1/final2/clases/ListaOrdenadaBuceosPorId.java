package ar.edu.ort.tp1.final2.clases;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaOrdenadaBuceosPorId extends ListaOrdenadaNodos<Integer, Buceo> {

	@Override
	public int compare(Buceo dato1, Buceo dato2) {
		Integer buceo1 = dato1.getId();
		Integer buceo2 = dato2.getId();
		return buceo1 - buceo2;
	}

	@Override
	public int compareByKey(Integer clave, Buceo elemento) {
		Integer buceo1 = elemento.getId();
		return clave - buceo1;
	}

}
