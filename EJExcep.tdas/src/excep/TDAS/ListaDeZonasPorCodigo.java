package excep.TDAS;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaDeZonasPorCodigo extends ListaOrdenadaNodos<Integer, Zona> {

	@Override
	public int compare(Zona dato1, Zona dato2) {
		
		return dato1.getCodigo() - dato2.getCodigo();
	}

	@Override
	public int compareByKey(Integer clave, Zona elemento) {
		
		return clave - elemento.getCodigo();
	}

}