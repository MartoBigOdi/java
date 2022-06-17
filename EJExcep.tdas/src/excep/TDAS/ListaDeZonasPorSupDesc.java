package excep.TDAS;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;


//DESCENDENTE ES IGUAL DE MAS GRANDE AL MAS CHICO
public class ListaDeZonasPorSupDesc extends ListaOrdenadaNodos<Double, Zona> {

	@Override
	public int compare(Zona dato1, Zona dato2) {
		
		Double sup1 = dato1.getSuperficie();
		Double sup2 = dato2.getSuperficie();
		//DESCENDENTE por eso primero va sup2 y luego sup1
		return sup2.compareTo(sup1);
	}

	@Override
	public int compareByKey(Double clave, Zona elemento) {
		//Porque es DESCENDENTE va sup.compareTo(clave);
		//SINO seria clave.compareTo(elemento.getSuperficie());
		Double sup = elemento.getSuperficie();
		return sup.compareTo(clave);
	}

}
