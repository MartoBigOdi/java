package excep.TDAS;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

// K ---> es el tipo de dato por el cual vamos a ordenar | T ---> Tipo de dato que va a contener la Lista
public class ListaDeZonasPorNombre extends ListaOrdenadaNodos<String, Zona>{

	@Override
	public int compare(Zona dato1, Zona dato2) {
		//Utilizamos el compareTo() para poder retornar el int que necesitamos
		return dato1.getNombre().compareTo(dato2.getNombre()) ;
	}

	@Override
	public int compareByKey(String clave, Zona elemento) {
		//Utilizamos el compareTo() para poder retornar el int que necesitamos
		return clave.compareTo(elemento.getNombre());
	}

}
