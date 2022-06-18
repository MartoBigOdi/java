package ar.edu.ort.tp1.examen.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaDeProductosPorId extends ListaOrdenadaNodos<Integer, Producto> {
    @Override
    public int compare(Producto dato1, Producto dato2) {
        // dato1.getMarca().compareTo(dato2.getMarca());
        // Float.valueOf(dato1.getCosto()).compareTo(Float.valueOf(dato2.getCosto()));
        // Float.compare(dato1.getCosto(), dato2.getCosto());
        return dato1.getId() - dato2.getId();
    }

    @Override
    public int compareByKey(Integer clave, Producto elemento) {
        return clave - elemento.getId();
    }
}
